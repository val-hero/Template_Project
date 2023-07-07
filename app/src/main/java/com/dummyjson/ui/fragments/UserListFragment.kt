package com.dummyjson.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dummyjson.ui.UserRecyclerViewAdapter
import com.example.dummyjson.databinding.FragmentUserListBinding

class UserListFragment: Fragment() {
    private lateinit var binding: FragmentUserListBinding
    private val adapter = UserRecyclerViewAdapter { user ->
        onUserClick(user.id)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun onUserClick(userId: Int) {

    }
}