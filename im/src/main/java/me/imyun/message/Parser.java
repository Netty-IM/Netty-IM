package me.imyun.message;

import me.imyun.request.Request;

/**
 * Copyright © Netty-IM team. All rights reserved.
 * @author samdyli
 */


public interface Parser {

    Message parser(Request request, MessageFormater format);

}
