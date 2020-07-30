package com.example.compiler

import android.os.Bundle
import android.text.Editable
import android.text.SpannableStringBuilder
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.MultiAutoCompleteTextView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.antlr.v4.runtime.CharStreams
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    /**
     *
     */
    lateinit var file: File
    lateinit var writer: FileWriter
    lateinit var reader: FileReader

    /**
     *
     */

    lateinit var rowNum: TextView

    lateinit var result: TextView
    lateinit var input: MultiAutoCompleteTextView

    lateinit var visitor: MyVisitor


    /**
     *
     */

    lateinit var runButton: Button
    lateinit var stopButton: Button
    lateinit var outputButton: Button

    /**
     *
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        visitor = MyVisitor()
        findId()
        file = File(filesDir, "compiler.txt")
        writer = FileWriter(file)
        reader = FileReader(file)
    }


    private fun findId() {
        val adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, suggest)
        input = findViewById(R.id.input)
        input.setTokenizer(CommaTokenizer())
        input.setAdapter(adapter)
        input.addTextChangedListener(textChangeListener)

        outputButton = findViewById(R.id.btno)
        outputButton.setOnClickListener(outputButtonClickListener)


        rowNum = findViewById(R.id.rownum)
        result = findViewById(R.id.resault)

        runButton = findViewById(R.id.btnr)
        runButton.setOnClickListener(runButtonClickListener)
        stopButton = findViewById(R.id.btns)
        stopButton.setOnClickListener(stopButtonClickListener)


    }

    /**
     * bind line counter with user input
     */

    private val textChangeListener =
        object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val lines = input.lineCount
                var lineCounts = ""
                for (num in 1..lines) {
                    lineCounts = lineCounts + num + "\n"
                }
                rowNum.text = lineCounts
            }


        }

    /**
     * clear and hide key board
     */

    private val stopButtonClickListener =
        View.OnClickListener { view ->
            val button: Button = view as Button
            input.setText("")
            result.text = ""
            hideKeyboard(button, this@MainActivity)
        }

    /**
     *
     */

    private val runButtonClickListener =
        View.OnClickListener {
            val button: Button = it as Button
            val data = visitor.runVisitor(CharStreams.fromString(input.text.toString()))
            val string = StringBuilder()
            val tx = data[0]
            val px = data[1]
            val rl = data[2]

            tx.forEach {
                string.append(it)
            }

            result.text = string.toString()

            reader.close()
            hideKeyboard(button, this@MainActivity)
        }

    /**
     * write the output compiled text to text view !!!
     */

    private val outputButtonClickListener =
        View.OnClickListener {
            val lines = reader.readLines()
            reader.close()
            Log.e("lines", lines.toString())
            val string = String()
            lines.forEach {
                string.plus(it)
            }
            result.text = SpannableStringBuilder(string)

        }
}
