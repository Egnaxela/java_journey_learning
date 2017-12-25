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
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

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

	    //1、抓取网站的设置 、编码、间隔时间、重试次数
	    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

	    @Override
	    public void process(Page page) {
	    	//2、从页面后续的url地址来抓取
	    	//获取用于满足正则表达式 (https://github\\.com/[\\w\\-]+/[\\w\\-]+) 所有的链接,并将它们加入到待抓取的队列中 addTargetRequests
	    	page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/[\\w\\-]+/[\\w\\-]+)").all());
	        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/[\\w\\-])").all());
	        
	        
	        /**
	         * 抽取下载到的html页面，三种技术：
	         * 1、XPath
	         * 2、正则表达式
	         * 3、CSS选择器
	         *  
	         */
	        //3、定义如何抽取页面信息并保存下来
	        // 它表示匹配了所有"https://github.com/code4craft/webmagic" 这样的链接
	        page.putField("author", page.getUrl().regex("https://github\\.com/(\\w+)/.*").toString());
	        
	        //  查找所有class属性为'public'的h1元素，并找到它的strong子节点的a子节点，并提取a节点的文本信息
	        page.putField("name", page.getHtml().xpath("//h1[@class='public']/strong/a/text()").toString());
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
	        Spider.create(new SpiderMark())
	        			.addUrl("https://github.com/code4craft")//从该地址开始抓取
	        			.addPipeline(new JsonFilePipeline("D:\\eclipse\\workspace\\java_resource\\webmagicResult"))
	        			.thread(5)  //开启5个线程抓取
	        			.run(); //启动线程 
	    }
	

}
