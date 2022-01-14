package com.example.viewmodel;

import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    public String name;
    public String getName(){
        if (name != null){
            return name;
        }
        return "Unknown";
    }
    public void setName(String name){
        this.name = name;
    }
}
