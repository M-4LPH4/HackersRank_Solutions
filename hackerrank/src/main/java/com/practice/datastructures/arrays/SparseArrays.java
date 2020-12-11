package com.practice.datastructures.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SparseArrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Long> stringCount = Arrays.stream(strings).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int[] result = new int[queries.length];
        IntStream.range(0, queries.length).forEach(i -> {
            result[i] = Math.toIntExact(stringCount.get(queries[i]) != null ? stringCount.get(queries[i]) : 0);
        });
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }
        scanner.close();

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            stringBuilder.append(String.valueOf(res[i]));
            if (i != res.length - 1) {
                stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}
