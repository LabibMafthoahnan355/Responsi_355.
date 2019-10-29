package com.example.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_data.*
import kotlinx.android.synthetic.main.register1.*

class data : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bio)

        val bundle = intent.extras
        val getEmail = bundle?.get("Email")
        val getName = bundle?.get("Nama")
        val getUmur = bundle?.get("Umur")
        val getJk = bundle?.get("Jk")
        val getUsername =bundle?.get("Username")
        val getPassword = bundle?.get("Password")

        Nama.text = getName.toString()
        Email.text= getEmail.toString()
        Username.text= getUsername.toString()
        Password.text= getPassword.toString()
        Jk.text= getJk.toString()

    }
}
