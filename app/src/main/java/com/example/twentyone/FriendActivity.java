package com.example.twentyone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.twentyone.Friend.RVAdapter;
import com.example.twentyone.Friend.Person;

import java.util.ArrayList;
import java.util.List;

public class FriendActivity extends Activity {

    private List<Person> persons;
    private RecyclerView rv;

    private TextView tvSearchFriend;
    private Button btnSearchFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_friend);

        rv=(RecyclerView)findViewById(R.id.rv);
        tvSearchFriend = findViewById(R.id.searchFriend);
        btnSearchFriend = findViewById(R.id.btnSearch);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);



        initializeData();
        initializeAdapter();

        btnSearchFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(Person person : persons){

                    if(person.name.equalsIgnoreCase(tvSearchFriend.getText().toString())){
                        Toast.makeText(getApplicationContext(), person.nick, Toast.LENGTH_SHORT ).show();
                    }
                }
            }
        });
    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.ava_1));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.ava_2));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.ava_3));

    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }

}
