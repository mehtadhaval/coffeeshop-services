package com.coffeeshop.domain.to.order;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class QueuePositionTo {

    @ApiModelProperty("Position in queue")
    long position;

    @ApiModelProperty("Approximate wait time in seconds")
    long waitTime;

}
