package com.truongpv.musicapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.truongpv.musicapp.Adapter.MainViewPagerAdapter;
import com.truongpv.musicapp.Fragment.Fragment_tim_kiem;
import com.truongpv.musicapp.Fragment.Fragment_trang_chu;
import com.truongpv.musicapp.R;

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
        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        mainViewPagerAdapter.addFragment(new Fragment_trang_chu(),"trang chu");
        mainViewPagerAdapter.addFragment(new Fragment_tim_kiem(),"tim kiem");
        viewPager.setAdapter(mainViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.icontrangchu);
        tabLayout.getTabAt(1).setIcon(R.drawable.iconsearch);
}
    private void anhxa() {
        tabLayout=findViewById(R.id.myTabLayout);
        viewPager=findViewById(R.id.myViewPager);
    }
}