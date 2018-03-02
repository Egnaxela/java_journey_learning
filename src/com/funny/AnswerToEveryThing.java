/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月1日 下午5:42:29  
 *  
 */  

package com.funny;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月1日 下午5:42:29  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月1日      Eg                      1.0         1.0 Version  
 */

public class AnswerToEveryThing{
	
	public static void main(String[] args) {
        String s = "Hitchhiker's Guide to the Galaxy";
        String s2 = "Don'tPanic";
        String s3 = "The Restaurant at the End of the Universe.";
 
        int arthur_dent = s.length();
        int ford_prefect = s2.length();
        int zooey_deschanel = s3.length();
        int vogon_poetry = arthur_dent + ford_prefect;
 
        System.out.println("         " + vogon_poetry + "       " + zooey_deschanel + " " + zooey_deschanel); //in case you're confused, I'm using Zooey to print the big '2', and Vogons to print the big '4'.
        System.out.println("       " + vogon_poetry + vogon_poetry + "     " + zooey_deschanel + "     " + zooey_deschanel);
        System.out.println("     " + vogon_poetry + "  " + vogon_poetry + "    " + zooey_deschanel + "       " + zooey_deschanel);
        System.out.println("   " + vogon_poetry + "    " + vogon_poetry + "            " + zooey_deschanel);
        System.out.println(" " + vogon_poetry + "      " + vogon_poetry + "          " + zooey_deschanel);
        System.out.println(vogon_poetry + " " + vogon_poetry + " " + vogon_poetry + " DA " + vogon_poetry + "     " + zooey_deschanel);
        System.out.println("         " + vogon_poetry + "     " + zooey_deschanel);
        System.out.println("         " + vogon_poetry + "    " + zooey_deschanel + " " + zooey_deschanel + " " + zooey_deschanel + " " + zooey_deschanel);
    }
}

