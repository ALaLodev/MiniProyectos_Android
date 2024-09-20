package com.alalodev.androidDesde0

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.alalodev.androidDesde0.firstapp.FirstAppActivity
import com.alalodev.androidDesde0.imccalculator.imcCalculatorActivity
import com.alalodev.androidDesde0.superheroapp.SuperHeroListActivity
import com.alalodev.androidDesde0.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODOApp = findViewById<Button>(R.id.btnTODOApp)
        val btnSuperHeroApp = findViewById<Button>(R.id.btnSuperHeroApp)

        btnSaludApp.setOnClickListener{ navigateToSaludApp() }
        btnIMCApp.setOnClickListener{ navigateToIMCApp() }
        btnTODOApp.setOnClickListener { navigateToTODOApp() }
        btnSuperHeroApp.setOnClickListener { navigateToSuperHeroApp() }
    }
    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToIMCApp() {
        val intent = Intent(this, imcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTODOApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToSuperHeroApp() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

}