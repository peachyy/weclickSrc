/*
 * Auctioneer.java
 * Created on 2015��7��1�� ����5:34:08
 * Copyright (c) ������Ѷ�����������޹�˾  All Rights Reserved.
 * http://www.upsoft.com.cn
 *
 * This software is the confidential and proprietary information of UPSoft.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with UPSoft.
 */
package com.welick.desgin.observer;

import java.util.Observable;
import java.util.Observer;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 *
 *����ʦ
 * Copyright (c) 2015,������Ѷ�����������޹�˾<br>
 * All rights reserved.<br>
 *
 * �ļ����ƣ�Auctioneer.java<br>
 * ժҪ����Ҫ�������ļ�������<br>
 * -------------------------------------------------------<br>
 * ��ǰ�汾��1.1.1<br>
 * ���ߣ�xs Tao <br>
 * ������ڣ�2015��7��1��<br>
 * -------------------------------------------------------<br>
 * ȡ���汾��1.1.0<br>
 * ԭ���ߣ�xs Tao <br>
 * ������ڣ�2015��7��1��<br>
 */
public class Auctioneer extends Observable{
	//private static Logger logger = LoggerFactory.getLogger(Auctioneer.class);
	private static Logger logger = LoggerFactory.getLogger(Auctioneer.class);
	private String title;
	public Auctioneer(String title){
		this.title=title;
	}

	/**
	 * �����Ὺʼ����
	 * @date 2015��7��1�� ����5:37:07
	 * @author xs Tao
	 */
	public void startAuction(){
		logger.debug("{}��������ʽ��ʼ",title);
		//��ȡ���
		
		setChanged();
		notifyObservers();
	}
}