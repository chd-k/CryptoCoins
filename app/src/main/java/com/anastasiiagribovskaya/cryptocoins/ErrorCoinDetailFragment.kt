package com.anastasiiagribovskaya.cryptocoins

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anastasiiagribovskaya.cryptocoins.databinding.FragmentErrorCoinDetailBinding

class ErrorCoinDetailFragment : Fragment() {
    private lateinit var binding: FragmentErrorCoinDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentErrorCoinDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

}