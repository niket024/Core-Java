import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MovieRatingCollector {
	public static class RatingCollectorImpl implements RatingCollector {
		HashMap<String, ArrayList<Double>> hm = new HashMap<>();

		@Override
		public void putNewRating(String movie, double rating) {
			// YOUR CODE HERE
			if (hm.containsKey(movie)) {
				ArrayList<Double> d1 = hm.get(movie);
				d1.add(rating);

			} else {
				ArrayList<Double> a = new ArrayList<>();
				a.add(rating);
				hm.put(movie, a);

			}
		}

		@Override
		public double getAverageRating(String movie) {
			// YOUR CODE HERE
			ArrayList<Double> a1 = hm.get(movie);
			Double sum = 0.0d;
			int count = 0;
			// Double d2;
			for (Double d2 : a1) {
				sum += d2;
				count++;
			}

			double avg = sum / count;
			return avg;
		}

		@Override
		public int getRatingCount(String movie) {
			// YOUR CODE HERE
			ArrayList<Double> a1 = hm.get(movie);
			int count = 0;
			for (Double d : a1) {
				count++;
			}

			return count;
		}
	}
}

////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

public interface RatingCollector {
	// This is an input. Make note of this rating. Rating can be a double number
	// between 0 and 100.
	void putNewRating(String movie, double rating);

	// Get the average rating
	double getAverageRating(String movie);

	// Get the total number of ratings received for the movie
	int getRatingCount(String movie);}

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 int numLines = Integer.parseInt(scanner.nextLine());
 int currentLine = 0;
 while (currentLine++ < numLines) {
 final RatingCollector stats = new RatingCollectorImpl();
 final Set<String> movies = new TreeSet<>();
 
 String line = scanner.nextLine();
 String[] inputs = line.split(",");
 for (int i = 0; i < inputs.length; ++i) {
 String[] tokens = inputs[i].split(" ");
 final String symbol = tokens[0];
 movies.add(symbol);
 final double price = Double.parseDouble(tokens[1]);
 
 stats.putNewRating(symbol, price);
 
 }
 
 for (String movie : movies) {
 System.out.println(
 String.format("%s %.4f %d", movie, stats.getAverageRating(movie), stats.getRatingCount(movie)));
 }
 
 }
 scanner.close();
 
 }
}