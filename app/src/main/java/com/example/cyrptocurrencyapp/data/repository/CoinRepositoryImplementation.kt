package com.example.cyrptocurrencyapp.data.repository

import com.example.cyrptocurrencyapp.data.remote.CoinPaprikaAPI
import com.example.cyrptocurrencyapp.data.remote.dto.CoinDetailDto
import com.example.cyrptocurrencyapp.data.remote.dto.CoinDto
import com.example.cyrptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImplementation @Inject constructor(
    private val api: CoinPaprikaAPI
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}