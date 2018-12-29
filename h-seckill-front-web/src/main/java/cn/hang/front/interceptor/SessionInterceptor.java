package cn.hang.front.interceptor;

import cn.hang.hseckill.common.constant.Global;
import cn.hang.hseckill.common.constant.ResponseMessageEnum;
import cn.hang.hseckill.common.exception.SessionException;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.common.utils.SessionUtils;
import cn.hang.hseckill.common.utils.UserHome;
import cn.hang.hseckill.pojo.po.UserPO;
import cn.hang.hseckill.pojo.vo.front.UserVO;
import com.alibaba.fastjson.JSON;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lihang15
 * @description session拦截器
 * @create 2018-12-14 13:32
 **/
public class SessionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding("utf-8");
        UserVO userVO = null;
        try {
            userVO = UserHome.currentUser();
        } catch (SessionException e) {
            response.setHeader("content-type", "application/json;charset=UTF-8");
            response.getWriter().print(JSON.toJSONString(Response.error(ResponseMessageEnum.NO_COMPETENCE)));
            return false;
        }
        return true;
    }
}
