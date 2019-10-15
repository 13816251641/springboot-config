package com.lujieni.springbootconfig.strategy.impl;

import com.lujieni.springbootconfig.strategy.CacheStrategy;
import org.springframework.stereotype.Service;

@Service
public class EhcaheCacheStrategyImpl implements CacheStrategy {
    @Override
    public void save(String value) {
        System.out.println("ehcahe strategy");
    }
}
