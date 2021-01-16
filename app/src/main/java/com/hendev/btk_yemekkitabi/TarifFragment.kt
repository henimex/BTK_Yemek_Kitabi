package com.hendev.btk_yemekkitabi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_tarif.*

class TarifFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tarif, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnKaydet.setOnClickListener {
            kaydet(it)
        }

        imgYemek.setOnClickListener {
            gorselSec(it)
        }
    }

    fun kaydet(view: View) {
        Toast.makeText(context, "SQL Kaydetme İşlemi Burda Başlanacak", Toast.LENGTH_LONG).show()
    }

    fun gorselSec(view: View) {

        

    }

}