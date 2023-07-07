package com.example.test.ui.theme.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.test.R
import com.example.test.ui.theme.model.CarModel

class CarAdapter(private val itemList: List<CarModel>, private val context: Context) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.car_item, parent, false)
        return CarViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val item = itemList[position]
        holder.imageNameTextView.text = item.name
        holder.yearTextView.text = item.year.toString()
        Glide.with(context)
            .load(item.image)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val imageView: ImageView = itemView.findViewById(R.id.iv_car)
        val imageNameTextView: TextView = itemView.findViewById(R.id.tv_name)
        val yearTextView: TextView = itemView.findViewById(R.id.tv_year)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            val navController = Navigation.findNavController(v)
            navController.navigate(R.id.detailFragment)
        }
    }
}