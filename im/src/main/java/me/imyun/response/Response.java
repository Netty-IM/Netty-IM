package me.imyun.response;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Copyright © Netty-IM team. All rights reserved.
 * @author samdyli
 */

public interface Response {
    /**
     * Get response million time
     * @return response million time
     */
    long getMillion();

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
