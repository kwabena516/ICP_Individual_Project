/**
 * @author Kwabena Gyane Akuamoah
 */

package IndividualProject;

public class Routes {
    private static String AirlineCode;
    private static String AirlineID;
    private static String SourceAirportCode;
    private static String DestinationAirportCode;

    /**
     *
     * @param AirlineCode
     * @param AirlineID
     * @param SourceAirportCode
     * @param DestinationAirportCode
     * @param routeDatum
     */
    public Routes(String AirlineCode, String AirlineID, String SourceAirportCode, String DestinationAirportCode, String routeDatum) {
        this.AirlineCode = AirlineCode;
        this.AirlineID = AirlineID;
        this.SourceAirportCode = SourceAirportCode;
        this.DestinationAirportCode = DestinationAirportCode;
    }

    public static String getAirlineCode() {
        return AirlineCode;
    }

    public static void setAirlineCode(String airlineCode) {
        AirlineCode = airlineCode;
    }

    public static String getAirlineID() {
        return AirlineID;
    }

    public static void setAirlineID(String airlineID) {
        AirlineID = airlineID;
    }

    public static String getSourceAirportCode() {
        return SourceAirportCode;
    }

    public static void setSourceAirportCode(String sourceAirportCode) {
        SourceAirportCode = sourceAirportCode;
    }

    public static String getDestinationAirportCode() {
        return DestinationAirportCode;
    }

    public static void setDestinationAirportCode(String destinationAirportCode) {
        DestinationAirportCode = destinationAirportCode;
    }
}