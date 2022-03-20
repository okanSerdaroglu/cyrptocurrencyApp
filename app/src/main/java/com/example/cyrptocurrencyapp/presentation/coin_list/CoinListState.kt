package com.example.cyrptocurrencyapp.presentation.coin_list

import com.example.cyrptocurrencyapp.domain.model.Coin

class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
