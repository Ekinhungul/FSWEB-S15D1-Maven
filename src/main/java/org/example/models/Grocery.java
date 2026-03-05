package org.example.models;

import java.util.ArrayList;
import java.util.Collections;

public class Grocery {
    public static ArrayList<String> groceryList = new ArrayList<>();

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            String trimmed = item.trim();
            if (!groceryList.contains(trimmed)) {
                groceryList.add(trimmed);
            }
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            String trimmed = item.trim();
            groceryList.remove(trimmed);
        }
        Collections.sort(groceryList);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }
}