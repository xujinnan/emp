package org.xjn.employ.util;

import java.util.UUID;

public class UuidCode {
/**
 * 产生UUID值
 * @param userId
 * @return
 */
	public static String productUuid(int userId){
	  UUID uuid =  UUID.randomUUID();
		return uuid.toString()+"-"+userId;
	}
	/**
	 * 获取Uuid
	 */
	public static String getUuid(String uuid){
		return uuid.substring(0,uuid.lastIndexOf("-"));
	}
	/**
	 * 获取Id值
	 */
	public static int getUserId(String uuid){
		return Integer.parseInt(uuid.substring(uuid.lastIndexOf("-")+1));
	}
	
}
