//package app.parser.deserializer;
//
//import java.lang.reflect.Type;
//
//import app.core.model.Cuisine;
//import app.core.model.Restaurant;
//
//import com.google.gson.JsonDeserializationContext;
//import com.google.gson.JsonDeserializer;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonParseException;
//
//public class CuisineDeserializer implements JsonDeserializer<Cuisine>{
//
//	@Override
//	public Cuisine deserialize(JsonElement json, Type tipe,
//			JsonDeserializationContext context) throws JsonParseException {
//		// TODO Auto-generated method stub
//		
//		
//		// TODO Auto-generated method stub
//		final com.google.gson.JsonObject jsonObject = json.getAsJsonObject();
//
//		final Cuisine cuisine = new Cuisine();
//		cuisine.setLabel(jsonObject.get("label").getAsString());
//		
//
//		
//		return cuisine;
//	}
//	
//}
