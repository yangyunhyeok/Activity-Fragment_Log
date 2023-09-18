package com.example.latecomers_6week

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("test","Fragment onCreate입니다")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("test","Fragment onCreateView입니다")
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("test","Fragment onViewCreated입니다")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("test","Fragment onViewStateRestored입니다")
    }

    override fun onStart() {
        super.onStart()
        Log.d("test","Fragment onStart입니다")
    }

    override fun onResume() {
        super.onResume()
        Log.d("test","Fragment onResume입니다")
    }

    override fun onPause() {
        super.onPause()
        Log.d("test","Fragment onPause입니다")
    }

    override fun onStop() {
        super.onStop()
        Log.d("test","Fragment onStop입니다")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("test","Fragment onSaveInstanceState입니다")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("test","Fragment onDestroyView입니다")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("test","Fragment onDestroy입니다")
    }
}