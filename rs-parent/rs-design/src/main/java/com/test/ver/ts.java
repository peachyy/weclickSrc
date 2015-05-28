/*
 * ts.java
 * Created on 2015年5月7日 下午3:43:05
 * Copyright (c) 重庆扬讯软件技术有限公司  All Rights Reserved.
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
 * Copyright (c) 2015,重庆扬讯软件技术有限公司<br>
 * All rights reserved.<br>
 *
 * 文件名称：ts.java<br>
 * 摘要：简要描述本文件的内容<br>
 * -------------------------------------------------------<br>
 * 当前版本：1.1.1<br>
 * 作者：陶小松<br>
 * 完成日期：2015年5月7日<br>
 * -------------------------------------------------------<br>
 * 取代版本：1.1.0<br>
 * 原作者：陶小松<br>
 * 完成日期：2015年5月7日<br>
 */
public class ts {
	static public class HwPlushlet extends EventPullSource {  
        // 休眠五秒  
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
