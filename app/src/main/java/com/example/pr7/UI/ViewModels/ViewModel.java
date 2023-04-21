package com.example.pr7.UI.ViewModels;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.pr7.data.Repository;
import com.example.pr7.data.dataSource.Item;

public class ViewModel extends androidx.lifecycle.ViewModel {

    private final MutableLiveData<Repository> itemID =
            new MutableLiveData(new Repository(new Item(null, null)));

    public LiveData<Repository> getItemID() {
        return itemID;
    }

    public void addItem(Integer imageId, String itemText) {
        itemID.setValue(
                new Repository(new Item(imageId, itemText))
        );
    }
}