package com.example.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_birthday_card_greeting.*
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayCardGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card_greeting)
        val name = intent.getStringExtra(NAME_EXTRA)
        BirthdayGreeting.text="Happy Birthday\n$name!!"
    }
}