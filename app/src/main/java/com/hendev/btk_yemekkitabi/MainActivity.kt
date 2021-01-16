package com.hendev.btk_yemekkitabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.options_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.yemek_ekle){
            val action = ListeFragmentDirections.actionListeFragmentToTarifFragment()
            Navigation.findNavController(this,R.id.fragment).navigate(action)
        }
        if (item.itemId == R.id.hakkinda){
            Toast.makeText(this@MainActivity,"Ferhat OYGUR tarafından hazırlanmıştır",Toast.LENGTH_LONG).show()
        }
        if (item.itemId == R.id.exit){
            System.exit(-1)
        }
        return super.onOptionsItemSelected(item)
    }
}