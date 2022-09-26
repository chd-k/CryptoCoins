package com.anastasiiagribovskaya.cryptocoins

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.anastasiiagribovskaya.cryptocoins.databinding.FragmentCoinsListBinding
import kotlinx.coroutines.launch

class CoinsListFragment : Fragment() {

    private lateinit var binding: FragmentCoinsListBinding
    private lateinit var viewModel: CoinsListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCoinsListBinding.inflate(inflater, container, false)
        binding.recyclerViewCoinsList.layoutManager = LinearLayoutManager(context)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.coins.collect { coins ->
                    binding.recyclerViewCoinsList.adapter = CoinsListAdapter(coins)
                }
            }
        }
    }
}