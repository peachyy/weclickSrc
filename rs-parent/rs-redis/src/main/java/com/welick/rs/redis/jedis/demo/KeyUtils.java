/*
 * KeyUtils.java
 * Created on 2015��7��14�� ����3:27:35
 * Copyright (c) ������Ѷ�����������޹�˾  All Rights Reserved.
 * http://www.upsoft.com.cn
 *
 * This software is the confidential and proprietary information of UPSoft.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with UPSoft.
 */
package com.welick.rs.redis.jedis.demo;

/**
 *
 *
 *
 * Copyright (c) 2015,������Ѷ�����������޹�˾<br>
 * All rights reserved.<br>
 *
 * �ļ����ƣ�KeyUtils.java<br>
 * ժҪ����Ҫ�������ļ�������<br>
 * -------------------------------------------------------<br>
 * ��ǰ�汾��1.1.1<br>
 * ���ߣ�xs Tao <br>
 * ������ڣ�2015��7��14��<br>
 * -------------------------------------------------------<br>
 * ȡ���汾��1.1.0<br>
 * ԭ���ߣ�xs Tao <br>
 * ������ڣ�2015��7��14��<br>
 */
public class KeyUtils {
	static String UID="demo:uid";
	static String UID_AUTO_NUM="demo-uid-index";
	public static String getUID(String uid){
		return UID.concat(uid);
	}
}