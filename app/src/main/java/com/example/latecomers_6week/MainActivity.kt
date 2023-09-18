package com.example.latecomers_6week

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.latecomers_6week.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("test","MainActivity onCreate입니다.")

        binding.btnMove.setOnClickListener {
            intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        binding.btnIn.setOnClickListener { // 프래그먼트 불러오기
            supportFragmentManager.beginTransaction()
                .replace(R.id.framgentLayout, FirstFragment())
                .commit()
        }

        binding.btnOut.setOnClickListener { // 프래그먼트 제거
            supportFragmentManager.findFragmentById(R.id.framgentLayout)
                ?.let { it1 -> supportFragmentManager.beginTransaction().remove(it1).commit() }
        }

        binding.btnToast.setOnClickListener {
            showToast("눌렸습니다.")
        }
    }

    fun Context.showToast(message: String) { // 확장함수
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("test","MainActivity onStart입니다.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("test","MainActivity onResume입니다.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("test","MainActivity onPause입니다.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("test","MainActivity onStop입니다.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("test","MainActivity onDestroy입니다.")
    }
}