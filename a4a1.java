public class CountIntegers {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            try {
                Integer.parseInt(arg); // check if it’s integer
                count++;
            } catch (NumberFormatException e) {
                // ignore non-integers
            }
        }
        System.out.println("Total integers: " + count);
    }
}
