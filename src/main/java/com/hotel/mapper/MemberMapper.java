package com.hotel.mapper;

import com.hotel.dto.MemberDto;

public interface MemberMapper {
    MemberDto selectMember(String user_id);
}
