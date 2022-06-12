package ru.skillbranch.notesmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import ru.skillbranch.notesmvvm.databinding.ActivityMainBinding
import ru.skillbranch.notesmvvm.viewmodel.MainViewModel
import ru.skillbranch.notesmvvm.viewmodel.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val viewmodel by lazy { ViewModelProvider(this, MainViewModelFactory()).get(MainViewModel::class.java) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewmodel.resultLive.observe(this,{
            binding.textView.text = it
        })

        binding.Bget.setOnClickListener {
            viewmodel.load()
        }
        binding.Bsave.setOnClickListener {
            viewmodel.save(binding.editText.text.toString())
        }



    }

}