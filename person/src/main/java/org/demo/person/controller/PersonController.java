package org.demo.person.controller;

import org.demo.person.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaol on 2017/12/28.
 */
@RestController
public class PersonController {

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Person> savePerson(String name) {
        List<Person> list = new ArrayList<>();
        Person person = new Person();
        person.setId("130210312");
        person.setName(name);
        person.setAge("24");
        person.setSex("男");
        list.add(person);
        return list;
    }

}
