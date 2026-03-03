/**
 * OOPSBannerApp UC5 - Banner Display Application
 *
 * This class demonstrates the fifth user story:
 *
 * UC5: Render OOPS as Banner using Inline Array Initialization
 * - Extends UC4 by combining array declaration and initialization with `String.join()`
 *   method calls in a single statement. This approach eliminates the need for separate
 *   population statements and provides more concise, readable code while maintaining
 *   the same modularity benefits of using arrays and loops.
 *
 * Key concepts: inline array initialization, array literal syntax, method invocation in initializers.
 *
 * @author Akshat Tiwari
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Declare and initialize banner lines in a single statement using inline array initialization
        // Each banner line is constructed using String.join() directly within the array initializer
        String[] bannerLines = {
            String.join(" ", "  *****  ", "  *****  ", "*******  ", "  *****  "),
            String.join(" ", " *     * ", " *     * ", "*      * ", " *     * "),
            String.join(" ", "*       *", "*       *", "*      * ", "*        "),
            String.join(" ", "*       *", "*       *", "*******  ", "  ****   "),
            String.join(" ", "*       *", "*       *", "*        ", "       * "),
            String.join(" ", " *     * ", " *     * ", "*        ", " *     * "),
            String.join(" ", "  *****  ", "  *****  ", "*        ", "  *****  ")
        };

        // Use a for-each loop to iterate through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
