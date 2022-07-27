package chandan.satyendra.prasad.one

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var myname: String? = null

    //Nullability
    // Nullable (?) && Non-null
    // !! vs ?
    private var myJob: String? = null
    private var myAge: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hellotext = findViewById<TextView>(R.id.textView)
        val nametext = findViewById<EditText>(R.id.nameText)
        val agetext = findViewById<EditText>(R.id.ageText)
        val jobtext = findViewById<EditText>(R.id.jobText)
        val restext = findViewById<TextView>(R.id.resultText)
        val restbutton = findViewById<Button>(R.id.button2)




        restbutton?.setOnClickListener {
            myname = nametext.text.toString()
            val myAge_check = agetext.text.toString()

            myJob = jobtext.text.toString()
            if (myname!!.isEmpty())
            {
                println("No value in myname "+ myname)
                Toast.makeText(this, "Kindly provide proper input for name!!", Toast.LENGTH_LONG).show()

            }else if (myAge_check.isEmpty())
            {
                println("No value in myAge_check "+myAge_check)
                Toast.makeText(this, "Kindly provide proper input for age!!", Toast.LENGTH_LONG).show()
            }else if (myJob!!.isEmpty())
            {
                println("No value in  myJob "+myJob)
                Toast.makeText(this, "Kindly provide proper input for job!!", Toast.LENGTH_LONG).show()
            }else
            {
                println("Values "+myname+myAge_check+myJob)
                myAge=myAge_check.toInt()
                restext.setText(" Hi " + myname!!.uppercase() + " your age is " + myAge + " and your profession is " + myJob!!.uppercase())

            }

        }
        test()
        val result = mul(4, 8)

        println(" Muliplication = " + result)
        hellotext.text = " Result = ${result}"
    }



    private fun mul(i: Int, i1: Int): Any {
        val res = i * i1
        return res
    }

    private fun test() {
        println("Not yet implemented")
    }


    fun scopeExample(view: View) {
        val classchandan=Chandan("Chandan",32,"Trainer")
        val alertDialog= AlertDialog.Builder(this)
        alertDialog.setTitle("Alert")
        alertDialog.setIcon(getDrawable(R.mipmap.ic_launcher_round))
        alertDialog.setMessage("Hi "+classchandan.name)
        alertDialog.setCancelable(true)
        alertDialog.show()
    }
}