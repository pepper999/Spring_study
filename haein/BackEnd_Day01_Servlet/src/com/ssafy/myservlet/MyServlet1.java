package com.ssafy.myservlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// �ش� Ŭ������ �������� ����� ���ؼ��� Servlet�� �����ؾ��Ѵ�.
public class MyServlet1 implements Servlet {

	@Override
	public void destroy() {
		
	}

	@Override
	public ServletConfig getServletConfig() {

		return null;
	}

	@Override
	public String getServletInfo() {

		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		
	}

}
