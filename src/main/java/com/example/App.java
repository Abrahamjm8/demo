package com.example;


import io.javalin.Javalin;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Javalin app = Javalin.create();

        app.get("/hello," ctx)
    }
}
