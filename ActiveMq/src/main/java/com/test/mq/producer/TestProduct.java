package com.test.mq.producer;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import javax.jms.JMSException;
import javax.jms.Session;

/**
 * Created by Administrator on 2017/5/25.
 */
public class TestProduct {
    private JmsTemplate jmsTemplate;

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    //使用JMSTemplate发送消息
    public void send(final String msg) {
        jmsTemplate.send(new MessageCreator() {
            public javax.jms.Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }
}
