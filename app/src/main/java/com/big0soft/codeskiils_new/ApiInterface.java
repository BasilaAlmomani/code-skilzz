package com.big0soft.codeskiils_new;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface ApiInterface {
        @GET("courses/all")
        Single<List<Course>> getAllCourse();

}
