package com.express.cryptoapp.data.remote

import com.express.cryptoapp.data.remote.dto.CoinDetailDto
import com.express.cryptoapp.data.remote.dto.CoinDto
import com.express.cryptoapp.domain.model.CoinDetail
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}