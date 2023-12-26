package com.bitcodetech.intentfilterdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.VmPolicy
import com.bitcodetech.intentfilterdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        StrictMode.setVmPolicy(
            VmPolicy.Builder().build()
        )

        binding.btnViewImage.setOnClickListener {
            val intent = Intent("in.bitcode.action.media.VIEW")
            intent.setDataAndType(
                Uri.parse(binding.edtFilePath.text.toString()),
                "image/png"
            )
            //intent.action = "in.bitcode.action.media.VIEW"
            //intent.putExtra("path", binding.edtFilePath.text.toString())
            startActivity(intent)
        }

    }
}