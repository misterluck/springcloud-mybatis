package org.demo.ui.controller;

import org.demo.ui.domain.Person;
import org.demo.ui.service.PersonHystrixService;
import org.demo.ui.service.SomeHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhaol on 2017/12/28.
 */
@RestController
public class UiController {

    @Autowired
    private SomeHystrixService someHystrixService;

    @Autowired
    private PersonHystrixService personHystrixService;

    @RequestMapping("/dispatch")
    public List<Person> sendMessage(String personName) {
        return personHystrixService.save(personName);
    }

    @RequestMapping(value = "/getSome",produces={MediaType.TEXT_PLAIN_VALUE})
    public String getSome(){
        return someHystrixService.getSome();
    }

}
