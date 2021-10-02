package com.sintsova.listofcurrencies;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MyViewModel extends AndroidViewModel {

    MutableLiveData<String> data;

    public MyViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<String> getData() {
        if (data == null) {
            data = new MutableLiveData<>();
            loadData();
        }
        return data;
    }

    private void loadData() {
        //dataRepository.loadData(new Callback<String>() {
        //    @Override
         //   public void onLoad(String s) {
         //       data.postValue(s);
         //   }
       // });
    }

    @Override
    protected void onCleared() {
    }
}
