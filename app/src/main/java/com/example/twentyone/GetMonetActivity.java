package com.example.twentyone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.twentyone.Task.RVAdapter;
import com.example.twentyone.Task.TaskItem;

import java.util.ArrayList;
import java.util.List;

public class GetMonetActivity extends Activity {

    private List<TaskItem> tasks;
    private RecyclerView rv;

    private TextView tvSearchFriend;
    private Button btnSearchFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_get_monet);

        rv=(RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);



        initializeData();
        initializeAdapter();

    }

    private void initializeData(){
        tasks = new ArrayList<>();
        tasks.add(new TaskItem(
           0,
           R.drawable.logo,
                "Регистрация",
                "100",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                1,
                R.drawable.logo,
                "Сменить Аватарку",
                "1000",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                2,
                R.drawable.logo,
                "Подтвердить почту",
                "700",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                3,
                R.drawable.logo,
                "Сдать долги",
                "400",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                4,
                R.drawable.logo,
                "Сходить к терпиле",
                "666",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                0,
                R.drawable.logo,
                "Регистрация",
                "100",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                1,
                R.drawable.logo,
                "Сменить Аватарку",
                "1000",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                2,
                R.drawable.logo,
                "Подтвердить почту",
                "700",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                3,
                R.drawable.logo,
                "Сдать долги",
                "400",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                4,
                R.drawable.logo,
                "Сходить к терпиле",
                "666",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                0,
                R.drawable.logo,
                "Регистрация",
                "100",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                1,
                R.drawable.logo,
                "Сменить Аватарку",
                "1000",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                2,
                R.drawable.logo,
                "Подтвердить почту",
                "700",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                3,
                R.drawable.logo,
                "Сдать долги",
                "400",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                4,
                R.drawable.logo,
                "Сходить к терпиле",
                "666",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                0,
                R.drawable.logo,
                "Регистрация",
                "100",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                1,
                R.drawable.logo,
                "Сменить Аватарку",
                "1000",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                2,
                R.drawable.logo,
                "Подтвердить почту",
                "700",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                3,
                R.drawable.logo,
                "Сдать долги",
                "400",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                4,
                R.drawable.logo,
                "Сходить к терпиле",
                "666",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                0,
                R.drawable.logo,
                "Регистрация",
                "100",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                1,
                R.drawable.logo,
                "Сменить Аватарку",
                "1000",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                2,
                R.drawable.logo,
                "Подтвердить почту",
                "700",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                3,
                R.drawable.logo,
                "Сдать долги",
                "400",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                4,
                R.drawable.logo,
                "Сходить к терпиле",
                "666",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                0,
                R.drawable.logo,
                "Регистрация",
                "100",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                1,
                R.drawable.logo,
                "Сменить Аватарку",
                "1000",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                2,
                R.drawable.logo,
                "Подтвердить почту",
                "700",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                3,
                R.drawable.logo,
                "Сдать долги",
                "400",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                4,
                R.drawable.logo,
                "Сходить к терпиле",
                "666",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                0,
                R.drawable.logo,
                "Регистрация",
                "100",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                1,
                R.drawable.logo,
                "Сменить Аватарку",
                "1000",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                2,
                R.drawable.logo,
                "Подтвердить почту",
                "700",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                3,
                R.drawable.logo,
                "Сдать долги",
                "400",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                4,
                R.drawable.logo,
                "Сходить к терпиле",
                "666",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                0,
                R.drawable.logo,
                "Регистрация",
                "100",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                1,
                R.drawable.logo,
                "Сменить Аватарку",
                "1000",
                R.drawable.coin
        ));
        tasks.add(new TaskItem(
                2,
                R.drawable.logo,
                "Подтвердить почту",
                "700",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                3,
                R.drawable.logo,
                "Сдать долги",
                "400",
                R.drawable.coin
        ));tasks.add(new TaskItem(
                4,
                R.drawable.logo,
                "Сходить к терпиле",
                "666",
                R.drawable.coin
        ));




    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(tasks);
        rv.setAdapter(adapter);
    }

}
