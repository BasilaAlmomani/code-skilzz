package com.big0soft.codeskiils_new;


import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.big0soft.codeskiils_new.databinding.ActivityMainBinding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private codeAdapter adapter;
    private static final String TAG = "MainActivity";

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.items);



        adapter=new codeAdapter(new ArrayList<>());


        ActivityMainBinding binding;
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.recyclerview.setAdapter(adapter);
        binding.recyclerview.setLayoutManager(new LinearLayoutManager(this));

        code_viewModel code_viewModel=new ViewModelProvider(this)
           .get(code_viewModel.class);

        code_viewModel.getCourses();
        code_viewModel.mutableLiveData.observe(this, code_models -> {
            Log.i(TAG, "onChanged: "+code_models);
            adapter.addItems(code_models);

        });



    }
}
