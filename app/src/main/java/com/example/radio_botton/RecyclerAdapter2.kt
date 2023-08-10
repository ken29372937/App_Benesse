package com.example.radio_botton

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.radio_botton.R

class RecyclerAdapter2:RecyclerView.Adapter<ViewHolderItem2>() {
    //５）表示するデータを用意
    //private val nameList = listOf("My Name0","My Name1","My Name2","My Name3","My Name4","My Name5")
    //９）privateは消す
    val nameList = listOf("田中太郎","高橋啓介","久保徹","北村美穂","江本忠","原田ひろし","田村夕子","斉藤拓哉","葛西仁美","島田圭","中嶋聡","新井信一","坂下直人","岡節子")
    private val messageList = listOf("よろしくお願いします!","ゲームが好きです","友達募集中","よろしくお願いします","よろしく","料理仲間が欲しい!","こんにちは!!","過去問もってます","気軽に連絡ください!!","よろしくお願いいたします!","課題する仲間募集中!!","彼女が欲しいです","よろしく!!","旅行にハマってます!")
    private val imgList = listOf(
        R.drawable.f1, R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,R.drawable.f7, R.drawable.f8,R.drawable.f9,R.drawable.f10,R.drawable.f11,R.drawable.f12,R.drawable.f13,R.drawable.f14)

    //４）ここで１行分のレイアウト（View）を生成
    //（「２」と「３」を紐づける作業）
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem2 {
        //「２」のレイアウトを取得（インフレート）
        val itemXml = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_layout2,parent,false)
        return ViewHolderItem2(itemXml)
    }

    //５）position番目のデータをレイアウト(xml)に表示するようセット
    override fun onBindViewHolder(holder: ViewHolderItem2, position: Int) {
        holder.tvNameHolder.text = nameList[position]
        holder.tvMessageHolder.text = messageList[position]
        holder.ivHolder.setImageResource(imgList[position])

    }

    //６）データが何件あるかをカウントする
    override fun getItemCount(): Int {
        return nameList.size
    }
}