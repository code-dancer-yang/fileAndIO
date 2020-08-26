package smart.web.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
/**
 * urlpattern :
 *   /* "所有请求"
 *  *.do 所有以".do结尾的请求"
 *  /test/aaa
 * @author zhyang
 *
 */
@WebServlet(value = {"/test/saysay"} )
public class GeneraServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello  mygenericservlet...");
		res.setContentType("text/html;charset=utf-8");
		res.getWriter().write("我是杨增辉");
		
	}

}
