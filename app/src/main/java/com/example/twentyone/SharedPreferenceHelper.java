package com.example.twentyone;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;

import com.example.twentyone.Model.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SharedPreferenceHelper {

    public static final String SHARED_PREF_NAME = "SHARED_PREF_NAME";
    public static final String USERS_KEY = "USERS_KEY";
    public static final String USER_LOCAL = "USER_LOCAL";

    public static User user;

    private SharedPreferences mSharedPreferences;

    public SharedPreferenceHelper(Context context){
        mSharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
    }

    public static final Type USERS_TYPE = new TypeToken<List<User>>(){}.getType();
    public static final Type USER_TYPE = new TypeToken<User>(){}.getType();

    private Gson mGson = new Gson();

    public List<User> getUsers(){
        List<User> users = mGson.fromJson(mSharedPreferences.getString(USERS_KEY, ""), USERS_TYPE);
        return users == null ? new ArrayList<User>() : users;
    }

    public void saveUser(String email){

        List<User> users = getUsers();
        for(User u : users){
            if(u.getEmail().equalsIgnoreCase(email)){
                mSharedPreferences.edit().putString(USER_LOCAL, mGson.toJson(u, USER_TYPE)).apply();
            }
        }
    }

    public User getUser(){

        User user =  mGson.fromJson(mSharedPreferences.getString(USER_LOCAL, ""), USER_TYPE);
        return user == null ? new User() : user;
    }

    public boolean addUser(User user){
        List<User> users = getUsers();

        for(User u : users){
            if(u.getEmail().equalsIgnoreCase(user.getEmail())){
                return false;
            }
        }

        users.add(user);
        mSharedPreferences.edit().putString(USERS_KEY, mGson.toJson(users, USERS_TYPE)).apply();
        return true;
    }

    public void updateImageUser(String userEmail, Drawable d){

        List<User> users = getUsers();

            for(User u : users){
                if(u.getEmail().equalsIgnoreCase(userEmail)){
                    u.setImageUrl(d);
                }
            }
        //if(users.size() > 0)
       // mSharedPreferences.edit().putString(USERS_KEY, mGson.toJson(users, USERS_TYPE)).apply();

        User user = getUser();
        user.setImageUrl(d);
        //if(user.getEmail() != "")
        //mSharedPreferences.edit().putString(USER_LOCAL, mGson.toJson(user, USER_TYPE)).apply();

    }

    public void setUserLocal(User user){
        mSharedPreferences.edit().putString(USER_LOCAL, mGson.toJson(user, USER_TYPE)).apply();

    }

    public static User getUserLocal(){
        return user;
    }

}
