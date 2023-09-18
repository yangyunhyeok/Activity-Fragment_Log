package com.example.latecomers_6week

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.latecomers_6week.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("test","SecondActivity onCreate입니다.")
        binding.btnMove.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("test","SecondActivity onStart입니다.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("test","SecondActivity onResume입니다.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("test","SecondActivity onPause입니다.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("test","SecondActivity onStop입니다.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("test","SecondActivity onDestroy입니다.")
    }
}