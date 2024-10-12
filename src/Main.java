import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Airplane[] airplanes = {
                new Airplane("Ukraine", "Antonov", "An-225 Mriya", 850, 15400),
                new Airplane("USA", "Boeing", "747", 988, 18300),
                new Airplane("France", "Airbus", "A380", 1020, 15200),
                new Airplane("USA", "Lockheed", "SR-71 Blackbird", 3529, 5632),
                new Airplane("USA", "Boeing", "B-52 Stratofortress", 988, 16000),
        };

        System.out.println("Airplanes before sorting:");
        printAirplanes(airplanes);

        Arrays.sort(airplanes);

        System.out.println("\nAirplanes after sorting:");
        printAirplanes(airplanes);

        Airplane target = new Airplane("Ukraine", "Antonov", "An-225 Mriya", 850, 15400);
        Airplane airplane = contains(airplanes, target);

        if (airplane != null) System.out.println("\nAirplane found: " + airplane);
        else System.out.println("\nAirplane not found: " + target);

    }

    private static void printAirplanes(Airplane[] airplanes) {
        for (Airplane airplane : airplanes) {
            System.out.println(airplane.toString());
        }
    }

    private static Airplane contains(Airplane[] airplanes, Airplane target) {
        for (Airplane airplane : airplanes) {
            if (airplane.equals(target)) {
                return target;
            }
        }
        return null;
    }
}