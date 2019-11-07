package com.lujieni.springbootconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootconfigApplicationTests {

    /**
     * 利用assert进行判空校验
     */
    @Test
    public void testAssert() {
        String a = "";
        String b = "a";
        Integer c = 1;
        Long d = 5L;
        Object[] checkItems = {a,b,c,d};
        Assert.noNullElements(checkItems,"字段不能为null");
    }
}
