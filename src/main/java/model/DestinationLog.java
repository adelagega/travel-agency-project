package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DestinationLog {

    private static final String LOG_FILE="destination.log";

    public static void logDestination(Destination destination){
        String logMessage=destination.getName()+
                " destination created with attractions: "+ destination.getAttractions();
        writeLog(logMessage);
    }

    public static void logException(AttractionNotFoundException e) {
        String logMessage = "Could not create destination: Attraction not found.";
        writeLog(logMessage);
    }


    private static void writeLog(String message) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(LOG_FILE, true));
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println("Error closing log file: " + e.getMessage());
                }
            }
        }
    }


}
