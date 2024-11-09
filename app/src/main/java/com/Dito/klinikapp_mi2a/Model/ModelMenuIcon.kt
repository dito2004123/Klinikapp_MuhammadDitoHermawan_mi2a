package com.friska.klinikapp_mi2a.Model

import com.friska.klinikapp_mi2a.R

data class ModelMenuIcon(
    val gambar : Int,
    val judul : String
)
object MockList{
    fun getModel() : List<ModelMenuIcon>{
        val itemModel1 = ModelMenuIcon(
            R.drawable.icon_tooth,
            "Dentist"
        )

        val itemModel2 = ModelMenuIcon(
            R.drawable.icon_eye,
            "Ophthalmologyst"
        )

        val itemModel3 = ModelMenuIcon(
            R.drawable.icon_heart,
            "Cardiologyst"
        )

        val itemList : ArrayList<ModelMenuIcon> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)


        return itemList


    }

}