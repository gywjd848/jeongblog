package com.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal.do")
public class CalServlet extends HttpServlet  {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		
		String x = req.getParameter("x");
		String y = req.getParameter("y");
		String op = req.getParameter("op");
		
		
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
		
		double num1 = Double.parseDouble(x);
		double num2 = Double.parseDouble(y);
			
		double result = 0;
		String opOut;
		
		switch (op) {
		case "plu":
			result = num1 + num2;
			opOut = "+";
			break;
		case "min":
			result = num1 - num2;
			opOut = "-";
			break;
		case "mul":
			result = num1 * num2;
			opOut = "*";
			break;
		case "div":
			result = num1 / num2;
			opOut = "/";
			break;
		default:
			System.out.println("알 수 없는 연산자");
			return;
			
		}
		
		out.println(x + opOut + y + "=" + result);
		
//		if(op.equals("plu")) {
//			out.println(num1 + " " + "+" + num2 + "=" + (result = num1 + num2));
//		}else if(op.equals("min")) {
//			out.println(num1 + " " + "-" + num2 + "=" + (result = num1 - num2));
//		}else if(op.equals("mul")) {
//			out.println(num1 + " " + "*" + num2 + "=" + (result = num1 * num2));
//		}else if(op.equals("div")) {
//			out.println(num1 + " " + "/" + num2 + "=" + (result = num1 / num2));
//		}
	
		
		out.println("	</body>                      ");
		out.println("	</html>   					");
		
	}

}
