package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World 07/12/2019 5 pm";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
