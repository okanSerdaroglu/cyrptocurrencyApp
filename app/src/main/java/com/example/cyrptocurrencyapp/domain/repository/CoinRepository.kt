package com.example.cyrptocurrencyapp.domain.repository

import com.example.cyrptocurrencyapp.data.remote.dto.CoinDetailDto
import com.example.cyrptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}