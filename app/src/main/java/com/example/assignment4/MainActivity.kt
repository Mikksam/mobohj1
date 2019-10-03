package com.example.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main)

        val txt:TextView = findViewById(R.id.textView)

        button.setOnClickListener {
            txt.isEnabled = txt.isEnabled !== true

            if(txt.isEnabled===true){
                txt.text = "Enabled"
            }
            else if (txt.isEnabled===false) {
                txt.text = "Disabled"
            }
        }


    }
}
