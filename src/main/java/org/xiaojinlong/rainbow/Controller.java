package org.xiaojinlong.rainbow;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Jin Long
 * 2015/7/27
 */
public interface Controller {

    void process(URI uri, HttpServletRequest req, HttpServletResponse resp);

}
