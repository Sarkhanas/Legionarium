package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private var list_btn: ImageButton? = null
    private var search_btn: ImageButton? = null
    private var settings_btn: ImageButton? = null
    private var bookmarks_btn: ImageButton? = null
    private var library_btn: ImageButton? = null
    private var arrowDown_btn: ImageButton? = null
    private var arrowBack_btn: ImageButton? = null
    private var plus_btn: ImageButton? = null
    private var minus_btn: ImageButton? = null
    private var font_icon: ImageView? = null
    private var fontSize_icon: ImageView? = null
    private var bold_icon: ImageView? = null
    private var bold_check: CheckBox? = null
    private var font_counter: TextInputLayout? = null
    private var font_counterEditor: TextInputEditText? = null
    private var text: EditText? = null
    private var counter: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrowDown_btn = findViewById(R.id.imageButton)//Visible
        search_btn = findViewById(R.id.imageButton2)//Visible
        settings_btn = findViewById(R.id.imageButton3)//Visible
        bookmarks_btn = findViewById(R.id.imageButton4)//Visible
        list_btn = findViewById(R.id.imageButton5)//Visible
        library_btn = findViewById(R.id.imageButton6)//Visible
        arrowBack_btn = findViewById(R.id.imageButton7)//Invisible
        plus_btn = findViewById(R.id.imageButton9)//Invisible
        minus_btn = findViewById(R.id.imageButton10)//Invisible
        bold_check = findViewById(R.id.checkBox)//Invisible
        font_counter = findViewById(R.id.textInput)//Invisible
        font_counterEditor = findViewById(R.id.textEdit)//Invisible
        text = findViewById(R.id.editTextTextMultiLine)//Visible
        font_icon = findViewById(R.id.imageView2)//Invisible
        fontSize_icon = findViewById(R.id.imageView3)//Invisible
        bold_icon = findViewById(R.id.imageView4)//Invisible

        search_btn?.setOnClickListener{
            Toast.makeText(this, "in developing", Toast.LENGTH_LONG).show()
        }

        arrowDown_btn?.setOnClickListener {
            Toast.makeText(this, "in developing", Toast.LENGTH_LONG).show()
        }

        arrowBack_btn?.setOnClickListener {
            arrowDown_btn?.visibility = View.VISIBLE
            search_btn?.visibility = View.VISIBLE
            settings_btn?.visibility = View.VISIBLE
            bookmarks_btn?.visibility = View.VISIBLE
            list_btn?.visibility = View.VISIBLE
            library_btn?.visibility = View.VISIBLE
            text?.visibility = View.VISIBLE
            arrowBack_btn?.visibility = View.GONE
            plus_btn?.visibility = View.GONE
            minus_btn?.visibility = View.GONE
            bold_check?.visibility = View.GONE
            font_counter?.visibility = View.GONE
            font_icon?.visibility = View.GONE
            fontSize_icon?.visibility = View.GONE
            bold_icon?.visibility = View.GONE
        }

        bookmarks_btn?.setOnClickListener{
            Toast.makeText(this, "in developing", Toast.LENGTH_LONG).show()
        }

        list_btn?.setOnClickListener {
            Toast.makeText(this, "in developing", Toast.LENGTH_LONG).show()
        }

        settings_btn?.setOnClickListener {
            arrowDown_btn?.visibility = View.GONE
            search_btn?.visibility = View.GONE
            settings_btn?.visibility = View.GONE
            bookmarks_btn?.visibility = View.GONE
            list_btn?.visibility = View.GONE
            library_btn?.visibility = View.GONE
            text?.visibility = View.GONE
            arrowBack_btn?.visibility = View.VISIBLE
            plus_btn?.visibility = View.VISIBLE
            minus_btn?.visibility = View.VISIBLE
            bold_check?.visibility = View.VISIBLE
            font_counter?.visibility = View.VISIBLE
            font_icon?.visibility = View.VISIBLE
            fontSize_icon?.visibility = View.VISIBLE
            bold_icon?.visibility = View.VISIBLE

            if (font_counterEditor?.hint?.toString()?.trim()?.equals("")!!)
                font_counterEditor?.hint = "14"
            else
            {
                var font: String = font_counterEditor?.hint.toString()
                counter = font.toInt()
            }
        }

        plus_btn?.setOnClickListener {
            counter?.plus(1)
            font_counterEditor?.hint = counter.toString()
        }
    }
}