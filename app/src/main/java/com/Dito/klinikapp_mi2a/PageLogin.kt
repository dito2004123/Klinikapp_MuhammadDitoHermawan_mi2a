package com.friska.klinikapp_mi2a

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.friska.klinikapp_mi2a.screen.HomeDoctorActivity

class PageLogin : AppCompatActivity() {
    private lateinit var txtSignUp: TextView
    private lateinit var btnsignin: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)

        txtSignUp = findViewById(R.id.txtLog)
        btnsignin = findViewById(R.id.btnsignin)

        txtSignUp.setOnClickListener {
            val intent = Intent(this@PageLogin, PageRegister::class.java)
            startActivity(intent)
        }
        btnsignin.setOnClickListener{
            val intent = Intent(this@PageLogin, HomeDoctorActivity::class.java)
            startActivity(intent)
        }
    }
}
