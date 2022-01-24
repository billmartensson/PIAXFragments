package se.magictechnology.piaxfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction().add(R.id.fragContainer, StartFragment()).commit()




        val fragcont = findViewById<FragmentContainerView>(R.id.fragContainer)


        findViewById<Button>(R.id.goOneButton).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragContainer, StartFragment()).commit()

        }

        findViewById<Button>(R.id.goTwoButton).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragContainer, SecondFragment()).commit()

        }

    }
}