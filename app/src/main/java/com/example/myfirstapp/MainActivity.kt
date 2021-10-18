package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Changing toolbar name
        val title = supportActionBar
        title?.title = "Home Screen"

        btn_message.setOnClickListener(View.OnClickListener {
            Log.i("Main Activity", "Hello World from Log cat")
            Toast.makeText(this, "Hello World from Toast", Toast.LENGTH_SHORT).show()

        })
    }
}