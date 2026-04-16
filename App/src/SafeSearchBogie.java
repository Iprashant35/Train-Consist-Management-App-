public class SafeSearchBogie {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC20 ===");

        // Example: Empty bogie list
        String[] bogieIds = {};

        String searchKey = "BG101";

        try {
            boolean result = searchBogie(bogieIds, searchKey);

            if (result) {
                System.out.println("Bogie ID " + searchKey + " found.");
            } else {
                System.out.println("Bogie ID " + searchKey + " not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Search method with validation
    public static boolean searchBogie(String[] bogieIds, String searchKey) {

        // Fail-fast validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Train has no bogies. Cannot perform search.");
        }

        // Linear search logic (can also reuse binary if sorted)
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                return true;
            }
        }

        return false;
    }
}