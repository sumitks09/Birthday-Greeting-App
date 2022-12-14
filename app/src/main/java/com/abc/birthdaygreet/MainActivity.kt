package com.abc.birthdaygreet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createBirthdayButton.setOnClickListener {
             val name = nameInput.editableText.toString()
            val intent = Intent(this, BirthdayGreetActivity::class.java)
            intent.putExtra(BirthdayGreetActivity.NAME_EXTRA, name)
            startActivity(intent)
        }
    }
}



