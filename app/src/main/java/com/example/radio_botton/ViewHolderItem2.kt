package com.example.radio_botton

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ViewHolderItem2(itemView:View) :RecyclerView.ViewHolder(itemView){
    //３）View(xml)の方から、指定のidを見つけてくる
    val ivHolder :ImageView =itemView.findViewById(R.id.iv2)
    val tvNameHolder:TextView =itemView.findViewById(R.id.tvName2)
    val tvMessageHolder:TextView =itemView.findViewById(R.id.tvMessage2)

    //９）クリック処理(1行分の画面(view)が押されたら～)
    private val recyclerAdapter = RecyclerAdapter2()
    private val nameList =recyclerAdapter.nameList

    init {
        itemView.setOnClickListener {

            val context: Context = itemView.getContext()
            context.startActivity(Intent(context, Sub3Activity::class.java))
            //val context: Context = itemView.getContext()
            //context.startActivity(Intent(context, Sub2Activity::class.java))
            //val position:Int =adapterPosition
            //Toast.makeText(itemView.context,"${nameList[position]}さんです",Toast.LENGTH_SHORT).show()
        }
    }
}