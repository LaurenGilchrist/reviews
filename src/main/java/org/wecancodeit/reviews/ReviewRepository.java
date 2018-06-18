package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review theGreatestShowman = new Review(1L, "The Greatest Showman", "Greatest musical with a great message, that makes people feel good.", "/images/greatestshowman.jpg");
		Review avengers = new Review(2L, "Avengers", "Amazing superhero movie with a mash-up of leading superheros with great cohesiveness!!", "/images/avengers.jpg");
		Review spaceballs = new Review(3L, "Spaceballs", "Best comedy that includes quirkiness that spoofs nearly all modern SciFi films", "/images/spaceballs.jpg");
		
		reviewList.put(theGreatestShowman.getId(), theGreatestShowman);
		reviewList.put(avengers.getId(), avengers);
		reviewList.put(spaceballs.getId(), spaceballs);
	}
	//constructor for testing purposes
	public ReviewRepository(Review...reviews) {
		for(Review review: reviews) {
		reviewList.put(review.getId(), review);
		}
	}

	public Review findOne(long id) {
		
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		
		return reviewList.values();
	}
	
	
	}


