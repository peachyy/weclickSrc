/*
 * test.java
 * Created on 2015年7月9日 上午10:43:03
 * Copyright (c) 重庆扬讯软件技术有限公司  All Rights Reserved.
 * http://www.upsoft.com.cn
 *
 * This software is the confidential and proprietary information of UPSoft.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with UPSoft.
 */
package com.mongodb.test;

import java.net.UnknownHostException;
import java.util.Iterator;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import com.mongodb.Mongo;
import com.mongodb.MongoOptions;

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
 * 完成日期：2015年7月9日<br>
 * -------------------------------------------------------<br>
 * 取代版本：1.1.0<br>
 * 原作者：xs Tao <br>
 * 完成日期：2015年7月9日<br>
 */
public class test {
	public static final String HOST="localhost";
	public static final Integer PORT=27017;
	
	Mongo mongo=null;
	@Before
	public void before(){
		try {
			mongo=new Mongo(HOST,PORT);
			//mongodb 数据库连接参数配置
			 MongoOptions opt = mongo.getMongoOptions();
			 opt.connectionsPerHost=10;//设置连接池大小
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void getDbs(){
		System.out.println(111);
		 Iterator<String> it=mongo.getDatabaseNames().iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
	}
}
