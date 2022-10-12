package com.catnip.cowboyshoot.ui.menu


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.catnip.cowboyshoot.databinding.ActivityMenuBinding


class MenuActivity : AppCompatActivity(){

    companion object{
        const val EXTRA_TEXT = "EXTRA_TEXT"
    }

    private lateinit var tvReceiver : TextView

    private val binding: ActivityMenuBinding by lazy {
        ActivityMenuBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        nameReceiver()
    }

    fun nameReceiver(){
        binding.apply {
            tvReceiver = tvName
        }

        val receiver = intent.getStringExtra(EXTRA_TEXT)
        val text = "Hi $receiver"

        tvReceiver.text = text
    }
}