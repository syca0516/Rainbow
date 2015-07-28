package org.xiaojinlong.rainbow;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Jin Long
 * 2015/7/27
 */
public class FakeController implements Controller {
    @Override
    public void process(String obj, HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("###" + obj);
    }
}
