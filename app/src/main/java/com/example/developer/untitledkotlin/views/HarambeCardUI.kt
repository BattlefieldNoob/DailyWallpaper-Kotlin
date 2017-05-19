package com.example.developer.untitledkotlin.views

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import trikita.anvil.DSL.*
import trikita.anvil.cardview.v7.CardViewv7DSL.cardView


/**
 * Created by developer on 19/05/17.
 */
class HarambeCardUI(c: android.content.Context) : trikita.anvil.RenderableView(c) {

    var url = ""
    private var image: android.graphics.Bitmap? = null

    override fun view() {
        linearLayout {

            trikita.anvil.BaseDSL.init {
                doAsync {
                    val imager = android.graphics.BitmapFactory.decodeStream(java.net.URL(url).openStream())
                    uiThread {
                        image = imager
                        trikita.anvil.Anvil.render()
                    }
                }
            }

            trikita.anvil.BaseDSL.size(trikita.anvil.BaseDSL.FILL, trikita.anvil.BaseDSL.FILL)
            cardView {
                trikita.anvil.BaseDSL.margin(trikita.anvil.BaseDSL.dip(8))
                size(trikita.anvil.BaseDSL.FILL, trikita.anvil.BaseDSL.FILL)
                linearLayout {
                    imageView {
                        size(FILL, FILL)
                        scaleType(android.widget.ImageView.ScaleType.CENTER_CROP)
                        imageBitmap(image)
                    }
                }
            }
        }
    }
}