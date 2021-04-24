package com.namespacermcw.fragglesrock;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeFragment(View view){
        Fragment frag;

        if(view == findViewById(R.id.btnSteve)){
            frag = new FragmentSteven();
            FragmentManager fragM = getFragmentManager();
            FragmentTransaction fragT = fragM.beginTransaction();
            fragT.replace(R.id.frag_holder, frag);
            fragT.commit();
        }

        if(view == findViewById(R.id.btnBill)){
            frag = new FragmentWilliam();
            FragmentManager fragM = getFragmentManager();
            FragmentTransaction fragT = fragM.beginTransaction();
            fragT.replace(R.id.frag_holder, frag);
            fragT.commit();
        }
    }
}