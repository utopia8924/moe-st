package ccu.cc.SSO;

import org.apache.commons.lang3.StringUtils;

public class DiffDemo {

		public String getDiff(String str1, String str2 ) throws Exception {
			
			if (StringUtils.isEmpty(str1) || (StringUtils.isEmpty(str2))) {
				throw new Exception("Empty or null string is not allowed");
			}
			
			return StringUtils.difference(str1, str2);
		}
}
