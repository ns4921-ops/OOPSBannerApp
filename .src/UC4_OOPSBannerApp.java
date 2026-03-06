public class UC4_OOPSBannerApp {

    // Main method to run the banner display
    // Print each line of the OOPS banner to create the visual effect for the
    // message "OOPS". Construct each line using string concatenation.
    // Each line corresponds to a row in the banner for the letters O, O, P, S.
    // Using individual print statements for each line.
    public static void main(String[] args) {
	// Hint:
// 1. Define a String array with a size equal to the number of lines in the banner
// 2. Populate each index of the array with the corresponding banner line using String.join()
// 3. Use a for-each loop to iterate through the array and print each line
// Example of OS banner line creation: Firstly populate the array as below


        String[] banner = new String[7];

        banner[0] = String.join(" ",
                " ***** ", " ***** ", " ****** ", " ***** ");

        banner[1] = String.join(" ",
                "*     *", "*     *", "*     *", "*      ");

        banner[2] = String.join(" ",
                "*     *", "*     *", "*     *", "*      ");

        banner[3] = String.join(" ",
                "*     *", "*     *", "****** ", " ***** ");

        banner[4] = String.join(" ",
                "*     *", "*     *", "*      ", "      *");

        banner[5] = String.join(" ",
                "*     *", "*     *", "*      ", "      *");

        banner[6] = String.join(" ",
                " ***** ", " ***** ", "*      ", " ***** ");

        for (String line : banner) {
            System.out.println(line);
        }
    }
}