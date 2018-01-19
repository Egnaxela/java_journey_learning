/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年1月9日 下午4:51:07  
 *  
 */  

package org.netty.inaction;

import java.net.InetSocketAddress;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年1月9日 下午4:51:07  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年1月9日      Eg                      1.0         1.0 Version  
 */

public class EchoClient {
	private final String host;
	private final int port;
	public EchoClient(String host,int port) {
		this.host=host;
		this.port=port;
	}
	
	public void start() throws Exception {
		EventLoopGroup group=new NioEventLoopGroup();
		try {
			Bootstrap b=new Bootstrap();
			b.group(group)
				.channel(NioSocketChannel.class)
				.remoteAddress(new InetSocketAddress(host, port))
				.handler(new ChannelInitializer<SocketChannel>() {
					@Override
					public void initChannel(SocketChannel socketChannel) {
						socketChannel.pipeline().addLast(new EchoClientHandler());
					}
				});
			
			//连接到远程节点，阻塞等待直到连接完成
			ChannelFuture future=b.connect().sync();
			future.channel().closeFuture().sync();
		} finally {
			//关闭线程池并释放所有资源
			group.shutdownGracefully().sync();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		if(args.length!=2) {
			System.err.println("Usage: "+EchoClient.class.getName());
			return;
		}
		final String host=args[0];
		final int port=Integer.parseInt(args[1]);
		new EchoClient(host, port).start();
	}
	
}
