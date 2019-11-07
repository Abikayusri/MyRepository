package com.project.myretrofit.ui.add

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.project.myretrofit.R
import com.project.myretrofit.model.PostContentResponse
import kotlinx.android.synthetic.main.activity_add_content.*

class AddContentActivity : AppCompatActivity(), AddContentPresenter.Listener {

    private lateinit var addContentPresenter: AddContentPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_content)

        setupComponent()
        setupListener()
    }

    private fun setupComponent() {
        addContentPresenter = AddContentPresenter(this)
    }

    private fun setupListener() {
        btn_add_save.setOnClickListener {

            val title = et_add_title.text.toString().trim()
            val categories = et_add_categories.text.toString().trim()
            val content = et_add_content.text.toString().trim()

            when{
                (title.isEmpty()) ->{
                    et_add_title.error = "Title required"
                    et_add_title.requestFocus()
                }
                (categories.isEmpty()) -> {
                    et_add_categories.error = "Categories required"
                    et_add_categories.requestFocus()
                }
                (content.isEmpty())->{
                    et_add_content.error = "Content required"
                    et_add_content.requestFocus()
                }
            }

            val postContent = PostContentResponse(title, categories, content)
            addContentPresenter.createContent(postContent)

//            ApiClient.instance.addContent(postContent)
//                .enqueue(object : Callback<PostResponse> {
//                    override fun onFailure(call: retrofit2.Call<PostResponse>, t: Throwable) {
//                        Toast.makeText(this@AddContentActivity, "Error", Toast.LENGTH_SHORT).show()
//                    }
//
//                    override fun onResponse(
//                        call: retrofit2.Call<PostResponse>, response: Response<PostResponse>
//                    ) {
//                        Toast.makeText(this@AddContentActivity, "Sukses", Toast.LENGTH_SHORT).show()
//                    }
//
//                })
        }
    }



    override fun onAddContentSuccess(sccMessage: String) {
        Toast.makeText(this, sccMessage, Toast.LENGTH_SHORT).show()
        finish()
    }

    override fun onAddContentFailure(errMessage: String) {
        Toast.makeText(this, errMessage, Toast.LENGTH_SHORT).show()
    }

//    override fun onAddContentLoading(isLoading: Boolean) {
//    }
}
