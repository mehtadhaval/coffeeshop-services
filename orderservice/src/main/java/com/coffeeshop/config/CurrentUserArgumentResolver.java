package com.coffeeshop.config;

import com.coffeeshop.domain.User;
import com.coffeeshop.domain.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.lang.NonNull;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Slf4j
@Component
public class CurrentUserArgumentResolver implements HandlerMethodArgumentResolver {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getParameter().getType() == User.class;
    }

    @Override
    public Object resolveArgument(@NonNull MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, @NonNull NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (!(authentication instanceof OAuth2Authentication)) {
            throw new UsernameNotFoundException("Invalid user: " + authentication.getName());
        }

        return userRepository.findByUsername(authentication.getName());
    }
}
