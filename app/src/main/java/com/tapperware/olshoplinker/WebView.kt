package com.tapperware.olshoplinker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_clothes.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.webView

class WebView : AppCompatActivity() {

    var urlBaju : String? = null
    var urlTravel : String? = null
    var urlOlshop : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        urlBaju = intent.getStringExtra("clothesWeb")

        if (urlBaju.equals("https://www.zaful.com/")) {
            webView().loadUrl("https://www.zaful.com/")
        } else if (urlBaju.equals("https://www.zalora.co.id/")) {
            webView().loadUrl("https://www.zalora.co.id/")
        } else if (urlBaju.equals("https://www.asos.com/")){
            webView().loadUrl("https://www.asos.com/")
        }else{

        }

        urlTravel = intent.getStringExtra("travelWeb")

            if (urlTravel.equals("https://www.traveloka.com/")){
                webView().loadUrl("https://www.traveloka.com/")
            }else if (urlTravel.equals("https://www.wego.co.id/")){
                webView().loadUrl("https://www.wego.co.id/")
            }else if (urlTravel.equals("https://www.pegipegi.com/")){
                webView().loadUrl("https://www.pegipegi.com/")
            }else{

            }

            urlOlshop = intent.getStringExtra("moreWeb")

            if (urlOlshop.equals("https://www.lazada.co.id/")){
                webView().loadUrl("https://www.lazada.co.id/")
            }else if (urlOlshop.equals("https://www.tokopedia.com/")){
                webView().loadUrl("https://www.tokopedia.com/")
            }else if (urlOlshop.equals("https://www.blibli.com/")){
                webView().loadUrl("https://www.blibli.com/")
            }else{

            }
        }
    }

