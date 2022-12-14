package db_connect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bye2") //@(annotation, 에노테이션, 어노테이션, 표시)==> 표시를 통해서 요청url을 설정!!
public class Hello extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//name=hong&message=goodbye
		String name = request.getParameter("name");
		String message = request.getParameter("message");
		System.out.println("이름은 " + name + "이고, 메시지는 " + message);
		
	}

}
