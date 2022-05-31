package org.overlake.mat803.blackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.overlake.mat803.blackjack.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private int[] mImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        mImages = new int[]{
                R.drawable.jack_of_clubs,
                R.drawable.jack_of_clubs2,
                R.drawable.jack_of_diamonds,
                R.drawable.jack_of_diamonds2,
                R.drawable.jack_of_hearts,
                R.drawable.jack_of_spades,
                R.drawable.jack_of_spades2,
                R.drawable.king_of_clubs,
                R.drawable.king_of_clubs2,
                R.drawable.king_of_diamonds,
                R.drawable.king_of_diamonds2,
                R.drawable.king_of_hearts,
                R.drawable.king_of_spades,
                R.drawable.king_of_spades2,
                R.drawable.nine_of_clubs,
                R.drawable.nine_of_diamonds,
                R.drawable.nine_of_hearts,
                R.drawable.queen_of_clubs,
                R.drawable.queen_of_clubs2,
                R.drawable.queen_of_diamonds,
                R.drawable.queen_of_diamonds2,
                R.drawable.queen_of_hearts,
                R.drawable.queen_of_spades,
                R.drawable.queen_of_spades2,
                R.drawable.seven_of_clubs,
                R.drawable.seven_of_diamonds,
                R.drawable.seven_of_hearts,
                R.drawable.six_of_clubs,
                R.drawable.six_of_diamonds,
                R.drawable.six_of_hearts,
                R.drawable.six_of_spades,
                R.drawable.ten_of_clubs,
                R.drawable.ten_of_diamonds,
                R.drawable.ten_of_hearts,
                R.drawable.ten_of_spades,
                R.drawable.three_of_clubs,
                R.drawable.three_of_diamonds,
                R.drawable.three_of_hearts,
                R.drawable.two_of_clubs,
                R.drawable.two_of_diamonds,
                R.drawable.two_of_hearts,
                R.drawable.two_of_spades,
                R.drawable.ace_of_clubs,
                R.drawable.ace_of_diamonds,
                R.drawable.ace_of_hearts,
                R.drawable.ace_of_spades2,
                R.drawable.eight_of_clubs,
                R.drawable.eight_of_diamonds,
                R.drawable.eight_of_hearts,
                R.drawable.eight_of_spades,
                R.drawable.five_of_clubs,
                R.drawable.five_of_diamonds,
                R.drawable.five_of_hearts,
                R.drawable.four_of_clubs,
                R.drawable.four_of_diamonds,
                R.drawable.four_of_hearts,
                R.drawable.four_of_spades,
        };
        setContentView(mBinding.getRoot());
        mBinding.cardDeck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(MainActivity.this);
                cardRandom(imageView);

                addView(imageView, 150, 150);
            }
        });
    }

    public void cardRandom(ImageView imageView){
        int randomIndex = (int)(Math.random() * mImages.length - 1);
        imageView.setImageResource(mImages[randomIndex]);
    }

    public void addView(ImageView imageView, int width, int height){
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
        layoutParams.setMargins(8,100,8,10);

        imageView.setLayoutParams(layoutParams);
        mBinding.layout.addView(imageView);
    }

}