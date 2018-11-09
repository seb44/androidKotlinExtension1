package fr.sebastienlaunay.kotlinextension1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        afficher.setOnClickListener {
            menu.showWithSlideBottomAnimation()
            afficher.visibility = View.GONE
            cacher.visibility = View.VISIBLE
        }

        cacher.setOnClickListener {
            menu.hideWithSlideBottomAnimation()
            afficher.visibility = View.VISIBLE
            cacher.visibility = View.GONE
        }
    }
}
