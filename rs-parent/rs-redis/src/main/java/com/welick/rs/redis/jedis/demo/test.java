/*
 * test.java
 * Created on 2015年7月14日 下午2:53:01
 * Copyright (c) 重庆扬讯软件技术有限公司  All Rights Reserved.
 * http://www.upsoft.com.cn
 *
 * This software is the confidential and proprietary information of UPSoft.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with UPSoft.
 */
package com.welick.rs.redis.jedis.demo;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import redis.clients.jedis.Jedis;

/**
 *
 *
 *
 * Copyright (c) 2015,重庆扬讯软件技术有限公司<br>
 * All rights reserved.<br>
 *
 * 文件名称：test.java<br>
 * 摘要：简要描述本文件的内容<br>
 * -------------------------------------------------------<br>
 * 当前版本：1.1.1<br>
 * 作者：xs Tao <br>
 * 完成日期：2015年7月14日<br>
 * -------------------------------------------------------<br>
 * 取代版本：1.1.0<br>
 * 原作者：xs Tao <br>
 * 完成日期：2015年7月14日<br>
 */
public class test extends JFrame {
	public static void main(String[] args) {
		Jedis jedis=DButil.getJedis();
		String uid=String.valueOf(jedis.incr(KeyUtils.UID_AUTO_NUM));
		User user=new User();
		user.setAge("23");
		user.setId(uid);
		user.setName("happy");
		user.setPassword("5757124");
		user.setSex("男");
		jedis.hmset(KeyUtils.getUID(uid),user.toMap());
		System.out.println(jedis.hget(KeyUtils.getUID(uid), "name"));
	}
}
