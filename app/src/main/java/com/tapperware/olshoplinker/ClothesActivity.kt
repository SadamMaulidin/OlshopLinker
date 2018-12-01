package com.tapperware.olshoplinker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_clothes.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity

class ClothesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clothes)

        zafulbtn.onClick {
            startActivity<WebView>("clothesWeb" to "https://www.zaful.com/")
        }

        zalorabtn.onClick {
            startActivity<WebView>("clothesWeb" to "https://www.zalora.co.id/")
        }

        asosbtn.onClick {
            startActivity<WebView>("clothesWeb" to "https://www.asos.com/")
        }
    }
}
