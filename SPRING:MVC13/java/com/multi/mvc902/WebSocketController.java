package com.multi.mvc902;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

	@MessageMapping("/chat2")
	@SendTo("/topic/messages2")
	public OutputMessage2 send2(Message message) {
		String menu = "";
		switch (message.getText()) {
		case "1":
			menu = "맛돌이>>  10)맛집 등록은 어떻게 하나요? \n"+"11) 지도에 마커 등록은 언제 되나요? \n"+" 12) 등록메뉴는 어디로 가야하나요?";
			break;
		case "2":
			menu = "맛돌이>>  20) 탈퇴를 원하는 아이디로 로그인 해주세요 21) 회원정보 페이지로 이동해주세요. 22)페이지 최하단의 회원탈퇴 버튼을 눌러주세요  ";
			break;
		case "20":
			menu = "맛돌이>> DB에서 가지고 온 배송 상황 목록 \n" +
						"상품명: 르꼬뿌		배송상황: 물건 준비중";
			break;
		case "10":
			menu = "맛돌이>>  100) 나이커	    200) 르꼬뿌			300) 라코스또";
			break;
		case "100":
			menu = "맛돌이>>  1000) 나이커 운동화 세부 메뉴	1) 다시 처음 메뉴";
			break;
		case "1000":
			menu = "맛돌이>>  1001)나이커빨강(1만원)	1002)나이커파랑(2만원)	1003)나이커보라(3만원)	100)이전 메뉴로";
			break;
		default:
			menu = "맛돌이>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요.";
			break;
		}
		OutputMessage2 outputMessage2 = new OutputMessage2(menu);
		return outputMessage2;
	}
	
	//ws프로토콜로 요청을 받음.
	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public OutputMessage send(Message message) {
		System.out.println("서버에서 받은 데이터>> " + message); //서버에서 받은 클라이언트의 채팅 내용을 확인 
		Date date = new Date(); //java.util.Date;
		int hour = date.getHours();//시 
		int min = date.getMinutes();//분 
		String time = hour + ":" + min;
		//채팅방에 들어와있는 모든 클라이언트에게 보낼 데이터 
		OutputMessage output = new OutputMessage(message.getFrom(), message.getText(), time);
		return output; //return데이터는 json으로 만들어서 클라이언트 브라우저에 보냄.
		//jackson-databind
	}
}
