//package com.example.core.member;
//
//import com.example.core.AppConfig;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class MemberServiceTest {
//
//    AppConfig appConfig = new AppConfig();
//    MemberService memberService = appConfig.memberService();
//
//    @Test
//    void join() {
//        //given
//        Member member = new Member(1L,"memberA", Grade.VIP);
//        //when
//        memberService.join(member);
//        Member findMember = memberService.findMember(1L);
//        //then
//        assertThat(member).isEqualTo(findMember);
//
//    }
//}
