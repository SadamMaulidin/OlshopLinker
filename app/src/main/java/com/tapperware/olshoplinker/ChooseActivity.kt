package com.tapperware.olshoplinker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choose.*
import org.jetbrains.anko.startActivity

class ChooseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        clothes.setOnClickListener {
            val pindah = Intent(this, ClothesActivity::class.java)
            startActivity(pindah)
        }

        travel.setOnClickListener {
            val pindah = Intent(this, TravelActivity::class.java)
            startActivity(pindah)
        }

        more.setOnClickListener {
            val pindah = Intent(this, MoreActivity::class.java)
            startActivity(pindah)
        }

    }
}
