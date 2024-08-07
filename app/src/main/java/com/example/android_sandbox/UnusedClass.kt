package com.example.android_sandbox

import android.util.Log
import com.example.android_sandbox.annotation.ClassAnnotation
import com.example.android_sandbox.annotation.MethodAnnotation

@ClassAnnotation
class UnusedClass {
    @MethodAnnotation
    fun unusedFunc() {
        Log.e("UnusedClass", "unusedFunc")
    }

    fun otherUnusedFunc() {
        Log.e("UnusedClass", "otherUnusedFunc")
    }
}
