package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class NameList {

    public static List<Names> generateList() {
        List<String> namesList = Arrays.asList("Bill", "Jack", "John", "Oh", "Zein", "Mark", "Jim", "Konor", "Tomas", "Rama");
        List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Names> namesArrayList = new ArrayList<>();
        for (int i = 0; i < namesList.size(); i++) {
            String name = namesList.get(i);
            int index = digits.get(i);

            Names names1 = new Names(name, index);
            namesArrayList.add(names1);
        }
        return namesArrayList;
    }

    public static void main(String[] args) {

            List<Names> mylist = NameList.generateList();

            mylist.stream()
                    .filter(n -> n.getIndex() % 2 != 0)
                    .peek(n -> System.out.println(n + " "))
                    .collect(Collectors.toList());

    }
}
