package com.fei.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: fengzf fengzf@gstarcad.com
 * @MethodName:
 * @@Description:  自定义过滤器
 * @params
 * @return
 * @Date:  2019/4/19 15:41
 */
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
    }

    @Override
    public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        HttpServletRequest request = (HttpServletRequest) srequest;
        System.out.println("this is MyFilter,url :"+request.getRequestURI());
        filterChain.doFilter(srequest, sresponse);
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
    }

}