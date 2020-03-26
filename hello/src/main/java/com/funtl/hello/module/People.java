package com.funtl.hello.module;

import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;
import com.sun.org.apache.xpath.internal.objects.XStringForFSB;

public class People {
    private XString name;
    private int age;
    private XString tel;
    public People(){

    }
    public People(XString name,int age,XString tel){
        this.name=name;
        this.age=id;
        this.tel=tel;
    }


    public XString getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public XString getTel() {
        return tel;
    }
}

