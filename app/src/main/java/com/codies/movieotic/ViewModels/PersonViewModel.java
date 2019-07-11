package com.codies.movieotic.ViewModels;

import android.app.Application;

import com.codies.movieotic.Models.PersonModels.ExternalIds;
import com.codies.movieotic.Models.PersonModels.People.Example;
import com.codies.movieotic.Models.PersonModels.People.Person;
import com.codies.movieotic.Repository.PersonRepo;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class PersonViewModel extends AndroidViewModel {

    PersonRepo personRepo;

    LiveData<Person> personLiveData;
    LiveData<Example> personImages;
    LiveData<com.codies.movieotic.Models.PersonModels.CreditMovies.Example> personMovies;
    LiveData<com.codies.movieotic.Models.PersonModels.CreditTv.Example> personTv;
    LiveData<ExternalIds> externalIdsLiveData;

    public PersonViewModel(@NonNull Application application) {
        super(application);
        personRepo = new PersonRepo();
    }

    public LiveData<ExternalIds> getExternalIdsLiveData(String personId) {
        externalIdsLiveData = personRepo.getExternalIds(personId);
        return externalIdsLiveData;
    }

    public LiveData<com.codies.movieotic.Models.PersonModels.CreditTv.Example> getPersonTv(String personId) {
        personTv = personRepo.getTvCredits(personId);
        return personTv;
    }

    public LiveData<com.codies.movieotic.Models.PersonModels.CreditMovies.Example> getPersonMovies(String personId) {
        personMovies = personRepo.getMovieCredits(personId);
        return personMovies;
    }

    public LiveData<Person> getPersonLiveData(String personId) {
        personLiveData = personRepo.getPersonDetail(personId);
        return personLiveData;
    }

    public LiveData<Example> getPersonImages(String personId) {
        personImages = personRepo.getPersonImages(personId);
        return personImages;
    }
}
