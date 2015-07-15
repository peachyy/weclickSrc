/*
 * test.java
 * Created on 2015��7��14�� ����2:53:01
 * Copyright (c) ������Ѷ�����������޹�˾  All Rights Reserved.
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
 * Copyright (c) 2015,������Ѷ�����������޹�˾<br>
 * All rights reserved.<br>
 *
 * �ļ����ƣ�test.java<br>
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
public class test extends JFrame {
	public static void main(String[] args) {
		Jedis jedis=DButil.getJedis();
		String uid=String.valueOf(jedis.incr(KeyUtils.UID_AUTO_NUM));
		User user=new User();
		user.setAge("23");
		user.setId(uid);
		user.setName("happy");
		user.setPassword("5757124");
		user.setSex("��");
		jedis.hmset(KeyUtils.getUID(uid),user.toMap());
		System.out.println(jedis.hget(KeyUtils.getUID(uid), "name"));
	}
}