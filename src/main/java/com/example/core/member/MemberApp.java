//package com.example.core.member;
//
//import com.example.core.AppConfig;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class MemberApp {
//    public static void main(String[] args) {
////        AppConfig appConfig = new AppConfig();
////        MemberService memberService = appConfig.memberService();
//
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
//
//        Member Seongkyun = new Member(1L, "seongkyun", Grade.VIP);
//
//        memberService.join(Seongkyun);
//
//        Member findMember = memberService.findMember(1L);
//        System.out.println("new member = " + Seongkyun.getName());
//        System.out.println("findMember = " + findMember.getName());
//
//    }
//}