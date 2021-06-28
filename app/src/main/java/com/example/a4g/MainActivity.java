package com.example.a4g;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setClassName("com.android.settings", "com.android.settings.RadioInfo");
            startActivity(intent);
        } catch(Exception e){
            Toast.makeText(getApplicationContext(), " Device not supported" , Toast.LENGTH_LONG).show();
            setContentView(R.layout.layout);
        }
    }

    public void uninstall(View view) {
        Intent d=new Intent(Intent.ACTION_DELETE);
        d.setData(Uri.parse("package:com.example.a4g"));
        startActivity(d);
    }
}