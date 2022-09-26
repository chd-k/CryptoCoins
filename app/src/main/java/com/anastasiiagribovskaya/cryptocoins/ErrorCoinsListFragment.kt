package com.anastasiiagribovskaya.cryptocoins

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anastasiiagribovskaya.cryptocoins.databinding.FragmentErrorCoinsListBinding

class ErrorCoinsListFragment : Fragment() {
    private lateinit var binding: FragmentErrorCoinsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentErrorCoinsListBinding.inflate(inflater, container, false)
        return binding.root
    }
}