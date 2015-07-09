/*
 * JmsSender.java
 * Created on 2015��6��4�� ����11:54:10
 * Copyright (c) ������Ѷ�����������޹�˾  All Rights Reserved.
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
 * Copyright (c) 2015,������Ѷ�����������޹�˾<br>
 * All rights reserved.<br>
 *
 * �ļ����ƣ�JmsSender.java<br>
 * ժҪ����Ҫ�������ļ�������<br>
 * -------------------------------------------------------<br>
 * ��ǰ�汾��1.1.1<br>
 * ���ߣ�xs Tao <br>
 * ������ڣ�2015��6��4��<br>
 * -------------------------------------------------------<br>
 * ȡ���汾��1.1.0<br>
 * ԭ���ߣ�xs Tao <br>
 * ������ڣ�2015��6��4��<br>
 */
public class JmsSender {
	public static void main(String[] args) throws JMSException {
		ConnectionFactory connectionFactory = new org.apache.activemq.ActiveMQConnectionFactory("tcp://127.0.0.1:61616");
		Connection connection=connectionFactory.createConnection();
		connection.start(); 
		 Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE); 
		 Destination destination = session.createQueue("Test.foo");   //����һ������
		 MessageProducer producer = session.createProducer(destination);    
	        producer.setDeliveryMode(DeliveryMode.PERSISTENT);  
	        for(int i=0; i<100; i++) {    
	            int id = i+1;  
	            ObjectMessage message = session.createObjectMessage();  
	            message.setObject(new User(id, "����"+id, "123456"));  
	            producer.send(message);    
	        }    
	        session.commit();  
	        session.close();    
	        connection.close();
	}
}