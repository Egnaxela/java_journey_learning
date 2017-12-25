/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月25日 下午4:13:36  
 *  
 */  

package com.spider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.processor.example.GithubRepoPageProcessor;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月25日 下午4:13:36  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月25日      Eg                      1.0         1.0 Version  
 */

public class SpiderMark implements PageProcessor {

	    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);

	    @Override
	    public void process(Page page) {
	        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/\\w+/\\w+)").all());
	        page.putField("author", page.getUrl().regex("https://github\\.com/(\\w+)/.*").toString());
	        page.putField("name", page.getHtml().xpath("//h1[@class='entry-title public']/strong/a/text()").toString());
	        if (page.getResultItems().get("name")==null){
	            //skip this page
	            page.setSkip(true);
	        }
	        page.putField("readme", page.getHtml().xpath("//div[@id='readme']/tidyText()"));
	    }

	    @Override
	    public Site getSite() {
	        return site;
	    }

	    public static void main(String[] args) {
	        Spider.create(new GithubRepoPageProcessor()).addUrl("https://github.com/code4craft").thread(5).run();
	    }
	

}
