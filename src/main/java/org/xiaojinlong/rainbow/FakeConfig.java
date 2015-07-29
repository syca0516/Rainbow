package org.xiaojinlong.rainbow;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Jin Long
 * 2015/7/27
 */
public class FakeConfig implements Config {
    @Override
    public Map<Pattern, Class<? extends Controller>> configRoutes() {
        Map<Pattern, Class<? extends Controller>> routes = new HashMap<>();
        routes.put(Pattern.compile("/happy/\\d+"), FakeController.class);
        routes.put(Pattern.compile("/\\d+/edit"), FakeController.class);
        return routes;
    }
}
