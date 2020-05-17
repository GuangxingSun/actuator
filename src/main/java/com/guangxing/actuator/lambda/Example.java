package com.guangxing.actuator.lambda;

import java.util.function.Function;
import java.util.function.IntConsumer;

/**
 * @program actuator
 * 测试Lambda使用情况
 * @description:
 * @author: Guangxing
 * @create: 2020/05/17 21:42
 */
public class Example {

    private String name;

    Example(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        InterfaceExample com =  Example::new;
        Example bean = com.create("hello world");
        System.out.println(bean.name);
    }
}
interface InterfaceExample{
    Example create(String name);
}
class Example01 {
    public static void main(String[] args) {
        //Function<Integer, Example[]> function = Example[]::new;//借用jdk自带的java.util.function.Function类实现
        Interface<Integer, Example[]> function = Example[]::new; //自定义接口
        Example[] array = function.apply(4);	//这里的4是数组的大小

        for(Example e:array){
            System.out.println(e);	//如果输出的话，你会发现会输出4个空对象(null)
        }
    }
}

@FunctionalInterface
interface Interface<A, T>{
    T apply(A a);
}
