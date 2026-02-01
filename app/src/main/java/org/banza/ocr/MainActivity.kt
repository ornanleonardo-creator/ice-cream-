package org.banza.ocr

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.view.PreviewView

class MainActivity : AppCompatActivity() {

    private lateinit var previewView: PreviewView
    private lateinit var resultText: TextView
    private lateinit var btnScan: Button
    private lateinit var btnOk: Button
    private lateinit var btnVerify: Button
    private lateinit var modeGroup: RadioGroup
    private lateinit var modeAuto: RadioButton
    private lateinit var modeManual: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Liaison XML
        previewView = findViewById(R.id.previewView)
        resultText = findViewById(R.id.resultText)
        btnScan = findViewById(R.id.btnScan)
        btnOk = findViewById(R.id.btnOk)
        btnVerify = findViewById(R.id.btnVerify)
        modeGroup = findViewById(R.id.modeGroup)
        modeAuto = findViewById(R.id.modeAuto)
        modeManual = findViewById(R.id.modeManual)

        // Bouton Scanner
        btnScan.setOnClickListener {
            resultText.text = "📷 Scan en cours..."
            // CameraX / OCR viendra ici
        }

        // Bouton OK
        btnOk.setOnClickListener {
            if (modeAuto.isChecked) {
                resultText.text = "⚙️ Traitement automatique en arrière-plan"
                // Job background (WorkManager plus tard)
            } else {
                resultText.text = "✍️ Mode manuel : vérifier puis confirmer"
            }
        }

        // Bouton Vérifier
        btnVerify.setOnClickListener {
            resultText.text = "🗂️ Ouverture des travaux traités"
            // Future Activity : Historique
        }
    }
}
