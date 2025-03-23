import java.net.MalformedURLException;

public class Service {
    private String county;
    private String city;
    private String waluta;
    public String countrySkr;
    public Service(String kraj) {
        county=kraj;
    }

    public String getWeather(String miasto) throws Exception {
        SimpleGetUrlContent simpleGetUrlContent = null;
        try {
            simpleGetUrlContent = new SimpleGetUrlContent("https://api.openweathermap.org/data/2.5/weather?q="+miasto+"&appid=d8f492d6e4644731e86045ab5d3c664e");
            simpleGetUrlContent.ReeadUrl();
            simpleGetUrlContent.getWeather();
            city=miasto;
        } catch (Exception e) {
            return null;
        }
        return simpleGetUrlContent.getWeather();
    }
    public Double getRateFor(String waluta) throws Exception {
        Country country2 = new Country();
        if (country2.countriesReverse.get(waluta)==null) {
            return 2.0;
        }
        SimpleGetUrlContent simpleGetUrlContent = new SimpleGetUrlContent("https://v6.exchangerate-api.com/v6/e855da8710ecf5664eaa1ed3/latest/"+waluta);
        simpleGetUrlContent.ReeadUrl();
        countrySkr = country2.countries.get(county);
        this.waluta=waluta;
        if (countrySkr==null) {
            return 0.0;
        }
        return simpleGetUrlContent.getRateFor(countrySkr);
    }
    public Double getNBPRate() throws Exception {
        SimpleGetUrlContent simpleGetUrlContentA = null;
        SimpleGetUrlContent simpleGetUrlContentB = null;
        try {
            simpleGetUrlContentA = new SimpleGetUrlContent("https://api.nbp.pl/api/exchangerates/rates/A/"+countrySkr+"/?format=json");
            simpleGetUrlContentA.ReeadUrl();

            return simpleGetUrlContentA.getNBPRate();

        } catch (Exception e) {
            if (countrySkr.equals("PLN")) {
                return 1.0;
            }
            try {
                simpleGetUrlContentB = new SimpleGetUrlContent("https://api.nbp.pl/api/exchangerates/rates/B/"+countrySkr+"/?format=json");
                simpleGetUrlContentB.ReeadUrl();
                return simpleGetUrlContentB.getNBPRate();
            } catch (Exception e2) {
                return 0.0;
            }
        }
    }
    public String getCountry() {
        return county;
    }
    public void setCountry(String country) {
        this.county = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getWaluta() {
        return waluta;
    }
    public void setWaluta(String waluta) {
        this.waluta = waluta;
    }
}
