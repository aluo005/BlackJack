package org.overlake.mat803.blackjack;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.overlake.mat803.blackjack.databinding.FragmentPlayerCardBinding;

public class PlayerCardFragment extends Fragment {

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private FragmentPlayerCardBinding mBinding;
    private int[] mImages;


    public PlayerCardFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
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
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentPlayerCardBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    public void addCard() {
        ImageView imageView = new ImageView(getActivity());
        cardRandom(imageView);
        addView(imageView, 150, 150);
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