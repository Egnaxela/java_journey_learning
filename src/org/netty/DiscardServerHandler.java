/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月21日 下午5:17:12  
 *  
 */  

package org.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月21日 下午5:17:12  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月21日      Eg                      1.0         1.0 Version  
 */

public class DiscardServerHandler extends ChannelInboundHandlerAdapter{
	
	@Override
	public void channelRead(ChannelHandlerContext ctx,Object msg) {
		((ByteBuf)msg).release();
		
		//or
		
		   ByteBuf in = (ByteBuf) msg;
		    try {
		        while (in.isReadable()) { // (1)
		            System.out.print((char) in.readByte());
		            System.out.flush();
		        }
		    } finally {
		        ReferenceCountUtil.release(msg); // (2)
		    }
		    // 或者直接打印
		    System.out.println("Yes, A new client in = " + ctx.name());
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx,Throwable throwable) {
		throwable.printStackTrace();
		ctx.close();
	}
}
