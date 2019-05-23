package com.thoughtworks.tdd;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;



public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 3;i <= 120;i *= 3){
            assertThat(fizzBuzz.fizzBuzz(i),startsWith("Fizz"));
        }

        for (int i = 5;i <= 120;i *= 5){
            assertThat(fizzBuzz.fizzBuzz(i),containsString("Buzz"));
        }

        for (int i = 7;i <= 120;i *= 7){
            assertThat(fizzBuzz.fizzBuzz(i),endsWith("Whizz"));
        }





    }


}
