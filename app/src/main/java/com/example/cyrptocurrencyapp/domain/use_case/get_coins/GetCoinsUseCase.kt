package com.example.cyrptocurrencyapp.domain.use_case.get_coins

import com.example.cyrptocurrencyapp.common.Resource
import com.example.cyrptocurrencyapp.data.remote.dto.toCoin
import com.example.cyrptocurrencyapp.domain.model.Coin
import com.example.cyrptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject


/**
 * useCase should have only one public method and only one aim
 */
class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An exception error occured"))
        } catch (e: IOException) {
            emit(Resource.Error("Could not reach server. Check your connection"))
        }
    }
}