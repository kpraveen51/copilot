package com.copilot.x.demo;

import org.junit.jupiter.api.Test;

public class MyControllerTests {
    //generated test cases for MyController.java
    @Test
    public void testHello() {
        MyController myController = new MyController();
        String result = myController.hello();
        assert(result.equals("Hello World!"));
    }

    @Test
    public void testHelloPost() {
        MyController myController = new MyController();
        String result = myController.helloPost("You just called the POST method at '/hello'!\n");
        assert(result.equals("You just called the POST method at '/hello'!\n"));
    }

    //generated test cases for DemoApplication.java
    @Test
    public void testMain() {
        String[] args = new String[0];
        DemoApplication.main(args);
    }

    //generated negative test cases for MyController.java helloPost
    //fix the test case to make it pass
    @Test   
    public void testHelloPostNegative() {
        MyController myController = new MyController();
        String result = myController.helloPost("hello");
        assert(!result.equals("You just called the POST method at '/hello'!\n"));
    }   

}
