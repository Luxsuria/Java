package ru.spb.herzen.ivt3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        List<Integer> randomNumbers = new Random()
                .ints(10, 0, 100)
                .boxed()
                .collect(Collectors.toList());
        randomNumbers
                .forEach(System.out::println);
        //
        System.out.println("Even Numbers");
        randomNumbers
                .stream()
                .filter(n -> n%2==0)
                .sorted()
                .forEach(System.out::println);
        System.out.println("Number Crusher");
        Function<Integer, Integer> NumberCrusher = n->n*2;
        randomNumbers
                .stream()
                .map(NumberCrusher)
                .forEach(System.out::println);
    }
}