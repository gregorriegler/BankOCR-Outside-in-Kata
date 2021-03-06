package kata;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Shortcut methods to get input test data.
 */
public class Input {

    public static List<String> allDigits() throws IOException {
        return read("one_to_nine.txt");
    }

    public static List<String> onlyZeroes() throws IOException {
        return read("only_zeroes.txt");
    }

    public static List<String> onlyOnes() throws IOException {
        return read("only_ones.txt");
    }

    public static List<String> onlyTwos() throws IOException {
        return read("only_twos.txt");
    }

    public static List<String> onlyThrees() throws IOException {
        return read("only_threes.txt");
    }

    public static List<String> onlyFours() throws IOException {
        return read("only_fours.txt");
    }

    public static List<String> onlyFives() throws IOException {
        return read("only_fives.txt");
    }

    public static List<String> onlySixes() throws IOException {
        return read("only_sixes.txt");
    }

    public static List<String> onlySevens() throws IOException {
        return read("only_sevens.txt");
    }

    public static List<String> onlyEights() throws IOException {
        return read("only_eights.txt");
    }

    public static List<String> onlyNines() throws IOException {
        return read("only_nines.txt");
    }

    public static List<String> twoLines() throws IOException {
        return read("two_lines.txt");
    }

    private static List<String> read(String fileName) throws IOException {
        return Files.readAllLines(Paths.get("src/test/resources", fileName)); 
    }

}
