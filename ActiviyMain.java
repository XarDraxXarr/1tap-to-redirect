package com.example.toastproject; 

import android.content.Intent; 
import android.net.Uri; 
import android.os.Bundle; 
import android.view.View; 

import androidx.appcompat.app.AppCompatActivity; 

public class MainActivity extends AppCompatActivity { 
  @Override protected void 
  onCreate(Bundle savedInstanceState) { 
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.activity_main); 
  } 
  public void CLK(View V){ 
    Intent intent=new Intent(Intent.ACTION_VIEW, 
  Uri.parse("linktoYourSchoolWebsite")); 
    startActivity(intent); 
  }
}
