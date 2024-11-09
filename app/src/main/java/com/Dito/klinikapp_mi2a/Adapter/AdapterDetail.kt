package com.friska.klinikapp_mi2a.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.friska.klinikapp_mi2a.Model.ModelDetail
import com.friska.klinikapp_mi2a.R
import com.friska.klinikapp_mi2a.screen.HomeDoctorActivity

class AdapterDetail(
    val itemList: ArrayList<ModelDetail>,
    val getActivity : HomeDoctorActivity
): RecyclerView.Adapter<AdapterDetail.MyViewHolder>()
{
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemDetail : TextView

        init {
            itemDetail = itemView.findViewById(R.id.txtHastag) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tag, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemDetail.setText(itemList[position].hastag)
    }

}