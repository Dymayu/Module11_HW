package task2;

import task1.Names;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NameList {
    public static List<task1.Names> generateList() {
        List<String> namesList = Arrays.asList("Bill", "Jack", "John", "Oh", "Zein", "Mark", "Jim", "Konor", "Tomas", "Rama");
        List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<task1.Names> namesArrayList = new ArrayList<>();
        for (int i = 0; i < namesList.size(); i++) {
            String name = namesList.get(i);
            int index = digits.get(i);

            task1.Names names1 = new task1.Names(name, index);
            namesArrayList.add(names1);
        }
        return namesArrayList;
    }

    public static void main(String[] args) {

        List<task1.Names> mylist = task1.NameList.generateList();

        mylist.stream()
                //.filter(n -> n.getIndex() % 2 != 0)
                .sorted(Comparator.comparing(Names::getName).reversed())
                .map(n -> n.getName().toUpperCase())
                .peek(n -> System.out.println(n + " "))
                .collect(Collectors.toList());



    }
}
