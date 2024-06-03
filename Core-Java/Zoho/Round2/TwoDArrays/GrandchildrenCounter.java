package Zoho.Round2.TwoDArrays;

public class GrandchildrenCounter {

    public static int countGrandchildren(String[][] relationships, String father) {
        int grandchildCount = 0;
        for (int i = 0; i < relationships.length; i++) {
            if (relationships[i][1].equals(father)) {
                String child = relationships[i][0];
                for (int j = 0; j < relationships.length; j++) {
                    if (relationships[j][1].equals(child)) {
                        grandchildCount++;
                    }
                }
            }
        }
        return grandchildCount;
    }

    public static void main(String[] args) {
        String[][] relationships = {
            {"Lava", "kushwaha"},
            {"Rama", "Lava"},
            {"Lava", "Ravanan"},
            {"Abi", "Lava"}
            //{child, father}
        };

        String father = "Ravanan";
        int numberOfGrandchildren = countGrandchildren(relationships, father);

        System.out.println(father + " has " + numberOfGrandchildren + " grandchildren.");
    }
}
