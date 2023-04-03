package Inc1;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.joining;
	import static java.util.stream.Collectors.toList;

	class Snakes {

	    /*
	     * Complete the 'quickestWayUp' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. 2D_INTEGER_ARRAY ladders
	     *  2. 2D_INTEGER_ARRAY snakes
	     */

	    public static int quickestWayUp(List<List<Integer>> ladders, List<List<Integer>> snakes) {
	    // Write your code here
             return 0;
	    }
	}


	 class Solution {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int t = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, t).forEach(tItr -> {
	            try {
	                int n = Integer.parseInt(bufferedReader.readLine().trim());

	                List<List<Integer>> ladders = new ArrayList<>();

	                IntStream.range(0, n).forEach(i -> {
	                    try {
	                        ladders.add(
	                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                                .map(Integer::parseInt)
	                                .collect(toList())
	                        );
	                    } catch (IOException ex) {
	                        throw new RuntimeException(ex);
	                    }
	                });

	                int m = Integer.parseInt(bufferedReader.readLine().trim());

	                List<List<Integer>> snakes = new ArrayList<>();

	                IntStream.range(0, m).forEach(i -> {
	                    try {
	                        snakes.add(
	                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                                .map(Integer::parseInt)
	                                .collect(toList())
	                        );
	                    } catch (IOException ex) {
	                        throw new RuntimeException(ex);
	                    }
	                });

	                int result = Result.quickestWayUp(ladders, snakes);

	                bufferedWriter.write(String.valueOf(result));
	                bufferedWriter.newLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}


