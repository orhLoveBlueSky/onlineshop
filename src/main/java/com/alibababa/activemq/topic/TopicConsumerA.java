package com.alibababa.activemq.topic;

import com.alibababa.activemq.PersonInfo;

import javax.jms.JMSException;



/**
 * topic消息消费者A
 * 
 * 作者: zhoubang 
 * 日期：2015年9月28日 下午1:19:56
 */
public class TopicConsumerA {

    public void receiveA(PersonInfo personInfo) throws JMSException {
        System.out.println("【TopicConsumerA】 收到TopicProducer的消息—->personInfo的用户名是:"  + personInfo.getUserName());
        System.out.println();
    }

}
