package com.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		
	out.println("	<!DOCTYPE html>              ");
	out.println("	<html>                       ");
	out.println("	<head>                       ");
	out.println("	<meta charset=\"UTF-8\">      ");
	out.println("	<title>파라미터 테스트</title>    ");
	out.println("	</head>                      ");
	out.println("	<body>                       ");
	
	if(id.equals("a001")) {
		if(pw.equals("1234")) {
			out.println("<h1>로그인 성공!</h1>");
		}else {
			out.println("<h1>로그인 실패!</h1>");
		}
	}else {
		out.println("<h1>로그인 실패!</h1>");
	}
	
	
	out.println("	</body>                      ");
	out.println("	</html>                      ");
		
		}
		
	}


