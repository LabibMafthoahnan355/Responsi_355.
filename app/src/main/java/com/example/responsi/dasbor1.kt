package com.example.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dasbor1.*
import kotlinx.android.synthetic.main.activity_data.*

class dasbor1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dasbor1)
        val bundle = intent.extras
        val getEmail = bundle?.get("Email")
        val getName = bundle?.get("Nama")
        val getUmur = bundle?.get("Umur")
        val getJk = bundle?.get("Jk")
        val getUsername =bundle?.get("Username")
        val getPassword = bundle?.get("Password")
        Nama1.text = getName.toString()
        Email1.text= getEmail.toString()
        Username1.text= getUsername.toString()
        Password1.text= getPassword.toString()
        Jk1.text= getJk.toString()
    }
}
