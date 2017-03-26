package com.Imtiyaaz.Assignment3Interface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
public class App 
{
    @Bean(name = "cal")
    public Calculator getService()
    {
        return new CalculatorCode();
    }

}
