package com.hotel.Controller;

import com.hotel.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hotel.service.MemberService;

@Controller
public class UserController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/login/{id}")
    public String loginTestResult(@PathVariable String id, Model model){
        MemberDto dto = memberService.selectMember(id);

        model.addAttribute("member", dto);

        return "loginResultView";
    }
}
