package com.anastasiiagribovskaya.cryptocoins

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CoinsListViewModel : ViewModel() {
    private val _coins: MutableStateFlow<List<Coin>> = MutableStateFlow(emptyList())
    val coins: StateFlow<List<Coin>>
        get() = _coins.asStateFlow()
}