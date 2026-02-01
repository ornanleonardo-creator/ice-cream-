package org.banza.ocr

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

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
            toast("Scan copie de référence (Prof)")
        }

        btnScanEleve.setOnClickListener {
            toast("Scan copies élèves (arrière-plan)")
        }

        btnScanNote.setOnClickListener {
            toast("Scan notes manuelles")
        }

        btnValider.setOnClickListener {
            toast("Correction lancée")
        }

        btnGrille.setOnClickListener {
            toast("Affichage de la grille")
        }

        btnHistorique.setOnClickListener {
            toast("Historique ouvert")
        }

        btnExport.setOnClickListener {
            toast("Exportation en cours")
        }

        btnSync.setOnClickListener {
            toast("Synchronisation en ligne")
        }
    }

    private fun toast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
