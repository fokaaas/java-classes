import java.util.Arrays;

/**
 * This class contains the main method to demonstrate the functionality of the Airplane class.
 * It creates an array of Airplane objects, sorts them based on their attributes,
 * and searches for a specific Airplane object.
 */
public class Main {
    /**
     * The main method where the program execution begins.
     * It creates an array of Airplane objects, sorts the array,
     * and finds a specific airplane in the array.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        // Create an array of Airplane objects
        Airplane[] airplanes = {
                new Airplane("Ukraine", "Antonov", "An-225 Mriya", 850, 15400),
                new Airplane("USA", "Boeing", "747", 988, 18300),
                new Airplane("France", "Airbus", "A380", 1020, 15200),
                new Airplane("USA", "Lockheed", "SR-71 Blackbird", 3529, 5632),
                new Airplane("USA", "Boeing", "B-52 Stratofortress", 988, 16000),
        };

        System.out.println("Airplanes before sorting:");
        printAirplanes(airplanes);

        // Sort the airplanes array
        Arrays.sort(airplanes);

        System.out.println("\nAirplanes after sorting:");
        printAirplanes(airplanes);

        // Define the target airplane to search for
        Airplane target = new Airplane("Ukraine", "Antonov", "An-225 Mriya", 850, 15400);
        Airplane airplane = findAirplane(airplanes, target);

        // Print the result of the search
        if (airplane != null) System.out.println("\nAirplane found: " + airplane);
        else System.out.println("\nAirplane not found: " + target);

    }

    /**
     * Prints the details of each airplane in the given array.
     *
     * @param airplanes An array of Airplane objects to print.
     */
    private static void printAirplanes(Airplane[] airplanes) {
        for (Airplane airplane : airplanes) {
            System.out.println(airplane.toString());
        }
    }

    /**
     * Searches for a specific airplane in the given array.
     *
     * @param airplanes An array of Airplane objects to search.
     * @param target    The Airplane object to find in the array.
     * @return The found Airplane object, or null if not found.
     */
    private static Airplane findAirplane(Airplane[] airplanes, Airplane target) {
        for (Airplane airplane : airplanes) {
            if (airplane.equals(target)) {
                return target;
            }
        }
        return null;
    }
}