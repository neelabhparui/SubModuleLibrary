package com.np.submodulelibrary

import android.util.Log

private const val TAG = "SubModule"
class SubModule {
    fun call() : String{
        Log.i(TAG, "calling public sub module")
        return "Public Module"
    }
}