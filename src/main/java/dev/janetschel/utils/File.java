package dev.janetschel.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class File {
    public static ArrayList<String> readFile(String dayName) {
        var lines = new ArrayList<String>();
        var path = String.format("src/main/java/dev/janetschel/calendar/day%s/input.txt", dayName);

        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            stream.forEach(lines::add);
        } catch (IOException ignored) { }

        return lines;
    }
}
