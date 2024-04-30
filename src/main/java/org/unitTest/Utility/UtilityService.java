package org.unitTest.Utility;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.unitTest.Model.Movie;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.unitTest.Service.MovieService.allMovies;

public class UtilityService {
    public static void loadMoviesFromCSV(String filePath)  {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            // Skip the header row (assuming the first row contains column names)
            reader.readNext();
            List<String[]> rows = reader.readAll();
            for (String[] row : rows) {
                // Parse movie data from each row
                String title = row[1];
                List<String> cast = Arrays.asList(row[5].split(",")); // Assuming comma-separated cast
                String category = row[2];
                String releaseDate = row[6];
                double budget;
                try {
                     budget = Double.parseDouble(row[10]);
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing budget for movie: " + title + ". Using default value 0.");
                    budget = 0;
                }
                Movie movie = new Movie(title, cast, category, releaseDate, budget);
                //System.out.println(movie);
                allMovies.add(movie);
            }
        } catch (IOException | CsvException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
