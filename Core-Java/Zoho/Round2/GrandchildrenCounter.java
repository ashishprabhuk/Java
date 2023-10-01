package Zoho.Round2;

import java.util.*;

public class GrandchildrenCounter {

    public static int countGrandchildren(String[][] relationships, String father) {
        Map<String, Integer> grandchildrenCount = new HashMap<>();

        for (String[] relationship : relationships) {
            String child = relationship[0];
            String parent = relationship[1];

            // Check if the parent is the given "father"
            if (parent.equals(father)) {
                // Find the children of the child
                for (String[] subRelationship : relationships) {
                    if (subRelationship[1].equals(child)) {
                        String grandchild = subRelationship[0];
                        // Increment the grandchildren count for the "father"
                        grandchildrenCount.put(father, grandchildrenCount.getOrDefault(father, 0) + 1);
                        // Increment the grandchildren count for the "grandchild"
                        grandchildrenCount.put(grandchild, grandchildrenCount.getOrDefault(grandchild, 0) + 1);
                    }
                }
            }
        }

        // Return the number of grandchildren for the given "father"
        return grandchildrenCount.getOrDefault(father, 0);
    }

    public static void main(String[] args) {
        // String[][] relationships = {
        //     {"luke", "shaw"},
        //     {"wayne", "rooney"},
        //     {"rooney", "ronaldo"},
        //     {"shaw", "rooney"}
        // };
        String[][] relationships = {
            {"Lava" , "kushwaha"},
            {"Rama" , "Lava"},
            {"Lava" ,"Ravanan"},
            {"Abi" , "Lava"}
        };

        // String father = "ronaldo";
        String father = "Ravanan";

        int numberOfGrandchildren = countGrandchildren(relationships, father);

        System.out.println(father + " has " + numberOfGrandchildren + " grandchildren.");
    }
}
