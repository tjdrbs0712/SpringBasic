package com.example.core.discount;

import com.example.core.member.Member;
import org.springframework.stereotype.Component;

@Component
public interface DiscountPolicy {

    int discount(Member member, int price);
}
