package com.example.cyrptocurrencyapp.domain.use_case.get_coin

import com.example.cyrptocurrencyapp.common.Resource
import com.example.cyrptocurrencyapp.data.remote.dto.toCoinDetail
import com.example.cyrptocurrencyapp.domain.model.CoinDetail
import com.example.cyrptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId:String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId = coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An exception error occured"))
        } catch (e: IOException) {
            emit(Resource.Error("Could not reach server. Check your connection"))
        }
    }
}