package com.lujieni.springbootconfig;

import com.lujieni.springbootconfig.service.AnnotationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther ljn
 * @Date 2019/11/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAspect {
    @Autowired
    private AnnotationService annotationService;

    @Test
    public void testAspect(){
        annotationService.say("hello");
    }


}
