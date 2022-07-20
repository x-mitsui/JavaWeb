package com.dzq;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/19 - 07 - 19 - 15:00
 * @Description: com.dzq
 * @version: 1.0
 */
public class loginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("login执行了-------");
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        if("dzq".equals(account)&&"123".equals(password)){
            resp.getWriter().write("succeed");
        }else {
            resp.getWriter().write("failed");
        }
    }
}
