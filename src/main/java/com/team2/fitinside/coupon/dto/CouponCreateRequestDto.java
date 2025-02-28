package com.team2.fitinside.coupon.dto;

import com.team2.fitinside.coupon.entity.CouponType;
import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor // 모든 필드를 포함하는 생성자 추가
@NoArgsConstructor(access = AccessLevel.PRIVATE) // 기본 생성자 추가 (Jackson 역직렬화 지원)
public class CouponCreateRequestDto {

    private String name;
    private CouponType type;
    private int value;
    private int percentage;
    private int minValue;
    private LocalDate expiredAt;
    private Long categoryId;
}
