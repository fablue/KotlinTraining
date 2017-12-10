package com.quickbirdstudios.kotlintrainingexercises

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

class ResultsAdapter(private val mDataset: Array<String>) : RecyclerView.Adapter<ResultsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var textView: TextView = view.findViewById(R.id.resultText)
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ResultsAdapter.ViewHolder = ViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_result, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = mDataset[position]
    }

    override fun getItemCount() = mDataset.size
}
