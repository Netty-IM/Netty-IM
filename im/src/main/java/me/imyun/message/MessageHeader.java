package me.imyun.message;

/**
 * Copyright © Netty-IM team. All rights reserved.
 * @author samdyli
 */


public interface MessageHeader {
    Byte getMagic();
    int getMillionTime();
    int getVersion();
}