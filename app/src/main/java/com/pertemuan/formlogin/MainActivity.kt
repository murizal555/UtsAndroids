package com.pertemuan.formlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pertemuan.formlogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding.btlogin.setOnClickListener{
            val username=binding.atusername.text.toString()
            val password=binding.etpassword.text.toString()
            if (username.isEmpty()||password.isEmpty()){
                binding.btlogin.text="input tidak boleh kosong"
            } else if (username.isNotEmpty()||password.isNotEmpty()){
                if (username=="murizal"&&password=="satu"){
                    binding.btlogin.setOnClickListener {
                        val intent= Intent(this, HitungVolume::class.java)
                    }d
                }else if (username!="murizal"&&password!="satu") {
                    binding.pesantext.text="username atau password salah"
                }
            }
        }
    }
}