/*
 * Bidders.java
 * Created on 2015年7月1日 下午5:34:18
 * Copyright (c) 重庆扬讯软件技术有限公司  All Rights Reserved.
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
 *竞拍人
 * Copyright (c) 2015,重庆扬讯软件技术有限公司<br>
 * All rights reserved.<br>
 *
 * 文件名称：Bidders.java<br>
 * 摘要：简要描述本文件的内容<br>
 * -------------------------------------------------------<br>
 * 当前版本：1.1.1<br>
 * 作者：xs Tao <br>
 * 完成日期：2015年7月1日<br>
 * -------------------------------------------------------<br>
 * 取代版本：1.1.0<br>
 * 原作者：xs Tao <br>
 * 完成日期：2015年7月1日<br>
 */
public class Bidders implements Observer {
	private static Logger logger = LoggerFactory.getLogger(Bidders.class);
	private String name;
	private double money;
	public Bidders(String name,double money){
		this.name=name;
		this.money=money;
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		logger.info("{}最高价格是:{}",name,arg);
		
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
