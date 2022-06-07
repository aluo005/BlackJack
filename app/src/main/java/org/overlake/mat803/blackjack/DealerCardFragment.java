package org.overlake.mat803.blackjack;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.overlake.mat803.blackjack.databinding.FragmentDealerCardBinding;
import org.overlake.mat803.blackjack.databinding.FragmentPlayerCardBinding;

import java.util.Stack;

public class DealerCardFragment extends Fragment {

    private static final String CURRENT_CARD_ARRANGEMENT = "current_card_arrangement";

    private FragmentDealerCardBinding mBinding;
    private Stack<Card> cardImages;
    private Card mysteryCardValue;
    private int sum;
    private ImageView imageView;

    public DealerCardFragment() {
        // Required empty public constructor
    }

    public static DealerCardFragment newInstance(Stack<Card> images) {
        DealerCardFragment fragment = new DealerCardFragment();
        Bundle args = new Bundle();
        args.putSerializable(CURRENT_CARD_ARRANGEMENT, images);
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
        mBinding = FragmentDealerCardBinding.inflate(getLayoutInflater());
        sum = 0;
        if(getArguments() != null) {
            cardImages = (Stack<Card>) getArguments().getSerializable(CURRENT_CARD_ARRANGEMENT);
        }
        addMysteryCard();
        addCard();
        return mBinding.getRoot();
    }

    public void dealerTurn(){

    }

    public void addCard() {
        imageView = new ImageView(getActivity());
        imageView.setImageResource(cardImages.peek().cardName);
        cardImages.pop();
        addView(imageView, 200, 200);
    }

    public void addMysteryCard() {
        imageView = new ImageView(getActivity());
        imageView.setImageResource(R.drawable.card_face_down3);
        mysteryCardValue = cardImages.peek();
        cardImages.pop();
        addView(imageView, 200, 200);
    }

    public void addView(ImageView imageView, int width, int height){
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
        layoutParams.setMargins(5,100,5,10);

        imageView.setLayoutParams(layoutParams);
        mBinding.layout.addView(imageView);
    }

    public void resetDeck(){
        mBinding.layout.removeAllViews();
        addMysteryCard();
        addCard();
    }
}