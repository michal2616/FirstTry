package gwiazda.com.firsttry

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_CONT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber(){
        //get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_CONT, 0)

        //generate the random number
        val random = Random()
        var randomInt = 0

        if (count > 0){
            //add one because the boound is exclusive
            randomInt = random.nextInt(count + 1)
        }

        //dispaly the random number
        textview_random.text = Integer.toString(randomInt)

        //substitute the max value into the string resource
        //for the heading and update the heading

        textview_label.text = getString(R.string.random_heading, count)
    }
}
