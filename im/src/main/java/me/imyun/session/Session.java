package me.imyun.session;

/**
 * Copyright © Netty-IM team. All rights reserved.
 * @author samdyli
 */

public interface Session {
    /**
     * Get session id of request
     * @return session id
     */
    long getSessionId();

    /**
     * Set session id of request
     * @param sessionId
     */
    void setSessionId(long sessionId);

    /**
     * Set session method which is used to generate session id
     * @param method session method
     */
    void setMethod(SessionMethod method);
}
