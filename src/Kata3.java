import java.util.ArrayList;
import java.util.List;

public class Kata3 {
    /**
     * Return a two-dimensional containing all the possible combinations of an array of doubles.
     * Each possible combination will be of a fixed size, which must be equal or less the size of
     * the array input.
     *
     * @param array : the input array we want to get all possible combinations from
     * @param size  : an integer fixing the size of each combination.
     * @return a two-dimensional list of doubles, containing all possible combinations of the array
     */
    public static List<List<Double>> generatePossibleCombinations(double[] array, int size) {
        List<List<Double>> combinations = new ArrayList<>();

        generate(combinations, new ArrayList<>(), array, size, 0);

        return combinations;
    }

    /**
     * A somewhat complex recursive algorithm to insert all possible combinations of a given array
     * into a two-dimensional list of doubles, starting with the first index and moving its way
     * forward, with a fixed size per combination.
     *
     * <h2>NOTE : THIS FUNCTION IS GRANTED TO MAKE THIS KATA EASIER... JUST USE IT.</h2>
     *
     * @param combinations : a two-dimensional list containing all possible combinations
     * @param current      : the current combination to be built
     * @param array        : the original input array
     * @param size         : an integer describing the size of each combination
     * @param start        : the index to start looking for all combinations
     */
    private static void generate(
            List<List<Double>> combinations,
            List<Double> current,
            double[] array,
            int size,
            int start
    ) {
        if (current.size() == size) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < array.length; i++) {
            current.add(array[i]);
            generate(combinations, current, array, size, i + 1);
            current.remove(current.size() - 1);
        }
    }

    /**
     * Returns the sublist of 9 doubles which would make for the worst average amongst all scores
     * from all 12 judges
     * @param scores : the input array of scores of the 12 judges
     * @return a list of scores from the 9 judges whose average is the worst (order don't matter)
     */
    public static List<Double> getMinAverageScores(double[] scores) {
        // TODO : write your code here
        return null;
    }

    /**
     * Returns the sublist of 9 doubles which would make for the best average amongst all scores
     * from the 12 jurys
     * @param scores : the input array of scores of the 12 judges
     * @return a list of scores from the 9 judges whose average is the best (order don't matter)
     */
    public static List<Double> getMaxAverageScores(double[] scores) {
        // TODO : write your code here
        return null;
    }

    /**
     * Returns the average of all possible combinations of 9 scores from the 12 judges
     * @param scores : the input array of scores of the 12 judges
     * @return the average of all possibles combinations of 9 scores
     */
    public static double getAverageOfAllPossibleScores(double[] scores) {
        // TODO : write your code here
        return 0.0;
    }

    /**
     * Returns the median value of all 12 scores from the judges. Look out for the test data to
     * check if your understanding of what a "median" is the right one.
     * @param scores : the input array of scroes from the 12 judges
     * @return the median value of all 12 scores.
     */
    public static double getMedianValue(double[] scores) {
        // TODO : write your code here
        return 0.0;
    }

    /**
     * Test Data. No need to round the values if there are many decimals.
     */
    public static void main(String[] args) {
        double[] input1 = new double[]{6.7, 4.2, 4.3, 7.0, 0.0, 2.8, 3.9, 1.3, 6.9, 6.0, 7.3, 3.2};
        double[] input2 = new double[]{7.1, 9.6, 0.9, 3.9, 7.4, 3.3, 7.5, 2.6, 2.9, 8.4, 6.4, 0.3};

        System.out.println(getMinAverageScores(input1));
        // expected (in any order) : [6.7, 4.2, 4.3, 0.0, 2.8, 3.9, 1.3, 6.0, 3.2]
        System.out.println(getMaxAverageScores(input1));
        // expected (in any order) : [6.7, 4.2, 4.3, 7.0, 3.9, 6.9, 6.0, 7.3, 3.2]
        System.out.println(getAverageOfAllPossibleScores(input1));
        // expected (no need to round it) : 4.4667
        System.out.println(getMedianValue(input1));
        // expected : 4.25

        System.out.println(getMinAverageScores(input2));
        // expected (in any order) : [0.3,0.9,2.6,2.9,3.3,3.9,6.4,7.1,7.4]
        System.out.println(getMaxAverageScores(input2));
        // expected (in any order) : [9.6,8.4,7.5,7.4,7.1,6.4,3.9,3.3,2.9]
        System.out.println(getAverageOfAllPossibleScores(input2));
        // expected : 5.025
        System.out.println(getMedianValue(input1));
        // expected : 5.150
    }
}