package com.codies.movieotic.NetworkUtils;


import com.codies.movieotic.Models.Movies.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SearchMovies {
    @GET("search/movie")
    Call<Example> getMoviesBasedOnQuery(@Query("api_key") String api_key, @Query("query") String q);
}
