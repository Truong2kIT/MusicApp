package com.truongpv.myappmusic.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import androidx.appcompat.app.AppCompatActivity;

import com.truongpv.myappmusic.Adapter.MainViewPagerAdapter;
import com.truongpv.myappmusic.Fagment.Fragment_Tim_Kiem;
import com.truongpv.myappmusic.Fagment.Fragment_Trang_Chu;
import com.truongpv.myappmusic.R;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        init();
    }
    private void init(){
        MainViewPagerAdapter mainViewPagerAdapter;
        mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        mainViewPagerAdapter.addFragment(new Fragment_Trang_Chu(),"Trang chu");
        mainViewPagerAdapter.addFragment(new Fragment_Tim_Kiem(),"Tim Kiem");
        viewPager.setAdapter(mainViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.icontrangchu);
        tabLayout.getTabAt(1).setIcon(R.drawable.icontimkiem);
    }
    private void anhxa() {
        tabLayout=findViewById(R.id.MyTabLayout);
        viewPager = findViewById(R.id.myViewPager);
    }
}