package com.bitcodetech.intentfilterdemo

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bitcodetech.intentfilterdemo.databinding.ImageActivityBinding

class ImageActivity : AppCompatActivity() {

    private lateinit var binding : ImageActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ImageActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.img.setImageURI(intent.data)

        /*if(intent.hasExtra("path")) {
            val fileUri = Uri.parse(intent.getStringExtra("path"))
            binding.img.setImageURI(fileUri)
        }*/
    }
}