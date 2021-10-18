package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_log_in.*

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        //let's change the toolbar name
        val title = supportActionBar
        title?.title = "Log In"

        btn_login.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Log In Successfully", Toast.LENGTH_LONG).show()
            startActivity(Intent(this,MainActivity::class.java))
        })

        tv_signUp.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        })
    }
}