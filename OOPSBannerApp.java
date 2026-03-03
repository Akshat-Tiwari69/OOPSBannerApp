/**
 * OOPSBannerApp UC6 - Banner Display Application
 *
 * This class demonstrates the sixth user story:
 *
 * UC6: Refactor Banner Logic into Functions
 * - Extends UC5 by defining helper methods that generate the banner lines for each
 *   character (O, P, S). These methods encapsulate pattern generation logic, improving
 *   modularity, reusability, and maintainability. The main method calls these methods
 *   during array initialization to build the banner programmatically.
 *
 * Key concepts: static methods, helper methods, method abstraction, DRY principle, code reusability.
 *
 * @author Akshat Tiwari
 * @version 6.0
 */
public class OOPSBannerApp {
    
    /**
     * Helper method to generate the pattern for the letter 'O'
     * @return String array containing the 7 lines of the O pattern
     */
    public static String[] getOPattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
        };
    }
    
    /**
     * Helper method to generate the pattern for the letter 'P'
     * @return String array containing the 7 lines of the P pattern
     */
    public static String[] getPPattern() {
        return new String[] {
            "*******  ",
            "*      * ",
            "*      * ",
            "*******  ",
            "*        ",
            "*        ",
            "*        "
        };
    }
    
    /**
     * Helper method to generate the pattern for the letter 'S'
     * @return String array containing the 7 lines of the S pattern
     */
    public static String[] getSPattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            "*        ",
            "  ****   ",
            "       * ",
            " *     * ",
            "  *****  "
        };
    }
    
    public static void main(String[] args) {
        // UC6: Get patterns for each letter using helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
        
        // Assemble banner lines by combining patterns from each letter using String.join()
        String[] bannerLines = {
            String.join(" ", oPattern[0], oPattern[0], pPattern[0], sPattern[0]),
            String.join(" ", oPattern[1], oPattern[1], pPattern[1], sPattern[1]),
            String.join(" ", oPattern[2], oPattern[2], pPattern[2], sPattern[2]),
            String.join(" ", oPattern[3], oPattern[3], pPattern[3], sPattern[3]),
            String.join(" ", oPattern[4], oPattern[4], pPattern[4], sPattern[4]),
            String.join(" ", oPattern[5], oPattern[5], pPattern[5], sPattern[5]),
            String.join(" ", oPattern[6], oPattern[6], pPattern[6], sPattern[6])
        };
        
        // Use a for-each loop to iterate through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
