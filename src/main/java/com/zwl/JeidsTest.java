package com.zwl;


import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * author: zwl
 * Date: 2020/6/12
 *
 * <p>
 */
public class JeidsTest {

    @Test
    public void tset() {
        //获得连接对象
        Jedis jedis = new Jedis("39.99.179.10", 6379);
        jedis.set("username","张三");
        jedis.set("password","zwl");

        System.out.println(jedis.get("username"));
        System.out.println(jedis.get("password"));

        //关闭
        jedis.close();




    }
}
