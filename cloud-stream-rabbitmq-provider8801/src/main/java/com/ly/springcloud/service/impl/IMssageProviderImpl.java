package com.ly.springcloud.service.impl;

import com.ly.springcloud.service.IMssageProviderService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * 消息通道绑定
 * @author mly
 * @date 2020-07-26
 */
@EnableBinding(Source.class)// 定义消息推送的管道
public class IMssageProviderImpl  implements IMssageProviderService {
    /**
     * 消息发送管道
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String ids = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(ids).build());
        System.out.println("当前流水号:"+ids+"***********");
        return null;
    }
}
