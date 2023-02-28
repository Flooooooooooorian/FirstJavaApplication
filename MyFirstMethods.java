public class MyFirstMethods {

    public static void main(String[] args) {
        int resultSum = sum(16, 25);
        String resultString = sumAsString(68, 4);

        System.out.println(resultSum);
        System.out.println(resultString);


        String name = "Florian";

        System.out.println(name.toLowerCase());

        System.out.println(isLongerThan20("ThisIsDefinetlyLongEnough"));
        System.out.println(containsFancy("YeahFancy"));

        System.out.println(longerThan20AndContainsFancy("ThisStringContainsTheWordfancy"));
    }

    public static int sum(int valueA, int valueB) {
        return valueA + valueB;
    }

    public static String sumAsString(int valueA, int valueB) {
        return "Summe: " + (valueA + valueB);
    }

    public static boolean isLongerThan20(String text) {
        return text.length() > 20;
    }

    public static boolean containsFancy(String text) {
        return text.contains("fancy");
    }

    public static boolean longerThan20AndContainsFancy(String text) {
        return isLongerThan20(text) && containsFancy(text);
    }
}
