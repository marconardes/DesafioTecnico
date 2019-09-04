package com.nardes;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.http.HttpStatus;

import com.nardes.s3.AmazonS3Utils;



@MultipartConfig(location="/tmp", fileSizeThreshold=1024*1024, 
maxFileSize=1024*1024*100)
@WebServlet(name="Converter", value="/v1/converter",asyncSupported=true)
public class VideoConverter extends HttpServlet{

	
	 
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//VideoInput cv = new VideoInput();
		
		resp.setContentType("text/html");
		
		resp.getWriter().println(req.getParameter("Authorization"));
		resp.getWriter().println("======");
			    
		
		
		if(req.getParameter("Authorization")!=null)
		{
			String auth = (String) req.getParameter("Authorization");
			if(authorize(auth,Configuration.apiKey))
			{
				resp.setStatus(HttpStatus.SC_OK);
				resp.getWriter().println("Authorized");
			    resp.setContentType("text/plain");
			    resp.getWriter().println("hello");

			}
			else
			{
				resp.setStatus(HttpStatus.SC_UNAUTHORIZED);
				resp.getWriter().println("UNAUTHORIZED");

			}
			
		}
		else
		{
			resp.setStatus(HttpStatus.SC_BAD_REQUEST);
			resp.getWriter().println("BAD_REQUEST");
		}
		
		
		resp.getWriter().println(resp.getStatus());
		
		
	}

	private boolean authorize(String auth, String apiKey) {
		// TODO Auto-generated method stub
		return apiKey.contains(auth);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		if(req.getParameter("Authorization")!=null)
		{
			String auth = (String) req.getParameter("Authorization");
			if(authorize(auth,Configuration.apiKey))
			{
				resp.setStatus(HttpStatus.SC_ACCEPTED);
				partManipulation(req, resp);
				resp.getWriter().println("Authorized");
			    resp.setContentType("text/plain");
			    resp.getWriter().println("hello");

			}
			else
			{
				resp.setStatus(HttpStatus.SC_UNAUTHORIZED);
				resp.getWriter().println("UNAUTHORIZED");

			}
			
		}
		else
		{
			resp.setStatus(HttpStatus.SC_BAD_REQUEST);
			resp.getWriter().println("BAD_REQUEST");
		}
		
		
		resp.getWriter().println(resp.getStatus());
	      
		
	}

	private void partManipulation(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		//OKLeitura
		for (Part part : req.getParts()) {		  
		    if(part.getName().equals("upload"))
		    {
		    	String filename = getFileName(part);
		    	InputStream fileInputStream = part.getInputStream();
		    	
		    	AmazonS3Utils am3u = new AmazonS3Utils();
		    	
		    	System.out.println(filename);
		    	boolean uploaded = (am3u.addFile(fileInputStream, filename, Configuration.folderToConvert));
		    	
		    	if(uploaded)
		    	{
		    		resp.getWriter().println(am3u.listUrl(Configuration.folderToConvert,filename));
		    	}
		    	
		    }
		    
		    else
		    {
		    	String xx  = req.getParameter(part.getName());
		    	
		    }
		}
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}
	
	
	
	private String getFileName(Part part) {
	    for (String content : part.getHeader("content-disposition").split(";")) {
	        if (content.trim().startsWith("filename"))
	            return content.substring(content.indexOf("=") + 2, content.length() - 1);
	        }
	    return null;
	}
	
	
	
}
