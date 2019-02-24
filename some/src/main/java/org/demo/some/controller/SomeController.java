package org.demo.some.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaol on 2017/12/28.
 */
@RestController
public class SomeController {

    @Value(value = "${my.message}")
    private String message;

    @RequestMapping(value = "/getSome")
    public String getSome() {
        return message;
    }

}
