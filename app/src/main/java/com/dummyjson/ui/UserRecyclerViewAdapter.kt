package com.dummyjson.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dummyjson.domain.User
import com.example.dummyjson.databinding.UserItemBinding

class UserRecyclerViewAdapter(val onClick: (User) -> Unit): RecyclerView.Adapter<UserViewHolder>() {
    private val users = arrayListOf<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layout = LayoutInflater.from(parent.context)
        return UserViewHolder(UserItemBinding.inflate(layout, parent, false))
    }

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(users[position], onClick)
    }

}