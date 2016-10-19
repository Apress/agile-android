package com.riis.horoscope;

import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class JsonParser {
	final String TAG = "JsonParser.java";

	public JSONObject getJSONFromUrl(String url) {
		// make HTTP request
		try {
			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpGet httpGet = new HttpGet(url);

			HttpResponse httpResponse = httpClient.execute(httpGet);
			HttpEntity httpEntity = httpResponse.getEntity();
			InputStream inputStream = httpEntity.getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"), 8);

            JSONObject jsonObject = createJsonObject(reader);
            inputStream.close();

            return jsonObject;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

    protected JSONObject createJsonObject(BufferedReader reader) {
        try {
            StringBuilder sb = new StringBuilder();
            JSONObject jsonObject;
            String line;
            String json;

            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }

            json = sb.toString();
            jsonObject = new JSONObject(json);

            return jsonObject;
        } catch (Exception e) {
            Log.e(TAG, "Error converting result " + e.toString());
        }

        return null;
    }

    public boolean isValidJSON(String horoscope){
		try {
			new JSONObject(horoscope);
			return true;
		} catch (JSONException e) {
            e.printStackTrace();
			return false;
		}
	}
}
