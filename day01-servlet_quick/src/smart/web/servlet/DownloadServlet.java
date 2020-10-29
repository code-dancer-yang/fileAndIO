package smart.web.servlet;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import smart.utils.DownLoadUtils;
@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取要下载的文件名称
		String filenameTemp=new String(request.getParameter("filename").getBytes("ISO-8859-1"),"utf-8");
		System.out.println("文件名称是："+filenameTemp);
		//获取ServletContext上下文对象
		ServletContext servletContext = this.getServletContext();
		//获取文件在服务器的真实路径
		String filePath=servletContext.getRealPath("/WEB-INF/files/"+filenameTemp);
		//设置响应头以让浏览器正确解析文件
		response.setHeader("content-type",servletContext.getMimeType(filenameTemp));
		//解决中文文件名问题（在各类型浏览器显示不正确的问题）
		String filename=DownLoadUtils.getFileName(request.getHeader("USER-AGENT"), filenameTemp);
		//设置响应头以让浏览器在下载任何类型的文件时都能弹出文件下载框(即设置响应头的打开方式)
		response.setHeader("content-disposition", "attachment;filename="+filename);
	    //将文件通过字节输入流加载到服务器内存中
		FileInputStream fis=new FileInputStream(filePath);
		//将文件通过字节输出流响应给浏览器进行解析
		ServletOutputStream ops = response.getOutputStream();
		int len=0;
		byte[] b=new byte[1024*6];
		while((len=fis.read(b))!=-1) {
			ops.write(b, 0, len);
		}
		//释放文件输入流资源
		fis.close();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

}
