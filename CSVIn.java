import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class CSVIn {
    public static List<CartItem> loadBeverage(String filename) throws ClassNotFoundException {
        File file = new File(filename);
        List<CartItem> ItemList = new ArrayList<>();
        try {
            if (file.exists()) {
                try (Scanner fin = new Scanner(new FileInputStream(file))) {
                    while (fin.hasNextLine()) {
                        String[] berverageInput = fin.nextLine().trim().split(",");
                        if (berverageInput != null && berverageInput.length >= 3) {
                            ItemList.add(new CartItem(berverageInput[0], Integer.parseInt(berverageInput[1]),
                                    Integer.parseInt(berverageInput[2])));
                        }
                    }
                    return ItemList;
                }
            } else {
                return ItemList;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
        return ItemList;
    }

    public static List<CartItem> loadToppings(String filename) throws ClassNotFoundException {
        File file = new File(filename);
        List<CartItem> ItemList = new ArrayList<>();
        try {
            if (file.exists()) {
                try (Scanner fin = new Scanner(new FileInputStream(file))) {
                    while (fin.hasNextLine()) {
                        String[] topInput = fin.nextLine().trim().split(",");
                        if (topInput != null && topInput.length >= 2) {
                            ItemList.add(new CartItem(topInput[0], Integer.parseInt(topInput[1]), Integer.parseInt(topInput[1])));
                        }
                    }
                    return ItemList;
                }
            } else {
                return ItemList;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
        return ItemList;
    }
}