package riis.mockitowebapplicationsolution;

/**
 * @author tkocikjr
 */
public class Consts
{
    private static final String API_KEY = "d2ad6d01cd5a26f9bff1f51f5be7affd";

    private String getDefaultUrl()
    {
        return "http://api.opensignal.com/v2/networkstats.json?";
    }

    private String getApiKey()
    {
        return "&apikey=" + API_KEY;
    }

    /**
     * @param lat
     *  Latitude value as a String
     * @param lon
     *  Longitude value as a String
     * @param distance
     *  Distance Value as a String
     * @return
     *  URL as a string value to retrieve Cell Tower Information
     */
    public String getTowerInformation(String lat, String lon, String distance)
    {
        return getDefaultUrl() + "lat=" + lat + "&lng=" + lon + "&distance="+ distance + getApiKey();
    }
}
