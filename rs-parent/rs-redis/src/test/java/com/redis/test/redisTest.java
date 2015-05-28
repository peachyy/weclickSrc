/*
 * redisTest.java
 * Created on 2015年5月28日 下午5:23:36
 * Copyright (c) 重庆扬讯软件技术有限公司  All Rights Reserved.
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
 * Copyright (c) 2015,重庆扬讯软件技术有限公司<br>
 * All rights reserved.<br>
 *
 * 文件名称：redisTest.java<br>
 * 摘要：简要描述本文件的内容<br>
 * -------------------------------------------------------<br>
 * 当前版本：1.1.1<br>
 * 作者：xs Tao <br>
 * 完成日期：2015年5月28日<br>
 * -------------------------------------------------------<br>
 * 取代版本：1.1.0<br>
 * 原作者：xs Tao <br>
 * 完成日期：2015年5月28日<br>
 */
public class redisTest {
	static JedisPool pool;
	static Jedis jedis; 
	public static void main(String[] args) {
		pool = new JedisPool(new JedisPoolConfig(), "localhost");  
		jedis = pool.getResource(); 
		
		//
		jedis.set("name","陶小松");//向key-->name中放入了value-->minxr 
		System.out.println(jedis.get("name"));
		jedis.append("name", "是一个男生");
		System.out.println(jedis.get("name"));
		jedis.set("name","测试");
		System.out.println(jedis.get("name"));
		jedis.del("name");
		System.out.println(jedis.get("name"));
		Map<String,String> mp=new HashMap<String, String>();
		mp.put("mapname", "nosql");
		jedis.hmset("mapTest",mp);
		System.out.println(jedis.hmget("mapTest", "mapname"));
	}
}
