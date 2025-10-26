package com.rolmer.mymock;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;

@Component
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Inicialização do filtro, se necessário
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.println("METHOD: " + request.getMethod());
        System.out.println("URI: " + request.getRequestURI());
        System.out.println("QUERY: " + request.getQueryString());
        Enumeration<String> headerNames = request.getHeaderNames();
        while
        (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
        }
    }

    @Override
    public void destroy() {
        // Limpeza de recursos, se necessário
    }
}
