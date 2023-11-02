package com.big0soft.codeskiils_new;


import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class code_viewModel extends ViewModel {
    public  MutableLiveData<List<Course>> mutableLiveData = new MutableLiveData<>();
    private final reposoditory reposoditory2;
    private static final String TAG = "code_viewModel";
    public code_viewModel() {
      reposoditory2 = new reposoditory();
    }
    public void getCourses(){
         reposoditory2.getCourses()
                 .subscribeOn(Schedulers.io())
                 .subscribe(new SingleObserver<List<Course>>() {
                     @Override
                     public void onSubscribe(Disposable d) {

                     }

                     @Override
                     public void onSuccess(List<Course> courses) {
mutableLiveData.postValue(courses);
                     }

                     @Override
                     public void onError(Throwable e) {
                         Log.e(TAG, "onError: ",e );
                     }
                 });
    }
    public MutableLiveData<List<Course>> getMutableLiveData() {
        return mutableLiveData;
    }
}
