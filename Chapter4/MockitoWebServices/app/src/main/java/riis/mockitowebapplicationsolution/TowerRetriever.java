package riis.mockitowebapplicationsolution;

import android.net.Uri;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author tkocikjr
 */
public class TowerRetriever
{
    private Consts mConsts;

    public TowerRetriever()
    {
        mConsts = new Consts();
    }

    /**
     * @param latitude
     *      Latitude coordinate as a String
     * @param longitude
     *      Longitude coordinate as a String
     * @param distance
     *      Distance coordinate as a String
     * @return String
     *      JSon response as a String
     */
    public String send(String latitude, String longitude, String distance)
    {
        if(latitude == null || longitude == null || latitude.isEmpty() || longitude.isEmpty())
        {
            return null;
        }

        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        Uri uri = Uri.parse(mConsts.getTowerInformation(latitude, longitude, distance));

        try {
            URL url = new URL(uri.toString());

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();
            if (inputStream == null) {
                return null;
            }

            reader = new BufferedReader(new InputStreamReader(inputStream));
            String responseString = reader.readLine();
            reader.close();
            urlConnection.disconnect();

            return responseString;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally{
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * Save tower information from API to the database.
     *
     * @param json
     *      Web-Service Json response as a String
     * @param locationId
     *      Location's unique id.
     * @throws JSONException
     */
//    public void getTowerPower(String json, long locationId) throws JSONException
//    {
//        JSONObject jsonObject = new JSONObject(json);
//        JSONObject networkRankJson = jsonObject.getJSONObject(NETWORK_RANK);
//
//        //Reference: http://stackoverflow.com/questions/7304002/how-to-parse-a-dynamic-json-key-in-a-nested-json-result
//        Iterator keys = networkRankJson.keys();
//        while(keys.hasNext())
//        {
//            String network = (String) keys.next();
//            JSONObject networkObject = networkRankJson.getJSONObject(network);
//            Iterator networkKeys = networkObject.keys();
//
//            //Dynamically grab network types, instead of hard-coding 2G, 3G, etc.
//            while(networkKeys.hasNext())
//            {
//                String networkType = (String) networkKeys.next();
//                JSONObject towerObject = networkObject.getJSONObject(networkType);
//
//                long towerId = addTower(towerObject);
//
//                addLocationTower(towerId, locationId);
//            }
//        }
//    }
}
