package com.moneysdk

import android.app.Activity
import android.view.View

object MyReactNativeModule {

    fun createReactNativeView(activity: Activity): View {
        return MyReactNativeView(activity)
    }
}
