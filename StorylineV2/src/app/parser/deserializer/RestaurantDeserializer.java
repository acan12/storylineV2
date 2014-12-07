//package app.parser.deserializer;
//
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import app.core.model.BaseModel;
//import app.core.model.Cuisine;
//import app.core.model.Restaurant;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonDeserializationContext;
//import com.google.gson.JsonDeserializer;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParseException;
//
//public class RestaurantDeserializer extends BaseDeserializer implements JsonDeserializer<Restaurant> {
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public Restaurant deserialize(final JsonElement json, final Type tipe,
//			final JsonDeserializationContext context) throws JsonParseException {
//	
//		// TODO Auto-generated method stub
//		final com.google.gson.JsonObject jsonObject = json.getAsJsonObject();
//
//		final Restaurant resto = new Restaurant();
//		resto.setName(jsonObject.get("name").getAsString());
//		resto.setSlug(jsonObject.get("slug").getAsString());
//		
//		resto.setCuisines((List<Cuisine>) fromJsonArray(jsonObject, "cuisines", Cuisine[].class));
//
//		return resto;
//	}
//
//}
