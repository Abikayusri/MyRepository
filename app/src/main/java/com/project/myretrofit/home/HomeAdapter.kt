package com.project.myretrofit.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.myretrofit.R
import com.project.myretrofit.model.ContentBody
import kotlinx.android.synthetic.main.item_content.view.*

/**
 * Created by Abika Chairul Yusri
 * on Wednesday, 06 November 2019
 * Bismillahirrahmanirrahim
 */
class HomeAdapter: RecyclerView.Adapter<HomeHolder>() {

    private val contentList = mutableListOf<ContentBody>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_content, parent, false)
        return HomeHolder(view)
    }

    override fun getItemCount(): Int {
        return contentList.size
    }

    override fun onBindViewHolder(holder: HomeHolder, position: Int) {
//        holder.bind(position)

        val content = contentList[position]



        holder.itemView.tv_item_title.text = content.title
        holder.itemView.tv_item_categories.text = content.categories
        holder.itemView.tv_item_content.text = content.content
    }

//    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
//        fun bind(position: Int){
//            val content = contentList[position]
//
//            itemView.tv_item_title.text = content.title
//            itemView.tv_item_categories.text = content.categories
//            itemView.tv_item_content.text = content.content
//        }
//    }
}