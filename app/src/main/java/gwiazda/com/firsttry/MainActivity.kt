package gwiazda.com.firsttry

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view : View){
        //val myToast = Toast.makeText(this,message, duration)
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
//        myToast.show()
        val mapsIntent = Intent(this, MapsActivity::class.java)
        startActivity(mapsIntent)
    }

    fun countMe(view: View){
        //Get the text view
//        val showCountTextView = findViewById<TextView>(R.id.textView)

        //Get the value of text
//        val countString = showCountTextView.text.toString()
        val countString = textView.text.toString()

        //Convert value to the number
        var count: Int = Integer.parseInt(countString)
        count++

//        showCountTextView.text = count.toString()
        textView.text = count.toString()
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this, SecondActivity::class.java)

        val countString = textView.text.toString()
        val count = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_CONT, count)
        startActivity(randomIntent)
    }

    //create an Intent to start the second activity

}
