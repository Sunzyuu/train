package com.github.train.member.service;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.swing.clipboard.ImageSelection;
import com.github.train.common.context.LoginMemberContext;
import com.github.train.common.utils.SnowUtil;
import com.github.train.member.domain.Passenger;
import com.github.train.member.mapper.PassengerMapper;
import com.github.train.member.req.PassengerSaveReq;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

@Service
public class PassengerService {

    @Resource
    private PassengerMapper passengerMapper;


    public void save(PassengerSaveReq passengerSaveReq) {
        Passenger passenger = BeanUtil.copyProperties(passengerSaveReq, Passenger.class);
        Long memberId = LoginMemberContext.getId();
        passenger.setMemberId(memberId);
        passenger.setId(SnowUtil.getSnowflakeNextId());
        passenger.setCreateTime(new Date());
        passenger.setUpdateTime(new Date());
        passengerMapper.insert(passenger);
    }
}
