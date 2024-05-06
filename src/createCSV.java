import java.io.*;
import java.util.*;

public class createCSV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new CSV file
        System.out.print("Enter the name for the CSV file (include .csv extension): ");
        String csvFilename = scanner.nextLine();

        createCSV(csvFilename);

        // Get image files in the current directory
        File currentDirectory = new File("C:/Users/Mankeerat Singh/Desktop/warm45");
        File[] files = currentDirectory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".jpg") || name.toLowerCase().endsWith(".jpeg")
                        || name.toLowerCase().endsWith(".png") || name.toLowerCase().endsWith(".gif");
            }
        });

        if (files != null) {
            // Rename image files based on CSV data
            try (BufferedReader reader = new BufferedReader(new FileReader(csvFilename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 2) {
                        String id = parts[0].trim();
                        String temp = parts[1].trim();

                        for (File file : files) {
                            if (file.isFile()) {
                                String oldName = file.getName();
                                String extension = oldName.substring(oldName.lastIndexOf("."));
                                String newName = id + extension;
                                if (file.renameTo(new File(currentDirectory, newName))) {
                                    System.out.println("File " + oldName + " renamed to " + newName);
                                } else {
                                    System.err.println("Failed to rename file: " + oldName);
                                }
                            }
                        }
                    }
                }
            } catch (IOException e) {
                System.err.println("Error reading CSV file: " + e.getMessage());
            }
        } else {
            System.err.println("No image files found in the current directory.");
        }

        scanner.close();
    }

    public static void createCSV(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("ID,Temp");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the temperature value: ");
            String temp = scanner.nextLine();
            writer.println("1," + temp);
            writer.println("2," + temp);
            writer.println("3," + temp);
            writer.println("4," + temp);
            System.out.println("CSV file created successfully: " + filename);
            scanner.close();
        } catch (IOException e) {
            System.err.println("Error creating CSV file: " + e.getMessage());
        }
    }
}
