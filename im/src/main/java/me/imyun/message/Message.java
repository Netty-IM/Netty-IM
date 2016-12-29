package me.imyun.message;

 /**
 * Copyright © Netty-IM team. All rights reserved.
 * @author samdyli
 */

public interface Message {
    MessageFormater getFormater();
     int getVersion();
     Byte[] getBytes();
}
