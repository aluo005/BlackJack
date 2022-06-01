package org.overlake.mat803.blackjack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.overlake.mat803.blackjack.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    PlayerCardFragment playerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        FragmentManager fm = getSupportFragmentManager();

        fm.beginTransaction()
                .commit();
        mBinding.hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerFragment.addCard();
            }
        });
    }


}