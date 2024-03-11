package com.example.cryptoinfo.presentation.coin_detail

import com.example.cryptoinfo.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
