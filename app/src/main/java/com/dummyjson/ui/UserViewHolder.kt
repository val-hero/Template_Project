package com.dummyjson.ui

import androidx.recyclerview.widget.RecyclerView
import com.dummyjson.domain.User
import com.example.dummyjson.databinding.UserItemBinding

class UserViewHolder(private val binding: UserItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(model: User, onClick: (User) -> Unit) {
        binding.userName.text = model.name
        binding.root.setOnClickListener { onClick(model) }
    }
}