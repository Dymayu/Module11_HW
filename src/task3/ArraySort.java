package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraySort {

    public static void main(String[] args) {
        List<String> digits = Arrays.asList("1,2,0","4,5");

        ArrayList<Integer> resArr = new ArrayList<>();
        for(String line: digits){
            String[] split = line.split(",");
            for (String a: split){
                resArr.add(Integer.valueOf(a));
            }

        }
        List<Integer> sorted = resArr.stream()
                .sorted()
                .peek(a -> System.out.print(a + ", "))
                .collect(Collectors.toList());

    }
}
