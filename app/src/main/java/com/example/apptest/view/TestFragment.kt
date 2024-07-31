package com.example.apptest.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.apptest.R
import com.example.apptest.databinding.FragmentTestBinding

/**
 *  Test Fragment
 *  画面ID:
 *
 *  @author Y.Sato
 *  created on 2024/01/04
 */
class TestFragment : Fragment() {

    companion object {
        /** TAG */
        private const val TAG = "TestFragment"
    }

    /** binding */
    private lateinit var binding: FragmentTestBinding

    /** viewModel */
    private lateinit var viewModel: TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate Start")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Start")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Start")
        Log.d(TAG, "onPause End")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Start")
        Log.d(TAG, "onStop End")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView Start")
        Log.d(TAG, "onDestroyView End")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Start")
        Log.d(TAG, "onDestroy End")
    }

}