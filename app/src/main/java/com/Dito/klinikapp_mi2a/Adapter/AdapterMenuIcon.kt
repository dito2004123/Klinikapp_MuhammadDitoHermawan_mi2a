package com.friska.klinikapp_mi2a.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.friska.klinikapp_mi2a.Model.ModelMenuIcon
import com.friska.klinikapp_mi2a.R
import com.friska.klinikapp_mi2a.screen.HomeDoctorActivity

class AdapterMenuIcon (
val itemList: ArrayList<ModelMenuIcon>,
val getActivity : HomeDoctorActivity
): RecyclerView.Adapter<AdapterMenuIcon.MyViewHolder>(){

    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView)  {
        var itemImage : ImageView
        var itemJudul : TextView

        init {
            itemImage =itemView.findViewById(R.id.imgIcon) as ImageView
            itemJudul =itemView.findViewById(R.id.txtNamaIcon) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_item_menuicon, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].gambar)
        holder.itemJudul.setText(itemList[position].judul)
    }
}