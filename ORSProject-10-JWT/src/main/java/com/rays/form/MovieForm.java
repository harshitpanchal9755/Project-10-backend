package com.rays.form;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MovieDto;

public class MovieForm extends BaseForm {
	
	@NotNull(message = "MovieName is required")
	private String movieName;
	
	@NotNull(message = "Duration is required")
	private String duration;
	
	@NotNull(message = "Title is required")
	private String title;
	
	@NotNull(message = "Genre is required")
	private String genre;
	
	@NotNull(message = "MovieName is required")
	@DecimalMin(value = "0.0", message = "Rating must be greater than or equal to 0.0")
	@DecimalMax(value = "10.0", message = "Rating must be less than or equal to 10.0")
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
	public BaseDTO getDto() {
		
		MovieDto dto = (MovieDto) initDTO(new MovieDto());
		dto.setMovieName(movieName);
		dto.setDuration(duration);
		dto.setTitle(title);
		dto.setGenre(genre);
		dto.setRating(rating);
		
		return dto;
	}

}
