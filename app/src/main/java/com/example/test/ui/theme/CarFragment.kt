package com.example.test.ui.theme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.ui.theme.adapter.CarAdapter
import com.example.test.ui.theme.model.CarModel


@Suppress("UNREACHABLE_CODE")
class CarFragment : Fragment() {
   private lateinit var recyclerView: RecyclerView
   private lateinit var adapter: CarAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_car, container, false)
        recyclerView = requireView().findViewById(R.id.rv_car)
        adapter = CarAdapter(getItemList(), requireContext())
    }

    private fun getItemList(): List<CarModel> {
        val itemList = mutableListOf<CarModel>()
        itemList.add(CarModel("2023", "Mercedes", R.drawable.mercedes.toString()))
        itemList.add(CarModel("2020", "Toyota Camry", R.drawable.camry.toString()))
        itemList.add(CarModel("2019", "Mustang", R.drawable.mustang.toString()))
        itemList.add(CarModel("2020", "Porche", R.drawable.porche.toString()))
        itemList.add(CarModel("2020", "BMW", R.drawable.bmw.toString()))
        itemList.add(CarModel("2021", "kia", R.drawable.kia.toString()))
        itemList.add(CarModel("2023", "tesla", R.drawable.tesla.toString()))
        return itemList
    }
}