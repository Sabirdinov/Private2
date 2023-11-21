package com.example.shahtak

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shahtak.databinding.ActivityMainBinding
import java.net.URL

class MainActivity : AppCompatActivity() {
        lateinit var binding: ActivityMainBinding
        var link ="https://namozvaqti.uz/shahar/fargona"
        val link2 = "http://mp3muslim.uz/component/muscol/N/28-mishari-roshid-al-afasij/77-ur-oni-karim?Itemid=101"
        var a:Int=0
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.namoz1.setOnClickListener {
                val url = "https://namozvaqti.uz/shahar/fargona"
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse("$link")
                startActivity(i)
            }

            binding.btn1.setOnClickListener {
                a++
                binding.edit.text=a.toString()
            }
            binding.btn2.setOnClickListener {
                binding.edit.text = ""
                a = 0
            }
        }
    }