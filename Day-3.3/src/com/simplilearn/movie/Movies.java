package com.simplilearn.movie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MOVIES")
public class Movies {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MOVIE_ID")
	int movieid;  
	
	@Column(name="MOVIE_NAME")
	String movieName;
	
	@Column(name="MTICKET_PRICE")
	int moviePrice;
	
	@Column(name="MOVIE_DIRECTOR")
	String movieDirector;

	
	public Movies() {
		
	}
	
	public Movies(String movieName, int moviePrice, String movieDirector) {
		super();
		this.movieName = movieName;
		this.moviePrice = moviePrice;
		this.movieDirector = movieDirector;
	}
	
	public Movies(int movieid, String movieName, int moviePrice, String movieDirector) {
		super();
		this.movieid = movieid;
		this.movieName = movieName;
		this.moviePrice = moviePrice;
		this.movieDirector = movieDirector;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getMoviePrice() {
		return moviePrice;
	}

	public void setMoviePrice(int moviePrice) {
		this.moviePrice = moviePrice;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	@Override
	public String toString() {
		return "Movies [movieid=" + movieid + ", movieName=" + movieName + ", moviePrice=" + moviePrice
				+ ", movieDirector=" + movieDirector + "]";
	}
	
}
