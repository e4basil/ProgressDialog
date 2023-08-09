package com.ta.apps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ta.apps.databinding.ActivityMainBinding
import com.ta.progressbar.ProgressDialog

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val dialog = ProgressDialog(this@MainActivity)
            dialog
                .setMessage("sahbdhsadhg bngfnghn nthnhgngnghhggfhgfh hfghgfhgfhgf" +
                        "")
            dialog.show()
        }
    }
}