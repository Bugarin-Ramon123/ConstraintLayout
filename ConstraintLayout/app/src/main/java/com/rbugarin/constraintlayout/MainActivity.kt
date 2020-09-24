package com.rbugarin.constraintlayout

import android.animation.AnimatorSet
import android.animation.ValueAnimator
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //marte
        val mars = findViewById<ImageView>(R.id.marte)
        val animator =ValueAnimator.ofInt(0, 359)
        animator.addUpdateListener{ value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = mars.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            mars.layoutParams = layoutParams
        }
        //tierra
        val earth = findViewById<ImageView>(R.id.tierra)
        animator.addUpdateListener{ value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = earth.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            earth.layoutParams = layoutParams
        }
        //mercurio
        val mercury = findViewById<ImageView>(R.id.mercurio)
        animator.addUpdateListener{ value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = mercury.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            mercury.layoutParams = layoutParams
        }
        //venus
        val venus = findViewById<ImageView>(R.id.venus)
        animator.addUpdateListener{ value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = venus.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            venus.layoutParams = layoutParams
        }
        //jupiter
        val jupiter = findViewById<ImageView>(R.id.jupiter)
        animator.addUpdateListener{ value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = jupiter.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            jupiter.layoutParams = layoutParams
        }
        //saturno
        val saturn = findViewById<ImageView>(R.id.saturno)
        animator.addUpdateListener{ value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = saturn.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            saturn.layoutParams = layoutParams
        }
        //urano
        val uranus = findViewById<ImageView>(R.id.urano)
        animator.addUpdateListener{ value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = urano.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            uranus.layoutParams = layoutParams
        }
        //neptuno
        val neptune = findViewById<ImageView>(R.id.neptuno)
        animator.addUpdateListener{ value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = neptune.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            neptune.layoutParams = layoutParams
        }
        //todos
        animator.repeatMode = ValueAnimator.RESTART
        animator.repeatCount = ValueAnimator.INFINITE
        animator.interpolator = LinearInterpolator()
        animator.duration = 3000
        
        animator.start()
    }
}