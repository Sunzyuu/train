package com.github.train.member.controller;


import com.github.train.member.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Resource
    private MemberService memberService;
    @GetMapping("/")
    public long hello() {
        return memberService.count();
    }
}
