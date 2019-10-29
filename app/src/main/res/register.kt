package com.example.responsi

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.bio.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.register1.*

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nama = Edit_Nama.text
        val Umur = Umur.text
        val Email = Email.text
        val Username = Username.text
        val Jk= Jk.text

        prosses.setOnClickListener {
            intent = Intent(this,data::class.java)
            intent.putExtra("Nama", nama)
            intent.putExtra("Nilai",Umur)
            intent.putExtra("Email", Email)
            intent.putExtra("Username", Username)
            intent.putExtra("jk",Jk)

        }
    }
}
