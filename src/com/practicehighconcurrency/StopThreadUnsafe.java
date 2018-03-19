/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月19日 下午4:12:46  
 *  
 */  

package com.practicehighconcurrency;

import com.google.gson.Authors;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月19日 下午4:12:46  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月19日      Eg                      1.0         1.0 Version  
 */

public class StopThreadUnsafe {
	public static User u=new User();
	public static  class User{
		private int id;
		private String name;
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public User() {
			super();
		}

		public User(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + "]";
		}
	}
	
	public static class ChangeObjectThread extends Thread{
		volatile boolean stopme=false;
		public void stopme() {
			stopme=true;
		}
		
		@Override
		public void run() {
			while(true) {
				if(stopme) {
					break;
				}
				
				synchronized (u) {
					int v=(int)(System.currentTimeMillis()/1000);
					u.setId(v);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
					u.setName(String.valueOf(v));;
				}
				
				Thread.yield();
			}
		}
	}
	
	public static class ReadObjectThread extends Thread{
		@Override
		public void run() {
			while(true) {
				synchronized (u) {
					if(u.getId()!=Integer.parseInt(u.getName())) {
						System.out.println(u);
					}
				}
				
				Thread.yield();
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		new ReadObjectThread().start();
		while(true) {
			Thread thread=new ChangeObjectThread();
			thread.start();
			Thread.sleep(450);
			thread.stop();
		}
	}
	
	

}
