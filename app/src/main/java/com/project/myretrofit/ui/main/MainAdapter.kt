package com.project.myretrofit.ui.main

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.myretrofit.R
import com.project.myretrofit.model.ContentBody
import com.project.myretrofit.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.item_content.view.*

/**
 * Created by Abika Chairul Yusri
 * on Wednesday, 06 November 2019
 * Bismillahirrahmanirrahim
 */
//class MainAdapter(private val contentList: List<ContentBody>): RecyclerView.Adapter<MainAdapter.ViewHolder>() {
class MainAdapter: RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private val contentList = mutableListOf<ContentBody>()

    fun addContentList(content: MutableList<ContentBody>) {
        contentList.clear()
        contentList.addAll(content)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_content, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contentList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
//        holder.itemView.setOnClickListener{v ->
//            val context = v.context
//            val intent = Intent(context, DetailActivity::class.java)
//            intent.putExtra(DetailActivity.EXTRA_CONTENT, holder.bind(position)!!.id)
//
//        }

    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int){
            val content = contentList[position]

            itemView.tv_item_title.text = content.title
            itemView.tv_item_categories.text = content.categories
            itemView.tv_item_content.text = content.content

            itemView.setOnClickListener{v ->
                val context = v.context
                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_CONTENT, content.id)

                context.startActivity(intent)
            }
        }
    }
}