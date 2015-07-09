/*
 * ff.java
 * Created on 2015年7月1日 下午4:38:42
 * Copyright (c) 重庆扬讯软件技术有限公司  All Rights Reserved.
 * http://www.upsoft.com.cn
 *
 * This software is the confidential and proprietary information of UPSoft.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with UPSoft.
 */
package com.welick.desgin.observer;

import java.util.Vector;

/**
 *
 *
 *
 * Copyright (c) 2015<br>
 * All rights reserved.<br>
 *
 * 文件名称：ff.java<br>
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
public class main {
	public static void main(String[] args) {
		Auctioneer auc=new Auctioneer("1000年红酒");
		Bidders b1=new Bidders("张三1",100);
		Bidders b2=new Bidders("张三2",200);
		Bidders b3=new Bidders("张三3",300);
		Bidders b4=new Bidders("张三4",400);
		Bidders b5=new Bidders("张三5",500);
	
		auc.addObserver(b1);
		auc.addObserver(b2);
		auc.addObserver(b3);
		auc.addObserver(b4);
		auc.addObserver(b5);
		auc.startAuction();
	}
}
