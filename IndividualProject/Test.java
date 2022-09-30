/**
 * @author Kwabena Gyane Akuamoah
 */

package IndividualProject;

import java.util.*;
import java.io.*;

public class Test {

    public static void main(String[] args) {
        try {
            // Reading the 'routes.csv' file using FileReader and BufferedReader
            FileReader routesReader = new FileReader("/Users/kwabenagyaneakuamoah/Library/CloudStorage/" +
                    "OneDrive-AshesiUniversity/ASHESI/Level 200/2nd Semester/Intermediate Computer Programming/ICP2022/" +
                    "src/IndividualProject/routes.csv");
            BufferedReader bufferedRoutesFile = new BufferedReader(routesReader);
            String routesInLines = bufferedRoutesFile.readLine(); //reading the file line by line

            HashMap<String, ArrayList<Routes>> routesHashMap = new HashMap<>();
            routesHashMap = new HashMap<>(); // Creating a Hashmap for the Routes

            while (routesInLines != null) {
                String[] routeData = routesInLines.split(","); // splitting each entry by a comma
                Routes routes = new Routes(routeData[0], routeData[1], routeData[2], routeData[4], routeData[7]);
                // creating an object that stores the AirlineCode, AirlineID, SourceAirportCode and DestinationAirportCode

                ArrayList<Routes> routesList = new ArrayList<>(); // storing all roots in a list

                String SourceAirportCode = routeData[2];

                routesHashMap.put(SourceAirportCode, routesList);
                System.out.println(routesHashMap);

                routesInLines = bufferedRoutesFile.readLine();
            }

            // Reading the 'airports.csv' file using FileReader and BufferedReader
            FileReader airportsReader = new FileReader("/Users/kwabenagyaneakuamoah/Library/CloudStorage/" +
                    "OneDrive-AshesiUniversity/ASHESI/Level 200/2nd Semester/Intermediate Computer Programming/ICP2022/" +
                    "src/IndividualProject/airports.csv");
            BufferedReader bufferedAirportsFile = new BufferedReader(airportsReader);
            String airportsInLines = bufferedAirportsFile.readLine(); //reading the file line by line

            HashMap<String, ArrayList<String>> airportsMap1 = new HashMap<>();
            HashMap<String, String> airportsMap2 = new HashMap<>();

            while (airportsInLines != null) {
                String[] airportData = airportsInLines.split(","); // splitting each entry by a comma

                String CityAndCountry = airportData[2] + "," + airportData[3]; // joining City and Country with ',' as a delimeter
                String AirportCode = airportData[4];

                ArrayList<String> airportCodeList = new ArrayList<>();
                airportCodeList.add(AirportCode);

                airportsMap1.put(CityAndCountry, airportCodeList);
                airportsMap2.put(AirportCode, CityAndCountry);

                airportsInLines = bufferedAirportsFile.readLine();
            }
        }

        catch (IOException ie) {
            System.out.println(ie.toString());
        }

        public static String breadthFirstSearch(String start, String destination) {
            Queue<Node> frontier = new ArrayDeque<>();
            Set<String> exploredList =  new HashSet<>();

            ArrayList<String> listOfAirports = airportsMap1.get(start);

            for (String AirportCode: listOfAirports) {
                frontier.add(new Node(null, null, AirportCode, 0));
            }
            while(frontier.size()>0) {
                Node node = frontier.remove();
                exploredList.add(node.getAirportCode());

                ArrayList<Routes> routesList = routesHashMap.get(node.getAirportCode());

                if (routesList != null) {
                    for (Routes childStates: routesList) {
                        Node child = new Node(node, childStates.getAirlineCode(),
                                childStates.getDestinationAirportCode(),childStates.getStops());

                        String endCityandCountry = airportsMap1.get(child.getAirportCode());
                        if (! frontier.contains(child) && exploredList.contains(child.getAirportCode())) {
                            if (endCityandCountry.equals(destination)) {
                                return child.solutionPath();
                            }
                            frontier.add(child);
                        }

                    }
                }
            }
        }

        }

}
