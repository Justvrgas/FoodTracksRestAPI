# FoodTracksRestAPI
Restful API for Food Tracks iOS app. With java, I used Spring Boot to create a simple API that allows to send POST and GET requests.

### HTTP To Send POST/GET Request (When Hosting on Local Machine)

```sh
localhost:8080/food-trucks
```

### Example of a Successful Response

```sh
{
    "results": [
        {
            "_id": "0",
            "username": "jvargas",
            "truckName": "Bella Luna",
            "type": "Italian",
            "lat": 37.758155,
            "lng": -121.461069,
            "stars": 4,
            "reviewsAmount": 200,
            "priceRating": 3
        },
        {
            "_id": "1",
            "username": "Scurry",
            "truckName": "JR Tacos",
            "type": "Mexican",
            "lat": 37.775606,
            "lng": -122.418715,
            "stars": 4.5,
            "reviewsAmount": 200,
            "priceRating": 2
        },
        {
            "_id": "2",
            "username": "MannyP",
            "truckName": "Quickly",
            "type": "Asian",
            "lat": 37.775522,
            "lng": -122.419476,
            "stars": 3,
            "reviewsAmount": 139,
            "priceRating": 2
        },
        {
            "_id": "3",
            "username": "kdawg",
            "truckName": "Long Dogs",
            "type": "American",
            "lat": 37.787351,
            "lng": -122.408379,
            "stars": 2,
            "reviewsAmount": 320,
            "priceRating": 1
        }
    ]
}
```
