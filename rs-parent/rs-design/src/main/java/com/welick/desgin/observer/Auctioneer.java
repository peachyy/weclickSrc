/*
 * Auctioneer.java
 * Created on 2015年7月1日 下午5:34:08
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
 *拍卖师
 * Copyright (c) 2015,重庆扬讯软件技术有限公司<br>
 * All rights reserved.<br>
 *
 * 文件名称：Auctioneer.java<br>
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
public class Auctioneer extends Observable{
	//private static Logger logger = LoggerFactory.getLogger(Auctioneer.class);
	private static Logger logger = LoggerFactory.getLogger(Auctioneer.class);
	private String title;
	public Auctioneer(String title){
		this.title=title;
	}

	/**
	 * 拍卖会开始拍卖
	 * @date 2015年7月1日 下午5:37:07
	 * @author xs Tao
	 */
	public void startAuction(){
		logger.debug("{}拍卖会正式开始",title);
		//获取最高
		
		setChanged();
		notifyObservers();
	}
}
