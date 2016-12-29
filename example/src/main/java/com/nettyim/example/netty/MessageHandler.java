package com.nettyim.example.netty;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

/**
 * Created by samdyli on 16-12-16.
 */
public class MessageHandler extends SimpleChannelHandler {
    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        System.out.println(e.getMessage());
    }

    /**
     * In most cases, the caught exception should be logged
     * and its associated channel should be closed here,
     * although the implementation of this method can be different depending on
     * what you want to do to deal with an exceptional situation.
     * For example, you might want to send a response message with an error code before closing the connection.
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {
        e.getCause().printStackTrace();

        Channel ch = e.getChannel();
        ch.close();
    }
}

