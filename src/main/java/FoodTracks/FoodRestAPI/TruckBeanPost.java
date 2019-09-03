package FoodTracks.FoodRestAPI;

public class TruckBeanPost {
	
	private String _id;
	private String username;
	private String truckName;
	private String type;
	private int lat;
	private int lng;
	private int stars;
	private int reviewsAmount;
	private int priceRating;
//	
	
	public String getTruckName() {
		return truckName;
	}
	
	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getLat() {
		return lat;
	}
	
	public void setLat(int lat) {
		this.lat = lat;
	}
	
	public int getLng() {
		return lng;
	}
	
	public void setLng(int lng) {
		this.lng = lng;
	}
	
	public String getId() {
		return _id;
	}
	
	public void setId(String _id) {
		this._id = _id;
	}
	
	
	public int getStars() {
		return stars;
	}
	
	public void setStars(int stars) {
		this.stars = stars;
	}
	
	public int getReviewsAmount() {
		return reviewsAmount;
	}
	
	public void setReviewsAmount(int reviewsAmount) {
		this.reviewsAmount = reviewsAmount;
	}
	
	public int getPriceRating() {
		return priceRating;
	}
	
	public void setPriceRating(int priceRating) {
		this.priceRating = priceRating;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public TruckBeanPost(String _id, String truckName, String type, String username, int lat, int lng,
			int stars, int reviewsAmount, int priceRating) {
		super();
		this._id = _id;
		this.truckName = truckName;
		this.type = type;
		this.username = username;
		this.lat = lat;
		this.lng = lng;
		this.stars = stars;
		this.reviewsAmount = reviewsAmount;
		this.priceRating = priceRating;
	}

	

}
