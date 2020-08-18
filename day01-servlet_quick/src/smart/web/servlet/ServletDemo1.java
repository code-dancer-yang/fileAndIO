package smart.web.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * servlet入门案例:实现servlet接口 并实现其抽象方法
 * @author zhyang
 *
 */
public class ServletDemo1 implements Servlet{
    /**
     * 在服务器正常关闭时执行，只执行一次
     */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy...");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
    /**
     * 在servlet被创建时执行该方法，只会执行一次。
     */
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init...");
		
	}
    /**
     * 每一次servlet被访问时，该方法都会被执行。
     */
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello servlet!!!");
		
	}

}
