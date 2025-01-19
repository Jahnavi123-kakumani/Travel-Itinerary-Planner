import java.util.*;
import java.net.*;

public class TravelItinerary {
    // Replace with your Google Maps API key if required
    private static final String API_KEY_MAPS = "AIzaSyAVy426Lrb7cRP7Y5Aw022kM_hY5yYFMxY"; // Add valid API key if needed

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter the start date of your trip (YYYY-MM-DD):");
        String startDate = scanner.nextLine();

        System.out.println("Enter the end date of your trip (YYYY-MM-DD):");
        String endDate = scanner.nextLine();

        System.out.println("Enter destinations (comma separated):");
        String destinations = scanner.nextLine();

        System.out.println("Enter your travel preferences (e.g., 'Beach', 'Mountain', 'City', 'Adventure'):");
        String preferences = scanner.nextLine();

        System.out.println("Enter your budget for the trip in USD:");
        double budget = scanner.nextDouble();

        // Process the input
        String[] destinationList = destinations.split(",");
        double estimatedCost = estimateCost(destinationList);

        // Display itinerary
        System.out.println("\n--- Travel Itinerary ---");
        System.out.println("Traveler: " + name);
        System.out.println("Trip Dates: " + startDate + " to " + endDate);
        System.out.println("Destinations: " + Arrays.toString(destinationList));
        System.out.println("Preferences: " + preferences);
        System.out.println("Estimated Budget: $" + budget);
        System.out.println("Estimated Trip Cost: $" + estimatedCost);

        System.out.println("\n--- Map Locations ---");
        for (String destination : destinationList) {
            displayMapLocation(destination.trim());
        }

        scanner.close();
    }

    private static double estimateCost(String[] destinations) {
        // Simple estimate: $300 per destination for accommodation/transportation and
        // activities
        return destinations.length * 300;
    }

    private static void displayMapLocation(String destination) {
        String googleMapsUrl = "https://www.google.com/maps?q=" + destination.replace(" ", "+");
        System.out.println("Map for " + destination + ": " + googleMapsUrl);
    }
}
