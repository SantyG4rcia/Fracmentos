package com.app1.fracmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun llamartarea(view: View) {
        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .add(R.id.fragcontainer, tareafrackment::class.java,null, "tarea")
            .commit()
    }
}
