package com.example.radio_botton

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.radio_botton.R

class RecyclerAdapter:RecyclerView.Adapter<ViewHolderItem>() {
    //５）表示するデータを用意
    //private val nameList = listOf("My Name0","My Name1","My Name2","My Name3","My Name4","My Name5")
    //９）privateは消す
    val nameList = listOf("課題をしよう","FPS好き集まれ","GPA3.0以上のみ","過去問共有","対面でやりたい人募集","スタバ好きな人","チャットのみグループ","やる気ない人集合","ポケモン語れる人","GPA低い人!!","顔合わせグル")
    private val messageList = listOf("メンバー数15","メンバー数5","メンバー数1","メンバー数14","メンバー数18","メンバー数5","メンバー数7","メンバー数9","メンバー数3","メンバー数9","メンバー数7")
    private val imgList = listOf(
        R.drawable.im1, R.drawable.im2,R.drawable.im3,R.drawable.im4,R.drawable.im5,R.drawable.im6,R.drawable.im7, R.drawable.im8,R.drawable.im9,R.drawable.im10,R.drawable.im11)

    //４）ここで１行分のレイアウト（View）を生成
    //（「２」と「３」を紐づける作業）
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        //「２」のレイアウトを取得（インフレート）
        val itemXml = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_layout,parent,false)
        return ViewHolderItem(itemXml)
    }

    //５）position番目のデータをレイアウト(xml)に表示するようセット
    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        holder.tvNameHolder.text = nameList[position]
        holder.tvMessageHolder.text = messageList[position]
        holder.ivHolder.setImageResource(imgList[position])

    }

    //６）データが何件あるかをカウントする
    override fun getItemCount(): Int {
        return nameList.size
    }
}