package com.ratel.web;

import com.ratel.rabbit.topic.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yxc on 2019/3/15.
 */
@RestController
public class TestWeb {
    @Autowired
    private TopicSender topicSender;

    @RequestMapping("/sendMessage")
   public void sendMessage(){
        for (int i=0;i<100;i++){
            topicSender.send2(i);
        }
   }

}
