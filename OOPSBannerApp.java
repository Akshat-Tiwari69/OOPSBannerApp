/**
 * OOPSBannerApp UC4 - Banner Display Application
 *
 * This class demonstrates the fourth user story:
 *
 * UC4: Banner output (array + loop)
 * - Stores the banner lines in a `String[]` and prints them using a loop.
 *   This reduces repetition from multiple `System.out.println()` calls and
 *   makes the code more modular and maintainable.
 *
 * Key concepts: arrays, loops, code reusability.
 *
 * @author Akshat Tiwari
 * @version 4.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC4: Build the banner lines into an array and print with a loop
        String[] bannerLines = new String[] {
            String.join(" ", "  *****  ", "  *****  ", "*******  ", "  *****  "),
            String.join(" ", " *     * ", " *     * ", "*      * ", " *     * "),
            String.join(" ", "*       *", "*       *", "*      * ", "*        "),
            String.join(" ", "*       *", "*       *", "*******  ", "  ****   "),
            String.join(" ", "*       *", "*       *", "*        ", "       * "),
            String.join(" ", " *     * ", " *     * ", "*        ", " *     * "),
            String.join(" ", "  *****  ", "  *****  ", "*        ", "  *****  ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
