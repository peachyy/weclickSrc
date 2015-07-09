/*
 * JmsSender.java
 * Created on 2015年6月4日 上午11:54:10
 * Copyright (c) 重庆扬讯软件技术有限公司  All Rights Reserved.
 * http://www.upsoft.com.cn
 *
 * This software is the confidential and proprietary information of UPSoft.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with UPSoft.
 */
package com.mq.test;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;



/**
 *
 *
 *
 * Copyright (c) 2015,重庆扬讯软件技术有限公司<br>
 * All rights reserved.<br>
 *
 * 文件名称：JmsSender.java<br>
 * 摘要：简要描述本文件的内容<br>
 * -------------------------------------------------------<br>
 * 当前版本：1.1.1<br>
 * 作者：xs Tao <br>
 * 完成日期：2015年6月4日<br>
 * -------------------------------------------------------<br>
 * 取代版本：1.1.0<br>
 * 原作者：xs Tao <br>
 * 完成日期：2015年6月4日<br>
 */
public class JmsSender {
	public static void main(String[] args) throws JMSException {
		ConnectionFactory connectionFactory = new org.apache.activemq.ActiveMQConnectionFactory("tcp://127.0.0.1:61616");
		Connection connection=connectionFactory.createConnection();
		connection.start(); 
		 Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE); 
		 Destination destination = session.createQueue("Test.foo");   //创建一个队列
		 MessageProducer producer = session.createProducer(destination);    
	        producer.setDeliveryMode(DeliveryMode.PERSISTENT);  
	        for(int i=0; i<100; i++) {    
	            int id = i+1;  
	            ObjectMessage message = session.createObjectMessage();  
	            message.setObject(new User(id, "张三"+id, "123456"));  
	            producer.send(message);    
	        }    
	        session.commit();  
	        session.close();    
	        connection.close();
	}
}
