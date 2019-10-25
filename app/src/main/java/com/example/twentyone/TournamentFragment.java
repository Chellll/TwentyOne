package com.example.twentyone;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class TournamentFragment extends Fragment
{
    static final String PAGE_NUMBER_POSITION = "page_number_position";
    static final String RED_COLOR = "#ff0608";           //каждый
    static final String ORANGE_COLOR = "#ff591c";        //охотник
    static final String YELLOW_COLOR = "#ffff1e";        //желает
    static final String GREEN_COLOR = "#33ff4f";         //знать
    static final String LIGHT_BLUE_COLOR = "#19e9ff";    //где
    static final String BLUE_COLOR = "#004cff";          //сидит
    static final String PURPLE_COLOR = "#df10ff";        //фазан

    int pageNumber;

    static TournamentFragment newInstance (int page) {
        TournamentFragment tournamentFragment = new TournamentFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(PAGE_NUMBER_POSITION, page);
        tournamentFragment.setArguments(arguments);
        return tournamentFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt(PAGE_NUMBER_POSITION);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View myView = inflater.inflate(R.layout.fragment_tournament, null);
        TextView myTxt = (TextView) myView.findViewById(R.id.myTxt);
        myTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), Integer.toString(pageNumber+1), Toast.LENGTH_SHORT).show();
            }
        });
        myTxt.setAnimation(AnimationUtils.loadAnimation(getActivity(), android.R.anim.fade_in));
        if(pageNumber==0) {myTxt.setText("Турнир 1");myTxt.setBackgroundColor(Color.parseColor(RED_COLOR));}
        if(pageNumber==1) {myTxt.setText("Турнир 2");myTxt.setBackgroundColor(Color.parseColor(ORANGE_COLOR));}
        if(pageNumber==2) {myTxt.setText("Турнир 3");myTxt.setBackgroundColor(Color.parseColor(GREEN_COLOR));}
        if(pageNumber==3) {myTxt.setText("Турнир 4");myTxt.setBackgroundColor(Color.parseColor(BLUE_COLOR));}
        if(pageNumber==4) {myTxt.setText("Турнир 5");myTxt.setBackgroundColor(Color.parseColor(PURPLE_COLOR));}
        return myView;
    }

    public void onClick(){
        Toast.makeText(getContext(), Integer.toString(pageNumber), Toast.LENGTH_SHORT).show();
    }
}