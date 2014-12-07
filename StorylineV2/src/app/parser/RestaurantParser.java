//package app.parser;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import app.core.model.Cuisine;
//import app.core.model.Restaurant;
//import app.parser.deserializer.RestaurantDeserializer;
//
//import com.eclipsesource.json.JsonObject;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//public class RestaurantParser {
//	public static List<Restaurant> doParse(String response) {
//
//		JsonObject jsonObject = JsonObject.readFrom(response);
//
//		// JsonArray restosJson = jsonObject.get("restaurants").asArray();
//		String jsonString = jsonObject.get("restaurants").asArray().toString();
//
//		GsonBuilder gsonBuilder = new GsonBuilder();
//		gsonBuilder.registerTypeAdapter(Restaurant.class,
//				new RestaurantDeserializer());
//		gsonBuilder.setDateFormat("M/d/yy hh:mm a");
//		Gson gson = gsonBuilder.create();
//
//		List<Restaurant> restos = new ArrayList<Restaurant>();
//		restos = Arrays.asList(gson.fromJson(jsonString, Restaurant[].class));
//		for (Restaurant resto : restos) {
//			for (Cuisine cuisine : resto.getCuisines()) {
//				System.out.println("------ cuisines label: "
//						+ cuisine.getLabel());
//			}
//
//		}
//
//		return restos;
//	}
//
//}
