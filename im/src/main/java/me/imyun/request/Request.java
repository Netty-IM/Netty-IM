package me.imyun.request;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Copyright © Netty-IM team. All rights reserved.
 * @author samdyli
 */

public interface Request {
    /**
     * Get request million time
     * @return requst million time
     */
    long getMillion();

    /**
     * Get request action
     * @return request action
     */
    Action getAction();

    /**
     * Get output stream of request
     * @return out put stream of request
     */
    OutputStream getOutPutStream();

    /**
     * Set input stream of request
     * @return input stream of request
     */
    InputStream setInputStream();
}
