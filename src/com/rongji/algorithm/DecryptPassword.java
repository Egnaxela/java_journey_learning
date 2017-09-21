/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年7月14日 下午12:23:52  
 *  
 */  

package com.rongji.algorithm;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.rongji.dfish.base.crypt.CryptFactory;
import com.rongji.dfish.base.crypt.StringCryptor;
import com.rongji.dfish.framework.FrameworkHelper;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年7月14日 下午12:23:52  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年7月14日      吴有根                      1.0         1.0 Version  
 */

public class DecryptPassword {
	
	private static final  Logger log=Logger.getLogger(DecryptPassword.class);
	
	@Test
	public void decrypt(){
		StringCryptor sc = getStringCryptor();
		log.info("解密后的 "+sc.decrypt("0SD2HWEJ3G1HW"));
		
	}
	
	public StringCryptor getStringCryptor() {
		String secretKey = FrameworkHelper.getSystemConfig(CiqConstants.MOD_USER_PWD_SECRETKEY, "eciq@2016");
		String algorithms = FrameworkHelper.getSystemConfig(CiqConstants.MOD_USER_PWD_ALGORITHMS,
				CryptFactory.BLOWFISH);
		String encoding = FrameworkHelper.getSystemConfig(CiqConstants.MOD_USER_PWD_ENCODING, CryptFactory.UTF8);
		String presentStyle = FrameworkHelper.getSystemConfig(CiqConstants.MOD_USER_PWD_PRESENTSTYLE,
				String.valueOf(CryptFactory.BASE32));
		StringCryptor sc = null;
		if (CryptFactory.BLOWFISH.equals(algorithms)) {
			sc = CryptFactory.getStringCryptor(CryptFactory.BLOWFISH, encoding, Integer.valueOf(presentStyle),
					secretKey);// 密钥
		} else {
			sc = CryptFactory.getStringCryptor(algorithms, encoding, Integer.valueOf(presentStyle));
		}
		return sc;
	}

}
