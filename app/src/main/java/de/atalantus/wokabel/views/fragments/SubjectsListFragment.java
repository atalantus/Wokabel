package de.atalantus.wokabel.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import de.atalantus.wokabel.R;
import de.atalantus.wokabel.viewModels.SubjectsListViewModel;

public class SubjectsListFragment extends Fragment {

    private SubjectsListViewModel subjectsListViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        subjectsListViewModel =
                ViewModelProviders.of(this).get(SubjectsListViewModel.class);
        View root = inflater.inflate(R.layout.fragment_subjects_list, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        subjectsListViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}