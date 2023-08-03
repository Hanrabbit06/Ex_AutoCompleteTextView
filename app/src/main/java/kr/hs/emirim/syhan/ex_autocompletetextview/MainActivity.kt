package kr.hs.emirim.syhan.ex_autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.MultiAutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var items = arrayOf("novel-전독시","novel-데못죽","novel-화산귀환","Friends","Fringe","Lost","Lost forest")

        var autoText = findViewById<AutoCompleteTextView>(R.id.autoText)
        var multiText = findViewById<MultiAutoCompleteTextView>(R.id.multiautoText)

        var adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items)
        autoText.setAdapter(adapter)

        var token = MultiAutoCompleteTextView.CommaTokenizer()
        multiText.setTokenizer(token)
        multiText.setAdapter(adapter)

    }
}