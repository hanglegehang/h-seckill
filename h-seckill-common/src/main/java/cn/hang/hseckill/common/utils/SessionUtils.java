package cn.hang.hseckill.common.utils;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Session management.
 *
 * @author subo
 */
@Slf4j
public class SessionUtils {

    /**
     * Returns the HttpServletRequest currently bound to the thread.
     *
     * @return
     */
    public static HttpServletRequest currentRequest() {
        ServletRequestAttributes attrs =
                (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        return attrs.getRequest();
    }

    /**
     * Returns the HttpSession currently bound to the thread.
     *
     * @return
     */
    public static HttpSession currentSession() {
        HttpServletRequest req = currentRequest();
        HttpSession session = req.getSession();
        log.debug("session id: " + session.getId());
        return session;
    }

    /**
     * Returns the HttpSession currently bound to the thread or, if if there is no current session and
     * create is true, returns a new session.
     *
     * @param create
     * @return
     */
    public static HttpSession currentSession(boolean create) {
        HttpServletRequest req = currentRequest();
        HttpSession session = req.getSession(create);
        log.debug("session id: " + session.getId());
        return session;
    }

    /**
     * Binds an object to this session, using the name specified. If an object of the same name is
     * already bound to the session, the object is replaced.
     *
     * @param name
     * @param value
     */
    public static void put(String name, Object value) {
        HttpSession session = currentSession(true);
        if (session == null) {
            return;
        }

        try {
            session.setAttribute(name, value);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    /**
     * Returns the object bound with the specified name in this session, or null if no object is bound
     * under the name.
     *
     * @param name
     */
    public static Object get(String name) {
        HttpSession session = currentSession(true);
        if (session == null) {
            return null;
        }

        try {
            return session.getAttribute(name);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return null;
    }

    /**
     * Removes the object bound with the specified name from this session. If the session does not
     * have an object bound with the specified name, this method does nothing.
     *
     * @param name
     */
    public static void remove(String name) {
        HttpSession session = currentSession(true);
        if (session == null) {
            return;
        }

        try {
            session.removeAttribute(name);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    /**
     * Invalidates this session and unbinds any objects bound to it.
     */
    public static void invalidate() {
        HttpSession session = currentSession(true);
        if (session == null) {
            return;
        }

        try {
            session.invalidate();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
