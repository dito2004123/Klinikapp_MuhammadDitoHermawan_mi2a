package com.friska.klinikapp_mi2a.Adapter

import android.content.Intent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.friska.klinikapp_mi2a.Detailactivity
import com.friska.klinikapp_mi2a.Model.ModelListDoctor
import com.friska.klinikapp_mi2a.R
import com.friska.klinikapp_mi2a.screen.HomeDoctorActivity

class AdapterListDoctor(
    val itemList: ArrayList<ModelListDoctor>,
    val getActivity: HomeDoctorActivity
):RecyclerView.Adapter<AdapterListDoctor.MyViewHolder>()
{
    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        var itemGambar : ImageView
        var itemNama : TextView
        var itemSpesialis : TextView
        var itemReview : TextView
        var itemRating : TextView

        init {
            itemGambar = itemView.findViewById(R.id.imgDoctor) as ImageView
            itemNama = itemView.findViewById(R.id.txtNamaDoctor) as TextView
            itemSpesialis = itemView.findViewById(R.id.txtSpesDoctor) as TextView
            itemReview = itemView.findViewById(R.id.txtReviewDoctor) as TextView
            itemRating = itemView.findViewById(R.id.txtJumlahRating) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_list_doctor, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemGambar.setImageResource(itemList[position].imgDoctor)
        holder.itemNama.setText(itemList[position].namaDoctor)
        holder.itemSpesialis.setText(itemList[position].spesDoctor)
        holder.itemReview.setText(itemList[position].jumlahReview)
        holder.itemRating.setText(itemList[position].angkaRating)

        holder.itemView.setOnClickListener(){
            val intent = Intent(getActivity,Detailactivity::class.java)

            intent.putExtra("gambar",itemList[position].imgDoctor)
            intent.putExtra("nama_dokter",itemList[position].namaDoctor)
            intent.putExtra("spesialis",itemList[position].spesDoctor)
            intent.putExtra("review",itemList[position].jumlahReview)
            intent.putExtra("nilai",itemList[position].angkaRating)

            getActivity.startActivity(intent)
        }

    }

}