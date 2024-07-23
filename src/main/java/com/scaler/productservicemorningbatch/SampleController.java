package com.scaler.productservicemorningbatch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This controller support Rest Api's (http requests)
//The request coming to endpoint /hello, transfer to this controller
@RestController
@RequestMapping("/hello")
public class SampleController {

    @GetMapping("/{name}/{number}")
    public String sayHello(@PathVariable String name, @PathVariable int number){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1; i <= number; i++){
            stringBuilder.append(name).append(", ");
        }
        return stringBuilder.toString();
        //return "Hello " + name;
    }
}
