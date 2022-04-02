package org.d3if2009.asesment1pyramidvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.d3if2009.asesment1pyramidvolume.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)
    }

    private fun onClick(v: MainActivity) {

    }

    override fun onClick(v: View?) {
        if (v != null) {
            if (v.id == R.id.button_calculate) {
                val MasukanPanjang = binding.editPanjang.text.toString().trim()
                val MasukanLebar = binding.editLebar.text.toString().trim()
                val MasukanTinggi = binding.editTinggi.text.toString().trim()

                var KolomKosong = false
                if (MasukanPanjang.isEmpty()) {
                    KolomKosong = true
                    binding.editPanjang.error = "Kolom ini tidak boleh kosong"
                }
                if (MasukanLebar.isEmpty()) {
                    KolomKosong = true
                    binding.editLebar.error = "Kolom ini tidak boleh kosong"
                }
                if (MasukanTinggi.isEmpty()) {
                    KolomKosong = true
                    binding.editTinggi.error = "Kolom ini tidak boleh kosong"
                }
                if (!KolomKosong) {
                    val VolumeLimas =
                        (MasukanPanjang.toDouble() * MasukanLebar.toDouble() * MasukanTinggi.toDouble()) / 3
                    binding.TextResault.text = VolumeLimas.toString()
                }
            }
        }
    }

}