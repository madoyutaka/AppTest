package com.example.apptest.view

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.apptest.model.TestRepository

/**
 *  Test ViewModel
 *  画面ID:
 *
 *  @author Y.Sato
 *  created on 2024/01/04
 */
class TestViewModel : ViewModel() {
    companion object {
        /** TAG */
        private const val TAG = "TestViewModel"
    }

    /** TestRepository */
    private val testRepository: TestRepository = TestRepository()

    /**
     * init
     */
    init {
        Log.d(TAG, "init")
    }

    //
    fun onBtnClicked(): String {
        Log.d(TAG, "onBtnClicked")
        return "test"
    }
}