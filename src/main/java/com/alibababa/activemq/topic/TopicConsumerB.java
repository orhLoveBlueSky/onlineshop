package com.alibababa.activemq.topic;

import com.alibababa.activemq.PersonInfo;

import javax.jms.JMSException;



/**
 * topic消息消费者B
 * 
 * 作者: zhoubang 
 * 日期：2015年9月28日 下午1:20:14
 */
public class TopicConsumerB {
    public void receiveB(PersonInfo personInfo) throws JMSException {
        System.out.println("【TopicConsumerB】收到TopicProducer的消息—->personInfo的用户名是:" + personInfo.getUserName());
        System.out.println();
    }
}
