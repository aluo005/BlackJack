package org.overlake.mat803.blackjack;

import android.os.Bundle;

import androidx.core.util.Pair;
import androidx.fragment.app.Fragment;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.overlake.mat803.blackjack.databinding.FragmentPlayerCardBinding;

import java.util.Stack;

public class PlayerCardFragment extends Fragment {

    public static final String CURRENT_CARD = "current_card";
    public static final String CURRENT_CARD_VALUE = "current_card_value";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private FragmentPlayerCardBinding mBinding;
    private Stack<Card> cardImages;
    private ImageView imageView;


    public PlayerCardFragment() {
        // Required empty public constructor
    }

    public static PlayerCardFragment newInstance(Stack<Card> images) {
        PlayerCardFragment fragment = new PlayerCardFragment();
        Bundle args = new Bundle();
        args.putSerializable(CURRENT_CARD, images);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentPlayerCardBinding.inflate(getLayoutInflater());
        if(getArguments() != null) {
            cardImages = (Stack<Card>) getArguments().getSerializable(CURRENT_CARD);
        }
        addCard();
        addCard();
        return mBinding.getRoot();
    }

    public void addCard() {
        imageView = new ImageView(getActivity());
        imageView.setImageResource(cardImages.peek().cardName);
        cardImages.pop();
        addView(imageView, 200, 200);
    }

    public void addView(ImageView imageView, int width, int height){
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
        layoutParams.setMargins(5,100,5,10);

        imageView.setLayoutParams(layoutParams);
        mBinding.layout.addView(imageView);
    }

    public void removeView(){
        mBinding.layout.removeAllViews();
        addCard();
        addCard();
    }
}