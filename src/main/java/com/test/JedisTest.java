package com.test;


import com.bean.JedisClient;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisTest {
    @Test
    /**
     * redis单机版的测试
     */
    public void testJedisSingle()throws Exception{
        Jedis jedis = new Jedis("39.108.217.202",6379);
        jedis.set("test","Hello jedis");
        String string = jedis.get("test");
        System.out.println(string);
        jedis.close();
    }
    @Test
    /**
     * redis单机版连接池的测试
     */
    public void testJedisPool()throws Exception{
        //创建对象，单例
        JedisPool jedisPool = new JedisPool("39.108.217.202",6379);
        //获得连接
        Jedis jedis = jedisPool.getResource();
        String result = jedis.get("test");
        System.out.println(result);
        //jedis必须关闭
        jedis.close();
        //系统关闭时关闭连接池
        jedisPool.close();
    }
    @Test
    public void testJedisClientSpring()throws Exception{
        //创建一个Spring的容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //从容器中获得对象
        JedisClient jedisClient = applicationContext.getBean(JedisClient.class);
        //使用jedisClient操作redis
        jedisClient.set("aaa" ,"1000");
        String aaa = jedisClient.get("aaa");
        System.out.println("###aaa" + aaa);
    }
}
