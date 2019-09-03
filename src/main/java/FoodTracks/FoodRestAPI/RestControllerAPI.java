package FoodTracks.FoodRestAPI;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//import javax.swing.text.Document;

import org.bson.Document;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

@RestController

public class RestControllerAPI {
	
	MongoClientURI uri = new MongoClientURI("mongodb+srv://JustVgas:1Vargas@cluster0-uon7z.azure.mongodb.net/test?retryWrites=true&w=majority");

	MongoClient mongoClient = new MongoClient(uri);
	MongoDatabase database = mongoClient.getDatabase("test");
	
	MongoCollection<Document> truckCollection = database.getCollection("trucks");
	
	

	@RequestMapping(value = "/food-trucks", method = RequestMethod.GET)
	@ResponseBody
	public HashMap<String, List<Document>> getFoodTrucks(){
		List<Document> trucks = new ArrayList<>();
		HashMap<String, List<Document>> resp = new HashMap<>();
		MongoCursor<Document> cursor = truckCollection.find().iterator();
		try {
			while(cursor.hasNext()) {
				trucks.add(cursor.next());
			}
		}finally {
			cursor.close();
		}
		resp.put("results", trucks);
		return resp;
	}
	

	
	@RequestMapping(value = "/food-trucks", method = RequestMethod.POST)
	public ResponseEntity<String> postFoodTrucks(@RequestBody Map<String, Object> payload) {
		Document document = new Document("username", payload.get("username"))
				.append("_id", payload.get("_id"))
				.append("truckName", payload.get("truckName"))
				.append("type", payload.get("type"))
				.append("lat", payload.get("lat"))
				.append("lng", payload.get("lng"))
//				.append("realName", payload.get("realName"))
				.append("stars", payload.get("stars"))
				.append("reviewsAmount", payload.get("reviewsAmount"))
				.append("priceRating", payload.get("priceRating"));
		
	
		
		truckCollection.insertOne((Document) document);
		return ResponseEntity.ok("Status: 200 Object Added");
		
		
		
	}
	
	

	

}
