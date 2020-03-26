package com.funtl.hello.controller;

import com.funtl.hello.module.People;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;
import com.sun.xml.internal.bind.v2.runtime.Name;
import org.apache.el.parser.AstGreaterThanEqual;
import org.apache.tomcat.util.http.fileupload.util.LimitedInputStream;
import org.springframework.jmx.export.UnableToRegisterMBeanException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "test")
public class testcontroller {
    @GetMapping(value = "孙超")
    public List<People> getPeoplaManList(){
        People peo1=new People(name:"sunchao",age:28,tel:"1520035");

        List<People> list1=new ArrayList<>();
        list1.add(peo1);

        return  list1;
    }
    @GetMapping(value = "郭胜美")
    public list<People> getPeoplaManList(){
        People peo1=new People(name:"孙超",age:28,tel:"1520035");
        People peo2=new People(name:"郭胜美",age:27,tel:"1557328");
        List<People> list1=new ArrayList<>();
        list1.add(peo1);
        list1.add(peo2);
        return  list1;
    }
}
