package day01_servlet_cookie.smart.servlet.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/cookieDemo01")
public class CookieDemo01 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("cookieDemo01");
		 //获取Cookie对象
		 Cookie cookie01=new Cookie("username","yangzenghui");
		 //设置Cookie对象的生命周期
		 cookie01.setMaxAge(30);//设置生命周期为30s
		 //设置cookie的存储位置,默认是项目的虚拟目录 
		 cookie01.setPath("/");//设置存储位置是项目所在服务器的根路径
		 response.addCookie(cookie01);
		// TODO Auto-generated method stub
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
