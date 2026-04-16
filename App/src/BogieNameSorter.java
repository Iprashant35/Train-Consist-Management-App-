import java.util.Arrays;

public class BogieNameSorter {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC17 ===");

        // Array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort using built-in method
        Arrays.sort(bogieNames);

        System.out.println("After Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
    }
}