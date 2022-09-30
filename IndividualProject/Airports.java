/**
 * @author Kwabena Gyane Akuamoah
 */

package IndividualProject;

public class Airports {
    private static String AirportID;
    private static String AirportName;
    private static String CityName;
    private static String Country;
    private static String IATACode;

    /**
     *
     * @param AirportID
     * @param AirportName
     * @param CityName
     * @param Country
     * @param IATACode
     */
    public Airports(String AirportID, String AirportName, String CityName, String Country, String IATACode) {
        this.AirportID = AirportID;
        this.AirportName = AirportName;
        this.CityName = CityName;
        this.IATACode = IATACode;
    }

    public String getAirportID() {
        return AirportID;
    }

    public String getAirportName() {
        return AirportName;
    }

    public String getCityName() {
        return CityName;
    }

    public String getIATACode() {
        return IATACode;
    }

    public static void setAirportID(String airportID) {
        AirportID = airportID;
    }

    public static void setAirportName(String airportName) {
        AirportName = airportName;
    }

    public static void setCityName(String cityName) {
        CityName = cityName;
    }

    public static void setCountry(String country) {
        Country = country;
    }

    public static void setIATACode(String IATACode) {
        Airports.IATACode = IATACode;
    }
}

