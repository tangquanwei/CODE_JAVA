package test;

import java.util.*;
import java.util.List;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List.of("  Apple ", " pear ", " ORANGE", " BaNaNa ").stream().map(String::trim).map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
