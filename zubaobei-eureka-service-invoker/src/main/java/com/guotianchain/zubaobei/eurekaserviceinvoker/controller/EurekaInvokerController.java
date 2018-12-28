package com.guotianchain.zubaobei.eurekaserviceinvoker.controller;

import com.guotianchain.zubaobei.eurekaserviceinvoker.service.EurekaProviderInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaInvokerController {

    @Autowired
    private EurekaProviderInterface providerService;

    @RequestMapping(value = "/api/person/{personId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String findById(@PathVariable("personId") String personId) {
        return providerService.findById(personId);
    }

}
