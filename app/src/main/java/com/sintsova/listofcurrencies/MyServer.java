package com.sintsova.listofcurrencies;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class MyServer implements LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void connect() {
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void disconnect() {
    }
}