package com.nettyim.core.message;

import me.imyun.message.Message;
import me.imyun.message.MessageFormater;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class MessageBuilder {
    private MessageFormater format;
    private int version;

    private Byte[] bytes;

    MessageBuilder format(MessageFormater format) {
       this.format = format;
        return this;
    }

    MessageBuilder version(int version) {
        this.version = version;
        return this;
    }

    MessageBuilder bytes(Byte[] bytes) {
       this.bytes = bytes;
        return this;
    }

    Message buid() {
       Message message = new SimpleMessage();
        return message;
    }


}
