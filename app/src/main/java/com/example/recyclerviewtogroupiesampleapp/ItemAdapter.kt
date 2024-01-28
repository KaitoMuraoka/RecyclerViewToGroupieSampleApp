package com.example.recyclerviewtogroupiesampleapp

import com.example.recyclerviewtogroupiesampleapp.databinding.RecyclerItemBinding
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class ItemAdapter(private val item: String): Item<GroupieViewHolder>() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        val binding = RecyclerItemBinding.bind(viewHolder.itemView)
        binding.textViewItem.text = item
    }

    override fun getLayout() = R.layout.recycler_item
}