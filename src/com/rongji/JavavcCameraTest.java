/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月22日 下午6:54:03  
 *  
 */  

package com.rongji;

import java.awt.Button;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月22日 下午6:54:03  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月22日      Eg                      1.0         1.0 Version  
 */



import javax.swing.JFrame;  

import org.bytedeco.javacv.CanvasFrame;  
import org.bytedeco.javacv.OpenCVFrameConverter;  
import org.bytedeco.javacv.FrameGrabber.Exception;
import org.bytedeco.javacv.OpenCVFrameGrabber;  

  
/** 
 * 调用本地摄像头窗口视频 
 * @author eguid   
 * @version 2016年6月13日   
 * @see javavcCameraTest   
 * @since  javacv1.2 
 */  
  
public class JavavcCameraTest {
	public static void main(String[] args) throws Exception, InterruptedException {
		OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);    
	    grabber.start();   //开始获取摄像头数据  
	    CanvasFrame canvas = new CanvasFrame("现场查验-拍摄中");//新建一个窗口  
//	    canvas.add(new Button("保存并上传"));
//	    canvas.add(new Button("取消"));
	    canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    canvas.setAlwaysOnTop(true);  
	      
	    while(true)  
	    {  
	        if(!canvas.isDisplayable())  
	        {//窗口是否关闭  
	            grabber.stop();//停止抓取  
	           // System.exit(2);//退出  
	        }  
	        canvas.showImage(grabber.grab());//获取摄像头图像并放到窗口上显示， 这里的Frame frame=grabber.grab(); frame是一帧视频图像  
	  
	        Thread.sleep(50);//50毫秒刷新一次图像  
	    }  
		
	}
}  
