package zlx.controller.Interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       /* System.out.println("方法前1");*/
        //判断用户是否登录 登录就放行 不登陆不放行
        String uri=request.getRequestURI();
        if (!uri.contains("my")&&!uri.contains("test")){
            Integer count = (Integer) request.getSession().getAttribute("count");
            if (null==count){
                response.sendRedirect(request.getContextPath()+"/my.action");
                return false;
            }
            if (count!=null&&count==0){
                response.sendRedirect(request.getContextPath()+"/my.action");
                return false;
            }
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("方法后1");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println("页面渲染后1");
    }
}
