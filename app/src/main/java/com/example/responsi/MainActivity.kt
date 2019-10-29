package com.example.responsi

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_data.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.Password1
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            val intent = Intent(this,dasbor::class.java)
            startActivity(intent)
            finish()
        }
        btn.setOnClickListener {
            val Username1= Username.text.toString()
            val Password1 = Password.text.toString()
            if (Username1.isEmpty()|| Password1.isEmpty()){
                Toast.makeText(this, " Please Insert Username and password",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (Username1=="labibmafthoahnan@gmail.com"|| Password1=="kuy0101"){
                val progressDialog= ProgressDialog(this,R.style.Theme_AppCompat_Light_Dialog)
                progressDialog.setMessage("authenticating")
                progressDialog.show()
                val intent = Intent(this,dasbor::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}
