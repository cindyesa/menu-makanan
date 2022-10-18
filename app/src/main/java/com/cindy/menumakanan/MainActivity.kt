package com.cindy.menumakanan

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuMakanan = arrayOf(
            "Ayam Goreng",
            "Ayam Bakar",
            "Perkedel",
            "Sop Daging",
            "Oseng Mandai",
            "Kroket Jamur",
            "Schotel Mie Keju",
            "Tahu Rambutan",
            "Mie Kuah Kimchi",
            "Bola Ikan Tenggiri",
            "Steak Tempe"
        )

        val hargaMakanan = arrayOf(
            "25.000",
            "30.000",
            "5.000",
            "20.000",
            "15.000",
            "20.000",
            "10.000",
            "35.000",
            "10.000",
            "28.000",
            "20.000",
            "70.000",
        )
        val menuImage = intArrayOf(
            R.drawable.ayam_goreng,
            R.drawable.ayam_bakar,
            R.drawable.perkedel,
            R.drawable.sop_daging,
            R.drawable.oseng_mandai_pedas,
            R.drawable.kroket_jamur,
            R.drawable.schotel_mie_keju,
            R.drawable.tahu_rambutan,
            R.drawable.mie_kuah_kimchi,
            R.drawable.bola_ikan_tengiri,
            R.drawable.steak_tempe
        )
        val menuDeskripsi = arrayOf(
            "Ayam yang di goreng dengan menggunakan bumbu spesial",
            "Ayam bakar dengan balutan olesan kecap sedap",
            "Perkedel, ternyata tidak hanya berbahan kentang saja. Ada juga perkedel tempe yang memiliki sensasi yang berbeda. Yuk, cobain perkedel tempe dengan isi telur di dalamnya. Dijamin, Endeus.",
            "Sop Daging Bening ini terasa endeus dengan penggunaan bumbu-bumbu rempah di dalamnya, seperti kapula, cengkeh, hingga pala. Tertarik untuk membuatnya di rumah? Cek resepya di bawah ini!\n",
            "Mandai merupakan sebutan warga Banjar bagi kulit buah cempedak. Sebelum diolah, kulit cempedak difermentasi terlebih dahulu selama beberapa hari dalam air garam. Namun ada pula yang mengolah kulit cempedak dalam keadaan segar tanpa fermentasi. Biasanya kulit cempedak ini kemudian dimasak dengan cara ditumis dengan bumbu bercita rasa pedas manis. Penasaran dengan rasanya? Yuk, simak segera resepnya berikut ini.",
            "Kroket Jamur Keju dapat jadi inspirasi untuk menu camilan Endeusiast di rumah. Rasa gurihnya endeus banget!\n",
            "Hidangan sepinggan praktis yang nikmat disantap bersama keluarga saat akhir pekan. Schotel mie merupakan hidangan sepinggan kaya rasa dengan campuran sayur, sosis, keju,dan telur yang gurih dan lezat.",
            "Tahu Rambutan Isi Telur Puyuh bisa jadi sajian yang menarik dan lezat untuk camilan. Bahannya mudah didapat dan rasanya lezat. Jangan khawatir, walaupun tanpa daging, rasanya pasti Endeus.",
            "Semangkuk Mie Kuah Kimchi yang hangat dan sedikit pedas sangat cocok disantap sebagai menu sarapan yang penuh semangat di pagi hari. Aroma asam pedas kimchi dengan kuah kaldu sapi gurih berbumbu gochujang dengan cita rasa khasnya yang lezat.",
            "Bola Ikan Tenggiri dengan tekstur lembut kenyal dan cita rasa gurih yang praktis dan mudah dibuat. Hidangan lezat kaya protein ini sangat cocok untuk bekal anak sekolah.",
            "Steak dari Tempe kukus yang dicampur dengan bumbu seperti steak daging, lalu dibakar. Disiram dengan saus lada hitam yang menggugah selera. Pelengkapnya dengan potato wedges, buncis, wortel, dan jagung manis pipil."
        )

        val recyclerView = findViewById<RecyclerView>(R.id.myRecycler)
        val ad = Adapter(menuMakanan, hargaMakanan, menuImage, menuDeskripsi)
        recyclerView.adapter = ad
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}