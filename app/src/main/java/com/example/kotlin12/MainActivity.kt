package com.example.kotlin12

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.example.kotlin12.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    private val mutablelist = mutableListOf(
        "https://www.instagram.com/p/CSmGkZ4Mx5J/",
        "https://www.instagram.com/p/CRo9xzosNyw/",
        "https://www.instagram.com/p/CJ3TOSEMQew/",
        "https://www.instagram.com/p/CV96pB6BAi_/",
        "https://www.instagram.com/p/CTgUiatpIxV/"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
         addlist()
        submitClick()
        randomButton()

    }

      private fun addlist(){
          mutablelist[0]="https://cdn.mos.cms.futurecdn.net/hBnAKidjLXGjkEateNqvJh.jpg"
          mutablelist[1] = "https://m.media-amazon.com/images/M/MV5BZjkwZjkzYjYtNjdhYS00ZDZjLThhMmQtZGEwOTg3ODMwMTQ1XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg"
          mutablelist[2] = "https://www.cnet.com/a/img/BKLWNFuCnweL5IKLfA-iBd7u9fA=/940x528/2019/04/12/6ef88cb4-926d-408d-a566-29796a99a928/game-of-thrones-e1552846351168.jpg"
          mutablelist[3] = "https://i.guim.co.uk/img/media/eb691a97f92b5c1a0ac1158614695a852473937f/0_0_4800_2880/master/4800.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=678f8ea4b93f23074ac4c08359e3cc27"
          mutablelist[4] = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/game-of-thrones-illustration-sean-longmore-1598631176.jpeg?crop=0.669xw:1.00xh;0.0896xw,0&resize=640:*"
      }


    private fun randomButton() {
        viewBinding.randomBtn.setOnClickListener() {
            val random = Random.nextInt(0,4)
            Glide
                .with(this)
                .load(mutablelist[random])
                .into(viewBinding.avatarIv)
        }
    }

    private fun submitClick() {

        viewBinding.submitBtn.setOnClickListener() {
            mutablelist[0] = viewBinding.urlEt.text.toString()
            Log.e(TAG, "onClick: " + viewBinding.urlEt.text.toString())
            Glide
                .with(this)
                .load(mutablelist[0])
                .into(viewBinding.avatarIv)
        }
    }
}


