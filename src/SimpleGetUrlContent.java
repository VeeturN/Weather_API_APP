
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import java.io.*;
import java.net.*;

public class SimpleGetUrlContent {
    private URL urlPath;
    JSONObject json=null;
    public SimpleGetUrlContent(String url) throws MalformedURLException {
        this.urlPath = new URL(url);
    }

    public void ReeadUrl() throws Exception {
        StringBuilder content = new StringBuilder();
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(urlPath.openStream(), "UTF-8"))) {
            String line;
            while ((line = in.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        json = new JSONObject(content.toString());
    }
    public String getWeather() throws Exception {
        JSONArray waterArray = json.getJSONArray("weather");
        JSONObject temperature = json.getJSONObject("main");
        StringBuilder sb = new StringBuilder();
        double temp = Math.round((temperature.getDouble("temp") - 273.15) * 10.0) / 10.0;
        sb.append("Pogoda: ").append(waterArray.getJSONObject(0).getString("main")).append("<br>");
        sb.append("Temperatura: ").append(temp).append("°C<br>");
        sb.append("Opis: ").append(waterArray.getJSONObject(0).getString("description")).append("<br>");
        return sb.toString();
    }

    public Double getRateFor(String country) throws Exception {
        JSONObject conversion_rates = json.getJSONObject("conversion_rates");
        return conversion_rates.getDouble(country);
    }
    public Double getNBPRate() throws Exception {
        try {
            JSONArray rates = json.getJSONArray("rates");
            return rates.getJSONObject(0).getDouble("mid");
        } catch (JSONException e) {
            return 0.0;
        }
    }

}
