/*
 * ts.java
 * Created on 2015��5��7�� ����3:43:05
 * Copyright (c) ������Ѷ�����������޹�˾  All Rights Reserved.
 * http://www.upsoft.com.cn
 *
 * This software is the confidential and proprietary information of UPSoft.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with UPSoft.
 */
package com.test.ver;

import nl.justobjects.pushlet.core.Event;
import nl.justobjects.pushlet.core.EventPullSource;

/**
 *
 *
 *
 * Copyright (c) 2015,������Ѷ�����������޹�˾<br>
 * All rights reserved.<br>
 *
 * �ļ����ƣ�ts.java<br>
 * ժҪ����Ҫ�������ļ�������<br>
 * -------------------------------------------------------<br>
 * ��ǰ�汾��1.1.1<br>
 * ���ߣ���С��<br>
 * ������ڣ�2015��5��7��<br>
 * -------------------------------------------------------<br>
 * ȡ���汾��1.1.0<br>
 * ԭ���ߣ���С��<br>
 * ������ڣ�2015��5��7��<br>
 */
public class ts {
	static public class HwPlushlet extends EventPullSource {  
        // ��������  
        @Override  
        protected long getSleepTime() {  
            return 5000;  
        }  
        @Override  
        protected Event pullEvent() {  
            Event event = Event.createDataEvent("/cuige/he");  
            event.setField("mess", "hello,world!Plushlet!");  
            return event;  
        }  
    }  
}