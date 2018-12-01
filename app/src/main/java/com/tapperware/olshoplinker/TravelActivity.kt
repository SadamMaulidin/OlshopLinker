package com.tapperware.olshoplinker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_travel.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity

class TravelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        traveloka.onClick {
            startActivity<WebView>("travelWeb" to "https://www.traveloka.com/")
        }

        wego.onClick {
            startActivity<WebView>("travelWeb" to "https://www.wego.co.id/")
        }

        pegipegi.onClick {
            startActivity<WebView>("travelWeb" to "https://www.pegipegi.com/")
        }
    }
}
