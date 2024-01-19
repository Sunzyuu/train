package com.github.train.member.controller;


import com.github.train.common.resp.CommonResp;
import com.github.train.member.req.MemberLoginReq;
import com.github.train.member.req.MemberRegisterReq;
import com.github.train.member.req.MemberSendCodeReq;
import com.github.train.member.req.PassengerSaveReq;
import com.github.train.member.resp.MemberLoginResp;
import com.github.train.member.service.MemberService;
import com.github.train.member.service.PassengerService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passenger")
public class PassengerController {



    @Resource
    private PassengerService passengerService;

    @PostMapping("/save")
    public CommonResp<Integer> save(@Valid @RequestBody PassengerSaveReq req) {
        passengerService.save(req);
        CommonResp<Integer> commonResp = new CommonResp<>();
        commonResp.setContent(null);
        return commonResp;
    }

}
