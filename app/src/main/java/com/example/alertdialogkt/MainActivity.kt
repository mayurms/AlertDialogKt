package com.example.alertdialogkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.button)

        button.setOnClickListener{
//            Toast.makeText(this,"Order Successfully !",Toast.LENGTH_SHORT).show()
            showALertDialog()
        }
    }
    private fun showALertDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Food App")
            .setMessage("Do you want to order food!")
            .setPositiveButton("Yes"){dialog,which ->
                Toast.makeText(this,"Order Successfully !",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){dialog,which ->
                dialog.dismiss()
            }
        val alertDialog : AlertDialog = builder.create()
        alertDialog.show()
    }
}