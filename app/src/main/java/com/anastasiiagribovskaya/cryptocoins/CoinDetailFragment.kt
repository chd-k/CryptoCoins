package com.anastasiiagribovskaya.cryptocoins

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.anastasiiagribovskaya.cryptocoins.databinding.FragmentCoinDetailBinding

class CoinDetailFragment : Fragment() {
    private lateinit var binding: FragmentCoinDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentCoinDetailBinding.inflate(inflater, container, false)
//        activity
        return binding.root
    }

}