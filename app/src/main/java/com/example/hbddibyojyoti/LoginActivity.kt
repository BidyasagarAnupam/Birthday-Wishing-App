package com.example.hbddibyojyoti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun createBdCard(view: View) {

        val name = editTextPersonName.editableText.toString()

        if (name == "")
        {
            Toast.makeText(this, "Please enter your name...", Toast.LENGTH_SHORT).show()
        } else {
            // Intent for go to another activity
            val intent = Intent(this, BdWishActivity::class.java)
            intent.putExtra(BdWishActivity.NAME_EXTRA, name)
            startActivity(intent)
            finish()
        }
    }
}