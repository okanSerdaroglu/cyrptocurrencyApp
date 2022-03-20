package com.example.cyrptocurrencyapp.presentation.coin_detail

import com.example.cyrptocurrencyapp.domain.model.CoinDetail

class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
