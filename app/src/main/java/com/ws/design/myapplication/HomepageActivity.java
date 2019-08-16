package com.ws.design.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.ws.design.fragment.CardFragment;
import com.ws.design.fragment.HomeFragment;

public class HomepageActivity extends AppCompatActivity implements View.OnClickListener {

    FrameLayout frameLayout;
    ImageView home, user, notification, card;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        frameLayout = findViewById(R.id.framlayout);
        home = findViewById(R.id.home);
        user = findViewById(R.id.user);
        notification = findViewById(R.id.notification);
        card = findViewById(R.id.card);

        home.setOnClickListener(this);
        user.setOnClickListener(this);
        notification.setOnClickListener(this);
        card.setOnClickListener(this);


        Fragment fragment;

        fragment = new HomeFragment();
        loadFragment(fragment);

        home.setImageResource(R.drawable.ic_home_red);
        user.setImageResource(R.drawable.ic_profile);
        notification.setImageResource(R.drawable.ic_notification);
        card.setImageResource(R.drawable.ic_credit_cards_payment);

    }

    @Override
    public void onClick(View v) {

        Fragment fragment;

        switch (v.getId()) {

            case R.id.home:

                home.setImageResource(R.drawable.ic_home_red);
                user.setImageResource(R.drawable.ic_profile);
                notification.setImageResource(R.drawable.ic_notification);
                card.setImageResource(R.drawable.ic_credit_cards_payment);

                fragment = new HomeFragment();
                loadFragment(fragment);

                break;

            case R.id.user:


                home.setImageResource(R.drawable.ic_home);
                user.setImageResource(R.drawable.ic_profile_red);
                notification.setImageResource(R.drawable.ic_notification);
                card.setImageResource(R.drawable.ic_credit_cards_payment);

                break;

            case R.id.notification:


                home.setImageResource(R.drawable.ic_home);
                user.setImageResource(R.drawable.ic_profile);
                notification.setImageResource(R.drawable.ic_notification_red);
                card.setImageResource(R.drawable.ic_credit_cards_payment);

                break;


            case R.id.card:


                home.setImageResource(R.drawable.ic_home);
                user.setImageResource(R.drawable.ic_profile);
                notification.setImageResource(R.drawable.ic_notification);
                card.setImageResource(R.drawable.ic_credit_cards_payment_red);


                fragment = new CardFragment();
                loadFragment(fragment);

                break;
        }
    }


    /*load fragment method can be here*/

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.framlayout, fragment);
        transaction.commit();
    }
}
