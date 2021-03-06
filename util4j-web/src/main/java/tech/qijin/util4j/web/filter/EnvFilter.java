package tech.qijin.util4j.web.filter;

import tech.qijin.util4j.trace.pojo.EnvEnum;
import tech.qijin.util4j.trace.util.EnvUtil;
import tech.qijin.util4j.web.util.ServletUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author michealyang
 * @date 2018/11/23
 * 开始做眼保健操：←_← ↑_↑ →_→ ↓_↓
 **/
public class EnvFilter implements Filter {

    private static final String[] TEST_KEYWORDS = {"test", "localhost", "127.0.0.1"};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String host = ServletUtil.getHost((HttpServletRequest) request);
        EnvEnum envEnum = isTest(host)
                ? EnvEnum.TEST
                : EnvEnum.PRODUCT;
        EnvUtil.setEnv(envEnum);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

    private boolean isTest(String host) {
        for (String keyword : TEST_KEYWORDS) {
            if (host.contains(keyword)) {
                return true;
            }
        }
        return false;
    }
}
