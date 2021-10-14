package com.hotel.service;

import com.hotel.dao.MemberDao;
import com.hotel.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberDao memberDao;

    public MemberDto selectMember(String user_id){
        MemberDto memberDto = memberDao.selectMember(user_id);

        return memberDto;
    }
}
