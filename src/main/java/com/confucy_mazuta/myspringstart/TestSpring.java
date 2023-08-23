package com.confucy_mazuta.myspringstart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());
        testBean.setName("Хуйлан!");
        System.out.println(testBean.getName());

        context.close();
    }
}
