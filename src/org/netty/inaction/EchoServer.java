/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年1月8日 下午6:43:23  
 *  
 */  

package org.netty.inaction;

import java.net.InetSocketAddress;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年1月8日 下午6:43:23  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年1月8日      Eg                      1.0         1.0 Version  
 */

public class EchoServer {

	private final int port;
	public EchoServer(int port){
		this.port=port;
	}
	
	public static void main(String[] args) throws Exception {
		if(args.length!=1) {
			System.err.println("Usage: "+EchoServer.class.getName()+"<port>");
			return;
		}
		int port=Integer.parseInt(args[0]);
		new EchoServer(port).start();
	}
	
	public void start() throws Exception{
		final EchoServletHandler servletHandler=new EchoServletHandler();
		//1、创建EventLoopGroup
		EventLoopGroup group=new NioEventLoopGroup();
		try {
			//2、创建ServerBootstrap
			ServerBootstrap bootstrap=new ServerBootstrap();
			bootstrap.group(group)
						.channel(NioServerSocketChannel.class)//指定所使用的NIO传输Channel
						.localAddress(new InetSocketAddress(port))//使用指定的端口设置套接字地址
						//添加一个EchoserverHandler到子channel的ChannelPipeline
						.childHandler(new ChannelInitializer<SocketChannel>() {
							@Override
							public void initChannel(SocketChannel ch) {
								//因为servletHandler已经被标注为@Sharable,所以总是可以使用同样的实例
								ch.pipeline().addLast(servletHandler);
							}
						});
			ChannelFuture future=bootstrap.bind().sync();
			future.channel().closeFuture().sync();
		}finally {
			group.shutdownGracefully().sync();
		}
		
	}
}
