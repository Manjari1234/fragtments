package com.e.fragtments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import adapter.ViewPagerAdapter;
import fragment.FirstFragment;
import fragment.SecondFragment;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabLayout = findViewById(R.id.tabID);
        viewPager = findViewById(R.id.vpID);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new FirstFragment(), "sum");
        adapter.addFragment(new SecondFragment(),"area of circle");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }

}
