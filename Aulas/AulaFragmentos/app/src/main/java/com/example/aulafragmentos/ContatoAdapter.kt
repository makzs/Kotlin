package com.example.aulafragmentos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ContatoAdapter (val lista : List<Contato>) : Adapter<ContatoAdapter.ContatoViewHolder>() {

    inner class ContatoViewHolder(val itemView : View) : ViewHolder(itemView){
        val txtNome : TextView = itemView.findViewById(R.id.txtNome)
        val txtConversa : TextView = itemView.findViewById(R.id.txtConversa)
        val txtHorario : TextView = itemView.findViewById(R.id.txtHorario)
        val img : ImageView = itemView.findViewById(R.id.imgProfile)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.item_lista, parent, false)

        return ContatoViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
        val contato = lista[position]
        holder.txtNome.text = contato.nome
        holder.txtConversa.text = contato.msg
        holder.txtHorario.text = contato.hora
        holder.img.setImageResource(R.drawable.profile_1)


    }

}