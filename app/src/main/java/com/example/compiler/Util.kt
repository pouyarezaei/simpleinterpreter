package com.example.compiler

import android.content.Context
import android.text.SpannableString
import android.text.Spanned
import android.text.TextUtils
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.MultiAutoCompleteTextView.Tokenizer

val suggest = arrayOf(
    "if"
    , "then"
    , "else"
    , "for"
    , "loop"
    , "<="
    , ">="
    , "=="
    , "!="
    , "print"
    , "println"
    , "begin"
    , "end"
    , "while"
    , "do"
    , "="
    , ":"
    , ";"
    , "odd"
    , "put"
    , "even"
    , "map.size"
    , "map.get"
    , "map.put"
    , "array"
    , "array.size"
    , "array.get"
    , "array.put"

)

fun hideKeyboard(view: View, context: Context) {
    try {
        val inputManager =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(view.windowToken, 0);
    } catch (ignored: Exception) {

    }
}


class CommaTokenizer : Tokenizer {
    override fun findTokenStart(text: CharSequence, cursor: Int): Int {
        var i = cursor
        while (i > 0 && text[i - 1] != ' ') {
            i--
        }
        while (i < cursor && text[i] == '\n') {
            i++
        }
        return i
    }

    override fun findTokenEnd(text: CharSequence, cursor: Int): Int {
        var i = cursor
        val len = text.length
        while (i < len) {
            if (text[i] == '\n') {
                return i
            } else {
                i++
            }
        }
        return len
    }

    override fun terminateToken(text: CharSequence): CharSequence {
        var i = text.length
        while (i > 0 && text[i - 1] == ' ') {
            i--
        }
        return if (i > 0 && text[i - 1] == ' ') {
            text
        } else {
            if (text is Spanned) {
                val sp = SpannableString(
                    """
                        $text
                        
                        """.trimIndent()
                )
                TextUtils.copySpansFrom(
                    text, 0, text.length,
                    Any::class.java, sp, 0
                )
                sp
            } else {
                "$text "
            }
        }
    }
}
