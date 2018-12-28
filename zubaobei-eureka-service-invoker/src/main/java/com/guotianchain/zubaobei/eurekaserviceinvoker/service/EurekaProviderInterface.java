package com.guotianchain.zubaobei.eurekaserviceinvoker.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "ZUBAOBEI-EUREKA-SERVER-PROVIDER")
public interface EurekaProviderInterface {
    @RequestMapping(value = "/person/{personId}",method = RequestMethod.GET)
    String findById(@RequestParam(value = "personId") String personId);
}
