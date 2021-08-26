package dev.janetschel;

import dev.janetschel.calendar.day01.Day01;
import dev.janetschel.calendar.day02.Day02;
import dev.janetschel.utils.GenericDay;

public class Main {
    public static void main(String[] args) {
        // Change L9 constructor call to change day output
        GenericDay day = new Day02();

        var solutionPart1 = day.solvePt1();
        var solutionPart2 = day.solvePt2();

        System.out.println(solutionPart1);
        System.out.println(solutionPart2);
    }
}
