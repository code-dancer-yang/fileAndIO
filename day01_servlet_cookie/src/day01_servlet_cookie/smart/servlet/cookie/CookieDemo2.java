package day01_servlet_cookie.smart.servlet.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/cookieDemo02")
public class CookieDemo2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("cookieDemo02");
		 //获取Cookie对象
		 Cookie[] cookies=request.getCookies();
		 if(cookies!=null&&cookies.length>0) {
			 
			 for (Cookie cookie : cookies) {
				 System.out.println(cookie.getName()+":"+cookie.getValue());
			 }
		 }
		// TODO Auto-generated method stub
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
