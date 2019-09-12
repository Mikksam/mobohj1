package com.example.mobohj_vko1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_saved_view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myList = ArrayList<String>()
        button_save.setOnClickListener {
            d("sam", "btn was pressed")
            var txt = findViewById<TextView>(R.id.editTextView)
            if(txt.text.length < 3 || txt.text.length >15){
                Toast.makeText(applicationContext,"Item name is either too short or too long, please check that the length is in between 3 and 15 characters.",Toast.LENGTH_LONG).show()
            }
            else{
                myList.add(txt.text.toString())
                Toast.makeText(applicationContext,"Item added to the Shopping List", Toast.LENGTH_SHORT).show()
                txt.text = ""
            }
        }

        button_done.setOnClickListener {

            val intent = Intent(this, SavedView:: class.java)
            intent.putStringArrayListExtra("myList",myList)
            startActivity(intent)
        }
    }
}
