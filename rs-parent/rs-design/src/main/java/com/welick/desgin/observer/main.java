/*
 * ff.java
 * Created on 2015��7��1�� ����4:38:42
 * Copyright (c) ������Ѷ�����������޹�˾  All Rights Reserved.
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
 * �ļ����ƣ�ff.java<br>
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
public class main {
	public static void main(String[] args) {
		Auctioneer auc=new Auctioneer("1000����");
		Bidders b1=new Bidders("����1",100);
		Bidders b2=new Bidders("����2",200);
		Bidders b3=new Bidders("����3",300);
		Bidders b4=new Bidders("����4",400);
		Bidders b5=new Bidders("����5",500);
	
		auc.addObserver(b1);
		auc.addObserver(b2);
		auc.addObserver(b3);
		auc.addObserver(b4);
		auc.addObserver(b5);
		auc.startAuction();
	}
}