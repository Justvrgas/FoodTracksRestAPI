package FoodTracks.FoodRestAPI;

public class TruckBeanGet {
	
	private String _id;
	private String truckName;
	private String type;
	private Double lat;
	private Double lng;
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
	
	
	public Double getLat() {
		return lat;
	}
	
	public void setLat(Double lat) {
		this.lat = lat;
	}
	
	public Double getLng() {
		return lng;
	}
	
	public void setLng(Double lng) {
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
	
	public TruckBeanGet(String _id, String truckName, String type, Double lat, Double lng,
			int stars, int reviewsAmount, int priceRating) {
		super();
		this._id = _id;
		this.truckName = truckName;
		this.type = type;
		this.lat = lat;
		this.lng = lng;
		this.stars = stars;
		this.reviewsAmount = reviewsAmount;
		this.priceRating = priceRating;
	}
	
	
	
	
	

	
	

	
	
	
	
	
}
