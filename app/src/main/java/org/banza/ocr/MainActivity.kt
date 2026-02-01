package org.banza.ocr

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Modes
        val rgMode = findViewById<RadioGroup>(R.id.rgMode)

        // Boutons
        val btnScanProf = findViewById<Button>(R.id.btnScanProf)
        val btnScanEleve = findViewById<Button>(R.id.btnScanEleve)
        val btnScanNote = findViewById<Button>(R.id.btnScanNote)
        val btnValider = findViewById<Button>(R.id.btnValider)
        val btnGrille = findViewById<Button>(R.id.btnGrille)
        val btnHistorique = findViewById<Button>(R.id.btnHistorique)
        val btnExport = findViewById<Button>(R.id.btnExport)
        val btnSync = findViewById<Button>(R.id.btnSync)

        // Champs texte
        val etNom = findViewById<EditText>(R.id.etNom)
        val etClasse = findViewById<EditText>(R.id.etClasse)
        val etMatiere = findViewById<EditText>(R.id.etMatiere)
        val etNote = findViewById<EditText>(R.id.etNote)

        // Actions simples (test UI)
        btnScanProf.setOnClickListener {
            toast("Scan copie professeur")
        }

        btnScanEleve.setOnClickListener {
            toast("Scan copie élève")
        }

        btnScanNote.setOnClickListener {
            toast("Scan note manuelle")
        }

        btnValider.setOnClickListener {
            val nom = etNom.text.toString()
            toast("Enregistré pour $nom")
        }

        btnGrille.setOnClickListener {
            toast("Ouverture grille des notes")
        }

        btnHistorique.setOnClickListener {
            toast("Historique")
        }

        btnExport.setOnClickListener {
            toast("Export en cours")
        }

        btnSync.setOnClickListener {
            toast("Synchronisation")
        }
    }

    private fun toast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
