package com.creativeitlimited.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Toast
import androidx.activity.viewModels
import com.creativeitlimited.quizapp.databinding.ActivityMainBinding
import com.creativeitlimited.quizapp.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {
    private val viewModel:PlayViewModel by viewModels()

    lateinit var binding:ActivityPlayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)





        binding.nextBtn.setOnClickListener{
            val selectedIndex=binding.quizRadioGroup.indexOfChild(findViewById(binding.quizRadioGroup.checkedRadioButtonId))
            if (selectedIndex !=-1){
                viewModel.checkAnswer(selectedIndex)
                setNextQuestion()
            }else{
                Toast.makeText(this,"Please Select any option",Toast.LENGTH_LONG).show()
            }


          }
        }
    private fun showCurrentQuestion(){
        val currentQuestion=viewModel.getCurrentQuestion()

        binding.quesTv.text=currentQuestion.question
        binding.option1.text=currentQuestion.option[0]
        binding.option2.text=currentQuestion.option[1]
        binding.option3.text=currentQuestion.option[2]
        binding.option4.text=currentQuestion.option[3]
        binding.quizRadioGroup.clearCheck()
    }

    private fun setNextQuestion() {
        val nextQuestion=viewModel.getNextQuestion()

        if (nextQuestion !=null){
            showCurrentQuestion()
        }else{
            val resultIntent=Intent(this@PlayActivity,ResultActivity::class.java)
            resultIntent.putExtra("score",viewModel.getScore())
            startActivity(resultIntent)

//            resultIntent.putExtra("wrongScore",viewModel.wrongScore())
//            startActivity(resultIntent)
        }

    }

}

