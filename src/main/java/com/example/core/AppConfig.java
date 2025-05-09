//package com.example.core;
//
//import com.example.core.discount.DiscountPolicy;
//import com.example.core.discount.FixDiscountPolicy;
//import com.example.core.discount.RateDiscountPolicy;
//import com.example.core.member.MemberService;
//import com.example.core.member.MemberServiceImpl;
//import com.example.core.member.MemoryMemberRepository;
//import com.example.core.order.OrderService;
//import com.example.core.order.OrderServiceImpl;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class AppConfig {
//
//    @Bean
//    public MemberService memberService() {
//        return new MemberServiceImpl(memberRepository());
//    }
//
//    @Bean
//    public MemoryMemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
//
//    @Bean
//    public OrderService orderService() {
//        return new OrderServiceImpl(memberRepository(), FixDiscountPolicy());
//    }
//
//    @Bean
//    public DiscountPolicy FixDiscountPolicy() {
//        return new FixDiscountPolicy();
//    }
//
////    @Bean
////    public DiscountPolicy RateDiscountPolicy(){
////        return new RateDiscountPolicy();
////    }
//
//
//}
