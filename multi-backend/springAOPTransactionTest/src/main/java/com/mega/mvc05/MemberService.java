package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;

	// 암호화 di
	@Autowired
	BCryptPasswordEncoder pwEncoder;

	public void create(MemberVO memberVO) {
		memberVO.setPw(pwEncoder.encode(memberVO.getPw())); // 비밀번호 암호화
		dao.insert(memberVO);
	}

	public boolean sLogin(MemberVO vo) {
		String getPw = dao.sLogin(vo);
		System.out.println("2: " + getPw);
		boolean result = false;// 암호가 맞지 않음.
		System.out.println("3: " + pwEncoder.matches(vo.getPw(), getPw));
		if (pwEncoder.matches(vo.getPw(), getPw)) {
			result = true;
		}
		return result;
	}
}
