package com.tapperware.olshoplinker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tapperware.olshoplinker.R.id.btnStart
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener{
            val pindah = Intent(this, ChooseActivity::class.java)
            startActivity(pindah)
        }
    }
}
