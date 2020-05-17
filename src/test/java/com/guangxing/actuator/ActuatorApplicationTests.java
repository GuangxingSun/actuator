package com.guangxing.actuator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

@SpringBootTest
public class ActuatorApplicationTests extends BaseExample {
    private String name;

    ActuatorApplicationTests(String name){
        this.name = name;
    }

    @Test
    public void test01() {
    }
    @Test
    public void test() {
        List<String> list = Arrays.asList("aaaa", "bbbb", "cccc");

        //静态方法语法	ClassName::methodName
       // list.forEach(ActuatorApplicationTests::print);

        //超类测试方法
       // list.forEach(super::print01);
        
        //类构造器测试
        InterfaceExample com = ActuatorApplicationTests::new;
        ActuatorApplicationTests bean = com.create("hello word");
        System.out.println(bean);
        System.out.println(bean.name);
    }
    public static void print(String content){
        System.out.println(content);
    }
}
class BaseExample{
    public void print01(String content){
        System.out.println(content);
    }
}

interface InterfaceExample{
    ActuatorApplicationTests create(String name);
}

