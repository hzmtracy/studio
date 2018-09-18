package com.tk.sso.api;


import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tk.sso.api.test.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SsoApiApplicationTests {

    @Autowired
    private Person person;

    @Test
    public void propsTest() throws JsonProcessingException {
        System.out.println("simpleProp: " + JSON.toJSONString(person));

//        ObjectMapper objectMapper =;
//        System.out.println("arrayProps: " + objectMapper.writeValueAsString(myProps.getArrayProps()));
//        System.out.println("listProp1: " + objectMapper.writeValueAsString(myProps.getListProp1()));
//        System.out.println("listProp2: " + objectMapper.writeValueAsString(myProps.getListProp2()));
//        System.out.println("mapProps: " + objectMapper.writeValueAsString(myProps.getMapProps()));
    }


}
