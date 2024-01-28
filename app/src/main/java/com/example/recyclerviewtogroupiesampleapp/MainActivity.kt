package com.example.recyclerviewtogroupiesampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewtogroupiesampleapp.databinding.ActivityMainBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val groupAdapter = GroupAdapter<GroupieViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val items = listOf("🍎りんご", "🍌バナナ", "🍒さくらんぼ", "🍊オレンジ", "🍓いちご", "🍉すいか", "🍐洋梨")
        binding.mainRecyclerView.adapter = groupAdapter
        binding.mainRecyclerView.layoutManager = LinearLayoutManager(this)
        groupAdapter.addAll(items.map {
            ItemAdapter(it)
        })
    }
}