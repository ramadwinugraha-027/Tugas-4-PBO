# Laporan Praktikum 4 - Inheritance, Generalization & Overriding

Repositori ini berisi laporan dan source code Praktikum 4 mata kuliah Pemrograman Berorientasi Objek (PBO) Program Studi D3 Teknik Informatika, Politeknik Negeri Bandung.

## Identitas

* **Nama**: Rama Dwi Nugraha
* **NIM**: 251511027
* **Kelas**: D3-1A
* **Mata Kuliah**: Pemrograman Berorientasi Objek
* **Tahun**: 2026

## Topik Praktikum

1. Inheritance dan `extends`
2. Constructor chain dan `super(...)`
3. Inherited method dan overriding
4. Anotasi `@Override`
5. Penggunaan `super.method(...)`
6. Encapsulation pada hierarchy class
7. Refactoring kasus tugas sebelumnya (Inventaris Barang)

## Struktur Folder

```text
NIM_Nama_PBO4/
├── Laporan_PBO4.pdf
├── README.md
└── source/
    ├── Circle.java
    ├── Cylinder.java
    ├── TestCylinder.java
    ├── Shape.java
    ├── Rectangle.java
    ├── Square.java
    ├── TestShape.java
    └── kasus-sebelumnya/
        ├── model/
        │   ├── Barang.java
        │   ├── BarangElektronik.java
        │   ├── BarangNonElektronik.java
        │   ├── Lokasi.java
        │   └── PencatatanInventaris.java
        └── app/
            └── Main.java
```

## Isi Laporan

* **BAB I** Pendahuluan
* **BAB II** Praktikum I - Circle dan Cylinder
* **BAB III** Praktikum II - Shape, Circle, Rectangle, dan Square
* **BAB IV** Refactoring Kasus Tugas Sebelumnya (Inventaris Barang)
* **BAB V** Pengujian T4-01 sampai T4-07
* **BAB VI** Refleksi
* **BAB VII** Self Assessment
* **BAB VIII** Kesimpulan
* **Lampiran** Source code lengkap

## Kasus Tugas Sebelumnya

Kasus yang digunakan pada refactoring adalah **sistem pencatatan inventaris barang**.

Struktur class setelah refactor:

```text
Barang
├── BarangElektronik
└── BarangNonElektronik
```

* `Barang` menyimpan data umum: `kodeBarang`, `namaBarang`, dan `kondisi`.
* `BarangElektronik` menambahkan atribut `garansiBulan`.
* `BarangNonElektronik` menambahkan atribut `bahan`.

## Cara Menjalankan Program

1. Pastikan JDK sudah terpasang.
2. Buka terminal pada folder project.
3. Compile source code sesuai folder dan package yang digunakan.
4. Jalankan class utama sesuai bagian praktikum.

Class yang digunakan:

* `TestCylinder` untuk Praktikum I
* `TestShape` untuk Praktikum II
* `app.Main` untuk kasus Inventaris Barang

Contoh perintah:

```bash
javac source/*.java
java -cp source TestCylinder
java -cp source TestShape
java -cp source app.Main
```

> Catatan: Perintah compile dan run dapat disesuaikan dengan struktur package pada source code.

## Catatan

* Seluruh source code pada repositori ini merupakan hasil praktikum.
* Bukti output dan error eksperimen disertakan pada laporan PDF.
* Laporan disusun berdasarkan Modul Praktikum 4 PBO Politeknik Negeri Bandung.
