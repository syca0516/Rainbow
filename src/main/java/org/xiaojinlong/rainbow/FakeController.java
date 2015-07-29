package org.xiaojinlong.rainbow;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * Jin Long
 * 2015/7/27
 */
public class FakeController implements Controller {
    @Override
    public void process(URI uri, HttpServletRequest req, HttpServletResponse resp) {
//        System.out.println("###" + uri);
//        System.out.println(uri.get(0));
//        Map<String, String[]> paraMap = req.getParameterMap();
//        System.out.println(paraMap.get("a").length);
//        if (uri.get(0).equals("happy"))
//            call("passTo", this);

    }

    public void passTo(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Method[] method = FakeController.class.getMethods();
//        for (Method m: method)
//            System.out.println(m.getName());
        FakeController f = new FakeController();
        Method method = f.getClass().getMethod("passTo", int.class);
        method.invoke(f, 3);
    }

    static void call(Object receiver, String methodName, Class<?>... paraTypes) {
//        receiver.getClass().getMethod(methodName, paraTypes).invoke(receiver)
    }

}
