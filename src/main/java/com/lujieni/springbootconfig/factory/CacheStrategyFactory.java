package com.lujieni.springbootconfig.factory;

import com.lujieni.springbootconfig.strategy.CacheStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 *  CacheStrategy的工厂类,利用ApplicationContextAware可以实现
 *  自动扫描spring上下文中实现CacheStrategy接口的类,之后进行组装
 */
@Service
@Slf4j
public class CacheStrategyFactory implements ApplicationContextAware {

    private static Map<String,CacheStrategy> cacheMap = new HashMap<>();


    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.applicationContext = applicationContext;
    }

    @PostConstruct
    private void initCacheStrategy(){
        Map<String, CacheStrategy> map = applicationContext.getBeansOfType(CacheStrategy.class);
        for(Map.Entry<String, CacheStrategy> entity:map.entrySet()){
            /* 默认是类的名字,首字母小写,可以使用@Service("xxx")进行覆盖 */
            String key = entity.getKey();
            CacheStrategy value = entity.getValue();
            log.info("key: "+key);
            log.info(value.getClass().getName());
            cacheMap.put(key,value);
        }
    }
}
