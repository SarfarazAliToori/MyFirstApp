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

        val bundleUserName : Bundle? = intent.extras
        val bundleUserPass : Bundle? = intent.extras

        val userName = bundleUserName!!.getString("user_name")
        val userPass = bundleUserPass!!.getString("user_pass")

        tvMessage.text = userName
        tvPass.text = userPass

        // Fragments Buttons Actions

        btn_frament1.setOnClickListener {
            fragOne(Fragment1())
        }

        btn_fragment2.setOnClickListener {
            fragTwo(Fragment2())
        }


    }


    // Fragment 1 Method
    fun fragOne(frag1:Fragment1) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framgmentFram, frag1)
        ft.commit()
    }

    fun fragTwo(frag2 : Fragment2) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framgmentFram, frag2)
        ft.commit()
    }
}