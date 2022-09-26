package com.anastasiiagribovskaya.cryptocoins

import java.util.Date

data class Coin(
    val id: String,
    val symbol: String,
    val name: String,
    val image_url: String,
    val current_price: Float,
    val market_cap: Int,
    val market_cap_rank: Int,
    val fully_diluted_valuation: Int,
    val total_volume: Int,
    val high_24h: Float,
    val low_24h: Float,
    val price_change_24h: Float,
    val price_change_percentage_24h: Float,
    val market_cap_change_24h: Float,
    val market_cap_change_percentage_24h: Float,
    val circulating_supply: Int,
    val total_supply: Int,
    val max_supply: Int,
    val ath: Int,
    val ath_change_percentage: Float,
    val ath_date: Date,
    val atl: Float,
    val atl_change_percentage: Float,
    val atl_date: Date,
    val roi: Roi,
    val last_updated: Date
)
