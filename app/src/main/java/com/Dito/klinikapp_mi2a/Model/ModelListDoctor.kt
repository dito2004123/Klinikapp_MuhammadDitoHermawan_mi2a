package com.friska.klinikapp_mi2a.Model

import com.friska.klinikapp_mi2a.R

data class ModelListDoctor(
    var imgDoctor : Int,
    var namaDoctor : String,
    var spesDoctor : String,
    var jumlahReview : String,
    var angkaRating : String
)
object MockList2{
    fun getModel() : List<ModelListDoctor>{
        val itemModel1 = ModelListDoctor(
            R.drawable.dokter3,
            "Dr.Floyd Miles",
            "Pediatrics",
            "(123 reviews)",
            "4.9"
        )

        val itemModel2 = ModelListDoctor(
            R.drawable.dokter5,
            "Dr. Guy Hawkins",
            "Dentist",
            "(85 reviews)",
            "4.9"
        )

        val itemModel3 = ModelListDoctor(
            R.drawable.dokter1,
            "Dr. Jane Cooper",
            "Cardiologist",
            "(44 reviews)",
            "4.7"
        )

        val itemModel4 = ModelListDoctor(
            R.drawable.dokter3,
            "Dr. Jacob Jones",
            "Nephrologyst",
            "(101 reviews)",
            "5.0"
        )

        val itemModel5 = ModelListDoctor(
            R.drawable.dokter6,
            "Dr. Savannah Nguyen",
            "Urologyst",
            "(168 reviews)",
            "4.8"
        )

        val itmList : ArrayList<ModelListDoctor> = ArrayList()
        itmList.add(itemModel1)
        itmList.add(itemModel2)
        itmList.add(itemModel3)
        itmList.add(itemModel4)
        itmList.add(itemModel5)

        return itmList
    }

}