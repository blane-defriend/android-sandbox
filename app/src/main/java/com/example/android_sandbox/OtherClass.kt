package com.example.android_sandbox

import android.util.Log
import com.example.android_sandbox.annotation.ClassAnnotation

@ClassAnnotation
class OtherClass {
    fun someFunc() {
        Log.e("OtherClass", "someFunc")
    }
}
