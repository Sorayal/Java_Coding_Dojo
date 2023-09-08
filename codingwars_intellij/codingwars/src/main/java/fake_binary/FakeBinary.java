package fake_binary;

import java.util.stream.Collectors;

public class FakeBinary {

    private FakeBinary(){}

    public static String fakeBin(String numberString) {
        char[] charsCol = numberString.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : charsCol){
            int converted = Integer.parseInt(String.valueOf(c));
            sb = converted < 5 ? sb.append(0) : sb.append(1);
        }
        return sb.toString();
    }

    public static String fakeBinAsStream(String numberString) {
        return numberString.chars()
                .mapToObj(x -> String.valueOf((Character.getNumericValue(x) < 5) ? 0 : 1))
                .collect(Collectors.joining());
    }

    public static String fakeBinReplaceAll(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
