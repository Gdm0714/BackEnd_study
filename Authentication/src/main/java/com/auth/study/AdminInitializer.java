//package com.auth.study;
//
//import com.auth.study.common.MemberType;
//import com.auth.study.entity.Member;
//import com.auth.study.repository.MemberRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//
//@RequiredArgsConstructor
//@Component
//public class AdminInitializer implements ApplicationRunner {
//    private final MemberRepository memberRepository;
//    private final PasswordEncoder encoder;
//
//    @Override
//    public void run(ApplicationArguments args) {
//
//        memberRepository.save(Member.builder()
//                .account("admin")
//                .password((encoder.encode("admin")))
//                .name("관리자")
//                .type(MemberType.ADMIN)
//                .createdAt(LocalDateTime.now())
//                .build());
//    }
//}
