package com.codies.movieotic.Models.PersonModels.CreditTv;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Cast {

    @SerializedName("credit_id")
    @Expose
    private String creditId;
    @SerializedName("original_name")
    @Expose
    private String originalName;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("genre_ids")
    @Expose
    private List<Integer> genreIds = null;
    @SerializedName("character")
    @Expose
    private String character;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("poster_path")
    @Expose
    private String posterPath;
    @SerializedName("vote_count")
    @Expose
    private Integer voteCount;
    @SerializedName("vote_average")
    @Expose
    private Double voteAverage;
    @SerializedName("popularity")
    @Expose
    private Double popularity;
    @SerializedName("episode_count")
    @Expose
    private Integer episodeCount;
    @SerializedName("original_language")
    @Expose
    private String originalLanguage;
    @SerializedName("first_air_date")
    @Expose
    private String firstAirDate;
    @SerializedName("backdrop_path")
    @Expose
    private String backdropPath;
    @SerializedName("overview")
    @Expose
    private String overview;
    @SerializedName("origin_country")
    @Expose
    private List<String> originCountry = null;

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public Integer getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(Integer episodeCount) {
        this.episodeCount = episodeCount;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public void setFirstAirDate(String firstAirDate) {
        this.firstAirDate = firstAirDate;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public List<String> getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(List<String> originCountry) {
        this.originCountry = originCountry;
    }

}
