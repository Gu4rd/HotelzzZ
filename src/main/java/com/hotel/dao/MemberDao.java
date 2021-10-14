package com.hotel.dao;

import com.hotel.dto.MemberDto;
import com.hotel.mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

    @Autowired
    private SqlSession sqlSession;

    public MemberDto selectMember(final String user_id){
        MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);

        MemberDto memberDto = mapper.selectMember(user_id);

        return memberDto;
    }
}
