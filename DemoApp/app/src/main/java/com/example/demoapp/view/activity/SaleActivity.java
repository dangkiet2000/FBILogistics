package com.example.demoapp.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.demoapp.R;
import com.example.demoapp.view.fragment.AirlineFragment;
import com.example.demoapp.view.fragment.InlandRoadFragment;
import com.example.demoapp.view.fragment.RoadFragment;
import com.example.demoapp.view.fragment.SeaRoadFragment;
import com.google.android.material.navigation.NavigationView;
import com.example.demoapp.view.fragment.HomeSaleFragment;

public class SaleActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private  static  final int FRAGMENT_HOME =0;
    private  static  final int FRAGMENT_DUONGBIEN =1;
    private  static  final int FRAGMENT_DUONGKHONG =2;
    private  static  final int FRAGMENT_DUONGBO =3;
    private  static  final int FRAGMENT_NOIDIA =4;
    private  int mCurrentFragmet = FRAGMENT_HOME;


    DrawerLayout mDrawerLayout;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);

        anhxa();
        Actionbar();
    }
    private void anhxa() {
        toolbar = findViewById(R.id.tb_menu);
        mDrawerLayout =(DrawerLayout) findViewById(R.id.drawer_layout);
    }

    private void Actionbar() {
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar
                , R.string.nav_drawer_open, R.string.nav_drawer_close );
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        // xử lí mặc định vào trang home
        replaceFragment( new HomeSaleFragment());
        navigationView.getMenu().findItem(R.id.nav_home).setCheckable(true);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.nav_home){
            if(mCurrentFragmet != FRAGMENT_HOME){
                replaceFragment(new HomeSaleFragment());
                mCurrentFragmet = FRAGMENT_HOME;
            }
        }else if(id == R.id.nav_duongbien){
            if(mCurrentFragmet != FRAGMENT_DUONGBIEN){
                replaceFragment(new SeaRoadFragment());
                mCurrentFragmet = FRAGMENT_DUONGBIEN;
            }
        }else if(id == R.id.nav_hangkhong) {
            if (mCurrentFragmet != FRAGMENT_DUONGKHONG) {
                replaceFragment(new AirlineFragment());
                mCurrentFragmet = FRAGMENT_DUONGKHONG;
            }
        }else if(id == R.id.nav_duongbo) {
            if (mCurrentFragmet != FRAGMENT_DUONGBO) {
                replaceFragment(new RoadFragment());
                mCurrentFragmet = FRAGMENT_DUONGBO;
            }
        }else if(id == R.id.nav_noidia) {
            if (mCurrentFragmet != FRAGMENT_NOIDIA) {
                replaceFragment(new InlandRoadFragment());
                mCurrentFragmet = FRAGMENT_NOIDIA;
            }
       }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
    // sử lý fragement
    private  void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame,fragment);
        transaction.commit();
    }
}