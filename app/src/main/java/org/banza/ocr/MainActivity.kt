package org.banza.ocr

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rgMode = findViewById<RadioGroup>(R.id.rgMode)
        val btnScanProf = findViewById<Button>(R.id.btnScanProf)
        val btnScanEleve = findViewById<Button>(R.id.btnScanEleve)
        val btnValider = findViewById<Button>(R.id.btnValider)

        btnScanProf.setOnClickListener {
            startActivity(Intent(this, ScannerActivity::class.java))
        }

        btnScanEleve.setOnClickListener {
            startActivity(Intent(this, ScannerActivity::class.java))
        }

        btnValider.setOnClickListener {
            startActivity(Intent(this, VerifyWorksActivity::class.java))
        }
    }
}
