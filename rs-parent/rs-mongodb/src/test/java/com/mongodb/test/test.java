/*
 * test.java
 * Created on 2015��7��9�� ����10:43:03
 * Copyright (c) ������Ѷ�����������޹�˾  All Rights Reserved.
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
 * Copyright (c) 2015,������Ѷ�����������޹�˾<br>
 * All rights reserved.<br>
 *
 * �ļ����ƣ�test.java<br>
 * ժҪ����Ҫ�������ļ�������<br>
 * -------------------------------------------------------<br>
 * ��ǰ�汾��1.1.1<br>
 * ���ߣ�xs Tao <br>
 * ������ڣ�2015��7��9��<br>
 * -------------------------------------------------------<br>
 * ȡ���汾��1.1.0<br>
 * ԭ���ߣ�xs Tao <br>
 * ������ڣ�2015��7��9��<br>
 */
public class test {
	public static final String HOST="localhost";
	public static final Integer PORT=27017;
	
	Mongo mongo=null;
	@Before
	public void before(){
		try {
			mongo=new Mongo(HOST,PORT);
			//mongodb ���ݿ����Ӳ�������
			 MongoOptions opt = mongo.getMongoOptions();
			 opt.connectionsPerHost=10;//�������ӳش�С
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