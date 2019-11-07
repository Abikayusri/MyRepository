package com.project.myretrofit.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.myretrofit.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    companion object {
        const val EXTRA_CONTENT = "extra_content"
    }
}
