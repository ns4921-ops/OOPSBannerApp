public class UC5_OOPSBannerApp {

    // Main method to run the banner display
    // Print each line of the OOPS banner to create the visual effect for the
    // message "OOPS". Construct each line using string concatenation.
    // Each line corresponds to a row in the banner for the letters O, O, P, S.
    // Using individual print statements for each line.
   
    public static void main(String[] args) {
        // Inline Array Initialization using String.join()
        String[] banner = {
            String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*     *", "*      "),
            String.join("  ", "*     *", "*     *", "*     *", "*      "),
            String.join("  ", "*     *", " ***** ", " ***** ", " ***** "),
            String.join("  ", "*     *", "*       ", "*       ", "     *"),
            String.join("  ", "*     *", "*       ", "*       ", "     *"),
            String.join("  ", " ***** ", "*       ", "*       ", "***** ")
        };

        // Enhanced For Loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}