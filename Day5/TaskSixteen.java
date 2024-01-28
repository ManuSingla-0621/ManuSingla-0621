import java.util.HashSet;

public class TaskSixteen {

    // Function to find all interleavings of string X and Y
    private static void findInterleavings(String result, String X, String Y, HashSet<String> interleavings) {
        // insert result into the set if the end of both strings is reached
        if (X.length() == 0 && Y.length() == 0) {
            interleavings.add(result);
            return;
        }

        // if the string X is not empty, append its first character in the
        // result and recur for the remaining substring
        if (X.length() > 0) {
            findInterleavings(result + X.charAt(0), X.substring(1), Y, interleavings);
        }

        // if the string Y is not empty, append its first character in the
        // result and recur for the remaining substring
        if (Y.length() > 0) {
            findInterleavings(result + Y.charAt(0), X, Y.substring(1), interleavings);
        }
    }

    public static HashSet<String> findInterleavings(String X, String Y) {
        // use set to handle duplicates
        HashSet<String> interleavings = new HashSet<>();

        if (X.length() == 0 && Y.length() == 0) {
            return interleavings;
        }

        findInterleavings("", X, Y, interleavings);
        return interleavings;
    }

    public static void main(String[] args) {
        String X = "AB";
        String Y = "C";

        HashSet<String> interleavings = findInterleavings(X, Y);
        for (String s : interleavings) {
            System.out.println(s);
        }
    }
}

