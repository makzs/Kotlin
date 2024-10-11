package com.example.aula_banco2.Data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aula_banco2.AtualizarFragment
import com.example.aula_banco2.R

class LivroAdapter() : RecyclerView.Adapter<LivroAdapter.LivroViewHolder>() {

    private var livroList = emptyList<Livro>()
    lateinit var fragmentManager: FragmentManager

    inner class LivroViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LivroViewHolder {
        return LivroViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return livroList.size
    }

    override fun onBindViewHolder(holder: LivroViewHolder, position: Int) {
        var itemAtual = livroList[position]
        holder.itemView.findViewById<TextView>(R.id.txtIdLivro).text = itemAtual.id.toString()
        holder.itemView.findViewById<TextView>(R.id.txtNomeLivro).text = itemAtual.nome.toString()
        holder.itemView.findViewById<Button>(R.id.btnEditar).setOnClickListener {

            val novoFrag = AtualizarFragment()
            val bundle = bundleOf("nome" to itemAtual.nome, "id" to itemAtual.id)

            novoFrag.arguments = bundle

            fragmentManager.beginTransaction().replace(R.id.fragmentContainerView, AtualizarFragment()).commit()
        }
    }

    fun setData(livros: List<Livro>, fragmentManager: FragmentManager){
        this.livroList = livros
        this.fragmentManager = fragmentManager
        notifyDataSetChanged()
    }

}