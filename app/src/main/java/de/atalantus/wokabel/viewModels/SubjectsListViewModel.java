package de.atalantus.wokabel.viewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SubjectsListViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SubjectsListViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is subjects list fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}