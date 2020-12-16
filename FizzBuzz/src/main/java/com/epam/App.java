package com.epam;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static org.apache.log4j.Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        for(int i=1;i<=100;i++)
        {
            if(i%3==0)
                System.out.print("Fizz");
            if(i%5==0)
                System.out.print("Buzz");
        }
        logger.info("info");
    }
}
