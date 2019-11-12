package com.maharjan.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.maharjan.tablayout.LoginFragment;
import com.maharjan.tablayout.R;
import com.maharjan.tablayout.SignUPFragment;
import com.maharjan.tablayout.adapter.ViewPageAdapteR;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewpage);
        tabLayout=findViewById(R.id.tablayout);
        ViewPageAdapteR viewPageAdapteR = new ViewPageAdapteR(getSupportFragmentManager());
        viewPageAdapteR.addFragment(new LoginFragment(),"LogIn");
        viewPageAdapteR.addFragment(new SignUPFragment(),"SignUp");
        viewPager.setAdapter(viewPageAdapteR);
        tabLayout.setupWithViewPager(viewPager);
    }
}
