package com.example.assignment3

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.time_row.*
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    val times = ArrayList<String>()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.adapter = MainAdapter()

        button_add.setOnClickListener {

            times.add(LocalDateTime.now().toString())

            recyclerView.adapter = MainAdapter(times)
        }

        button_remove.setOnClickListener {

            //times.remove(toRemove)
            recyclerView.adapter = MainAdapter(times)
        }
    }
}
