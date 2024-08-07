package com.example.android_sandbox

import android.util.Log
import com.example.android_sandbox.annotation.MethodAnnotation

class JunkClass {
    @MethodAnnotation
    fun junkFunc() {
        Log.e("JunkClass", "junkFunc")
    }
}
