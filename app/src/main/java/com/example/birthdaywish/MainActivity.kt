package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CreateBirthdayCard(view: View) {
        val name=nameInput.editableText.toString()
        val intent = Intent(this,BirthdayCardGreetingActivity::class.java)
        intent.putExtra(BirthdayCardGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
        Toast.makeText(this, "Happy Birthday $name", Toast.LENGTH_SHORT).show()
    }
}