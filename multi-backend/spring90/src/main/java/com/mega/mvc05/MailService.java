package com.mega.mvc05;

import java.util.Arrays;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

//@Aspect
//@Service("mail")
public class MailService {
 
//  @Autowired
//  private JavaMailSender mailSender;
 
  public void mailSend2(JoinPoint joinPoint, Throwable ex) {
//	  Signature signature = joinPoint.getSignature();
//      String methodName = signature.getName();
//      String stuff = signature.toString();
//      String arguments = Arrays.toString(joinPoint.getArgs());
//      String body = "Write something in the log... We have caught exception in method: "
//      + methodName + " with arguments "
//      + arguments + "\nand the full toString: " + stuff + "\nthe exception is: "
//      + ex.getMessage();
//      
//	  System.out.println("서버에 문제가 있어서 자동 위빙되게 해줄 예정임.");
//	  String setfrom = "jungwonalicia@gmail.com";         
//	  String tomail  = "aliciawill@naver.com";     // 받는 사람 이메일
//	  String title   = "서버에 에러발생함.";      // 제목
//	  String content = "서버에 에러가 발생했으니, 서버에 접속하여 확인할 것." + body;    // 내용
//	  System.out.println("22.-----------------------");
//	  try {
////		  MimeMessage message = mailSender.createMimeMessage();
////		  MimeMessageHelper messageHelper 
////		  = new MimeMessageHelper(message, true, "UTF-8");
////		  System.out.println("3-----------------------");
////		  messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
////		  messageHelper.setTo(tomail);     // 받는사람 이메일
////		  messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
////		  messageHelper.setText(content);  // 메일 내용
////		  System.out.println("4-----------------------");
//		 // mailSender.send(message);
//		  
//		  System.out.println("5-----------------------");
//	  } catch(Exception e){
//		  System.out.println(e);
//	  }
//	  
//  }
//  
//  public void mailSend(HttpServletRequest request) {
//   System.out.println("11.나는 호출이 되었어.");
//    String setfrom = "jungwonalicia@gmail.com";         
//    String tomail  = request.getParameter("tomail");     // 받는 사람 이메일
//    String title   = request.getParameter("title");      // 제목
//    String content = request.getParameter("content");    // 내용
//   System.out.println("22.-----------------------");
//    try {
//     // MimeMessage message = mailSender.createMimeMessage();
//      //MimeMessageHelper messageHelper 
////                        = new MimeMessageHelper(message, true, "UTF-8");
////      System.out.println("3-----------------------");
////      messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
////      messageHelper.setTo(tomail);     // 받는사람 이메일
////      messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
////      messageHelper.setText(content);  // 메일 내용
//      System.out.println("4-----------------------");
//      //mailSender.send(message);
//      
//      System.out.println("5-----------------------");
//    } catch(Exception e){
//      System.out.println(e);
//    }
//  
  }
  
 
} 

