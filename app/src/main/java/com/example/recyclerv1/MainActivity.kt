package com.example.recyclerv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerv1.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"Auron play - Amongos\", \"channel\": \"AuronPlay\", \"views\": \"600k views\", \"datePosted\": \"5 days ago\", \"duration\": \"15:00min\"}"),
            JSONObject("{\"title\": \"Dross- Canitas\", \"channel\": \"DROSS\", \"views\": \"800k views\", \"datePosted\": \"1 month ago\", \"duration\": \"12:00min\"}"),
            JSONObject("{\"title\": \"Gucci - el chgico gucci\", \"channel\": \"Gucci\", \"views\": \"10k views\", \"datePosted\": \"21 days ago\", \"duration\": \"05:25\"}"),
            JSONObject("{\"title\": \"La ruta de la Garnacha - COME SANO\", \"channel\": \"La Ruta Garnachera\", \"views\": \"150k views\", \"datePosted\": \"A month ago\", \"duration\": \"05:02\"}"),
            JSONObject("{\"title\": \"Mikohel -  tenog tu love cover\", \"channel\": \"Mikohel\", \"views\": \"254k views\", \"datePosted\": \"2 years ago\", \"duration\": \"05:00\"}")

        )

        binding.rvVideo.adapter= MainAdapter(fakeVideoData)
    }
}