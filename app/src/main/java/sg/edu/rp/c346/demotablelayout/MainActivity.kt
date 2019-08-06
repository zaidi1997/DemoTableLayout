package sg.edu.rp.c346.demotablelayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick(view: View) {
        var msg = ""
        val btnSelected = view as Button
        when(btnSelected.id){
            button1.id -> msg = "Button 1 is clicked"
            button2.id -> msg = "Button 2 is clicked"
            button3.id -> msg = "Button 3 is clicked"
            button4.id -> msg = "Button 4 is clicked"
            button5.id -> msg = "Button 5 is clicked"
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}
