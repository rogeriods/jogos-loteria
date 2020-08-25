package br.com.rds.jogosloteria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    // Global variables
    private var jogoSelecionado: String = "MEGA-SENA";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fill spinner
        val spinner: Spinner = findViewById(R.id.spinner)
        // ArrayAdapter using string array
        ArrayAdapter.createFromResource(
            this,
            R.array.games,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Layout to use
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
    }

    // By event "Better approach"
    fun buGerarJogo(view: View) {
        // Fire when it's clicked
        val spinner: Spinner = findViewById(R.id.spinner)
        spinner.onItemSelectedListener = this

        val glj = GLoteriaJogos()
        var jogo: String = ""

        jogo = when (jogoSelecionado) {
            "MEGA-SENA" -> glj.megaSena()
            "DUPLA SENA" -> glj.duplaSena()
            "QUINA" -> glj.quina()
            "LOTOMANIA" -> glj.lotomania()
            "LOTOFÁCIL" -> glj.lotofacil()
            "TIMEMANIA" -> glj.timemania()
            else -> glj.diaDeSorte()
        }

        txtJogos.text = jogo
    }

    // Spinner selected listener
    override fun onNothingSelected(parent: AdapterView<*>?) {
        jogoSelecionado = "MEGA-SENA";
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        jogoSelecionado = parent?.getItemAtPosition(position).toString()
    }

}
