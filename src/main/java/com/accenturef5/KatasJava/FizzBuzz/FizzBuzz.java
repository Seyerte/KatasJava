package com.accenturef5.KatasJava.FizzBuzz;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class FizzBuzz {

    public String execute(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0)
            {return "FizzBuzz";}
            return "Fizz";}
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

}
