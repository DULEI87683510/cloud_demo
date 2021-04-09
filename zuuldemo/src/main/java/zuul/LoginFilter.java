package zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @className LoginFilter
 * @description 登录过滤器
 * @author DL
 * @date 2019/12/4 17:01
 * @version 1.0
 */
@Component
public class LoginFilter extends ZuulFilter{
    /**
     *拦截类型pre
     */
    private final static String FILTER_TYPE_PRE="pre";
    @Override
    public String filterType() {
        return FILTER_TYPE_PRE;
    }

    @Override
    public int filterOrder() {
        /**
         * 拦截的顺序
         */
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        /**
         * true该拦截器生效
         * false不生效
         */
        return true;
    }

    /**
     * 拦截的逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
     /*   // 登录校验逻辑。
        // 1）获取Zuul提供的请求上下文对象
        RequestContext ctx = RequestContext.getCurrentContext();
        // 2) 从上下文中获取request对象
        HttpServletRequest req = ctx.getRequest();
        // 3) 从请求头中获取token
        String token = req.getHeader("accessToken");
        // 4) 判断
        if(token == null || "".equals(token.trim())){
            // 没有token，登录校验失败，拦截
            ctx.setSendZuulResponse(false);
            // 返回401状态码。也可以考虑重定向到登录页。
            ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }*/
        System.out.println("1111111111111111");
        return null;
    }
}
