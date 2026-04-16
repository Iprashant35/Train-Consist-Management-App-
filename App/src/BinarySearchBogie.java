import java.util.Arrays;

public class BinarySearchBogie {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC19 ===");

        // Unsorted array of bogie IDs
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Search key
        String searchKey = "BG309";

        // Step 1: Sort the array (Binary Search requires sorted data)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Step 2: Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                System.out.println("Bogie ID " + searchKey + " found at position " + mid);
                found = true;
                break;
            } else if (comparison < 0) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        if (!found) {
            System.out.println("Bogie ID " + searchKey + " not found in the train consist.");
        }
    }
}