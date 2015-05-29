/*
 * redisTest.java
 * Created on 2015��5��28�� ����5:23:36
 * Copyright (c) ������Ѷ�����������޹�˾  All Rights Reserved.
 * http://www.upsoft.com.cn
 *
 * This software is the confidential and proprietary information of UPSoft.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with UPSoft.
 */
package com.redis.test;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.util.Pool;

/**
 *
 *
 *
 * Copyright (c) 2015,������Ѷ�����������޹�˾<br>
 * All rights reserved.<br>
 *
 * �ļ����ƣ�redisTest.java<br>
 * ժҪ����Ҫ�������ļ�������<br>
 * -------------------------------------------------------<br>
 * ��ǰ�汾��1.1.1<br>
 * ���ߣ�xs Tao <br>
 * ������ڣ�2015��5��28��<br>
 * -------------------------------------------------------<br>
 * ȡ���汾��1.1.0<br>
 * ԭ���ߣ�xs Tao <br>
 * ������ڣ�2015��5��28��<br>
 */
public class redisTest {
	static JedisPool pool;
	static Jedis jedis; 
	public static void main(String[] args) {
		pool = new JedisPool(new JedisPoolConfig(), "localhost");  
		jedis = pool.getResource(); 
		
		//
		jedis.set("name","��С��");//��key-->name�з�����value-->minxr 
		System.out.println(jedis.get("name"));
		jedis.append("name", "��һ������");
		System.out.println(jedis.get("name"));
		jedis.set("name","����");
		System.out.println(jedis.get("name"));
		jedis.del("name");
		System.out.println(jedis.get("name"));
		Map<String,String> mp=new HashMap<String, String>();
		mp.put("mapname", "nosql");
		jedis.hmset("mapTest",mp);
		System.out.println(jedis.hmget("mapTest", "mapname"));
	}
}