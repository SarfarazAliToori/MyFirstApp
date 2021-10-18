package com.example.myfirstapp

import android.content.Intent
import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sign_up.*
import javax.security.auth.login.LoginException

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // let's try to change the toolbar name
        val title = supportActionBar
        title?.title = "Sign Up"

        btn_signUp.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        })

        tv_logIn.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, LogIn::class.java))
        })
    }
}