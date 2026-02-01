package org.banza.ocr

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnGoScanner = findViewById<Button>(R.id.btnGoScanner)
        val btnGoVerify = findViewById<Button>(R.id.btnGoVerify)

        btnGoScanner.setOnClickListener {
            startActivity(Intent(this, ScannerActivity::class.java))
        }

        btnGoVerify.setOnClickListener {
            startActivity(Intent(this, VerifyWorksActivity::class.java))
        }
    }
}
