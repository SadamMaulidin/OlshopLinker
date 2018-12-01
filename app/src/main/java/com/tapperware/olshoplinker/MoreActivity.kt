package com.tapperware.olshoplinker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_more.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity

class MoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more)

        lazada.onClick {
            startActivity<WebView>("moreWeb" to "https://www.lazada.co.id/")
        }

        tokopedia.onClick {
            startActivity<WebView>("moreWeb" to "https://www.tokopedia.com/")
        }

        blibli.onClick {
            startActivity<WebView>("moreWeb" to "https://www.blibli.com/")
        }
    }
}
