package com.example.core.discount;

import com.example.core.member.Grade;
import com.example.core.member.Member;
import org.springframework.stereotype.Component;


public class RateDiscountPolicy implements DiscountPolicy{

    private final int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent /100;
        }
        else{
            return 0;
        }
    }
}
