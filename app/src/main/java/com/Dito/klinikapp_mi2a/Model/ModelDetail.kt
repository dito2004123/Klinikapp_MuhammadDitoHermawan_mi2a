package com.friska.klinikapp_mi2a.Model

data class ModelDetail(
    var hastag : String
)

object MockList1{
    fun getModel() : List<ModelDetail>{
        val itemModel1 = ModelDetail(
            "#heart"
        )

        val itemModel2 = ModelDetail(
            "#teeth"
        )

        val itemModel3 = ModelDetail(
            "#surgeon"
        )

        val itemModel4 = ModelDetail(
            "#eyes"
        )

        val itemModel5 = ModelDetail(
            "#mounth"
        )


        val itemList : ArrayList<ModelDetail> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList
    }
}
