package com.nettyim.core.message;

import me.imyun.message.MessageFormater;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class SimpleMessage extends AbstractMessageImpl {
    private int version;
    private Byte[] bytes;

    public MessageFormater getFormater() {
        return null;
    }

    public int getVersion() {
        return version;
    }

    public Byte[] getBytes() {
        return bytes;
    }
}
