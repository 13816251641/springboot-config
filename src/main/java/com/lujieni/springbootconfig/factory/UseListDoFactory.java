package com.lujieni.springbootconfig.factory;

import com.lujieni.springbootconfig.strategy.CacheStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @Auther ljn
 * @Date 2019/10/27
 * 使用List<Interface>实现接口的装配
 */
@Service
@Slf4j
public class UseListDoFactory {
    /* 接口类 */
    @Autowired
    private List<CacheStrategy> list;

    @PostConstruct
    public void init(){
        list.forEach(item->{
            log.info(item.getClass().getName());
            item.save("hello");
        });
    }

}
