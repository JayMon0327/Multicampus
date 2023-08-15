package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/hello2")
public class FirstServlet extends HttpServlet {
	
    //서블릿이 싱글톤으로 하나 만들어질 때 체크하고 싶은 내용 기술
	public void init(ServletConfig config) throws ServletException {
		System.out.println("서블릿이 싱글톤으로 하나 생성됨.");
	}

	//http요청/응답을 처리하는 메서드
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello2 주소가 요청됨.");
		//우리가 만든 jsp코드는 service()메서드 안으로 자동생성되어 들어감.
		//String id = null; //지역변수!, 쓰레기값이 들어있음.
		//입력
		String food = request.getParameter("food");
		String drink = request.getParameter("drink");
		System.out.println("먹고 싶은 음식은 " + food + "이고, 음료수는 " + drink);
		//db처리
		//출력(html)
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("food>> " + food + "<br>");
		out.print("drink>> " + drink);
		out.close();
	}

}
