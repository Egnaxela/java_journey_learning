/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月12日 下午6:28:10  
 *  
 */  

package com.google.gson;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月12日 下午6:28:10  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月12日      Eg                      1.0         1.0 Version  
 */

public class Poet {
	
	private String strains;
	private String author;
	private String paragraphs;
	private String title;
	public String getStrains() {
		return strains;
	}
	public void setStrains(String strains) {
		this.strains = strains;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getParagraphs() {
		return paragraphs;
	}
	public void setParagraphs(String paragraphs) {
		this.paragraphs = paragraphs;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Poet [ title=" + title + "author=" + author + ", paragraphs=" + paragraphs+"]";
	}
	
}
