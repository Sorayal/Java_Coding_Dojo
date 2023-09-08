package string_removing;


public class Removing {
    private Removing(){}

    // Null Unsafe variant
    public static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }

    // Null Safe variant
    public static String removeExclamationMarksNullSafe(String s) {
        return s == null ? null : s.replace("!", "");
    }

    public static String noSpace(final String s) {
        return s == null ? null : s.replace(" ", "");
    }
}
