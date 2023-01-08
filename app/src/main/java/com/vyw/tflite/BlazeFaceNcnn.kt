package com.vyw.tflite

import android.content.res.AssetManager
import android.view.Surface


class BlazeFaceNcnn {
    external fun loadModel(mgr: AssetManager? , modelid: Int , cpugpu: Int): Boolean
    external fun openCamera(facing: Int): Boolean
    external fun closeCamera(): Boolean
    external fun setOutputWindow(surface: Surface?): Boolean

    companion object {
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}