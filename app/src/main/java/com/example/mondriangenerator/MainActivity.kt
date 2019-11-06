package com.example.mondriangenerator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                box_one_text,
                box_two_text,
                box_three_text,
                box_four_text,
                box_five_text,
                constraint_layout,
                button_red,
                button_green,
                button_amber
            )

        for (item in clickableViews) {
            item.setOnClickListener {
                makeColored(it)
            }
        }
    }

    private fun makeColored(view: View) {
        // One click handler when the type of function is the same
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_blue_dark)

            R.id.button_red -> box_three_text.setBackgroundResource(R.color.red)
            R.id.button_amber -> box_four_text.setBackgroundResource(R.color.amber)
            R.id.button_green -> box_five_text.setBackgroundResource(R.color.green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
