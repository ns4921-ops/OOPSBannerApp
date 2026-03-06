public class UC6_OOPSBannerApp {

    // Main method to run the banner display
    // Print each line of the OOPS banner to create the visual effect for the
    // message "OOPS". Construct each line using string concatenation.
    // Each line corresponds to a row in the banner for the letters O, O, P, S.
    // Using individual print statements for each line.
   
    public static void main(String[] args) {

        System.out.println("OOPS Banner App");
        System.out.println("UC6: Refactor Banner Logic into Functions");
        System.out.println();

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Combine letters O O P S
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ", o[i], o[i], p[i], s[i]);
        }

        // Enhanced for loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static Method for O
    public static String[] getOPattern() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static Method for P
    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Static Method for S
    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}