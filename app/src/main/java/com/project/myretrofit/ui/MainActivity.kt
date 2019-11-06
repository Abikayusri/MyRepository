package com.project.myretrofit.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.myretrofit.R
import com.project.myretrofit.add.AddContentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupListener()
    }

    private fun setupListener() {
        fab_main.setOnClickListener {
            startActivity(Intent(this, AddContentActivity::class.java))
        }
    }
}
