package org.overlake.mat803.blackjack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.media.Image;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.overlake.mat803.blackjack.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    Stack<Card> cardImages;
    private int currIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        currIndex = 0;
        cardImages = new Stack<Card>();
        resetStack();
        setContentView(mBinding.getRoot());

        Collections.shuffle(cardImages);

        FragmentManager fm = getSupportFragmentManager();
        PlayerCardFragment playerFragment = PlayerCardFragment.newInstance(cardImages.get(currIndex).cardName, cardImages.get(currIndex).cardValue);
        fm.beginTransaction()
                .add(R.id.fragmentContainerView, playerFragment)
                .commit();

        mBinding.hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerFragment.addCard();
            }
        });

        mBinding.reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetStack();
                Collections.shuffle(cardImages);
            }
        });
    }

    public void resetStack(){
        cardImages.clear();
        cardImages.push(new Card(R.drawable.jack_of_clubs2, 10));
        cardImages.push(new Card(R.drawable.jack_of_diamonds2, 10));
        cardImages.push(new Card(R.drawable.jack_of_hearts2, 10));
        cardImages.push(new Card(R.drawable.jack_of_spades2, 10));
        cardImages.push(new Card(R.drawable.king_of_clubs2, 10));
        cardImages.push(new Card(R.drawable.king_of_diamonds2, 10));
        cardImages.push(new Card(R.drawable.king_of_hearts2, 10));
        cardImages.push(new Card(R.drawable.king_of_spades2, 10));
        cardImages.push(new Card(R.drawable.nine_of_clubs, 9));
        cardImages.push(new Card(R.drawable.nine_of_diamonds, 9));
        cardImages.push(new Card(R.drawable.nine_of_hearts, 9));
        cardImages.push(new Card(R.drawable.nine_of_spades, 9));
        cardImages.push(new Card(R.drawable.queen_of_clubs2, 10));
        cardImages.push(new Card(R.drawable.queen_of_diamonds2, 10));
        cardImages.push(new Card(R.drawable.queen_of_hearts2, 10));
        cardImages.push(new Card(R.drawable.queen_of_spades2, 10));
        cardImages.push(new Card(R.drawable.seven_of_clubs, 7));
        cardImages.push(new Card(R.drawable.seven_of_diamonds, 7));
        cardImages.push(new Card(R.drawable.seven_of_hearts, 7));
        cardImages.push(new Card(R.drawable.seven_of_spades, 7));
        cardImages.push(new Card(R.drawable.six_of_clubs, 6));
        cardImages.push(new Card(R.drawable.six_of_diamonds, 6));
        cardImages.push(new Card(R.drawable.six_of_hearts, 6));
        cardImages.push(new Card(R.drawable.six_of_spades, 6));
        cardImages.push(new Card(R.drawable.ten_of_clubs, 10));
        cardImages.push(new Card(R.drawable.ten_of_diamonds, 10));
        cardImages.push(new Card(R.drawable.ten_of_hearts, 10));
        cardImages.push(new Card(R.drawable.ten_of_spades, 10));
        cardImages.push(new Card(R.drawable.three_of_clubs, 3));
        cardImages.push(new Card(R.drawable.three_of_diamonds, 3));
        cardImages.push(new Card(R.drawable.three_of_hearts, 3));
        cardImages.push(new Card(R.drawable.three_of_spades, 3));
        cardImages.push(new Card(R.drawable.two_of_clubs, 2));
        cardImages.push(new Card(R.drawable.two_of_diamonds, 2));
        cardImages.push(new Card(R.drawable.two_of_hearts, 2));
        cardImages.push(new Card(R.drawable.two_of_spades, 2));
        cardImages.push(new Card(R.drawable.ace_of_clubs, 1));
        cardImages.push(new Card(R.drawable.ace_of_diamonds, 1));
        cardImages.push(new Card(R.drawable.ace_of_hearts, 1));
        cardImages.push(new Card(R.drawable.ace_of_spades2, 1));
        cardImages.push(new Card(R.drawable.eight_of_clubs, 8));
        cardImages.push(new Card(R.drawable.eight_of_diamonds, 8));
        cardImages.push(new Card(R.drawable.eight_of_hearts, 8));
        cardImages.push(new Card(R.drawable.eight_of_spades, 8));
        cardImages.push(new Card(R.drawable.five_of_clubs, 5));
        cardImages.push(new Card(R.drawable.five_of_diamonds, 5));
        cardImages.push(new Card(R.drawable.five_of_hearts, 5));
        cardImages.push(new Card(R.drawable.five_of_spades, 5));
        cardImages.push(new Card(R.drawable.four_of_clubs, 4));
        cardImages.push(new Card(R.drawable.four_of_diamonds, 4));
        cardImages.push(new Card(R.drawable.four_of_hearts, 4));
        cardImages.push(new Card(R.drawable.four_of_spades, 4));
    }

}