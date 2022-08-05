import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Api {
    public static void main(String[] args) throws IOException {
        URL obj = new URL("https://ftmscan.com/chart/address");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");

        if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            String string = response.toString();
            in.close();

            String finalString = string.substring(string.indexOf("var litChartData = ") + 19, string.indexOf(",];            Highcharts.setOptions"));
            finalString = finalString.replaceAll("y :", "\"y\" :");
            finalString = finalString.replaceAll("formattedValue", "\"formattedValue\"");
            finalString = finalString.replaceAll("dt", "\"dt\"");
            finalString = finalString.replaceAll("newaddresscount", "\"newaddresscount\"");
            finalString = finalString.replaceAll("'", "\"");
            finalString = finalString.replaceAll(", }", "}");
            finalString += "]";

            Data[] data = new ObjectMapper().readValue(finalString, Data[].class);
            for (Data value : data) System.out.println(value);
        }
    }
}
