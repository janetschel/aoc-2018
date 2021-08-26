package dev.janetschel.calendar.day01;

import dev.janetschel.utils.GenericDay;

import java.util.ArrayList;
import java.util.HashSet;

import static dev.janetschel.utils.File.readFile;

public class Day01 implements GenericDay {
    private final ArrayList<String> input = readFile("01");

    @Override
    public String solvePt1() {
        return input.stream()
                .map(Integer::parseInt)
                .reduce(0, Integer::sum)
                .toString();
    }

    @Override
    public String solvePt2() {
        var arr = input.stream()
                .map(Integer::parseInt)
                .toList()
                .toArray(Integer[]::new);

        var seenFrequencies = new HashSet<Integer>();
        var index = 0;
        var sum = 0;

        while (index >= 0) {
            if (seenFrequencies.contains(sum)) {
                return Integer.toString(sum);
            }

            seenFrequencies.add(sum);
            sum += arr[index++ % arr.length];
        }

        return null;
    }
}
