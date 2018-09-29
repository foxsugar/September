package com.code.september.feign;

import org.springframework.stereotype.Component;

/**
 * Created by sunxianping on 2018-09-20.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}