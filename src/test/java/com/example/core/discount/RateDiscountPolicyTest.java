package com.example.core.discount;

import com.example.core.member.Grade;
import com.example.core.member.Member;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    void vip(){
        //given
        Member member = new Member(1L, "member", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member,10000);
        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    void nVip(){
        //given
        Member member = new Member(1L, "member", Grade.BASIC);
        //when
        int discount = discountPolicy.discount(member,10000);
        //then
        assertThat(discount).isEqualTo(0);
    }

}