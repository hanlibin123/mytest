package com.test.mq.test;

import com.test.mq.producer.TestProduct;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Created by Administrator on 2017/5/25.
 */
public class TestMq {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");

        TestProduct producer = (TestProduct) applicationContext.getBean("TestProduct");

        producer.send("你在哪里啊？");
        producer.send("嗨，你好吗？");

    }
}
