package com.coffeeshop.domain.shop;


import com.coffeeshop.domain.Address;
import com.coffeeshop.domain.ContactDetails;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "shops")
@EntityListeners(AuditingEntityListener.class)
public class Shop {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String locationName;

    @ManyToMany
    private List<ContactDetails> contactDetails;

    @ManyToMany
    private List<Address> addresses;

    @NotNull
    private Integer queueCount;

    @NotNull
    private Integer queueSize;

    @OneToMany
    private List<ShopTiming> timings;

    @NotNull
    private String currencyCode;

    @NotNull
    @CreatedDate
    private Date createdAt;

    @NotNull
    @LastModifiedDate
    private Date modifiedAt;
}
