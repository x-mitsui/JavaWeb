package com.dzq;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/19 - 07 - 19 - 13:44
 * @Description: com.dzq
 * @version: 1.0
 */
public class MyServlet extends HttpServlet {
    /**
     * 接受http请求，做出响应
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        resp.setCharacterEncoding("UTF-8");
//设置浏览器默认打开的时候采用的字符集
        resp.setHeader("Content-Type","text/html;charset=UTF-8");
        int data  = new Random().nextInt();
        String result = data%2==0?"偶数":"你好";
        System.out.println("result:"+result);
        PrintWriter writer = resp.getWriter();
        writer.write(result);
    }
}
