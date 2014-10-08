package com.learn.json;

import java.io.ObjectInputStream.GetField;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class StringToJson {
	
	
private static String Stringjson = "{'acctID':'8087300010103953','error':null,'rentalItems':[{'deliveryID':null,'vodSource':'arris','lastAccess':null,'purchaseDate':'2014-10-07 22:47:57','nableAssetID':'8240006','expirationDate':'2014-10-09 22:47:57','isExpired':false,'pos':'13'}]}";



public static void main(String[] args) throws Exception {
	
	JSONObject json = getJSONFromResponse(Stringjson);
	JSONArray array = (JSONArray) json.get("rentalItems");
	JSONObject job = (JSONObject) array.get(0);
	System.out.println(job);
	
}


private static JSONObject getJSONFromResponse(String response) throws JSONException
{
    JSONObject jsonObject = new JSONObject(response);
    return jsonObject;
}

}