package com.itheima;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

public class HelloServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello接收到请求了,我已经收到了,有什么指示请讲,HaoJun?");
        String username = servletRequest.getParameter("username");
        System.out.println(username);


        String name = "xiaohong";
        servletResponse.getWriter().print(name+new Date().toLocaleString());


    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
