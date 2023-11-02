package com.big0soft.codeskiils_new;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofit {

        private static retrofit instance;
        private Retrofit retrofit;
        private retrofit(){
            retrofit = new Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("http://ahmad-dev.com:8080/codesklizz_api-0.0.1-SNAPSHOT/api/v1/")
                    .build();
        }
        public static retrofit getInstance() {
            if (instance == null) {
                synchronized (retrofit.class){
                    instance = new retrofit();
                }


            }
            return instance;
        }
        public ApiInterface service(){
            return retrofit.create(ApiInterface.class);
        }
    }


