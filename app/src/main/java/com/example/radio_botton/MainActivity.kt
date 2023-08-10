package com.example.radio_botton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val strList = arrayOf("研究の応用（I）","研究の応用（II）","研究の応用（III）","電気回路","データ分析基礎","基本情報解析")

        AlertDialog.Builder(this) // FragmentではActivityを取得して生成
            .setTitle("履修科目を選択してください")
            .setSingleChoiceItems(strList, 0, { dialog, which ->
                // TODO:アイテム選択時の挙動
            })
            .setPositiveButton("OK", { dialog, which ->
                // TODO:Yesが押された時の挙動
                val intent = Intent(this, SubActivity::class.java)
                startActivity(intent)

            })
            .show()

    }
}



