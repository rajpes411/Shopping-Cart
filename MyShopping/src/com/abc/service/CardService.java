package com.abc.service;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.abc.bean.Card;
@Transactional
@Service
public class CardService {
	private final static String USER_AGENT ="Mozilla/5.0";
	

	public boolean validateCard(Card card) {
		
		
		String uri="http://localhost:9099/convert/inchcm/details/";
		boolean valid=false;
		Map<Object, Object> jsonap=new HashMap<>();
		// Call RESTful webservice with URL http://localhost:9203/service/card/details/cardNo/name/cvv
		uri += card.getCardNo() + "/" + card.getName() + "/" + card.getCvv();
		System.out.println("uri: " + uri);
		String delim = System.getProperty("line.separator");
		try {
			URL url=new URL(uri);
			HttpURLConnection connection=(HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("User-Agent", USER_AGENT);
			BufferedReader reader= new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine = "";
			StringBuilder response = new StringBuilder();
			while((inputLine=reader.readLine()) != null) {
				response.append(inputLine+delim);
			}
			reader.close();
			String val = response.toString();
			System.out.println("val: " + val);
			Map<Object, Object> jsonmap = getJsonMap(val);
			System.out.println("JsonMap: " + jsonmap);
			Long cvvVal = (Long) jsonmap.get("cvv");
			if(jsonmap.get("name")!=null && jsonmap.get("expiry")!=null && cvvVal != 0) {
				valid = true;
			}
			
			
			//valid=true;
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//valid=true;
		
		return valid;
		
		
	}
	
	private Map<Object, Object> getJsonMap(String val) {
		Map<Object, Object> keyMap = new HashMap<>();
		JSONParser parser = new JSONParser();
		try {
			JSONObject obj = (JSONObject) parser.parse(val);
			Set<String> keySet = obj.keySet();
			for(Object keyObj: keySet) {
				Object jObj = obj.get(keyObj);
				if(jObj instanceof JSONObject) {
					System.out.println("json obj: "+jObj);
					JSONObject jsonObj = (JSONObject) jObj;
					Set<String> keySetInner = jsonObj.keySet();
					HashMap<Object, Object> innerMap = new HashMap<>();
					for(Object keyObjInner : keySetInner) {
						Object jsonObjInner = jsonObj.get(keyObjInner);
						innerMap.put(keyObjInner, jsonObjInner);
					}
					keyMap.put(keyObj, innerMap);
				}
				else if(jObj instanceof JSONArray) {
					JSONArray jsonArr = (JSONArray) jObj;
					if(jsonArr.size()>0) {
						JSONObject jsonObjArr = (JSONObject) jObj;
						System.out.println("json arr obj: "+jsonObjArr);
						Set<String> keySetInnerArr = jsonObjArr.keySet();
						HashMap<Object, Object> innerMap = new HashMap<>();
						for(Object keyObjectInnerArr : keySetInnerArr) {
							Object jsonObjInnerArr =  jsonObjArr.get(keyObjectInnerArr);
							innerMap.put(keyObjectInnerArr, jsonObjInnerArr);
						}
						keyMap.put(keyObj, innerMap);
					}
				}
				else {
					keyMap.put(keyObj, jObj);
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return keyMap;
	}
public static void main(String[] args) {
	System.out.println("test web service");
	//String uri="http://localhost:9099/convert/inchcm/details/";
	Card card =new Card(11, "11111", "raj", new Date(), 111, 1001);
	boolean valid= new CardService().validateCard(card);
	System.out.println("Card Valid : " +valid);
//	uri += card.getCardNo() + "/" + card.getName() + "/" + card.getCvv();
//	System.out.println("uri: " + uri);
//	String delim = System.getProperty("line.separator");
//	try {
//		URL url=new URL(uri);
//		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
//		connection.setRequestMethod("GET");
//		connection.setRequestProperty("User-Agent", USER_AGENT);
//		BufferedReader reader= new BufferedReader(new InputStreamReader(connection.getInputStream()));
//		String inputLine = "";
//		StringBuilder response = new StringBuilder();
//		while((inputLine=reader.readLine()) != null) {
//			response.append(inputLine+delim);
//		}
//		reader.close();
//		String val = response.toString();
//		System.out.println("val: " + val);
//		
//	} catch (MalformedURLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
}
}
