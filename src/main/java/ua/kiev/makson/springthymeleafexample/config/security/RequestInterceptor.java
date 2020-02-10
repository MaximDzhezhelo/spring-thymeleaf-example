package ua.kiev.makson.springthymeleafexample.config.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RequestInterceptor implements HandlerInterceptor {

  private static final Logger ACCESS_LOGGER = LoggerFactory.getLogger("access");

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    ACCESS_LOGGER.info("User: {}, remoteIpAddress: {}, executed: {}", request.getRemoteUser(), request.getRemoteAddr(), request.getRequestURI());
    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) { }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) { }

}