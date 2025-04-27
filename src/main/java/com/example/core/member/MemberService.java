package com.example.core.member;

import org.springframework.stereotype.Component;

@Component
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

}
