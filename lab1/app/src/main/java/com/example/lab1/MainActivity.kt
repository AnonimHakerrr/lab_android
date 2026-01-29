package com.example.lab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val randomtext = listOf(
        "Привіт, світ!",
        "Сьогодні чудовий день",
        "Android розробка - це цікаво",
        "Не забудь випити води",
        "Код працює успішно!",
        "Слава Україні!"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        RanTextView()

    }
    @Composable
    fun RanTextView()
    {
        val but: Button = findViewById(R.id.button)
        val text: TextView=findViewById(R.id.ranText)
        but.setOnClickListener {
            val x = randomtext.random()
            text.text =x;
        }

    }
}


