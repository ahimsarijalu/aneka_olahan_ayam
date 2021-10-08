package com.example.psirecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var ayamAdapter: AyamAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val olahanAyam: Array<String> = resources.getStringArray(R.array.olahan_ayam)
        val deskripsi: Array<String> = resources.getStringArray(R.array.deskripsi)
        val images: IntArray = intArrayOf(R.drawable.ayam_katsu, R.drawable.rolade_ayam, R.drawable.ayam_saus_tiram, R.drawable.ayam_kungpao, R.drawable.ayam_hainan, R.drawable.ayam_rica_rica, R.drawable.ayam_geprek, R.drawable.ayam_suwir_sambal_matah, R.drawable.ayam_teriyaki, R.drawable.ayam_telur_asin, R.drawable.ayam_goreng_mentega, R.drawable.ayam_goreng_krispi, R.drawable.opor_ayam, R.drawable.semur_ayam)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        ayamAdapter = AyamAdapter(olahanAyam, deskripsi, images)

        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = ayamAdapter
    }
}