package com.quickbirdstudios.kotlintrainingexercises.provided

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.quickbirdstudios.kotlintrainingexercises.R

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

class ResultsAdapter(dataSet: List<String>) : RecyclerView.Adapter<ResultsAdapter.ViewHolder>() {
    var onItemClickListener: ((Int) -> Unit)? = null

    var dataset = dataSet
        set(dataSet) {
            field = dataSet
            notifyDataSetChanged()
        }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var textView: TextView = view.findViewById(R.id.resultText)
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder = ViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_result, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataset[position]
        holder.itemView.setOnClickListener { onItemClickListener?.invoke(position) }
    }

    override fun getItemCount() = dataset.size
}
