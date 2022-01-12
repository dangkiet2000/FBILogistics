package com.example.demoapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import com.example.demoapp.model.AirImport;
import com.example.demoapp.repository.AirImportRepository;
import com.example.demoapp.utilities.Constants;

import java.util.List;

import retrofit2.Call;

public class AirImportViewModel extends AndroidViewModel {

    private LiveData<List<AirImport>> mAirList;
    private AirImportRepository mAirImportRepository;

    public AirImportViewModel(@NonNull Application application) {
        super(application);
        unit();
    }

    private void unit() {
        mAirImportRepository = new AirImportRepository(Constants.URL_API);
    }

    public Call<AirImport> insertAir(String pol, String pod, String dim, String grossweight, String typeofcargo, String airfreight,
                                     String surcharge, String airlines, String schedule, String transittime, String valid, String note
            , String month , String continent) {
        return  mAirImportRepository.insertAir(pol, pod, dim, grossweight,typeofcargo, airfreight, surcharge, airlines,
                schedule, transittime, valid, note, month, continent);
    }

    public Call<AirImport> updateAir(String stt, String pol, String pod, String dim, String grossweight, String typeofcargo, String airfreight,
                                     String surcharge, String airlines, String schedule, String transittime, String valid, String note
            , String month , String continent) {
        return mAirImportRepository.updateAir(stt, pol, pod, dim, grossweight, typeofcargo, airfreight, surcharge, airlines,
                schedule, transittime, valid, note, month, continent);
    }

    public void loadAllAir() {
        mAirList = mAirImportRepository.getAllAir();
    }

    public LiveData<List<AirImport>> getLclList() {
        loadAllAir();
        return mAirList;
    }
}
