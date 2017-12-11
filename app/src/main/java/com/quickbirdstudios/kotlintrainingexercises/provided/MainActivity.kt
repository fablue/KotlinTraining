package com.quickbirdstudios.kotlintrainingexercises.provided

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.text.Editable
import android.text.TextWatcher
import com.quickbirdstudios.kotlintrainingexercises.MainViewModel
import com.quickbirdstudios.kotlintrainingexercises.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mainViewModel = MainViewModel();
    private val resultsAdapter = ResultsAdapter(mainViewModel.results)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchField.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                mainViewModel.onSearchTermChanged(s.toString())
                mainViewModel.onResultListUpdated()
                onViewModelUpdated()
            }

        })

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        resultsAdapter.onItemClickListener = {
            Snackbar.make(recyclerView, mainViewModel.getAnimalSoundOf(mainViewModel.dataSet[it]), Snackbar.LENGTH_SHORT).show()
        }

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(recyclerView.context,
                (recyclerView.layoutManager as LinearLayoutManager).orientation))
        recyclerView.adapter = resultsAdapter
        onViewModelUpdated()
    }

    private fun onViewModelUpdated() {
        resultsAdapter.dataset = mainViewModel.results
        message.text = mainViewModel.message
        info.text = mainViewModel.resultQuantityString
    }
}
