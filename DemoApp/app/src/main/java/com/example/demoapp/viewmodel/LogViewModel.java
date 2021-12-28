package com.example.demoapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.demoapp.model.Log;
import com.example.demoapp.repository.LogRepository;
import com.example.demoapp.utilities.Constants;


import java.util.List;

import retrofit2.Call;

public class LogViewModel extends AndroidViewModel {
    private LiveData<List<Log>> mlistLog;
    private LogRepository mLogRepo;
    public LogViewModel(@NonNull Application application) {
        super(application);

        init();

    }

    private void init() {
        mLogRepo = new LogRepository(Constants.URL_API);

    }
    public void loaddatalog(){
        mlistLog = mLogRepo.getAllLog();
    }
    public LiveData<List<Log>> getLogList(){
        loaddatalog();
        return  mlistLog;
    }

    public Call<Log> insertLog(String tenhang, String hscode, String congdung, String hinhanh,
                               String cangdi, String cangden, String loaihang, String soluongcuthe,
                               String yeucaudacbiet, String valid ,String month, String importOrExport){
        return mLogRepo.insertLog(tenhang, hscode, congdung, hinhanh, cangdi, cangden, loaihang,
                soluongcuthe, yeucaudacbiet, valid,month, importOrExport);
    }
}
