package com.example.developer.untitledkotlin

import android.app.Activity
import android.os.Bundle
import com.example.developer.untitledkotlin.views.ActivityBaseLayout

class MainActivity() : Activity() {

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        setContentView(ActivityBaseLayout(this))
    }
}