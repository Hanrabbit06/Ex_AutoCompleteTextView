package kr.hs.emirim.syhan.ex_autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var items = arrayOf("소설-전독시","소설-데못죽","소설-화산귀환","Friends","Fringe","Lost","Lost forast")

    }
}