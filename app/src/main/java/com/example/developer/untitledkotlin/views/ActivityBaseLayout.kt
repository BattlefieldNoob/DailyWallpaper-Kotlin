package com.example.developer.untitledkotlin.views

import android.content.Context
import trikita.anvil.Anvil
import trikita.anvil.BaseDSL.*
import trikita.anvil.DSL
import trikita.anvil.RenderableView
import trikita.anvil.appcompat.v7.AppCompatv7DSL
import trikita.anvil.design.DesignDSL.*

/**
 * Created by developer on 19/05/17.
 */
class ActivityBaseLayout(val c : Context) : RenderableView(c){

    override fun view() {
        DSL.frameLayout {
            floatingActionButton {
                margin(dip(8))
                size(WRAP, WRAP)
                compatElevation(dip(4.0f))
                layoutGravity(BOTTOM or RIGHT)
            }

            v(HarambeCardUI::class.java){
                val instance= Anvil.currentView<HarambeCardUI>()
                instance.url="http://images2.corriereobjects.it/methode_image/2016/05/31/Scienze/Foto%20Gallery/AFP_BC8AH_MGTHUMB-INTERNA.jpg"
            }
        }
    }
}