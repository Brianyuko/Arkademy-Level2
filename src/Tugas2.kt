fun main(args: Array<String>) {
    /*
    *Tulis semua jawaban dengan menggunakan comment Kotlin!
    *
    *Soal 1
    *1. Jelaskan masing-masing apa itu Activity, Fragment, Intent pada android?
    *
    *Satu Activity biasanya berfokus pada hal yang bisa dilakukan oleh pengguna.
    * *Hampir semua activity pasti ada interaksi dengan pengguna.
    *
    *Fragment, mewakili bagian dari UI pengguna dalam FragmentActivity. Kita bisa
    *mengombinasikan beberapa fragmen dalam satu aktivitas dan menggunakan kembali
    *sebuah fragmen dalam beberapa aktivitas. lifecycle fragmen dipengaruhi oleh
    *lifecycle activity host-nya.
    *
    *Intent adalah sebuah abstrak deskripsi dari sebuah operasi yang akan di
    *jalankan. Intent mem-binding antara code di aplikasi/aktivitas yang berbeda.
    *
    *Soal 2
    *2. Jelaskan secara singkat lifecycle (siklus hidup) dari activity pada android?
    *
    *Setiap activity memiliki lifecycle, sebuah activity memiliki 4 status:
    *1. Running
    *2. Paused
    *3. Stopped
    *4. Killed ( finish() )
    *
    *Sebelum memasuki masing masing status, kita harus memanggil dengan method
    *dibawah ini:
    *1. onCreate()
    *2. onStart()
    *3. onResume()
    *4. onPause()
    *5. onStop()
    *6. onRestart()
    *7. onDestroy()
    *
    *Soal 3
    *3. Jelaskan masing-masing apa itu LinearLayout, RelativeLayout, dan Constraint Layout pada Android?
    *
    *LinearLayout merupakan sekelompok tampilan yang menyejajarkan semua anak dalam
    *satu arah, secara vertikal atau horizontal. Kata Kunci Orientation
    *
    *RelativeLayout merupakan grup tampilan yang menampilkan tampilan turunan di
    *posisi relatif. Posisi setiap tampilan dapat ditentukan sebagai posisi relatif
    *terhadap elemen yang setara atau di posisi relatif terhadap RelativeLayout
    *induknya. Kata Kunci relatif terhadap elemen lain
    *
    *ConstraintLayout, merupakan tata letak yang kompleks dan besar dengan hierarki
    *tampilan datar (tidak ada kelompok tampilan bertingkat). ConstraintLayout
    *mirip dengan RelativeLayout yang semua tampilannya diletakkan sesuai dengan
    *hubungan antara tampilan yang setara dan tata letak induk, tetapi lebih fleksibel dari RelativeLayout
    * dan lebih mudah digunakan dengan Layout Editor Android Studio
    *Kata Kunci Constraint terhadap elemen lain, minimal punya 1 batasan vertikal *dan horizontal
    **/
}