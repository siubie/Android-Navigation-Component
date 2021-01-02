package id.putraprima.viewmodelvideo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    //data
    private MutableLiveData<Integer> pushupCount = new MutableLiveData<>();
    private Integer initialPushup = 0;

    //event
    public void onPushupCount(){
        initialPushup = initialPushup + 1;
        pushupCount.setValue(initialPushup);
    }

    //event
    public void startCount(){
        pushupCount.setValue(initialPushup);
    }

    //getter
    public LiveData<Integer> getPushupCount(){
        return pushupCount;
    }
}
