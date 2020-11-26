package com.coffeeshop.domain.to.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class QueuePositionTo {

    long position;

    long waitTime;

}
