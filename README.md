# Program PBO — Account dan Customer

## Identitas

| | |
|---|---|
| **Nama** | Hari Fitratullah |
| **NIM** | F1D02510008 |
| **Mata Kuliah** | Pemrograman Berorientasi Objek (PBO) |
| **Tugas** | Account dan Customer |

## Deskripsi

Program ini merupakan implementasi Pemrograman Berorientasi Objek (PBO) menggunakan bahasa pemrograman Java. Program dibuat untuk mengelola data nasabah (*customer*) dan rekening bank (*account*) sederhana.

Program membuat satu objek nasabah, membuat satu rekening dengan saldo awal, menghubungkan rekening tersebut ke nasabah, lalu menjalankan transaksi penyetoran (*deposit*) dan penarikan (*withdraw*) serta menampilkan saldo pada setiap tahap.

## Tujuan Pembelajaran

- Memahami penerapan konsep *class* dan *object* dalam Java.
- Memahami penggunaan *constructor* untuk menginisialisasi objek.
- Memahami hubungan antar class, yaitu seorang nasabah memiliki sebuah rekening.
- Menggunakan method untuk mengakses data dan melakukan transaksi rekening.
- Memahami method yang mengembalikan nilai `boolean` untuk menandai berhasil atau tidaknya transaksi.

## Struktur File

| File | Fungsi |
|------|--------|
| `Account.java` | Class rekening: menyimpan saldo, melakukan deposit dan withdraw, serta menampilkan saldo. |
| `Customer.java` | Class nasabah: menyimpan nama depan dan nama belakang, serta rekening milik nasabah. |
| `AccountCustomerDemo.java` | Class utama (berisi `main`) untuk menjalankan program dan menampilkan hasilnya. |
| `BankAccount.java` | Class pendukung latihan rekening bank. |
| `BankAccountArrayBeraksi.java` | Class pendukung latihan penggunaan array pada rekening bank. |
| `HasilOutput.png` | Screenshot hasil output program di VS Code. |

## Konsep PBO yang Digunakan

### 1. Class dan Object
Program memiliki class `Account` dan `Customer`. Object dibuat dari kedua class tersebut di `AccountCustomerDemo` untuk merepresentasikan rekening dan nasabah.

### 2. Constructor
Constructor digunakan untuk memberikan nilai awal pada objek:
- `new Customer("Hari", "Fitra")` membuat nasabah dengan nama depan dan nama belakang.
- `new Account(100000)` membuat rekening dengan saldo awal 100000.

### 3. Hubungan Antar Class
Rekening dihubungkan ke nasabah melalui method `setAccount()`:

```java
cust.setAccount(acc);
```

Dengan begitu, objek `Customer` memiliki objek `Account`.

### 4. Method Transaksi
- `deposit()` menambah saldo rekening.
- `withdraw()` mengurangi saldo dan mengembalikan nilai `boolean`: `true` jika penarikan berhasil, `false` jika gagal.

## Alur Kerja Program

Program dijalankan melalui method `main()` pada class `AccountCustomerDemo`:

1. Membuat objek `Customer` dengan nama depan "Hari" dan nama belakang "Fitra".
2. Membuat objek `Account` dengan saldo awal 100000.
3. Menghubungkan rekening ke nasabah dengan `setAccount()`.
4. Menampilkan nama nasabah dan saldo awal.
5. Melakukan deposit sebesar 50000, lalu menampilkan saldo.
6. Melakukan withdraw sebesar 30000, lalu menampilkan status keberhasilannya.
7. Menampilkan saldo akhir.

## Hasil Program

Keluaran program:

```
Nama: Hari Fitra
Saldo awal: 100000.0
Setelah deposit 50000: 150000.0
Withdraw 30000 berhasil? true
Saldo akhir: 120000.0
```

Perhitungan saldo:

| Tahap | Perhitungan | Saldo |
|-------|-------------|-------|
| Saldo awal | - | 100000.0 |
| Setelah deposit 50000 | 100000 + 50000 | 150000.0 |
| Setelah withdraw 30000 | 150000 - 30000 | 120000.0 |

Penarikan 30000 berhasil (`true`) karena saldo saat itu (150000) mencukupi.

## Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terpasang.

1. Simpan semua file Java dalam satu folder.
2. Buka terminal atau Command Prompt pada folder tersebut.
3. Kompilasi seluruh file:

```
javac *.java
```

4. Jalankan program:

```
java AccountCustomerDemo
```

## Kesimpulan

Program ini menunjukkan penerapan dasar Pemrograman Berorientasi Objek menggunakan Java. Melalui class `Account` dan `Customer`, data rekening dan nasabah dikelola dengan constructor dan method. Program memperlihatkan proses deposit, penarikan yang mengembalikan status `boolean`, serta hubungan antara nasabah dan rekening miliknya.
