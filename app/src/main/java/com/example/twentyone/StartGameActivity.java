package com.example.twentyone;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StartGameActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{
    TextView textViewType1;
    TextView textViewType2;
    TextView textViewType3;
    TextView textViewPlayers2;
    TextView textViewPlayers3;
    TextView textViewPlayers4;
    TextView textViewPlayers5;
    TextView bet;
    TextView players;
    SeekBar sb;
    SeekBar sb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
        textViewType1 = (TextView) findViewById(R.id.textViewType1);
        textViewType2 = (TextView) findViewById(R.id.textViewType2);
        textViewType3 = (TextView) findViewById(R.id.textViewType3);
        bet = (TextView) findViewById(R.id.bet);
        sb = (SeekBar) findViewById(R.id.sb);
        players = (TextView) findViewById(R.id.players);
        sb2 = (SeekBar) findViewById(R.id.sb2);
        sb.setOnSeekBarChangeListener(this);
        sb2.setOnSeekBarChangeListener(this);
    }
    public void onClickType(View v) {
        textViewType1.setBackgroundResource(R.drawable.type);
        textViewType2.setBackgroundResource(R.drawable.type);
        textViewType3.setBackgroundResource(R.drawable.type);
        v.setBackgroundResource(R.drawable.type2);
    }

    @Override
    public void onProgressChanged(SeekBar sb, int i, boolean b) {
        switch (sb.getId())
        {
            case R.id.sb:
                bet.setText(String.valueOf(sb.getProgress())+"/3000");
                break;
            case R.id.sb2:
                players.setText(String.valueOf(sb.getProgress())+"/5");
                break;
        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar sb) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar sb) {

    }

    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(StartGameActivity.this);
        builder.setTitle("info")
                .setMessage("Тип1\n  Крч, братан, этот тип игры предполагает, что я в своём познании преисполнился." +
                            "\nТип2\n  А этот тип заключается в том, что я как будто бы уже 100 триллионов миллиардов лет проживаю на триллионах и триллионах таких же планет." +
                            "\nТип3\n  Ну а этот тип состоит в том, что мне уже этот мир абсолютно понятен, и я здесь ищу только одного: покоя, умиротворения и вот этой гармонии от слияния с бесконечно вечным.")
                .setCancelable(false)
                .setNegativeButton("ОК, спасибо за преисполнение",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}

