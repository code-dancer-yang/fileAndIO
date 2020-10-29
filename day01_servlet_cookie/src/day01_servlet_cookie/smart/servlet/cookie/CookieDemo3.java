package day01_servlet_cookie.smart.servlet.cookie;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/cookieDemo03")
public class CookieDemo3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		System.out.println("cookieDemo02");
		//获取Cookie对象
		Cookie[] cookies=request.getCookies();
		boolean flag=false;
		if(cookies!=null&&cookies.length>0) {

			for (Cookie cookie : cookies) {

				if("last_Time".equals(cookie.getName())) {
					flag=true;
					//获取cookie中存储的时间
					String old_Time=cookie.getValue();
					//获取当前时间
					Date date=new Date();
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
					String new_Time=sdf.format(date);
					//处理时间中的特殊符号 ：空格 start
					System.out.println("编码前新时间："+new_Time);
					new_Time= URLEncoder.encode(new_Time, "utf-8");
					System.out.println("编码后新时间："+new_Time);
					//处理时间中的特殊符号 ：空格 end
					cookie.setValue(new_Time);
					cookie.setMaxAge(5);
					cookie.setPath("/");
					response.addCookie(cookie);

					//设置响应的内容
					//解码
					//处理时间中的特殊符号 ：空格 start
					System.out.println("解码前旧时间："+old_Time);
					old_Time=URLDecoder.decode(old_Time, "utf-8");
					System.out.println("解码后旧时间："+old_Time);
					//处理时间中的特殊符号 ：空格 start
					response.getWriter().write("<h1>欢迎您，您上次的访问时间是："+old_Time+"</h1>");
					break;
				}
				System.out.println(cookie.getName()+":"+cookie.getValue());
			}
		}
		if(cookies==null||cookies.length==0||flag==false) {
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
			String new_Time=sdf.format(date);
			//处理时间中的特殊符号 ：空格 start
			System.out.println("编码前："+new_Time);//编码前
			new_Time= URLEncoder.encode(new_Time, "utf-8");//编码
			System.out.println("编码后："+new_Time);//编码后
			//处理时间中的特殊符号 ：空格 end
			Cookie cookie=new Cookie("last_Time", new_Time);
			cookie.setPath("/");
			cookie.setMaxAge(5);
			response.addCookie(cookie);
			response.getWriter().write("<h1>欢迎您首次访问本网站</h1>");
		}
		// TODO Auto-generated method stub
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
