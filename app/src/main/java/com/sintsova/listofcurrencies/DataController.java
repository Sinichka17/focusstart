package com.sintsova.listofcurrencies;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.sql.DatabaseMetaData;

public class DataController {
    private  static DataController instance;

    public static DataController getInstance() {
        if (DataController.instance == null) {
            DataController.instance = new DataController();
        }
        return DataController.instance;
    }
    private MutableLiveData<String> liveData = new MutableLiveData<>();

    private DataController() {
    }

    public LiveData<String> getData() {
        return liveData;
    }
}
