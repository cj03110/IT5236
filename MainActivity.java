package com.example.codjenk.myapplication;

//package com.example.vipul.fragmentdemo2;

        import android.app.Fragment;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

/**
 * Created by Vipul on 11/21/2015.
 */
public class MyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_layout,
                container, false);

    }
}



