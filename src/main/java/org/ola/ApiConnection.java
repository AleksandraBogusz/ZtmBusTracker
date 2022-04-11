package org.ola;
import com.google.gson.Gson;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ApiConnection {

    public static List<Vehicle> fetchVehicles() throws IOException {
        URL url = new URL("https://ckan2.multimediagdansk.pl/gpsPositions?v=2");
        var vehiclesList = new ArrayList<Vehicle>();
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            Scanner scanner = new Scanner(url.openStream());
            var data = "";
            while(scanner.hasNext()) {
                data += scanner.nextLine();
            }
            scanner.close();
            Gson gson = new Gson();
            var apiBody = gson.fromJson(data, ApiBody.class);
            vehiclesList.addAll(apiBody.getVehicles());

        } catch (IOException e) {
            System.out.println(e);
        }

        return vehiclesList;
    }
}


