package com.hotel.service;

import com.hotel.dto.MemberDto;

public interface MemberService {

    public MemberDto selectMember(String user_id);
}
