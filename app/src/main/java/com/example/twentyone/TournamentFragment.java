package com.example.twentyone;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class TournamentFragment extends Fragment {
    static final String PAGE_NUMBER_POSITION = "page_number_position";
    static final String RED_COLOR = "#ff0608";           //каждый
    static final String ORANGE_COLOR = "#ff591c";        //охотник
    static final String YELLOW_COLOR = "#ffff1e";        //желает
    static final String GREEN_COLOR = "#33ff4f";         //знать
    static final String LIGHT_BLUE_COLOR = "#19e9ff";    //где
    static final String BLUE_COLOR = "#004cff";          //сидит
    static final String PURPLE_COLOR = "#df10ff";        //фазан


    int pageNumber;

    static TournamentFragment newInstance(int page) {
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_tournament, null);
        TextView myTxt = (TextView) myView.findViewById(R.id.myTxt);
        ImageView myImag = (ImageView) myView.findViewById(R.id.imageViewTour);
        TextView myTour = (TextView) myView.findViewById(R.id.textTour);
        ImageView secImag = myView.findViewById(R.id.imageViewTour2);
        TextView tourDescr = myView.findViewById(R.id.textViewTourDescription);
        TextView tourDate = myView.findViewById(R.id.textViewTourDate);
        TextView tourPeopleCount = myView.findViewById(R.id.textViewTourPeopleCount);
        myTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), Integer.toString(pageNumber + 1), Toast.LENGTH_SHORT).show();
            }
        });
        Intent intent = new Intent(getContext(),TournamentActivity.class);
        myTxt.setAnimation(AnimationUtils.loadAnimation(getActivity(), android.R.anim.fade_in));


        int peop = 12;
        int Maxpeop = 100;




            if (pageNumber == 0) {
                myTxt.setText("Турнир 1");
                myTxt.setBackgroundColor(Color.parseColor(RED_COLOR));
                myImag.setImageResource(R.drawable.ava_1);
                myTour.setText("Описание первого турнира");
               // secImag.setImageResource(R.drawable.ava_1)
                //tourDescr.setText("Описание турнира тут будет когда нибудь а пока здеь просто много слов, но не так много как в романе Льва Николаевича Толстого 'Война и мир' ");
               // tourDate.setText("21.05.2019");
                //tourPeopleCount.setText(peop+ "/"+Maxpeop);
                myTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getContext(),TournamentActivitySecond.class);
                        startActivity(intent);
                    }

                });

            }

            if (pageNumber == 1) {
                myTxt.setText("Турнир 2");
                myTxt.setBackgroundColor(Color.parseColor(ORANGE_COLOR));
                myImag.setImageResource(R.drawable.ava_2);
                myTour.setText("Описание второго турнира");
                int resID=getResources().getIdentifier("ava_2","drawable",getContext().getPackageName());
              //  secImag.setImageResource(R.drawable.ava_2);
              //  tourDescr.setText("Описание турнира тут будет когда нибудь а пока здеь просто много слов, но не так много как в серии романов Анжея Сапковского 'Возьмак'  ");
               // tourDate.setText("21.05.2029");
              //  tourPeopleCount.setText(peop+ "/"+Maxpeop);
                myTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getContext(),TournamentActivitySecond.class);
                        startActivity(intent);
                    }

                });



            }

            if (pageNumber == 2) {
                myTxt.setText("Турнир 3");

                myTxt.setBackgroundColor(Color.parseColor(GREEN_COLOR));
                myImag.setImageResource(R.drawable.ava_3);
                myTour.setText("Описание третьего турнира");
              //  secImag.setImageResource(R.drawable.ava_3);
               // tourDescr.setText("Описание турнира тут будет когда нибудь а пока здеь просто много слов, но не так много как в романе Гоголя 'Мёртвые души' ");
               // tourDate.setText("11.04.2039");
               // tourPeopleCount.setText(peop+ "/"+Maxpeop);
                myTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getContext(),TournamentActivitySecond.class);
                        startActivity(intent);
                    }

                });


            }

            if (pageNumber == 3) {
                myTxt.setText("Турнир 4");
                myTxt.setBackgroundColor(Color.parseColor(BLUE_COLOR));
                myImag.setImageResource(R.drawable.golden_cup);
                myTour.setText("Описание Сереги");
              //  secImag.setImageResource(R.drawable.golden_cup);
              //  tourDescr.setText("Описание турнира тут будет когда нибудь а пока здеь просто много слов, но не так много как в этот момент зашёл Насуртдинов Рамиль Радикович и всё пошло не туда ");
              //  tourDate.setText("25 мая");
              //  tourPeopleCount.setText(peop+ "/"+Maxpeop);
                myTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getContext(),TournamentActivitySecond.class);
                        startActivity(intent);
                    }

                });
            }

            if (pageNumber == 4) {
                myTxt.setText("Турнир 5");
                myTxt.setBackgroundColor(Color.parseColor(PURPLE_COLOR));
                myImag.setImageResource(R.drawable.player);
                myTour.setText("Описание Никиты");
           //     secImag.setImageResource(R.drawable.player);
            //    tourDescr.setText("Описание турнира тут будет когда нибудь а пока здеь просто много слов, но не так много как тут уже читать никото не будет ");
            //    tourDate.setText("21.05.2019");
             //   tourPeopleCount.setText(peop+ "/"+Maxpeop);
                myTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getContext(),TournamentActivitySecond.class);
                        startActivity(intent);
                    }

                });
            }

            if (pageNumber == 5) {
                myTxt.setText("Турнир 6");
                myTxt.setBackgroundColor(Color.parseColor(YELLOW_COLOR));
                myImag.setImageResource(R.drawable.coin);
                myTour.setText("Описание Александра");
              //  secImag.setImageResource(R.drawable.coin);
              //  tourDescr.setText("Описание турнира тут будет когда нибудь а пока здеь просто пустота ");
              //  tourDate.setText("дата начала турнира");
              //  tourPeopleCount.setText(peop+ "/"+Maxpeop);
                myTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getContext(),TournamentActivitySecond.class);
                        startActivity(intent);
                    }

                });

            }

            if (pageNumber == 6) {
                myTxt.setText("Турнир 7");
                myTxt.setBackgroundColor(Color.parseColor(LIGHT_BLUE_COLOR));
                myImag.setImageResource(R.drawable.icon);
                myTour.setText("Описание седьмого турнира");
              //  secImag.setImageResource(R.drawable.icon);
               // tourDescr.setText("Описание турнира тут будет когда нибудь а пока здеь просто много слов, но не так много как в романе Льва Николаевича Толстого 'Война и мир' ");
               // tourDate.setText("21.05.2019");
              //  tourPeopleCount.setText(peop+ "/"+Maxpeop);
                myTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getContext(),TournamentActivitySecond.class);
                        startActivity(intent);
                    }

                });
            }


            return myView;
        }

        public void onClick () {
            Toast.makeText(getContext(), Integer.toString(pageNumber), Toast.LENGTH_SHORT).show();
        }

}