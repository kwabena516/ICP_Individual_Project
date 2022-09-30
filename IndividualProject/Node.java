/**
 * @author Kwabena Gyane Akuamoah
 */

package IndividualProject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Node {
    private static Node Parent;
    private static String AirlineCode;
    private static String AirportCode;
    private static int Stops;

    /**
     *
     * @param Parent
     * @param AirlineCode
     * @param AirportCode
     * @param Stops
     */
    public Node(Node Parent, String AirlineCode, String AirportCode, int Stops) {
        this.Parent = Parent;
        this.AirlineCode = AirlineCode;
        this.AirportCode = AirportCode;
        this.Stops = Stops;
    }

    public static Node getParent() {
        return Parent;
    }

    public static void setParent(Node parent) {
        Parent = parent;
    }

    public static String getAirportCode() {
        return AirportCode;
    }

    public static void setAirportCode(String airportCode) {
        AirportCode = airportCode;
    }

    public static String getAirlineCode() {
        return AirlineCode;
    }

    public static void setAirlineCode(String airlineCode) {
        AirlineCode = airlineCode;
    }

    public static int getStops() {
        return Stops;
    }

    public static void setStops(int stops) {
        Stops = stops;
    }


    public ArrayList<String> solutionPath() {
        ArrayList<String> sequenceList = new ArrayList();
        ArrayList<Integer> list = new ArrayList();
        ArrayList<String> air
        Node currentNode = this;

        while (currentNode.Parent != null) {
            sequenceList.add(currentNode.AirportCode);
            currentNode = currentNode.Parent;
            Collections.reverse(sequenceList);
        }
        return sequenceList;
    }

}


