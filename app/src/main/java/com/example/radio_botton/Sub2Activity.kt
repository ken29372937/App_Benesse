package com.example.radio_botton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.radio_botton.R
import com.example.radio_botton.RecyclerAdapter

class Sub2Activity : AppCompatActivity() {
    //７）recyclerViewの変数を用意
    private lateinit var recyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2)

        //８）recyclerView表示の呪文
        recyclerView = findViewById(R.id.rv2) //idの取得
        recyclerView.adapter = RecyclerAdapter2() //アダプターをセット
        recyclerView.layoutManager = LinearLayoutManager(this)//各アイテムを縦に並べてください（見せ方の指示）
    }
}






