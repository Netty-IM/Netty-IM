package com.nettyim.example.netty;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

/**
 * Created by samdyli on 16-12-16.
 */
public class MessageClient {

    public static void main(String[] args) {
        String ip = "127.0.0.1";
        int port = 8009;

        ChannelFactory cf = new NioClientSocketChannelFactory(
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool()
        );

        ClientBootstrap cbs = new ClientBootstrap(cf);

        cbs.setPipelineFactory(new ChannelPipelineFactory() {
            public ChannelPipeline getPipeline() throws Exception {
                return Channels.pipeline((ChannelPipeline) new MessageSender());
            }
        });



        cbs.setOption("tcpNoDelay", true);
        cbs.setOption("keepAlive", true);

        cbs.connect(new InetSocketAddress(ip, port));
    }
}
