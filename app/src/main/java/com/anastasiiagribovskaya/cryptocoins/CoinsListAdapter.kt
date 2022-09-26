package com.anastasiiagribovskaya.cryptocoins

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.anastasiiagribovskaya.cryptocoins.databinding.ItemCoinsListBinding

class CoinsListAdapter(
    private val coins: List<Coin>,
    ) : RecyclerView.Adapter<CoinsListHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinsListHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCoinsListBinding.inflate(inflater, parent, false)
        return CoinsListHolder(binding)
    }

    override fun onBindViewHolder(holder: CoinsListHolder, position: Int) {
        val coin = coins[position]
        holder.bind(coin)
    }

    override fun getItemCount() = coins.size
}

class CoinsListHolder(private val binding: ItemCoinsListBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(coin: Coin) {
        val percentage = coin.price_change_percentage_24h
        binding.apply {
            textViewCoin.text = coin.id.replaceFirstChar { it.uppercase() }
            textViewSymbol.text = coin.symbol.uppercase()
            textViewPrice.text = coin.current_price.toString()
            textViewPercentage.text = percentage.toString()
            textViewPercentage.setTextColor(if (percentage < 0)
                ContextCompat.getColor(binding.root.context, R.color.red)
                else ContextCompat.getColor(binding.root.context, R.color.green))
        }
    }

}
