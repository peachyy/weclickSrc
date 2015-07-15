
package com.welick.rs.redis.jedis.demo;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;


public class DButil {
	//在 org.apache.commons.pool.impl.GenericObjectPool 可以看到一些参数的默认值
	//主机IP
	private static final String  HOST="localhost";
	//端口
	private static final Integer PORT=6379;
	//认证密码
	private static final String AUTH_PAS="xstao";
	//最大活动数目
	private static final Integer MAX_ACTIVE =20;
	//指定pool池 最多有多少个状态为idle 
	private static final Integer MAX_IDLE=100;
	//最长等待时间 毫秒
	private static final Integer MAX_WAIT=5000;
	//超时
	private static final Integer TIME_OUT=5000;
	
	private static JedisPool poolInstance=null;
	/***
	 * 获取jedis 池实例对象
	 * @date 2015年7月14日 上午11:38:15
	 * @author xs Tao 
	 * @return
	 */
	public static JedisPool getJedisPoolInstance(){
		if(poolInstance==null){
			//连接redis数据库 的参数对象
			JedisPoolConfig config=new JedisPoolConfig();
			config.setMaxActive(MAX_ACTIVE);
			config.setMaxWait(MAX_WAIT);
			config.setMaxIdle(MAX_IDLE);
			//创建池 拥有多个构造函数
			//如果是默认的端口号  也可以使用默认端口号的构造函数。就连主机也是可以默认的。
			poolInstance=new JedisPool(config, HOST, PORT, TIME_OUT, AUTH_PAS);			
		}
		return poolInstance;
	}
	public static Jedis getJedis(){
		if(poolInstance==null){
			DButil.getJedisPoolInstance();
		}
		//从池连接中 获取一个jedis资源
		Jedis jedis= poolInstance.getResource();
		return jedis;
	}
	/**
	 * 销毁jedis连接
	 * @date 2015年7月14日 上午11:43:03
	 * @author xs Tao 
	 * @param jedis
	 */
	public static void destory(Jedis jedis){
		if(poolInstance!=null && jedis!=null){
			poolInstance.returnResource(jedis);
		}
	}
}
