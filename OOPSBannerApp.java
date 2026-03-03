/**
 * OOPSBannerApp UC2 - Banner Display Application
 *
 * This class demonstrates the second user story:
 *
 * UC2: Banner output
 * - Prints a large ASCII-art banner of the letters O, O, P, S built from
 *   asterisks (*) and spaces. The banner uses individual `System.out.println()`
 *   calls for each of the 7 lines that make up the characters. Each character
 *   is represented in a 7-line format and 9 characters wide.
 *
 * @author Akshat Tiwari
 * @version 2.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC2: Banner lines assembled using string concatenation with +
        System.out.println("  *****  " + " " + "  *****  " + " " + "*******  " + " " + "  *****  ");
        System.out.println(" *     * " + " " + " *     * " + " " + "*      * " + " " + " *     * ");
        System.out.println("*       *" + " " + "*       *" + " " + "*      * " + " " + "*        ");
        System.out.println("*       *" + " " + "*       *" + " " + "*******  " + " " + "  ****   ");
        System.out.println("*       *" + " " + "*       *" + " " + "*        " + " " + "       * ");
        System.out.println(" *     * " + " " + " *     * " + " " + "*        " + " " + " *     * ");
        System.out.println("  *****  " + " " + "  *****  " + " " + "*        " + " " + "  *****  ");
    }
}
