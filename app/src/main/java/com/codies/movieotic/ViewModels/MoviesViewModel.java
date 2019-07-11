package com.codies.movieotic.ViewModels;

import android.app.Application;

import com.codies.movieotic.DataSources.InCinemaMoviesDataSourceFactory;
import com.codies.movieotic.DataSources.PopularMoviesDataSourceFactory;
import com.codies.movieotic.DataSources.TopRatedMoviesDataSourceFactory;
import com.codies.movieotic.DataSources.UpCommingmoviesDataSourceFactory;
import com.codies.movieotic.Models.Movies.Result;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PagedList;

public class MoviesViewModel extends AndroidViewModel {
    public static final String TAG = "MOVIESVIEWMODEL";

    LiveData<PagedList<Result>> popularMoviesPagedList;
    LiveData<PageKeyedDataSource<Integer, Result>> popularMoviesPagedDataSource;
    PopularMoviesDataSourceFactory popularMoviesDataSourceFactory;

    LiveData<PagedList<Result>> topRatedMoviesPagedList;
    LiveData<PageKeyedDataSource<Integer, Result>> topRatedMoviesPagedDataSource;
    TopRatedMoviesDataSourceFactory topRatedMoviesDataSourceFactory;

    LiveData<PagedList<Result>> upCommingMoviesPagedList;
    LiveData<PageKeyedDataSource<Integer, Result>> upCommingMoviesPagedDataSource;
    UpCommingmoviesDataSourceFactory upCommingMoviesPagedDataSourceFactory;

    LiveData<PagedList<Result>> inCinemaMoviesPagedList;
    LiveData<PageKeyedDataSource<Integer, Result>> inCinemaMoviesPagedDataSource;
    InCinemaMoviesDataSourceFactory inCinemaMoviesDataSourceFactory;

    LiveData<PagedList<Result>> topRatedTvPagedList;
    LiveData<PageKeyedDataSource<Integer, Result>> topRatedTvPagedDataSource;

    LiveData<PagedList<Result>> popularTvPagedList;
    LiveData<PageKeyedDataSource<Integer, Result>> popularTvPagedDataSource;


    public MoviesViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<PagedList<Result>> getPopularMoviesPagedList() {
        popularMoviesDataSourceFactory = new PopularMoviesDataSourceFactory();
        popularMoviesPagedDataSource = popularMoviesDataSourceFactory.getMutableLiveData();
        PagedList.Config config = (new PagedList.Config.Builder())
                .setEnablePlaceholders(false)
                .setPageSize(20)
                .build();

        popularMoviesPagedList = (new LivePagedListBuilder(popularMoviesDataSourceFactory, config)).build();
        return popularMoviesPagedList;
    }

    public LiveData<PagedList<Result>> getTopRatedMoviesPagedList() {
        topRatedMoviesDataSourceFactory = new TopRatedMoviesDataSourceFactory();
        topRatedMoviesPagedDataSource = topRatedMoviesDataSourceFactory.getMutableLiveData();
        PagedList.Config config = (new PagedList.Config.Builder())
                .setEnablePlaceholders(false)
                .setPageSize(20)
                .build();

        topRatedMoviesPagedList = (new LivePagedListBuilder(topRatedMoviesDataSourceFactory, config)).build();
        return topRatedMoviesPagedList;
    }

    public LiveData<PagedList<Result>> getInCinemaMoviesPagedList() {
        inCinemaMoviesDataSourceFactory = new InCinemaMoviesDataSourceFactory();
        inCinemaMoviesPagedDataSource = inCinemaMoviesDataSourceFactory.getMutableLiveData();
        PagedList.Config config = (new PagedList.Config.Builder())
                .setEnablePlaceholders(false)
                .setPageSize(20)
                .build();

        inCinemaMoviesPagedList = (new LivePagedListBuilder(inCinemaMoviesDataSourceFactory, config)).build();
        return inCinemaMoviesPagedList;
    }

    public LiveData<PagedList<Result>> getUpCommingMoviesPagedList() {
        upCommingMoviesPagedDataSourceFactory = new UpCommingmoviesDataSourceFactory();
        upCommingMoviesPagedDataSource = upCommingMoviesPagedDataSourceFactory.getMutableLiveData();
        PagedList.Config config = (new PagedList.Config.Builder())
                .setEnablePlaceholders(false)
                .setPageSize(20)
                .build();

        upCommingMoviesPagedList = (new LivePagedListBuilder(upCommingMoviesPagedDataSourceFactory, config)).build();
        return upCommingMoviesPagedList;
    }

}
