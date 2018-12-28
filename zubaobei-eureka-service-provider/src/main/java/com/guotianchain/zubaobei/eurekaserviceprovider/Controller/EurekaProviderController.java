package com.guotianchain.zubaobei.eurekaserviceprovider.Controller;

import com.guotianchain.zubaobei.eurekaserviceprovider.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaProviderController {

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId") String personId) {
        Person person = new Person(personId, "Guotian", 30);
        return person;
    }
}
