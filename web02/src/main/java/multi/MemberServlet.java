package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert.do")
public class MemberServlet extends HttpServlet {
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//입력
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//처리-db처리
		//출력
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("로그인한 id는 " + id + "<br>");
		out.print("로그인한 pw는 " + pw + "<br>");
		out.print("<img src=car.jpg>");
		out.close();
	}

}

