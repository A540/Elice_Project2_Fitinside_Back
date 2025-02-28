package com.team2.fitinside.coupon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponEmailRequestDto {

    private Long couponId;
    private String address;
    private String template;
}
