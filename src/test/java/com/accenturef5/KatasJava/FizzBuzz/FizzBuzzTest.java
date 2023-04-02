package com.accenturef5.KatasJava.FizzBuzz;

import com.accenturef5.KatasJava.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @BeforeEach
    void setup(){
    }

    @Test
    void siNumEsMultiploDe3RetFizz() {

        //GIVEN
        var fizzbuzz = new FizzBuzz();

        //WHEN
        var sut = fizzbuzz.execute(3);

        //THEN
        assertEquals("Fizz", sut);
    }
    @Test
    void siNumEsMultiploDe5RetBuzz() {

        //GIVEN
        var fizzbuzz = new FizzBuzz();

        //WHEN
        var sut = fizzbuzz.execute(5);

        //THEN
        assertEquals("Buzz", sut);
    }
    @Test
    void siNumEsMultiploDe3YDe5RetFizzBuzz() {

        //GIVEN
        var fizzbuzz = new FizzBuzz();

        //WHEN
        var sut = fizzbuzz.execute(15);

        //THEN
        assertEquals("FizzBuzz", sut);
    }
}
