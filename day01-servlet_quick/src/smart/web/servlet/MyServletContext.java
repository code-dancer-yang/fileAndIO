package smart.web.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ServletContext对象代表整个web应用，作为域对象 它可以被整个应用的所有请求共享
 * 
 * @author zhyang
 *
 */
@WebServlet("/myServletContext")
public class MyServletContext extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    //获取servletcontext对象的方式1
		ServletContext servletContext1= this.getServletContext();
		//获取servletcontext对象的方式2
		ServletContext servletContext2 = req.getServletContext();
		System.out.println(servletContext1==servletContext2);
		System.out.println(servletContext1.getMimeType("a.jpg"));
		System.out.println(servletContext1.getMimeType("a.htm"));
		System.out.println(servletContext1.getMimeType("a.txt"));
		//获取文件的真实路径（在服务器中的）
		System.out.println(servletContext1.getRealPath("/453.txt"));
		System.out.println(servletContext1.getRealPath("/WEB-INF/c.txt"));
		System.out.println(servletContext1.getRealPath("/WEB-INF/classes/a.txt"));
		System.out.println(servletContext1.getRealPath("/WEB-INF/classes/smart/d.txt"));
		FileOutputStream fos=new FileOutputStream(new File(servletContext1.getRealPath("/WEB-INF/classes/d.txt")));
		FileInputStream fis=new FileInputStream(new File(servletContext1.getRealPath("/WEB-INF/classes/smart/d.txt")));
		byte[] b=new byte[1024];
		fis.read(b);
		System.out.println(Arrays.toString(b));
		fos.write("你好".getBytes());
		fos.flush();
		fos.close();
		fis.close();
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}

}
