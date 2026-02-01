package org.banza.ocr

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rgMode = findViewById<RadioGroup>(R.id.rgMode)
        val btnScanProf = findViewById<Button>(R.id.btnScanProf)
        val btnScanEleve = findViewById<Button>(R.id.btnScanEleve)
        val btnScanNote = findViewById<Button>(R.id.btnScanNote)
        val btnValider = findViewById<Button>(R.id.btnValider)
        val btnGrille = findViewById<Button>(R.id.btnGrille)
        val btnHistorique = findViewById<Button>(R.id.btnHistorique)
        val btnExport = findViewById<Button>(R.id.btnExport)
        val btnSync = findViewById<Button>(R.id.btnSync)

        btnScanProf.setOnClickListener {
            Toast.makeText(this, "Scan Prof", Toast.LENGTH_SHORT).show()
        }

        btnScanEleve.setOnClickListener {
            Toast.makeText(this, "Scan Élèves", Toast.LENGTH_SHORT).show()
        }

        btnValider.setOnClickListener {
            Toast.makeText(this, "Correction en arrière-plan", Toast.LENGTH_LONG).show()
        }
    }
}
