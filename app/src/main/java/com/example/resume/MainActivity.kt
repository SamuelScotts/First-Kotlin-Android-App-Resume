package com.example.resume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var experience = findViewById<Button>(R.id.experience)

        experience.setOnClickListener{
            var moveToExperience = Intent(getApplicationContext(), Experience::class.java)
            startActivity(moveToExperience)
        }

        var callMe = findViewById<Button>(R.id.callMe)

        callMe.setOnClickListener{
            var phoneURI = Uri.parse("tel:00000000000")
            var callIntent = Intent(Intent.ACTION_DIAL,phoneURI)
            startActivity(callIntent)
        }

        var emailMe = findViewById<Button>(R.id.emailMe)

        emailMe.setOnClickListener{
            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "emailme@email.com")
            startActivity(emailIntent)
        }

    }
}