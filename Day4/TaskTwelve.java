import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskTwelve {

    public static void main(String[] args) {
        Map<String, List<Character>> values = new HashMap<>();
        values.put("1", List.of('Z', 'Y', 'A'));
        values.put("2", List.of('B', 'O'));
        values.put("12", List.of('L'));
        values.put("3", List.of('U', 'P'));

        String input = "123";
        List<String> combinations = generateCombinations(input, values);
        System.out.println(combinations);
    }

    private static List<String> generateCombinations(String input, Map<String, List<Character>> values) {
        List<String> combinations = new ArrayList<>();
        generateCombinationsRecursive(combinations, new StringBuilder(), input, values, 0);
        return combinations;
    }

    private static void generateCombinationsRecursive(List<String> combinations, StringBuilder current, String input, Map<String, List<Character>> values, int index) {
        if (index == input.length()) {
            combinations.add(current.toString());
            return;
        }

        String key = String.valueOf(input.charAt(index));
        List<Character> options = values.get(key);

        if (options != null) {
            for (Character option : options) {
                current.append(option);
                generateCombinationsRecursive(combinations, current, input, values, index + 1);
                current.deleteCharAt(current.length() - 1);
            }
        } else {
            current.append(key);
            generateCombinationsRecursive(combinations, current, input, values, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
