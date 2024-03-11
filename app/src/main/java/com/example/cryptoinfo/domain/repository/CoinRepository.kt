package com.example.cryptoinfo.domain.repository

import com.example.cryptoinfo.data.remote.dto.CoinDetailDto
import com.example.cryptoinfo.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}