package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/check.do")
public class Check extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("서블릿 객체 하나 만들어짐");
	}
	//get요청,클라이언트로 부터 전달되는 데이터는 주소와 함께 도착
	//get은 서버에서 URIencoding 이미 해놔서 안해도됨 
	//get은 request할때 주소랑 데이터가 함께오기 때문에 안해도됨
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String today = request.getParameter("today");
		String result="그냥있자";
		if (today.equals("맑음")) {
			result="나가자";
		}else if (today.equals("흐림")) {
			result=".코딩";
		}else if (today.equals("비옴")) {
			result="쇼핑";
			}//for
	
		
		//set contenttype은  out 만들기전에 설정 !! 
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
		
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//html에서 받는거
		request.setCharacterEncoding("utf-8");
		
		String pass = request.getParameter("pass");
		String result="들어올 수 없습니다<img src='img/no.png' width:200px>";
		if (pass.equals("나는왕이다")) {
			result="들어오세요<img src='img/yes.png'>";
	
		}
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();

	}

}
