package moe.fotone.demo;

import moe.fotone.demo.repository.MemberRepository;
import moe.fotone.demo.repository.MemoryMemberRepository;
import moe.fotone.demo.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService () {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
