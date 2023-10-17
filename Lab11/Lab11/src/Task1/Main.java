package Task1;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("melon");
        UtilsList.showDuplicates(fruits);

        UtilsList.deleteDuplicates(fruits);
        UtilsList.showDuplicates(fruits);


        //Here delete don't work:
        List<String> fruits1 = List.of("banana", "apple", "apple", "lemon");
        UtilsList.showDuplicates(fruits1);
        try {
            UtilsList.deleteDuplicates(fruits1); //It doesn't work
        } catch (Exception e) {
            System.out.println("This function doesn't work by this way. " + e.getMessage());
        }
    }
}
