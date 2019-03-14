/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月14日 下午5:01:35  
 *  
 */  

package com.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月14日 下午5:01:35  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月14日      Pluto       1.0         1.0 Version  
 */

public class MP3Player {

	private String filename;
	private Player player;

	public MP3Player(String filename) {
		this.filename = filename;
	}

	public void play() {
		try {
			BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(filename));
			player = new Player(buffer);
			player.play();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		MP3Player mp3 = new MP3Player("F:\\BaiduyunDownload\\深入拆解Java虚拟机\\音频\\第1讲  Java代码是怎么运行的？.mp3");
		mp3.play();
	}

}
