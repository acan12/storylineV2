package app.parser.deserializer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class BaseDeserializer {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected static List fromJsonArray(JsonObject jsonObject, String key, Class clazz){
		JsonArray jsonObjectArray = jsonObject.get(key).getAsJsonArray();

		
		List<Object> nesteds = new ArrayList<Object>();
		
		// custom builder for gson purpose
		GsonBuilder gsonBuilder = new GsonBuilder();
//		gsonBuilder.registerTypeAdapter(clazz.getClass(), new CuisineDeserializer());
		gsonBuilder.setDateFormat("M/d/yy hh:mm a");
		Gson gson = gsonBuilder.create();
		
		nesteds = Arrays.asList(gson.fromJson(jsonObjectArray.toString(), Object[].class));
		
		return nesteds;
		
		
	}

}
