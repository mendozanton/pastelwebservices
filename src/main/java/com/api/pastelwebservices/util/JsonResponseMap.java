package com.api.pastelwebservices.util;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class JsonResponseMap {
	private static final String key1 = "content";
	
	public static HashMap<String, Object> getHashMap(Object object){
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		hashMap.put(key1, object);
		return hashMap;
	}
}
