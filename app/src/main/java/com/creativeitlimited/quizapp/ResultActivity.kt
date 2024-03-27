package com.creativeitlimited.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.creativeitlimited.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding:ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val score=intent.getIntExtra("score",0)
        binding.scoreTv.text="Currect Score:  $score"

        val wrongScore=15-score
        binding.wrongScoreTv.text="Wrong Score:$wrongScore"

    }
}