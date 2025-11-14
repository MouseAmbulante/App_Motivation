package com.example.appmotivation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var nome = findViewById<TextView>(R.id.text_view_nome)
        var nomeRecuperacao = this.getSharedPreferences("motivacao",MODE_PRIVATE).getString("nome","Olá Kotlin")
        nome.text = nomeRecuperacao

        var novaFrase = findViewById<TextView>(R.id.text_view_frase)
        var botaoFrase = findViewById<Button>(R.id.button_nova_frase)
        var imagemAll = findViewById<ImageView>(R.id.imagem_all)
        var imagemHappy = findViewById<ImageView>(R.id.imagem_emotion)
        var imagemSun = findViewById<ImageView>(R.id.imagem_sunny)

        imagemAll.setOnClickListener {
            imagemAll.setColorFilter(ContextCompat.getColor(this, R.color.white))
            imagemHappy.setColorFilter(ContextCompat.getColor(this, R.color.black))
            imagemSun.setColorFilter(ContextCompat.getColor(this, R.color.black))
            var fraseSorteada = fraseRepository.getFrase(0)
            novaFrase.text = fraseSorteada
        }

        imagemHappy.setOnClickListener {
            imagemHappy.setColorFilter(ContextCompat.getColor(this, R.color.white))
            imagemAll.setColorFilter(ContextCompat.getColor(this, R.color.black))
            imagemSun.setColorFilter(ContextCompat.getColor(this, R.color.black))
            var fraseSorteada = fraseRepository.getFrase(1)
            novaFrase.text = fraseSorteada
        }

        imagemSun.setOnClickListener {
            imagemSun.setColorFilter(ContextCompat.getColor(this, R.color.white))
            imagemAll.setColorFilter(ContextCompat.getColor(this, R.color.black))
            imagemHappy.setColorFilter(ContextCompat.getColor(this, R.color.black))
            var fraseSorteada = fraseRepository.getFrase(2)
            novaFrase.text = fraseSorteada
        }

        botaoFrase.setOnClickListener {
            var fraseSorteada = fraseRepository.getFrase(0)
            novaFrase.text = fraseSorteada
        }

    }
}