package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        /**
         * List of user info to display.
         */

        List<UserInfo> userInfoList = new ArrayList<>();
        userInfoList.add(new UserInfo("Ashish Dongol","20","Bafal", "Male", R.drawable.ic_launcher_background));
        userInfoList.add(new UserInfo("Prashant Shrestha","30","USA", "Male", R.drawable.ic_launcher_background));
        userInfoList.add(new UserInfo("Aayush Yadav","10","Nepal", "Male", R.drawable.ic_launcher_background));

        UserInfoAdapter userInfoAdapter = new UserInfoAdapter(this,userInfoList);
        recyclerView.setAdapter(userInfoAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
