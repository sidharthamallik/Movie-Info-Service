package io.javabrains.ratingsdataservice.model;

public class Rating {

    private String movieId;
    private int rating;
    private int houseNo;

    

	public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
        this.houseNo = houseNo;
    }
	
	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
