package com.codies.movieotic.NetworkUtils;

import com.codies.movieotic.Models.PersonModels.People.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PersonImages {
    @GET("person/{person_id}/images")
    Call<Example> getPersonImages(@Path(value = "person_id") String person_id, @Query("api_key") String api_key);
}
