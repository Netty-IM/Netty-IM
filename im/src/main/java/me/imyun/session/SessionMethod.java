package me.imyun.session;

/**
 * Copyright © Netty-IM team. All rights reserved.
 * @author samdyli
 */

public interface SessionMethod {
    /**
     * Generate session id
     * @return session id
     */
    long generateSessionId();
}
