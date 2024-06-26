package com.chris.horoscapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.chris.horoscapp.databinding.ItemHoroscopeBinding
import com.chris.horoscapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)
    fun render(horoscopeInfo: HoroscopeInfo){
        val context = binding.tvTittle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTittle.text = context.getString(horoscopeInfo.name)
    }
}