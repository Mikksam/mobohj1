package com.example.mobohj_vko1

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log.d
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.forEach
import kotlinx.android.synthetic.main.activity_saved_view.*

class SavedView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved_view)

        var intent = intent
        val myList: ArrayList<String> = intent.getStringArrayListExtra("myList")
        //d("asd","list on: " + myList?.get(0))
        val items = findViewById<ListView>(R.id.ListView_items)
        val array = arrayOfNulls<String>(myList.size)

        //Olisi hyvä olla try-catch lohkon sisällä!!!!
        for (i in 0 until myList.size){
                val item = myList[i]
                array[i]= item
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, array)
        items.adapter=adapter

        button_back.setOnClickListener {
            //NOTE TO SELF!
            //Oikeasti kannattaisi toteuttaa ArrayList omana luokkanaan, jotta se olisi tallessa.
            //poistuttaessa kysyttäisiin haluaako tyhjentää listan tai oma optio tyhjennykselle.
            val builder = AlertDialog.Builder(this@SavedView)

            builder.setTitle("Returning to previous")

            builder.setMessage("Are sure you want to go back?")

            builder.setPositiveButton("YES"){dialog, which ->
                val intentmain = Intent(this, MainActivity:: class.java)
                startActivity(intentmain)
            }

            builder.setNegativeButton("NO"){dialog, which ->
                //pitäisikö olla jotain extratoimintoa mahd jos haluaisi kehittää..
            }

            val dialog: AlertDialog = builder.create()


            dialog.show()
        }
    }
}