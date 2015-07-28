package org.xiaojinlong.rainbow;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Jin Long
 * 2015/7/27
 */
public class DispatcherServlet extends HttpServlet {

    private static Map<Pattern, Class<? extends Controller>> routes = null;

    public String configClassName = "org.xiaojinlong.rainbow.FakeConfig";

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)  {

        Config config = null;
        try {
            config = (Config)Class.forName(configClassName).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.err.println("’“≤ªµΩ≈‰÷√¿‡");
            e.printStackTrace();
        }

        assert config != null;
        DispatcherServlet.routes = config.configRoutes();

        String uri = req.getRequestURI().replace(req.getContextPath(), "");

        for (Map.Entry<Pattern, Class<? extends Controller>> entry : routes.entrySet()) {
            if (entry.getKey().matcher(uri).matches()) {
                Controller controller = null;
                try {
                    controller = entry.getValue().newInstance();
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }

                assert controller != null;
                controller.process(uri, req, resp);
            }
        }

    }
}
