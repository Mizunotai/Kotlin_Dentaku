package com.example.taiki.kotlin_dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import butterknife.bindView

class MainActivity : AppCompatActivity() {
    //Int
    var number = 0
    var number2 = 0
    var answer = 0
    var count = 0
    //
    //Button
    val one : Button by bindView(R.id.button)
    val two : Button by bindView(R.id.button2)
    val three : Button by bindView(R.id.button3)
    val four : Button by bindView(R.id.button4)
    val five : Button by bindView(R.id.button5)
    val six : Button by bindView(R.id.button6)
    val seven : Button by bindView(R.id.button7)
    val eight : Button by bindView(R.id.button8)
    val nine : Button by bindView(R.id.button9)
    val zero : Button by bindView(R.id.button10)
    val plus : Button by bindView(R.id.button11)
    val equal : Button by bindView(R.id.button12)

    //
    //TextView
    val text : TextView by bindView(R.id.textView)
    val text2 : TextView by bindView(R.id.textView3)
    val text3 : TextView by bindView(R.id.textView5)
    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener {
            if(count==0){
              number=number*10+1
                text.setText(Integer.toString(number))
            }else{
              number2=number2*10+1
                text2.setText(Integer.toString(number2))
            }
        }
        two.setOnClickListener {
            if(count==0){
                number=number*10+2
                text.setText(Integer.toString(number))
            }else{
                number2=number2*10+2
                text2.setText(Integer.toString(number2))
            }
        }
        three.setOnClickListener {
            if(count==0){
                number=number*10+3
                text.setText(Integer.toString(number))
            }else{
                number2=number2*10+3
                text2.setText(Integer.toString(number2))
            }
        }
        four.setOnClickListener {
            if(count==0){
                number=number*10+4
                text.setText(Integer.toString(number))
            }else{
                number2=number2*10+4
                text2.setText(Integer.toString(number2))
            }
        }
        five.setOnClickListener {
            if(count==0){
                number=number*10+5
                text.setText(Integer.toString(number))
            }else{
                number2=number2*10+5
                text2.setText(Integer.toString(number2))
            }
        }
        six.setOnClickListener {
            if(count==0){
                number=number*10+6
                text.setText(Integer.toString(number))
            }else{
                number2=number2*10+6
                text2.setText(Integer.toString(number2))
            }
        }
        seven.setOnClickListener {
            if(count==0){
                number=number*10+7
                text.setText(Integer.toString(number))
            }else{
                number2=number2*10+7
                text2.setText(Integer.toString(number2))
            }
        }
        eight.setOnClickListener {
            if(count==0){
                number=number*10+8
                text.setText(Integer.toString(number))
            }else{
                number2=number2*10+8
                text2.setText(Integer.toString(number2))
            }
        }
        nine.setOnClickListener {
            if(count==0){
                number=number*10+9
                text.setText(Integer.toString(number))
            }else{
                number2=number2*10+9
                text2.setText(Integer.toString(number2))
            }
        }
        zero.setOnClickListener {
            if(count==0){
                number=number*10
                text.setText(Integer.toString(number))
            }else{
                number2=number2*10
                text2.setText(Integer.toString(number2))
            }
        }
        plus.setOnClickListener {
            if(number>0){
                count=1
            }
        }
        equal.setOnClickListener {
          answer=number+number2
            text3.setText(Integer.toString(answer))
        }
    }

}
