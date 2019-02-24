package org.demo.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.demo.ui.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaol on 2017/12/28.
 */
@Service
public class PersonHystrixService {

    @Autowired
    private PersonService personService;

    @HystrixCommand(fallbackMethod = "fallbackSave")
    public List<Person> save(String name) {
        return personService.save(name);
    }

    public List<Person> fallbackSave(String name){
        List<Person> list = new ArrayList<>();
        Person person = new Person();
        person.setName(name+" 没有保存成功，Person Service 故障");
        list.add(person);
        return list;
    }

}
