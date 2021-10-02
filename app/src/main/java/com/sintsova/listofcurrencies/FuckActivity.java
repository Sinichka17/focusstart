package com.sintsova.listofcurrencies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

public class FuckActivity extends AppCompatActivity {

    private MyServer myServer = new MyServer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuck);
        getLifecycle().addObserver(myServer);

        MyViewModel model = new ViewModelProvider(this).get(MyViewModel.class);
        LiveData<String> data = model.getData();
        data.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.wtf("Fuck",s);
            }
        });

        LiveData<String> liveData = DataController.getInstance().getData();
        LiveData<Integer> liveDataInt = Transformations.map(liveData, new Function<String, Integer>() {
            @Override
            public Integer apply(String input) {
                return Integer.parseInt(input);
            }
        });

        liveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.wtf("","");
            }
        });
    }
}