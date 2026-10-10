package com.rays.dto;

import com.rays.common.BaseDTO;

public class MovieDto extends BaseDTO {

	private String movieName;
	private String duration;
	private String title;
	private String genre;
	private double rating;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "movieName";
	}

	@Override
	public String getUniqueValue() {
		return "movieName";
	}

	@Override
	public String getLabel() {
		return "movie";
	}

	@Override
	public String getTableName() {
		return "movie";
	}

}
