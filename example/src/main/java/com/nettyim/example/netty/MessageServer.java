package com.nettyim.example.netty;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

/**
 * Created by samdyli on 16-12-16.
 */
public class MessageServer {

    public static void main(String[] args) {
        ChannelFactory cf = new NioServerSocketChannelFactory(
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool()
        );

        ServerBootstrap bootstrap = new ServerBootstrap(cf);
        bootstrap.setPipelineFactory(
                new ChannelPipelineFactory() {
                    public ChannelPipeline getPipeline() throws Exception {
                        return Channels.pipeline((ChannelPipeline) new MessageHandler());
                    }
                }
        );

        bootstrap.setOption("child.tcpNoDelay", true);
        bootstrap.setOption("child.keepAlive", true);

        bootstrap.bind(new InetSocketAddress(8009));
    }
}
