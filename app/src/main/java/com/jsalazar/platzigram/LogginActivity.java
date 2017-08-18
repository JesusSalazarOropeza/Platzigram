package com.jsalazar.platzigram;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jsalazar.platzigram.view.ContainerActivity;
import com.jsalazar.platzigram.view.CreateAccountActivity;

public class LogginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggin);
    }
    public void  goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
    public void login (View view){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);

    }
    public void web (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.google.com"));
        startActivity(intent);

    }
}
