package com.project.myretrofit.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.myretrofit.R
import com.project.myretrofit.model.ContentBody
import com.project.myretrofit.ui.add.AddContentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainPresenter.Listener {

    private lateinit var mainPresenter: MainPresenter
    private lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupComponent()
        setupListener()
    }

    override fun onResume() {
        super.onResume()
        mainPresenter.getContentList()
    }

    private fun setupComponent() {
        mainPresenter = MainPresenter(this)
        mainAdapter = MainAdapter()

        rv_main.setHasFixedSize(true)
        rv_main.layoutManager = LinearLayoutManager(this)
        rv_main.adapter = mainAdapter
    }


    private fun setupListener() {
        fab_main.setOnClickListener {
            startActivity(Intent(this, AddContentActivity::class.java))
        }
    }

    override fun onGetContentListSuccess(contentList: MutableList<ContentBody>) {
        mainAdapter.addContentList(contentList)
        Toast.makeText(this, "Sukses datanya bro", Toast.LENGTH_SHORT).show()
    }

    override fun onGetContentListFailure(errMessage: String) {
        Toast.makeText(this, errMessage, Toast.LENGTH_SHORT).show()
    }
}
