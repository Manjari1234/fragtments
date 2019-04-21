package com.e.fragtments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragment.FirstFragment;
import fragment.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnOne;

    private Boolean status = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.btnOne);
        btnOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (status) {
            FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.add(R.id.rvOne, firstFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnOne.setText("Load Second Fragment");
            status = false;
        }

        else {

            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.add(R.id.rvOne, secondFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnOne.setText("Load First Fragment");
            status = true;
        }
        {
        }
    }
}
