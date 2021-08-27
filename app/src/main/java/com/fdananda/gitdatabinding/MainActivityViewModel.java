package com.fdananda.gitdatabinding;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    public MutableLiveData<String> mMessage = new MutableLiveData<>();

    public void setmMessage(String text) {
        mMessage.setValue(text);
    }
}
