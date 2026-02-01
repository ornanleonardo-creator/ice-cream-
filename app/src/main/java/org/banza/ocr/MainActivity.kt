package org.banza.ocr

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.TextView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "OCR Scanner - Étape 2 OK ✅"
        text.textSize = 22f

        setContentView(text)
    }
}
