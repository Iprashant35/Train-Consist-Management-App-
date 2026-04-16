public class LinearSearchBogie {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC18 ===");

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchKey = "BG309";

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie ID " + searchKey + " found at position " + i);
                break; // early termination
            }
        }

        if (!found) {
            System.out.println("Bogie ID " + searchKey + " not found in the train consist.");
        }
    }
}