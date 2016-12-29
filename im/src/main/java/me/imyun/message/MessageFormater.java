package me.imyun.message;

 /**
 * Copyright © Netty-IM team. All rights reserved.
 * @author samdyli
 */

public interface MessageFormater {
    MessageHeader getHeader();
    MessageBody getBody();
}
