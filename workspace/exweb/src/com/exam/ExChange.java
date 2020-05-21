package com.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet("/exchange.do")
public class ExChange extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	req.setCharacterEncoding("UTF-8");
	
	String money = req.getParameter("dollar");
	
	
	
	
	
		
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
	
	double num = Double.parseDouble(money);
	double result = num * 1216.90;
	
	out.println(money + "달러" + result + "원<br />");
	out.println("현찰 사실때" + (num * 1238.19) + "원<br />");
	out.println("현찰 파실때" + (num * 1195.61) + "원<br />");
	out.println("송금 보내실때" + (num * 1228.80) + "원<br />");
	out.println("송금 받으실때" + (num * 1205.00) + "원<br />");

	out.println("	</body>                      ");
	out.println("	</html>   					");
}
}
