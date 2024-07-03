// MoneySDKView.kt
package com.moneysdk

import android.content.Context
import android.widget.FrameLayout
import com.facebook.react.ReactInstanceManager
import com.facebook.react.ReactRootView
import com.facebook.react.shell.MainReactPackage

class MyReactNativeView(context: Context) : FrameLayout(context) {

    private val mReactRootView: ReactRootView = ReactRootView(context)
    private val mReactInstanceManager: ReactInstanceManager

    init {
        mReactInstanceManager = ReactInstanceManager.builder()
            .setApplication(context.applicationContext as Application)
            .setBundleAssetName("index.android.bundle")
            .setJSMainModulePath("index")
            .addPackage(MainReactPackage())
            .setUseDeveloperSupport(BuildConfig.DEBUG)
            .setInitialLifecycleState(ReactInstanceManager.LifecycleState.RESUMED)
            .build()

        mReactRootView.startReactApplication(mReactInstanceManager, "MoneySDK", null)
        addView(mReactRootView)
    }
}
