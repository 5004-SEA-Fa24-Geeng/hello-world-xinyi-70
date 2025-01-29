package student;

/*
 * This class is a placeholder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 *
 */

/**
 * Greeting holds the locality information and greeting formats.
 *
 * <p>
 * The Greeting class is meant to be a simple class that stores the locality IDs and names,
 * and associated greetings in ASCII and Unicode characters. It provides methods to format
 * these greetings based on the choices.
 * </p>
 *
 */
public class Greeting {
    /** Int value of locality ID. Immutable */
    private final int localityID;

    /** Holds the name of the locality. Immutable. */
    private final String localityName;

    /** Holds the greeting in ASCII characters. Immutable. */
    private final String asciiGreeting;

    /** Holds the greeting in Unicode characters. Immutable. */
    private final String unicodeGreeting;

    /** Holds the format string template used for creating greetings. Immutable. */
    private final String formatStr;

    /**
     * Constructor that creates a default greeting with "Hello".
     * @param localityID ID of the locality
     * @param localityName name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * Constructor that creates a greeting using only ASCII characters.
     * @param localityID ID of the locality
     * @param localityName name of the locality
     * @param greeting greeting using ASCII characters
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * Constructor that creates a greeting with ASCII and Unicode characters.
     * @param localityID ID of the locality
     * @param localityName name of the locality
     * @param asciiGreeting greeting using ASCII characters
     * @param unicodeGreeting greeting using Unicode characters
     * @param formatStr format string for the greeting
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Returns the locality ID number.
     * @return the locality ID number
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Returns the locality name.
     * @return the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Returns the ASCII greeting. Just the greeting, no formatting.
     * @return the ASCII greeting
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Returns the Unicode greeting. Just the greeting, no formatting.
     * @return the Unicode greeting
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * Returns the Unicode format string with the greeting inserted into the format.
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr() {
        return String.format(formatStr, unicodeGreeting);
    }

    /**
     * Returns the format string with the greeting inserted into the format.
     * @param asciiOnly if true, only ASCII characters will be used; if false, Unicode characters will be used
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr(boolean asciiOnly) {
        return String.format(formatStr, asciiOnly ? asciiGreeting : unicodeGreeting);
    }

    /**
     * Returns the full greeting details as a string. Primarily for debugging purposes.
     * @return the full greeting details as a string
     */
    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }

}
