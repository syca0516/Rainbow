package org.xiaojinlong.rainbow;

import java.util.Map;
import java.util.regex.Pattern;

/**
 * Jin Long
 * 2015/7/27
 */
public interface Config {
    Map<Pattern, Class<? extends Controller>> configRoutes();
}
