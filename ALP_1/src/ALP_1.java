
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.text.DecimalFormat;
import java.util.*;
import java.text.NumberFormat;

/**
 * @author mds
 */
public class ALP_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        ALP_1 objek = new ALP_1();

        int skala_tinggibadan, umur = 0, gender, menu_utama, jumlah_hari = 0, menu_konsumsi, menu_makanan, menu_minuman, menu_olahraga, menu_olahraga_inputan_sendiri, jumlah_input_makanan = 0, jumlah_input_minuman = 0, jumlah_input_olahraga = 0, pilihan_menu_makanan_sendiri, pilihan_menu_minuman_sendiri, pilihan_menu_olahraga_sendiri, menu_mempertahankan, menu_menargetkan, menu_sarapan, menu_makanan_utama, menu_makanan_ringan, menu_makanan_inputan_sendiri, menu_minuman_lainnya, menu_minuman_inputan_sendiri, count_per_day = 0, menit_olahraga = 0, menit_olahraga_inputan_sendiri_2, menu_masukan_perhari, menu_masukan_perhari_satupersatu, menu_masukan_perhari_satupersatu_konsumsi, menu_masukan_perhari_satupersatu_konsumsi_makanan, menu_masukan_perhari_satupersatu_konsumsi_minuman, menu_masukan_perhari_satupersatu_konsumsi_olahraga, menu_saldo, minimal_hari, count_to_break = 0, count_to_breakbreak = 0, ketentuan_menit_olahraga = 0, menu_pengeluaran_saldo, menu_pengeluaran_saldo_terpisah, index_user = -1, menu_authentication, menu_profil, count_per_day_mempertahankan = 0, count_per_day_menargetkan = 0, minum_air_putih;

        double berat_badan = 0.0, tinggi_badan_cm = 0.0, tinggi_badan = 0.0, BMI = 0.0, berat_badan_tujuan, jarak_berat_badan = 0.0, berat_badan_perhari = 0.0, target_kalori_perhari = 0.0, kalori_sarapan = 0.0, kalori_makanan_utama = 0.0, kalori_makanan_ringan = 0.0, kalori_minuman_lainnya = 0.0, kalori_olahraga = 0.0, target_berat_badan_perhari = 0.0, kalori = 0.0, kalori_makanan_inputan_sendiri_2 = 0.0, kalori_minuman_inputan_sendiri_2 = 0.0, kalori_olahraga_inputan_sendiri_2 = 0.0, kalori_konsumsi = 0.0, total_kalori_perhari = 0.0, kalori_diamdiam = 1320.0, karbohidrat_hilang = 792.0, protein_hilang = 198.0, lemak_hilang = 198.0, vitamin_hilang = 105.6, mineral_hilang = 26.4, total_beratbadan_perhari = 0.0, perubahan_beratbadan = 0.0, perubahan_kalori = 0.0, kalori_makanan_sendiri = 0.0, kalori_minuman_sendiri = 0.0, kalori_olahraga_sendiri = 0.0, BMI_yang_normal, kalori_makanan = 0.0, kalori_minuman = 0.0, kalori_olahraga_lainnya = 0.0, saldo, tambahan_saldo, perubahan_saldo = 0.0, total_harga = 0.0, sisa_saldo = 0.0, kalori_sebelumnya, harga_sarapan = 0.0, harga_makanan_utama = 0.0, harga_makanan_ringan = 0.0, harga_minuman_lainnya = 0.0, karbohidrat = 0.0, protein = 0.0, lemak = 0.0, vitamin = 0.0, mineral = 0.0, total_karbohidrat = 0.0, total_protein = 0.0, total_lemak = 0.0, total_vitamin = 0.0, total_mineral = 0.0, mineral_airputih = 0.0, karbohidrat_sendiri, protein_sendiri, lemak_sendiri, vitamin_sendiri, mineral_sendiri, perubahan_karbohidrat = 0.0, perubahan_protein = 0.0, perubahan_lemak = 0.0, perubahan_vitamin = 0.0, perubahan_mineral = 0.0;

        String nama, input_makanan, input_minuman, input_olahraga, makanan_yangdihapus, minuman_yangdihapus, olahraga_yangdihapus, username_register = null, password_register = null, name = null, username_login = null, password_login = null, new_username, new_password;

        boolean benar, hapus_makanan, hapus_minuman, hapus_olahraga, sudah_ada_isi, logged_status = false, selesai;

        int default_password_length = 1; //set panjang min password 12 Char
        int default_lowercase = 1; //set jumlah min lowercase 2 char
        int default_uppercase = 1; //set jumlah min uppercase 2 char
        int default_number = 1; //set jumlah min number 2 char
        int default_spesial_char = 0; //set jumlah min special char 2 char
        boolean password_valid;
        int length = 0, lowercase = 0, uppercase = 0, number = 0, specialchar = 0;

        ArrayList<String> array_username = new ArrayList<String>();
        ArrayList<String> array_password = new ArrayList<String>();
        ArrayList<String> array_name = new ArrayList<String>();
        ArrayList<Integer> umur_tersimpan = new ArrayList<Integer>();
        ArrayList<Integer> gender_tersimpan = new ArrayList<Integer>();
        ArrayList<String> nama_tersimpan = new ArrayList<String>();
        ArrayList<Double> tinggi_badan_tersimpan = new ArrayList<Double>();
        ArrayList<Double> tinggi_badan_cm_tersimpan = new ArrayList<Double>();
        ArrayList<String> username = new ArrayList<String>();
        ArrayList<String> passwords = new ArrayList<String>();
        //===================================================================================
        ArrayList<String> menu_makanan_sendiri = new ArrayList<String>();
        ArrayList<String> menu_minuman_sendiri = new ArrayList<String>();
        ArrayList<String> menu_olahraga_sendiri = new ArrayList<String>();
        ArrayList<Double> kalori_yangada = new ArrayList<Double>();
        ArrayList<Double> karbohidrat_yangada = new ArrayList<Double>();
        ArrayList<Double> protein_yangada = new ArrayList<Double>();
        ArrayList<Double> lemak_yangada = new ArrayList<Double>();
        ArrayList<Double> vitamin_yangada = new ArrayList<Double>();
        ArrayList<Double> mineral_yangada = new ArrayList<Double>();

        ArrayList<Double> kalori_perhari_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_makanan_inputan_sendiri = new ArrayList<Double>();
        ArrayList<Double> kalori_makanan_sarapan_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_makanan_makananutama_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_makanan_makananringan_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_makanan_makanansendiri_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_makanan_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_minuman_minumanlainnya_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_minuman_minumansendiri_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_minuman_inputan_sendiri = new ArrayList<Double>();
        ArrayList<Double> kalori_minuman_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_konsumsi_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_olahraga_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_olahraga_olahragalainnya_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_olahraga_olahragasendiri_tersimpan = new ArrayList<Double>();
        ArrayList<Double> kalori_olahraga_inputan_sendiri = new ArrayList<Double>();
        ArrayList<Double> beratbadan_perhari_tersimpan = new ArrayList<Double>();
        ArrayList<Double> beratbadan_yangada = new ArrayList<Double>();
        ArrayList<Double> BMI_tersimpan = new ArrayList<Double>();
        ArrayList<Double> saldo_tersimpan = new ArrayList<Double>();
        ArrayList<Double> harga_makanan_sarapan_tersimpan = new ArrayList<Double>();
        ArrayList<Double> harga_makanan_makananutama_tersimpan = new ArrayList<Double>();
        ArrayList<Double> harga_makanan_makananringan_tersimpan = new ArrayList<Double>();
        ArrayList<Double> harga_minuman_minumanlainnya_tersimpan = new ArrayList<Double>();
        ArrayList<Double> pengeluaran_perhari_tersimpan = new ArrayList<Double>();
        ArrayList<Integer> laporan_perhari = new ArrayList<Integer>();
        ArrayList<Integer> laporan_perhari_mempertahankan = new ArrayList<Integer>();
        ArrayList<Integer> laporan_perhari_menargetkan = new ArrayList<Integer>();
        ArrayList<Integer> menit_olahraga_inputan_sendiri = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        System.out.println("============");
        System.out.println("Fooderation, demi berat badan yang lebih baik tanpa gangguan apapun");

        do {
            System.out.println("============");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. View Database User");
            System.out.println("0. Exit");
            System.out.println("NOTE : jika sudah register, silahkan login lagi");
            System.out.println("Masukan menu autentikasi : ");
            menu_authentication = scan.nextInt();

            if (menu_authentication == 1) {

                register(scan, username_register, password_register, name, array_name, array_username, array_password); //ke function register

                System.out.println("===================");
                System.out.println("Nama lengkap : ");
                nama = scan.next() + scan.nextLine();

                nama_tersimpan.add(nama);

                benar = false;

                //SETIAP INPUTAN HARUS ADA YG DIBAWAH INI
                while (benar == false) {
                    System.out.println("         ");
                    System.out.println("Jumlah umur sekarang : ");
                    System.out.println("SYARAT : Umur harus minimal 15 tahun");

                    try {
                        umur = scan.nextInt();
                        benar = true;
                    } catch (Exception e) {
                        System.out.println("INVALID, Input harus angka dan tidak koma");
                        benar = false;
                        scan.nextLine();
                    }
                }

                if (benar == true) {
                    if (umur < 15) {
                        System.out.println("Maaf, umur harus minimal 15 tahun untuk menggunakan aplikasi ini");
                        return;
                    } else if (umur > 70) {
                        System.out.println("Maaf, anda sudah terlalu tua untuk menggunakan aplikasi ini");
                        return;
                        //SETIAP INPUTAN HARUS ADA YG DIATAS INI (YG WHILE, VARIABLE BENAR, TRY CATCH EXCEPTION E
                    } else {
                        do {
                            System.out.println("==== Gender ====");
                            System.out.println("1. Laki-laki");
                            System.out.println("2. Perempuan");
                            System.out.println("3. Lainnya");
                            System.out.println("0. Exit");
                            System.out.println("Gender : ");
                            gender = scan.nextInt();

                            if (gender == 0) {
                                return;
                            } else if (gender < 0 || gender > 3) {
                                System.out.println("Invalid Input");
                            } else {

                                gender_tersimpan.add(gender);
                                do {
                                    System.out.println("Masukan berat badan (kg) : ");
                                    berat_badan = scan.nextDouble();
                                    if (berat_badan > 200) {
                                        System.out.println("Berat Terlalu tinggi");
                                    } else if (berat_badan < 20) {
                                        System.out.println("Berat Terlalu rendah");
                                    }
                                } while (berat_badan > 200 || berat_badan < 20);
                                do {


                                    System.out.println("1. Centimeter (cm)");
                                    System.out.println("2. Meter (m)");
                                    System.out.println("0. Exit");
                                    System.out.println("Masukan skala tinggi badan : ");
                                    skala_tinggibadan = scan.nextInt();
                                } while (skala_tinggibadan > 2);

                                if (skala_tinggibadan == 1) {
                                    System.out.println("masukan tinggi badan (cm) minimal 120  : ");
                                    tinggi_badan_cm = scan.nextDouble();

                                    if (tinggi_badan_cm < 120) {
                                        System.out.println("Maaf, tinggi badan terlalu rendah");
                                        return;
                                    } else if (tinggi_badan > 275) {
                                        System.out.println("Maaf, tinggi badan tidak masuk akal");
                                        return;
                                    } else {
                                        tinggi_badan_cm_tersimpan.add(tinggi_badan_cm);
                                        tinggi_badan = tinggi_badan_cm / 100;
                                    }
                                } else if (skala_tinggibadan == 2) {
                                    System.out.println("masukan tinggi badan (m) minimal 1.2 : ");
                                    tinggi_badan = scan.nextDouble();

                                    if (tinggi_badan < 1.2) {
                                        System.out.println("Maaf, tinggi badan terlalu rendah");
                                        return;
                                    } else if (tinggi_badan > 2.75) {
                                        System.out.println("Maaf, tinggi badan tidak masuk akal");
                                        return;
                                    } else {
                                        tinggi_badan_tersimpan.add(tinggi_badan);
                                    }
                                } else if (skala_tinggibadan == 0) {
                                    return;
                                }

                                BMI = objek.MencariBMI(berat_badan, tinggi_badan);

                                System.out.println("===================");
                                System.out.println("Biodata Pengguna : ");
                                System.out.println("Nama Lengkap : " + nama);
                                System.out.println("Umur : " + umur);

                                if (gender_tersimpan.get(0) == 1) {
                                    System.out.println("Gender : Laki-laki");
                                } else if (gender_tersimpan.get(0) == 2) {
                                    System.out.println("Gender : Perempuan");
                                } else if (gender_tersimpan.get(0) == 3) {
                                    System.out.println("Gender : Lainnya");
                                } else {
                                    System.out.println("INVALID");
                                }

                                beratbadan_yangada.add(berat_badan);

                                System.out.println("Berat Badan : " + beratbadan_yangada.get(0) + " kg");

                                kalori = 7800 * berat_badan;

                                kalori_yangada.add(kalori);

                                System.out.println("Kalori yang ada : " + kalori_yangada.get(0) + " kalori");

                                if (skala_tinggibadan == 1) {
                                    System.out.println("Tinggi Badan : " + tinggi_badan_cm + " cm");
                                } else if (skala_tinggibadan == 2) {
                                    System.out.println("Tinggi Badan : " + tinggi_badan + " m");
                                } else {
                                    System.out.println("INVALID");
                                }

                                objek.MengecekBMI(BMI);
                                BMI_tersimpan.add(BMI);

                                for (double BMI_tersimpan_df : BMI_tersimpan) {
                                    System.out.println("BMI : " + df.format(BMI_tersimpan_df));
                                }

                                System.out.println("====================");
                                System.out.println("INFORMASI MENGENAI GIZI PENTING :");
                                System.out.println("Karbohidrat = 60% dalam tubuh");
                                System.out.println("Protein = 15% dalam tubuh");
                                System.out.println("Lemak = 15% dalam tubuh");
                                System.out.println("Vitamin = 8% dalam tubuh");
                                System.out.println("Mineral = 2% dalam tubuh");

                                karbohidrat = kalori * 60.0 / 100.0;
                                protein = kalori * 15.0 / 100.0;
                                lemak = kalori * 15.0 / 100.0;
                                vitamin = kalori * 8.0 / 100.0;
                                mineral = kalori * 2.0 / 100.0;

                                karbohidrat_yangada.add(karbohidrat);
                                protein_yangada.add(protein);
                                lemak_yangada.add(lemak);
                                vitamin_yangada.add(vitamin);
                                mineral_yangada.add(mineral);

                                System.out.println("");
                                System.out.println("Karbohidrat di tubuh : " + karbohidrat_yangada.get(0) + " gram");
                                System.out.println("Protein di tubuh : " + protein_yangada.get(0) + " gram");
                                System.out.println("Lemak di tubuh : " + lemak_yangada.get(0) + " gram");
                                System.out.println("Vitamin di tubuh : " + vitamin_yangada.get(0) + " gram");
                                System.out.println("Mineral di tubuh : " + mineral_yangada.get(0) + " gram");

                                System.out.println("=========================");

                                do {
                                    System.out.println("Masukan saldo (minimal IDR300,000.00) : ");
                                    saldo = scan.nextDouble();

                                    if (saldo < 300000) {
                                        System.out.println("SALDO TERLALU RENDAH");
                                    } else {

                                        saldo_tersimpan.add(saldo);

                                        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
                                        String formattedAmount_saldo = currencyFormat.format(saldo);
                                        System.out.println("saldo terisi : " + formattedAmount_saldo);
                                    }
                                } while (saldo < 300000);
                            }
                        } while (gender > 3);
                    }
                }
            } else if (menu_authentication == 2) {
                index_user = login(scan, username_login, password_login, array_name, array_username, array_password, index_user, logged_status);
                if (index_user >= 0) {

                    do {

                        menu_utama:
                        System.out.println("==============");
                        System.out.println("Menu");
                        System.out.println("1. Mempertahankan berat badan");
                        System.out.println("2. Menargetkan berat badan");
                        System.out.println("3. Lihat menu konsumsi");
                        System.out.println("4. Lihat menu olahraga");
                        System.out.println("5. Masukan perhari");
                        System.out.println("6. Lihat profil");
                        System.out.println("7. Info saldo");
                        System.out.println("0. Logout");
                        System.out.println("Masukan pilihan : ");
                        menu_utama = scan.nextInt();

                        if (menu_utama == 1) {
                            if (BMI < 18.5 && BMI > 24.9) {
                                System.out.println("Mohon maaf, berat badan anda sedang tidak baik-baik saja, fitur ini hanya digunakan jika berat badan anda normal");
                            } else {

                                do {

                                    System.out.println("================");

                                    kalori = (double) Math.round(kalori_yangada.get(0) * 100d) / 100d;

                                    System.out.println("kalori tersimpan sekarang : " + kalori + " kalori");

                                    berat_badan = (double) Math.round(beratbadan_yangada.get(0) * 100d) / 100d;

                                    System.out.println("berat badan sekarang : " + berat_badan + " kg");

                                    System.out.println("================");

                                    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
                                    String formattedAmount_saldo = currencyFormat.format(saldo_tersimpan.get(0));
                                    System.out.println("Saldo sekarang : " + formattedAmount_saldo);

                                    System.out.println("Hari telah dilewati : " + count_per_day_mempertahankan + " hari");
                                    System.out.println("");
                                    System.out.println("Karbohidrat di tubuh : " + karbohidrat_yangada.get(0) + " gram");
                                    System.out.println("Protein di tubuh : " + protein_yangada.get(0) + " gram");
                                    System.out.println("Lemak di tubuh : " + lemak_yangada.get(0) + " gram");
                                    System.out.println("Vitamin di tubuh : " + vitamin_yangada.get(0) + " gram");
                                    System.out.println("Mineral di tubuh : " + mineral_yangada.get(0) + " gram");
                                    System.out.println("================");
                                    System.out.println("NOTE : 1320 kalori atau 0.7 kg otomatis hilang jika tidak ada inputan kalori sama sekali");
                                    System.out.println("Sama seperti : 792 gram Karbohidrat, 198 gram Protein, 198 gram Lemak, 105.6 gram Vitamin, 26.4 Mineral hilang");
                                    System.out.println("================");
                                    System.out.println("1. Start");
                                    System.out.println("2. Lihat progress");
                                    System.out.println("0. Exit");
                                    System.out.println("Masukan pilihan : ");
                                    menu_mempertahankan = scan.nextInt();

                                    if (menu_mempertahankan == 1) {

                                        for (int i = 0; i < 3; i++) {

                                            System.out.println("==============");
                                            System.out.println("Sarapan");
                                            System.out.println("==============");
                                            System.out.println("Rekomendasi : ");
                                            System.out.println("1. Telur Dadar - 155.0 kalori - IDR15,000.00");
                                            System.out.println("2. Greek Yogurt - 100.0 kalori - IDR70,000.00");
                                            System.out.println("3. Oatmeal - 70.0 kalori - IDR50,000.00");
                                            System.out.println("4. Waffle - 290.0 kalori - IDR60,000.00");
                                            System.out.println("5. Roti Crossiant - 220.0 kalori - IDR45,000.00");
                                            System.out.println("00. Skip");
                                            System.out.println("Pilih menu sarapan " + (i + 1) + " : ");
                                            System.out.println("NOTE : Maksimal ambil 3, jika ingin mengambil dibawah 3 bisa menggunakan pilihan 00 atau Skip, contoh : hanya ingin mengambil 2, berarti 2 pilihan dan 1 skip");
                                            menu_sarapan = scan.nextInt();

                                            if (menu_sarapan == 1) {
                                                kalori_sarapan = kalori_sarapan + 155.0;
                                                total_karbohidrat = total_karbohidrat + 0.6;
                                                total_protein = total_protein + 11.7;
                                                total_lemak = total_lemak + 11.3;
                                                total_vitamin = total_vitamin + 3.1;
                                                total_mineral = total_mineral + 0.0;
                                                harga_sarapan = harga_sarapan + 15000.0;

                                            } else if (menu_sarapan == 2) {
                                                kalori_sarapan = kalori_sarapan + 100.0;
                                                total_karbohidrat = total_karbohidrat + 11.6;
                                                total_protein = total_protein + 8.2;
                                                total_lemak = total_lemak + 0.4;
                                                total_vitamin = total_vitamin + 5.0;
                                                total_mineral = total_mineral + 0.0;
                                                harga_sarapan = harga_sarapan + 70000.0;

                                            } else if (menu_sarapan == 3) {
                                                kalori_sarapan = kalori_sarapan + 70.0;
                                                total_karbohidrat = total_karbohidrat + 12.3;
                                                total_protein = total_protein + 2.4;
                                                total_lemak = total_lemak + 1.4;
                                                total_vitamin = total_vitamin + 15.2;
                                                total_mineral = total_mineral + 0.0;
                                                harga_sarapan = harga_sarapan + 50000.0;

                                            } else if (menu_sarapan == 4) {
                                                kalori_sarapan = kalori_sarapan + 290.0;
                                                total_karbohidrat = total_karbohidrat + 33.0;
                                                total_protein = total_protein + 16.4;
                                                total_lemak = total_lemak + 14.2;
                                                total_vitamin = total_vitamin + 4.9;
                                                total_mineral = total_mineral + 0.0;
                                                harga_sarapan = harga_sarapan + 60000.0;

                                            } else if (menu_sarapan == 5) {
                                                kalori_sarapan = kalori_sarapan + 220.0;
                                                total_karbohidrat = total_karbohidrat + 0.6;
                                                total_protein = total_protein + 11.7;
                                                total_lemak = total_lemak + 11.3;
                                                total_vitamin = total_vitamin + 0.1;
                                                total_mineral = total_mineral + 0.0;
                                                harga_sarapan = harga_sarapan + 45000.0;

                                            } else if (menu_sarapan == 00) {
                                                kalori_sarapan = kalori_sarapan + 0.0;
                                                total_karbohidrat = total_karbohidrat + 0.0;
                                                total_protein = total_protein + 0.0;
                                                total_lemak = total_lemak + 0.0;
                                                total_vitamin = total_vitamin + 0.0;
                                                total_mineral = total_mineral + 0.0;
                                                harga_sarapan = harga_sarapan + 0.0;

                                            } else if (menu_sarapan == 0) {
                                                break;
                                            } else {
                                                System.out.println("INVALID");
                                            }
                                        }

                                        for (int i = 0; i < 3; i++) {

                                            System.out.println("==============");
                                            System.out.println("Makanan Utama (Siang atau Malam)");
                                            System.out.println("==============");
                                            System.out.println("Rekomendasi : ");
                                            System.out.println("1. Udang goreng tepung - 280.0 kalori - IDR50,000.00");
                                            System.out.println("2. Tumis kangkung - 100.0 kalori - IDR25,000.00");
                                            System.out.println("3. Mashed potato - 90.0 kalori  - IDR25,000.00");
                                            System.out.println("4. Perkedel tahu - 220.0 kalori - IDR20,000.00");
                                            System.out.println("5. Kimbap - 140.0 kalori - IDR35,000.00");
                                            System.out.println("6. Capcay - 100.0 kalori - IDR45,000.00");
                                            System.out.println("7. Ikan selar goreng - 305.0 kalori - IDR90,000.00");
                                            System.out.println("8. Ubi jalar isi - 85.0 kalori - IDR25,000.00");
                                            System.out.println("9. Salad - 315.0 kalori - IDR45,000.00");
                                            System.out.println("10. Pasta - 130.0 kalori - IDR30,000.00");
                                            System.out.println("11. Sup ayam - 350.0 kalori - IDR60,000.00");
                                            System.out.println("12. Ayam panggang - 215.0 kalori - IDR40,000.00");
                                            System.out.println("00. Skip");
                                            System.out.println("Pilih menu makanan utama " + (i + 1) + " : ");
                                            System.out.println("NOTE : Maksimal ambil 3, jika ingin mengambil dibawah 3 bisa menggunakan pilihan 00 atau Skip, contoh : hanya ingin mengambil 2, berarti 2 pilihan dan 1 skip");
                                            menu_makanan_utama = scan.nextInt();

                                            if (menu_makanan_utama == 1) {
                                                kalori_makanan_utama = kalori_makanan_utama + 280.0;
                                                total_karbohidrat = total_karbohidrat + 0.1;
                                                total_protein = total_protein + 20.3;
                                                total_lemak = total_lemak + 14.4;
                                                total_vitamin = total_vitamin + 1.7;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 50000.0;

                                            } else if (menu_makanan_utama == 2) {
                                                kalori_makanan_utama = kalori_makanan_utama + 100.0;
                                                total_karbohidrat = total_karbohidrat + 3.1;
                                                total_protein = total_protein + 2.6;
                                                total_lemak = total_lemak + 1.9;
                                                total_vitamin = total_vitamin + 6.3;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 25000.0;

                                            } else if (menu_makanan_utama == 3) {
                                                kalori_makanan_utama = kalori_makanan_utama + 90.0;
                                                total_karbohidrat = total_karbohidrat + 15.0;
                                                total_protein = total_protein + 1.7;
                                                total_lemak = total_lemak + 2.8;
                                                total_vitamin = total_vitamin + 2.2;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 25000.0;

                                            } else if (menu_makanan_utama == 4) {
                                                kalori_makanan_utama = kalori_makanan_utama + 220.0;
                                                total_karbohidrat = total_karbohidrat + 31.2;
                                                total_protein = total_protein + 10.0;
                                                total_lemak = total_lemak + 4.2;
                                                total_vitamin = total_vitamin + 1.5;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 20000.0;

                                            } else if (menu_makanan_utama == 5) {
                                                kalori_makanan_utama = kalori_makanan_utama + 140.0;
                                                total_karbohidrat = total_karbohidrat + 42.2;
                                                total_protein = total_protein + 12.8;
                                                total_lemak = total_lemak + 6.2;
                                                total_vitamin = total_vitamin + 2.2;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 35000.0;

                                            } else if (menu_makanan_utama == 6) {
                                                kalori_makanan_utama = kalori_makanan_utama + 140.0;
                                                total_karbohidrat = total_karbohidrat + 65.1;
                                                total_protein = total_protein + 5.8;
                                                total_lemak = total_lemak + 3.2;
                                                total_vitamin = total_vitamin + 4.0;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 45000.0;

                                            } else if (menu_makanan_utama == 7) {
                                                kalori_makanan_utama = kalori_makanan_utama + 305.0;
                                                total_karbohidrat = total_karbohidrat + 7.7;
                                                total_protein = total_protein + 17.0;
                                                total_lemak = total_lemak + 1.5;
                                                total_vitamin = total_vitamin + 2.4;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 90000.0;

                                            } else if (menu_makanan_utama == 8) {
                                                kalori_makanan_utama = kalori_makanan_utama + 85.0;
                                                total_karbohidrat = total_karbohidrat + 20.6;
                                                total_protein = total_protein + 1.6;
                                                total_lemak = total_lemak + 0.2;
                                                total_vitamin = total_vitamin + 6.1;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 25000.0;

                                            } else if (menu_makanan_utama == 9) {
                                                kalori_makanan_utama = kalori_makanan_utama + 315.0;
                                                total_karbohidrat = total_karbohidrat + 10.8;
                                                total_protein = total_protein + 5.4;
                                                total_lemak = total_lemak + 4.3;
                                                total_vitamin = total_vitamin + 7.5;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 45000.0;

                                            } else if (menu_makanan_utama == 10) {
                                                kalori_makanan_utama = kalori_makanan_utama + 130.0;
                                                total_karbohidrat = total_karbohidrat + 255;
                                                total_protein = total_protein + 5.1;
                                                total_lemak = total_lemak + 1.1;
                                                total_vitamin = total_vitamin + 0.9;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 30000.0;

                                            } else if (menu_makanan_utama == 11) {
                                                kalori_makanan_utama = kalori_makanan_utama + 350.0;
                                                total_karbohidrat = total_karbohidrat + 14.5;
                                                total_protein = total_protein + 5.5;
                                                total_lemak = total_lemak + 1.2;
                                                total_vitamin = total_vitamin + 5.2;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 60000.0;

                                            } else if (menu_makanan_utama == 12) {
                                                kalori_makanan_utama = kalori_makanan_utama + 215.0;
                                                total_karbohidrat = total_karbohidrat + 0.4;
                                                total_protein = total_protein + 17.7;
                                                total_lemak = total_lemak + 15.8;
                                                total_vitamin = total_vitamin + 0.3;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 40000.0;

                                            } else if (menu_makanan_utama == 00) {
                                                kalori_makanan_utama = kalori_makanan_utama + 0.0;
                                                total_karbohidrat = total_karbohidrat + 0.0;
                                                total_protein = total_protein + 0.0;
                                                total_lemak = total_lemak + 0.0;
                                                total_vitamin = total_vitamin + 0.0;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_utama = harga_makanan_utama + 0.0;

                                            } else if (menu_makanan_utama == 0) {
                                                break;

                                            } else {
                                                System.out.println("INVALID");
                                            }
                                        }

                                        for (int i = 0; i < 3; i++) {
                                            System.out.println("==============");
                                            System.out.println("Makanan Ringan");
                                            System.out.println("==============");
                                            System.out.println("Rekomendasi : ");
                                            System.out.println("1. Kerupuk pisang - 250.0 kalori - IDR50,000.00");
                                            System.out.println("2. Kacang tanah - 350.0 kalori - IDR35,000.0");
                                            System.out.println("3. Sari gandum - 30.0 kalori - IDR15,000.0");
                                            System.out.println("4. Biskuit kelapa - 130.0 kalori - IDR15,000.0");
                                            System.out.println("5. Apel Fooderation - 50.0 kalori - IDR20,000.0");
                                            System.out.println("00. Skip");
                                            System.out.println("Pilih menu makanan ringan " + (i + 1) + " : ");
                                            System.out.println("NOTE : Maksimal ambil 3, jika ingin mengambil dibawah 3 bisa menggunakan pilihan 00 atau Skip, contoh : hanya ingin mengambil 2, berarti 2 pilihan dan 1 skip");
                                            menu_makanan_ringan = scan.nextInt();

                                            if (menu_makanan_ringan == 1) {
                                                kalori_makanan_ringan = kalori_makanan_ringan + 250.0;
                                                total_karbohidrat = total_karbohidrat + 42.0;
                                                total_protein = total_protein + 16.1;
                                                total_lemak = total_lemak + 34.5;
                                                total_vitamin = total_vitamin + 5.6;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_ringan = harga_makanan_ringan + 50000.0;

                                            } else if (menu_makanan_ringan == 2) {
                                                kalori_makanan_ringan = kalori_makanan_ringan + 350.0;
                                                total_karbohidrat = total_karbohidrat + 16.1;
                                                total_protein = total_protein + 26.4;
                                                total_lemak = total_lemak + 49.8;
                                                total_vitamin = total_vitamin + 4.3;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_ringan = harga_makanan_ringan + 35000.0;

                                            } else if (menu_makanan_ringan == 3) {
                                                kalori_makanan_ringan = kalori_makanan_ringan + 30.0;
                                                total_karbohidrat = total_karbohidrat + 22.5;
                                                total_protein = total_protein + 5.1;
                                                total_lemak = total_lemak + 11.3;
                                                total_vitamin = total_vitamin + 2.2;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_ringan = harga_makanan_ringan + 15000.0;

                                            } else if (menu_makanan_ringan == 4) {
                                                kalori_makanan_ringan = kalori_makanan_ringan + 130.0;
                                                total_karbohidrat = total_karbohidrat + 19.1;
                                                total_protein = total_protein + 2.1;
                                                total_lemak = total_lemak + 5.0;
                                                total_vitamin = total_vitamin + 0.2;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_ringan = harga_makanan_ringan + 15000.0;

                                            } else if (menu_makanan_ringan == 5) {
                                                kalori_makanan_ringan = kalori_makanan_ringan + 50.0;
                                                total_karbohidrat = total_karbohidrat + 14.6;
                                                total_protein = total_protein + 0.3;
                                                total_lemak = total_lemak + 0.2;
                                                total_vitamin = total_vitamin + 7.0;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_ringan = harga_makanan_ringan + 20000.0;

                                            } else if (menu_makanan_ringan == 00) {
                                                kalori_makanan_ringan = kalori_makanan_ringan + 0.0;
                                                total_karbohidrat = total_karbohidrat + 0.0;
                                                total_protein = total_protein + 0.0;
                                                total_lemak = total_lemak + 0.0;
                                                total_vitamin = total_vitamin + 0.0;
                                                total_mineral = total_mineral + 0.0;
                                                harga_makanan_ringan = harga_makanan_ringan + 0.0;

                                            } else if (menu_makanan_ringan == 0) {
                                                break;

                                            } else {
                                                System.out.println("INVALID");
                                            }
                                        }

                                        for (int i = 0; i < 3; i++) {
                                            System.out.println("==============");
                                            System.out.println("Makanan Inputan Sendiri");
                                            System.out.println("==============");

                                            for (int j = 0; j < menu_makanan_sendiri.size(); j++) {
                                                System.out.println((j + 1) + ". " + menu_makanan_sendiri.get(j) + " - " + kalori_makanan_inputan_sendiri.get(j) + " kalori");
                                            }

                                            System.out.println("00. Skip");
                                            System.out.println("Pilih menu makanan inputan sendiri " + (i + 1) + " : ");
                                            menu_makanan_inputan_sendiri = scan.nextInt();

                                            if (menu_makanan_inputan_sendiri > 0 && menu_makanan_inputan_sendiri <= menu_makanan_sendiri.size()) {
                                                Double kalori_makanan_sendiri_for = kalori_makanan_inputan_sendiri.get(menu_makanan_inputan_sendiri - 1);
                                                kalori_makanan_sendiri = kalori_makanan_sendiri + kalori_makanan_sendiri_for;

                                            } else if (menu_makanan_inputan_sendiri == 0) {
                                                kalori_makanan_sendiri = kalori_makanan_sendiri + 0.0;

                                            } else {
                                                System.out.println("INVALID");
                                            }
                                        }

                                        do {
                                            System.out.println("============");
                                            System.out.println("Air Putih (1.5 gram mineral)");
                                            System.out.println("============");
                                            System.out.println("Masukan jumlah konsumsi air putih (minimal 3) : ");
                                            minum_air_putih = scan.nextInt();

                                            if (minum_air_putih < 3) {
                                                System.out.println("KONSUMSI AIR PUTIH TERLALU SEDIKIT");

                                            } else {
                                                break;
                                            }
                                        } while (minum_air_putih < 3);

                                        for (int i = 0; i < 3; i++) {
                                            System.out.println("==============");
                                            System.out.println("Minuman lainnya ");
                                            System.out.println("==============");
                                            System.out.println("Rekomendasi : ");
                                            System.out.println("1. Susu Putih - 40.0 kalori - IDR15.000,00");
                                            System.out.println("2. Protein Shake - 285.0 kalori - IDR 80.000,00");
                                            System.out.println("3. Jus Alpukat - 195.0 kalori - IDR30.000,00");
                                            System.out.println("4. Kopi Hitam - 85.0 kalori - IDR20.000,00");
                                            System.out.println("5. Teh Hijau - 5.0 kalori - IDR10.000,00");
                                            System.out.println("6. Air Jahe - 110.0 kalori - IDR 45.000,00");
                                            System.out.println("00. Skip");
                                            System.out.println("Pilih menu minuman lainnya " + (i + 1) + " : ");
                                            System.out.println("NOTE : Maksimal ambil 3, jika ingin mengambil dibawah 3 bisa menggunakan pilihan 00 atau Skip, contoh : hanya ingin mengambil 2, berarti 2 pilihan dan 1 skip");
                                            menu_minuman_lainnya = scan.nextInt();

                                            if (menu_minuman_lainnya == 1) {
                                                kalori_minuman_lainnya = kalori_minuman_lainnya + 40.0;
                                                total_karbohidrat = total_karbohidrat + 5.1;
                                                total_protein = total_protein + 3.4;
                                                total_lemak = total_lemak + 0.0;
                                                total_vitamin = total_vitamin + 5.0;
                                                total_mineral = total_mineral + 0.7;
                                                harga_minuman_lainnya = harga_minuman_lainnya + 15000.0;

                                            } else if (menu_minuman_lainnya == 2) {
                                                kalori_minuman_lainnya = kalori_minuman_lainnya + 285.0;
                                                total_karbohidrat = total_karbohidrat + 0.5;
                                                total_protein = total_protein + 13.2;
                                                total_lemak = total_lemak + 6.6;
                                                total_vitamin = total_vitamin + 4.2;
                                                total_mineral = total_mineral + 2.5;
                                                harga_minuman_lainnya = harga_minuman_lainnya + 80000.0;

                                            } else if (menu_minuman_lainnya == 3) {
                                                kalori_minuman_lainnya = kalori_minuman_lainnya + 195.0;
                                                total_karbohidrat = total_karbohidrat + 15.2;
                                                total_protein = total_protein + 4.7;
                                                total_lemak = total_lemak + 30.1;
                                                total_vitamin = total_vitamin + 10.3;
                                                total_mineral = total_mineral + 0.8;
                                                harga_minuman_lainnya = harga_minuman_lainnya + 30000.0;

                                            } else if (menu_minuman_lainnya == 4) {
                                                kalori_minuman_lainnya = kalori_minuman_lainnya + 85.0;
                                                total_karbohidrat = total_karbohidrat + 10.07;
                                                total_protein = total_protein + 0.7;
                                                total_lemak = total_lemak + 6.3;
                                                total_vitamin = total_vitamin + 0.4;
                                                total_mineral = total_mineral + 0.5;
                                                harga_minuman_lainnya = harga_minuman_lainnya + 20000.0;

                                            } else if (menu_minuman_lainnya == 5) {
                                                kalori_minuman_lainnya = kalori_minuman_lainnya + 5.0;
                                                total_karbohidrat = total_karbohidrat + 0.0;
                                                total_protein = total_protein + 0.0;
                                                total_lemak = total_lemak + 0.0;
                                                total_vitamin = total_vitamin + 0.0;
                                                total_mineral = total_mineral + 0.0;
                                                harga_minuman_lainnya = harga_minuman_lainnya + 10000.0;

                                            } else if (menu_minuman_lainnya == 6) {
                                                kalori_minuman_lainnya = kalori_minuman_lainnya + 110.0;
                                                total_karbohidrat = total_karbohidrat + 12.3;
                                                total_protein = total_protein + 8.3;
                                                total_lemak = total_lemak + 4.8;
                                                total_vitamin = total_vitamin + 10.1;
                                                total_mineral = total_mineral + 0.4;
                                                harga_minuman_lainnya = harga_minuman_lainnya + 45000.0;

                                            } else if (menu_minuman_lainnya == 00) {
                                                kalori_minuman_lainnya = kalori_minuman_lainnya + 0.0;
                                                total_karbohidrat = total_karbohidrat + 0.0;
                                                total_protein = total_protein + 0.0;
                                                total_lemak = total_lemak + 0.0;
                                                total_vitamin = total_vitamin + 0.0;
                                                total_mineral = total_mineral + 0.0;
                                                harga_minuman_lainnya = harga_minuman_lainnya + 0.0;

                                            } else if (menu_minuman_lainnya == 0) {
                                                break;
                                            } else {
                                                System.out.println("INVALID");
                                            }
                                        }

                                        for (int i = 0; i < 3; i++) {
                                            System.out.println("==============");
                                            System.out.println("Minuman Inputan Sendiri");
                                            System.out.println("==============");

                                            for (int j = 0; j < menu_minuman_sendiri.size(); j++) {
                                                System.out.println((j + 1) + ". " + menu_minuman_sendiri.get(j) + " - " + kalori_minuman_inputan_sendiri.get(j) + " kalori");
                                            }

                                            System.out.println("00. Skip");
                                            System.out.println("Pilih menu minuman inputan sendiri " + (i + 1) + " : ");
                                            menu_minuman_inputan_sendiri = scan.nextInt();

                                            if (menu_minuman_inputan_sendiri > 0 && menu_minuman_inputan_sendiri <= menu_minuman_sendiri.size()) {
                                                Double kalori_minuman_sendiri_for = kalori_minuman_inputan_sendiri.get(menu_minuman_inputan_sendiri - 1);
                                                kalori_minuman_sendiri = kalori_minuman_sendiri + kalori_minuman_sendiri_for;

                                            } else if (menu_minuman_inputan_sendiri == 0) {
                                                kalori_minuman_sendiri = kalori_minuman_sendiri + 0.0;

                                            } else {
                                                System.out.println("INVALID");
                                            }
                                        }

                                        System.out.println("==============");
                                        System.out.println("Olahraga");
                                        System.out.println("==============");

                                        if (umur >= 50) {
                                            System.out.println("Maaf, anda sudah terlalu tua untuk menggunakan aplikasi ini");

                                        } else {

                                            if (gender_tersimpan.get(0) == 1) {
                                                if (umur >= 15 && umur <= 30) {
                                                    ketentuan_menit_olahraga = 90;
                                                } else if (umur >= 31 && umur <= 50) {
                                                    ketentuan_menit_olahraga = 75;
                                                }
                                            } else if (gender_tersimpan.get(0) == 2 || gender_tersimpan.get(0) == 3) {
                                                if (umur >= 15 && umur <= 30) {
                                                    ketentuan_menit_olahraga = 60;
                                                } else if (umur >= 31 && umur <= 50) {
                                                    ketentuan_menit_olahraga = 45;
                                                }
                                            }

                                            do {
                                                System.out.println("Ketentuan menit olahraga : " + ketentuan_menit_olahraga);
                                                System.out.println("Menit olahraga yang sudah terjalankan : " + menit_olahraga);

                                                System.out.println("Rekomendasi");
                                                System.out.println("1. Lari - 60 menit - 275.0 kalori");
                                                System.out.println("2. Mountain Climber - 30 menit - 300.0 kalori");
                                                System.out.println("3. Jumping Jack - 30 menit - 280.0 kalori");
                                                System.out.println("4. Sepeda statis - 30 menit - 250.0 kalori");
                                                System.out.println("5. Berenang - 60 menit - 260.0 kalori");
                                                System.out.println("6. Senam Aerobik - 30 menit - 240.0 kalori");
                                                System.out.println("7. Jalan Kaki - 30 menit - 100.0 kalori");
                                                System.out.println("00. Skip");
                                                System.out.println("Masukan pilihan : ");
                                                menu_olahraga = scan.nextInt();

                                                if (menu_olahraga == 1) {
                                                    kalori_olahraga_lainnya = kalori_olahraga_lainnya - 275.0;
                                                    menit_olahraga = menit_olahraga + 60;
                                                    total_vitamin = total_vitamin + 20.0;
                                                    total_mineral = total_mineral + 4.0;

                                                } else if (menu_olahraga == 2) {
                                                    kalori_olahraga_lainnya = kalori_olahraga_lainnya - 300.0;
                                                    menit_olahraga = menit_olahraga + 30;
                                                    total_vitamin = total_vitamin + 10.0;
                                                    total_mineral = total_mineral + 2.0;

                                                } else if (menu_olahraga == 3) {
                                                    kalori_olahraga_lainnya = kalori_olahraga_lainnya - 280.0;
                                                    menit_olahraga = menit_olahraga + 30;
                                                    total_vitamin = total_vitamin + 10.0;
                                                    total_mineral = total_mineral + 2.0;

                                                } else if (menu_olahraga == 4) {
                                                    kalori_olahraga_lainnya = kalori_olahraga_lainnya - 250.0;
                                                    menit_olahraga = menit_olahraga + 30;
                                                    total_vitamin = total_vitamin + 10.0;
                                                    total_mineral = total_mineral + 2.0;

                                                } else if (menu_olahraga == 5) {
                                                    kalori_olahraga_lainnya = kalori_olahraga_lainnya - 300.0;
                                                    menit_olahraga = menit_olahraga + 60;
                                                    total_vitamin = total_vitamin + 10.0;
                                                    total_mineral = total_mineral + 2.0;

                                                } else if (menu_olahraga == 6) {
                                                    kalori_olahraga_lainnya = kalori_olahraga_lainnya - 240.0;
                                                    menit_olahraga = menit_olahraga + 30;
                                                    total_vitamin = total_vitamin + 10.0;
                                                    total_mineral = total_mineral + 2.0;

                                                } else if (menu_olahraga == 7) {
                                                    kalori_olahraga_lainnya = kalori_olahraga_lainnya - 300.0;
                                                    menit_olahraga = menit_olahraga + 30;
                                                    total_vitamin = total_vitamin + 10.0;
                                                    total_mineral = total_mineral + 2.0;

                                                } else if (menu_olahraga == 00) {
                                                    kalori_olahraga_lainnya = kalori_olahraga_lainnya - 0.0;
                                                    menit_olahraga = menit_olahraga + 0;
                                                    total_vitamin = total_vitamin + 0.0;
                                                    total_mineral = total_mineral + 0.0;

                                                } else if (menu_olahraga == 0) {
                                                    break;
                                                } else {
                                                    System.out.println("INVALID");
                                                }

                                                System.out.println("==============");
                                                System.out.println("Olahraga Inputan Sendiri");
                                                System.out.println("==============");
                                                for (int j = 0; j < menu_olahraga_sendiri.size(); j++) {
                                                    System.out.println((j + 1) + ". " + menu_olahraga_sendiri.get(j) + " - " + menit_olahraga_inputan_sendiri.add(j) + kalori_olahraga_inputan_sendiri.get(j) + " kalori");
                                                }
                                                System.out.println("00. Skip");
                                                System.out.println("Pilih menu olahraga inputan sendiri : ");
                                                menu_olahraga_inputan_sendiri = scan.nextInt();

                                                if (menu_olahraga_inputan_sendiri > 0 && menu_olahraga_inputan_sendiri <= menu_olahraga_sendiri.size()) {
                                                    Double kalori_olahraga_sendiri_for = kalori_olahraga_inputan_sendiri.get(menu_olahraga_inputan_sendiri - 1);
                                                    kalori_olahraga_sendiri = kalori_olahraga_sendiri + kalori_olahraga_sendiri_for;
                                                    Integer menit_olahraga_inputan_sendiri_for = menit_olahraga_inputan_sendiri.get(menu_olahraga_inputan_sendiri - 1);

                                                    menit_olahraga = menit_olahraga + menit_olahraga_inputan_sendiri_for;
                                                    total_vitamin = menit_olahraga / 3.0;
                                                    total_mineral = menit_olahraga / 15.0;

                                                } else if (menu_olahraga_inputan_sendiri == 0) {
                                                    kalori_olahraga_sendiri = kalori_olahraga_sendiri + 0.0;

                                                } else {
                                                    System.out.println("INVALID");
                                                }

                                                if (menit_olahraga >= ketentuan_menit_olahraga) {
                                                    break;
                                                }

                                            } while (menit_olahraga != ketentuan_menit_olahraga);
                                        }

                                        total_harga = harga_sarapan + harga_makanan_utama + harga_makanan_ringan + harga_minuman_lainnya;
                                        harga_sarapan = 0.0;
                                        harga_makanan_utama = 0.0;
                                        harga_makanan_ringan = 0.0;
                                        harga_minuman_lainnya = 0.0;

                                        sisa_saldo = saldo_tersimpan.get(0) - total_harga;

                                        if (sisa_saldo <= 0) {
                                            System.out.println("ANDA BERUTANG, ISI SALDO ANDA");
                                        } else {
                                            harga_makanan_sarapan_tersimpan.add(harga_sarapan);
                                            harga_makanan_makananutama_tersimpan.add(harga_makanan_utama);
                                            harga_makanan_makananringan_tersimpan.add(harga_makanan_ringan);
                                            harga_minuman_minumanlainnya_tersimpan.add(harga_minuman_lainnya);

                                            pengeluaran_perhari_tersimpan.add(total_harga);

                                            kalori_makanan_sarapan_tersimpan.add(kalori_sarapan);
                                            kalori_makanan_makananutama_tersimpan.add(kalori_makanan_utama);
                                            kalori_makanan_makananringan_tersimpan.add(kalori_makanan_ringan);
                                            kalori_makanan_makanansendiri_tersimpan.add(kalori_makanan_sendiri);
                                            kalori_minuman_minumanlainnya_tersimpan.add(kalori_minuman_lainnya);
                                            kalori_minuman_minumansendiri_tersimpan.add(kalori_minuman_sendiri);
                                            kalori_olahraga_olahragalainnya_tersimpan.add(kalori_olahraga_lainnya);
                                            kalori_olahraga_olahragasendiri_tersimpan.add(kalori_olahraga_sendiri);

                                            kalori_diamdiam = 1320.0;
                                            karbohidrat_hilang = 44.0;

                                            kalori_makanan = kalori_sarapan + kalori_makanan_utama + kalori_makanan_ringan + kalori_makanan_sendiri;
                                            kalori_makanan_tersimpan.add(kalori_makanan);

                                            kalori_minuman = kalori_minuman_lainnya + kalori_minuman_sendiri;
                                            kalori_minuman_tersimpan.add(kalori_minuman);

                                            kalori_sarapan = 0.0;
                                            kalori_makanan_utama = 0.0;
                                            kalori_makanan_ringan = 0.0;
                                            kalori_makanan_sendiri = 0.0;
                                            kalori_minuman_lainnya = 0.0;
                                            kalori_minuman_sendiri = 0.0;

                                            kalori_konsumsi = kalori_makanan + kalori_minuman;
                                            kalori_konsumsi_tersimpan.add(kalori_konsumsi);

                                            kalori_makanan = 0.0;
                                            kalori_minuman = 0.0;

                                            kalori_olahraga = kalori_olahraga_lainnya + kalori_olahraga_sendiri;
                                            kalori_olahraga_tersimpan.add(kalori_olahraga);
                                            kalori_olahraga_lainnya = 0.0;
                                            kalori_olahraga_sendiri = 0.0;

                                            total_kalori_perhari = kalori_konsumsi + kalori_olahraga - kalori_diamdiam;
                                            kalori_konsumsi = 0.0;
                                            kalori_olahraga = 0.0;

                                            total_kalori_perhari = (double) Math.round(total_kalori_perhari * 100d) / 100d;

                                            kalori_perhari_tersimpan.add(total_kalori_perhari);
                                            perubahan_kalori = kalori + total_kalori_perhari;
                                            kalori_yangada.set(0, perubahan_kalori);

                                            perubahan_karbohidrat = karbohidrat + total_karbohidrat - karbohidrat_hilang;
                                            perubahan_protein = protein + total_protein - protein_hilang;
                                            perubahan_lemak = lemak + total_lemak - lemak_hilang;
                                            perubahan_vitamin = vitamin + total_vitamin - vitamin_hilang;
                                            perubahan_mineral = mineral + total_mineral - mineral_hilang;

                                            karbohidrat_yangada.set(0, total_karbohidrat);
                                            protein_yangada.set(0, total_protein);
                                            lemak_yangada.set(0, total_lemak);
                                            vitamin_yangada.set(0, total_vitamin);
                                            mineral_yangada.set(0, total_mineral);

                                            total_karbohidrat = 0.0;
                                            total_protein = 0.0;
                                            total_lemak = 0.0;
                                            total_vitamin = 0.0;
                                            total_mineral = 0.0;

                                            total_beratbadan_perhari = total_kalori_perhari / 7800.0;
                                            total_beratbadan_perhari = (double) Math.round(total_beratbadan_perhari * 100d) / 100d;
                                            beratbadan_perhari_tersimpan.add(total_beratbadan_perhari);
                                            perubahan_beratbadan = berat_badan + total_beratbadan_perhari;
                                            beratbadan_yangada.set(0, perubahan_beratbadan);

                                            saldo_tersimpan.set(0, sisa_saldo);

                                            count_per_day_mempertahankan++;
                                            laporan_perhari_mempertahankan.add(count_per_day_mempertahankan);

                                            System.out.println("Hari Ke-" + laporan_perhari_mempertahankan.get(0));
                                            System.out.println(total_kalori_perhari + " kalori");
                                            System.out.println(total_beratbadan_perhari + " kg");
                                            count_per_day++;
                                            laporan_perhari.add(count_per_day);

                                            total_kalori_perhari = 0.0;
                                            total_beratbadan_perhari = 0.0;

                                            NumberFormat currencyFormat_2 = NumberFormat.getCurrencyInstance();
                                            String formattedAmount_total_harga = currencyFormat.format(total_harga);
                                            System.out.println("Pengeluaran : " + formattedAmount_total_harga);
                                            total_harga = 0.0;

                                            if (total_beratbadan_perhari > 1.0) {
                                                System.out.println("Berat badan tidak stabil, disarankan untuk menurunkan inputan kalori");
                                            } else if (total_beratbadan_perhari < -1.0) {
                                                System.out.println("Berat badan tidak stabil, disarankan untuk menaikkan inputan kalori");
                                            } else {
                                                System.out.println("Pertahankan");
                                            }

                                            System.out.println("=================");
                                            System.out.println("SELESAI");
                                        }
                                    }

                                    if (menu_mempertahankan == 2) {

                                        System.out.println("");
                                        System.out.println("====================");
                                        System.out.println("Laporan sekarang");
                                        System.out.println("====================");

                                        for (double kalori_yangada_df : kalori_yangada) {
                                            System.out.println(df.format(kalori_yangada_df) + " kalori");
                                        }
                                        for (double beratbadan_yangada_df : beratbadan_yangada) {
                                            System.out.println(df.format(beratbadan_yangada_df) + " kg");
                                        }

                                        System.out.println("====================");
                                        System.out.println("Laporan perhari");
                                        System.out.println("====================");

                                        for (int i = 0; i < laporan_perhari_mempertahankan.size(); i++) {

                                            System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                            System.out.println(kalori_perhari_tersimpan.get(i) + " kalori");
                                            System.out.println(beratbadan_perhari_tersimpan.get(i) + " kg");

                                        }

                                        System.out.println("");

                                    } else if (menu_mempertahankan == 0) {
                                        break;
                                    }
                                } while (menu_mempertahankan != 0);

                                if (count_per_day == 0) {
                                    kalori_yangada.get(0);
                                    saldo_tersimpan.get(0);

                                } else {
                                    kalori_yangada.set(0, perubahan_kalori);
                                    saldo_tersimpan.set(0, sisa_saldo);
                                }

                            }

                        } else if (menu_utama == 2) {

                            System.out.println("================");
                            System.out.println("NOTE : 1320 kalori atau 0.7 kg otomatis hilang jika tidak ada inputan kalori sama sekali");
                            System.out.println("================");
                            for (double beratbadan_yangada_df : beratbadan_yangada) {
                                System.out.println("berat badan sekarang : " + df.format(beratbadan_yangada_df) + " kg");
                            }
                            System.out.println("Masukan berat badan yang diinginkan (kg) : ");
                            berat_badan_tujuan = scan.nextInt();

                            System.out.println("=================");
                            System.out.println("1 Minggu = 7 hari");
                            System.out.println("1 Bulan = 30 hari");
                            System.out.println("1 Tahun = 365 hari");
                            System.out.println("==================");

                            if (gender_tersimpan.get(0) == 1) {
                                if (umur >= 15 && umur <= 35) {
                                    do {
                                        System.out.println("Masukan jumlah hari untuk mencapai berat badan kesekian (minimal 30 hari) : ");
                                        jumlah_hari = scan.nextInt();
                                        minimal_hari = 30;

                                        if (jumlah_hari < minimal_hari) {
                                            System.out.println("HARI TERLALU PENDEK");
                                        }
                                    } while (jumlah_hari < minimal_hari);

                                } else if (umur >= 36 && umur <= 50) {
                                    do {
                                        System.out.println("Masukan jumlah hari untuk mencapai berat badan kesekian (minimal 60 hari) : ");
                                        jumlah_hari = scan.nextInt();
                                        minimal_hari = 60;

                                        if (jumlah_hari < minimal_hari) {
                                            System.out.println("HARI TERLALU PENDEK");
                                        }
                                    } while (jumlah_hari < minimal_hari);
                                } else if (umur > 50) {
                                    do {
                                        System.out.println("Masukan jumlah hari untuk mencapai berat badan kesekian (minimal 75 hari) : ");
                                        jumlah_hari = scan.nextInt();
                                        minimal_hari = 75;

                                        if (jumlah_hari < minimal_hari) {
                                            System.out.println("HARI TERLALU PENDEK");
                                        }
                                    } while (jumlah_hari < minimal_hari);
                                }
                            } else if (gender_tersimpan.get(0) == 2 || gender_tersimpan.get(0) == 3) {

                                if (umur >= 15 && umur <= 35) {
                                    do {
                                        System.out.println("Masukan jumlah hari untuk mencapai berat badan kesekian (minimal 45 hari) : ");
                                        jumlah_hari = scan.nextInt();
                                        minimal_hari = 45;

                                        if (jumlah_hari < minimal_hari) {
                                            System.out.println("HARI TERLALU PENDEK");
                                        }
                                    } while (jumlah_hari < minimal_hari);

                                } else if (umur >= 36 && umur <= 50) {
                                    do {
                                        System.out.println("Masukan jumlah hari untuk mencapai berat badan kesekian (minimal 70 hari) : ");
                                        jumlah_hari = scan.nextInt();
                                        minimal_hari = 70;

                                        if (jumlah_hari < minimal_hari) {
                                            System.out.println("HARI TERLALU PENDEK");
                                        }
                                    } while (jumlah_hari < minimal_hari);

                                } else if (umur > 50) {
                                    do {
                                        System.out.println("Masukan jumlah hari untuk mencapai berat badan kesekian (minimal 90 hari) : ");
                                        jumlah_hari = scan.nextInt();
                                        minimal_hari = 90;

                                        if (jumlah_hari < minimal_hari) {
                                            System.out.println("HARI TERLALU PENDEK");
                                        }
                                    } while (jumlah_hari < minimal_hari);
                                }
                            }

                            do {

                                selesai = false;

                                System.out.println("==================================");
                                System.out.println("berat badan sekarang : " + beratbadan_yangada);
                                System.out.println("target berat badan : " + berat_badan_tujuan);
                                jarak_berat_badan = berat_badan_tujuan - berat_badan;
                                System.out.println("jumlah berat badan yang dituju : " + df.format(jarak_berat_badan));

                                System.out.println("jumlah hari untuk mencapai berat badan kesekian : " + jumlah_hari + " hari");
                                System.out.println("Hari yang telah dilewati : " + laporan_perhari_menargetkan + " hari");
                                System.out.println("==================================");
                                target_berat_badan_perhari = jarak_berat_badan / (double) jumlah_hari;
                                target_kalori_perhari = target_berat_badan_perhari * 7800.0;
                                System.out.println("kalori yang dibutuhkan perhari : " + target_kalori_perhari + " kalori");
                                System.out.println("target berat badan perhari : " + df.format(target_berat_badan_perhari) + " kg");

                                System.out.println("================");

                                for (double kalori_yangada_df : kalori_yangada) {
                                    System.out.println("kalori tersimpan sekarang : " + kalori_yangada_df + " kalori");
                                }
                                for (double beratbadan_yangada_df : beratbadan_yangada) {
                                    System.out.println("berat badan sekarang : " + beratbadan_yangada_df + " kg");
                                }
                                System.out.println("Hari telah dilewati : " + count_per_day_menargetkan + " hari");

                                NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
                                String formattedAmount_saldo = currencyFormat.format(saldo_tersimpan.get(0));
                                System.out.println("Saldo sekarang : " + formattedAmount_saldo);

                                System.out.println("================");
                                System.out.println("NOTE : 1320 kalori atau 0.7 kg otomatis hilang jika tidak ada inputan kalori sama sekali");
                                System.out.println("Sama seperti : 792 gram Karbohidrat, 198 gram Protein, 198 gram Lemak, 105.6 gram Vitamin, 26.4 Mineral hilang");
                                System.out.println("================");
                                System.out.println("1. Start");
                                System.out.println("2. Lihat progress");
                                System.out.println("0. Exit");
                                System.out.println("Masukan pilihan : ");
                                menu_menargetkan = scan.nextInt();

                                if (menu_menargetkan == 1) {

                                    for (int i = 0; i < 3; i++) {

                                        System.out.println("==============");
                                        System.out.println("Sarapan");
                                        System.out.println("==============");
                                        System.out.println("Rekomendasi : ");
                                        System.out.println("1. Telur Dadar - 155.0 kalori - IDR15,000.00");
                                        System.out.println("2. Greek Yogurt - 100.0 kalori - IDR70,000.00");
                                        System.out.println("3. Oatmeal - 70.0 kalori - IDR50,000.00");
                                        System.out.println("4. Waffle - 290.0 kalori - IDR60,000.00");
                                        System.out.println("5. Roti Crossiant - 220.0 kalori - IDR45,000.00");
                                        System.out.println("00. Skip");
                                        System.out.println("0. Exit");
                                        System.out.println("Pilih menu sarapan " + (i + 1) + " : ");
                                        System.out.println("NOTE : Maksimal ambil 3, jika ingin mengambil dibawah 3 bisa menggunakan pilihan 00 atau Skip, contoh : hanya ingin mengambil 2, berarti 2 pilihan dan 1 skip");
                                        menu_sarapan = scan.nextInt();

                                        if (menu_sarapan == 1) {
                                            kalori_sarapan = kalori_sarapan + 155.0;
                                            total_karbohidrat = total_karbohidrat + 0.6;
                                            total_protein = total_protein + 11.7;
                                            total_lemak = total_lemak + 11.3;
                                            total_vitamin = total_vitamin + 3.1;
                                            total_mineral = total_mineral + 0.0;
                                            harga_sarapan = harga_sarapan + 15000.0;

                                        } else if (menu_sarapan == 2) {
                                            kalori_sarapan = kalori_sarapan + 100.0;
                                            total_karbohidrat = total_karbohidrat + 11.6;
                                            total_protein = total_protein + 8.2;
                                            total_lemak = total_lemak + 0.4;
                                            total_vitamin = total_vitamin + 5.0;
                                            total_mineral = total_mineral + 0.0;
                                            harga_sarapan = harga_sarapan + 70000.0;

                                        } else if (menu_sarapan == 3) {
                                            kalori_sarapan = kalori_sarapan + 70.0;
                                            total_karbohidrat = total_karbohidrat + 12.3;
                                            total_protein = total_protein + 2.4;
                                            total_lemak = total_lemak + 1.4;
                                            total_vitamin = total_vitamin + 15.2;
                                            total_mineral = total_mineral + 0.0;
                                            harga_sarapan = harga_sarapan + 50000.0;

                                        } else if (menu_sarapan == 4) {
                                            kalori_sarapan = kalori_sarapan + 290.0;
                                            total_karbohidrat = total_karbohidrat + 33.0;
                                            total_protein = total_protein + 16.4;
                                            total_lemak = total_lemak + 14.2;
                                            total_vitamin = total_vitamin + 4.9;
                                            total_mineral = total_mineral + 0.0;
                                            harga_sarapan = harga_sarapan + 60000.0;

                                        } else if (menu_sarapan == 5) {
                                            kalori_sarapan = kalori_sarapan + 220.0;
                                            total_karbohidrat = total_karbohidrat + 0.6;
                                            total_protein = total_protein + 11.7;
                                            total_lemak = total_lemak + 11.3;
                                            total_vitamin = total_vitamin + 0.1;
                                            total_mineral = total_mineral + 0.0;
                                            harga_sarapan = harga_sarapan + 45000.0;

                                        } else if (menu_sarapan == 00) {
                                            kalori_sarapan = kalori_sarapan + 0.0;
                                            total_karbohidrat = total_karbohidrat + 0.0;
                                            total_protein = total_protein + 0.0;
                                            total_lemak = total_lemak + 0.0;
                                            total_vitamin = total_vitamin + 0.0;
                                            total_mineral = total_mineral + 0.0;
                                            harga_sarapan = harga_sarapan + 0.0;

                                        } else if (menu_sarapan == 0) {
                                            break;
                                        } else {
                                            System.out.println("INVALID");
                                        }
                                    }

                                    for (int i = 0; i < 3; i++) {

                                        System.out.println("==============");
                                        System.out.println("Makanan Utama (Siang atau Malam)");
                                        System.out.println("==============");
                                        System.out.println("Rekomendasi : ");
                                        System.out.println("1. Udang goreng tepung - 280.0 kalori - IDR50,000.00");
                                        System.out.println("2. Tumis kangkung - 100.0 kalori - IDR25,000.00");
                                        System.out.println("3. Mashed potato - 90.0 kalori  - IDR25,000.00");
                                        System.out.println("4. Perkedel tahu - 220.0 kalori - IDR20,000.00");
                                        System.out.println("5. Kimbap - 140.0 kalori - IDR35,000.00");
                                        System.out.println("6. Capcay - 100.0 kalori - IDR45,000.00");
                                        System.out.println("7. Ikan selar goreng - 305.0 kalori - IDR90,000.00");
                                        System.out.println("8. Ubi jalar isi - 85.0 kalori - IDR25,000.00");
                                        System.out.println("9. Salad - 315.0 kalori - IDR45,000.00");
                                        System.out.println("10. Pasta - 130.0 kalori - IDR30,000.00");
                                        System.out.println("11. Sup ayam - 350.0 kalori - IDR60,000.00");
                                        System.out.println("12. Ayam panggang - 215.0 kalori - IDR40,000.00");
                                        System.out.println("00. Skip");
                                        System.out.println("0. Exit");
                                        System.out.println("Pilih menu makanan utama " + (i + 1) + " : ");
                                        System.out.println("NOTE : Maksimal ambil 3, jika ingin mengambil dibawah 3 bisa menggunakan pilihan 00 atau Skip, contoh : hanya ingin mengambil 2, berarti 2 pilihan dan 1 skip");
                                        menu_makanan_utama = scan.nextInt();

                                        if (menu_makanan_utama == 1) {
                                            kalori_makanan_utama = kalori_makanan_utama + 280.0;
                                            total_karbohidrat = total_karbohidrat + 0.1;
                                            total_protein = total_protein + 20.3;
                                            total_lemak = total_lemak + 14.4;
                                            total_vitamin = total_vitamin + 1.7;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 50000.0;

                                        } else if (menu_makanan_utama == 2) {
                                            kalori_makanan_utama = kalori_makanan_utama + 100.0;
                                            total_karbohidrat = total_karbohidrat + 3.1;
                                            total_protein = total_protein + 2.6;
                                            total_lemak = total_lemak + 1.9;
                                            total_vitamin = total_vitamin + 6.3;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 25000.0;

                                        } else if (menu_makanan_utama == 3) {
                                            kalori_makanan_utama = kalori_makanan_utama + 90.0;
                                            total_karbohidrat = total_karbohidrat + 15.0;
                                            total_protein = total_protein + 1.7;
                                            total_lemak = total_lemak + 2.8;
                                            total_vitamin = total_vitamin + 2.2;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 25000.0;

                                        } else if (menu_makanan_utama == 4) {
                                            kalori_makanan_utama = kalori_makanan_utama + 220.0;
                                            total_karbohidrat = total_karbohidrat + 31.2;
                                            total_protein = total_protein + 10.0;
                                            total_lemak = total_lemak + 4.2;
                                            total_vitamin = total_vitamin + 1.5;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 20000.0;

                                        } else if (menu_makanan_utama == 5) {
                                            kalori_makanan_utama = kalori_makanan_utama + 140.0;
                                            total_karbohidrat = total_karbohidrat + 42.2;
                                            total_protein = total_protein + 12.8;
                                            total_lemak = total_lemak + 6.2;
                                            total_vitamin = total_vitamin + 2.2;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 35000.0;

                                        } else if (menu_makanan_utama == 6) {
                                            kalori_makanan_utama = kalori_makanan_utama + 140.0;
                                            total_karbohidrat = total_karbohidrat + 65.1;
                                            total_protein = total_protein + 5.8;
                                            total_lemak = total_lemak + 3.2;
                                            total_vitamin = total_vitamin + 4.0;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 45000.0;

                                        } else if (menu_makanan_utama == 7) {
                                            kalori_makanan_utama = kalori_makanan_utama + 305.0;
                                            total_karbohidrat = total_karbohidrat + 7.7;
                                            total_protein = total_protein + 17.0;
                                            total_lemak = total_lemak + 1.5;
                                            total_vitamin = total_vitamin + 2.4;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 90000.0;

                                        } else if (menu_makanan_utama == 8) {
                                            kalori_makanan_utama = kalori_makanan_utama + 85.0;
                                            total_karbohidrat = total_karbohidrat + 20.6;
                                            total_protein = total_protein + 1.6;
                                            total_lemak = total_lemak + 0.2;
                                            total_vitamin = total_vitamin + 6.1;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 25000.0;

                                        } else if (menu_makanan_utama == 9) {
                                            kalori_makanan_utama = kalori_makanan_utama + 315.0;
                                            total_karbohidrat = total_karbohidrat + 10.8;
                                            total_protein = total_protein + 5.4;
                                            total_lemak = total_lemak + 4.3;
                                            total_vitamin = total_vitamin + 7.5;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 45000.0;

                                        } else if (menu_makanan_utama == 10) {
                                            kalori_makanan_utama = kalori_makanan_utama + 130.0;
                                            total_karbohidrat = total_karbohidrat + 255;
                                            total_protein = total_protein + 5.1;
                                            total_lemak = total_lemak + 1.1;
                                            total_vitamin = total_vitamin + 0.9;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 30000.0;

                                        } else if (menu_makanan_utama == 11) {
                                            kalori_makanan_utama = kalori_makanan_utama + 350.0;
                                            total_karbohidrat = total_karbohidrat + 14.5;
                                            total_protein = total_protein + 5.5;
                                            total_lemak = total_lemak + 1.2;
                                            total_vitamin = total_vitamin + 5.2;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 60000.0;

                                        } else if (menu_makanan_utama == 12) {
                                            kalori_makanan_utama = kalori_makanan_utama + 215.0;
                                            total_karbohidrat = total_karbohidrat + 0.4;
                                            total_protein = total_protein + 17.7;
                                            total_lemak = total_lemak + 15.8;
                                            total_vitamin = total_vitamin + 0.3;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 40000.0;

                                        } else if (menu_makanan_utama == 00) {
                                            kalori_makanan_utama = kalori_makanan_utama + 0.0;
                                            total_karbohidrat = total_karbohidrat + 0.0;
                                            total_protein = total_protein + 0.0;
                                            total_lemak = total_lemak + 0.0;
                                            total_vitamin = total_vitamin + 0.0;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_utama = harga_makanan_utama + 0.0;

                                        } else if (menu_makanan_utama == 0) {
                                            break;

                                        } else {
                                            System.out.println("INVALID");
                                        }
                                    }

                                    for (int i = 0; i < 3; i++) {
                                        System.out.println("==============");
                                        System.out.println("Makanan Ringan");
                                        System.out.println("==============");
                                        System.out.println("Rekomendasi : ");
                                        System.out.println("1. Kerupuk pisang - 250.0 kalori - IDR50,000.00");
                                        System.out.println("2. Kacang tanah - 350.0 kalori - IDR35,000.0");
                                        System.out.println("3. Sari gandum - 30.0 kalori - IDR15,000.0");
                                        System.out.println("4. Biskuit kelapa - 130.0 kalori - IDR15,000.0");
                                        System.out.println("5. Apel Fooderation - 50.0 kalori - IDR20,000.0");
                                        System.out.println("00. Skip");
                                        System.out.println("0. Exit");
                                        System.out.println("Pilih menu makanan ringan " + (i + 1) + " : ");
                                        System.out.println("NOTE : Maksimal ambil 3, jika ingin mengambil dibawah 3 bisa menggunakan pilihan 00 atau Skip, contoh : hanya ingin mengambil 2, berarti 2 pilihan dan 1 skip");
                                        menu_makanan_ringan = scan.nextInt();

                                        if (menu_makanan_ringan == 1) {
                                            kalori_makanan_ringan = kalori_makanan_ringan + 250.0;
                                            total_karbohidrat = total_karbohidrat + 42.0;
                                            total_protein = total_protein + 16.1;
                                            total_lemak = total_lemak + 34.5;
                                            total_vitamin = total_vitamin + 5.6;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_ringan = harga_makanan_ringan + 50000.0;

                                        } else if (menu_makanan_ringan == 2) {
                                            kalori_makanan_ringan = kalori_makanan_ringan + 350.0;
                                            total_karbohidrat = total_karbohidrat + 16.1;
                                            total_protein = total_protein + 26.4;
                                            total_lemak = total_lemak + 49.8;
                                            total_vitamin = total_vitamin + 4.3;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_ringan = harga_makanan_ringan + 35000.0;

                                        } else if (menu_makanan_ringan == 3) {
                                            kalori_makanan_ringan = kalori_makanan_ringan + 30.0;
                                            total_karbohidrat = total_karbohidrat + 22.5;
                                            total_protein = total_protein + 5.1;
                                            total_lemak = total_lemak + 11.3;
                                            total_vitamin = total_vitamin + 2.2;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_ringan = harga_makanan_ringan + 15000.0;

                                        } else if (menu_makanan_ringan == 4) {
                                            kalori_makanan_ringan = kalori_makanan_ringan + 130.0;
                                            total_karbohidrat = total_karbohidrat + 19.1;
                                            total_protein = total_protein + 2.1;
                                            total_lemak = total_lemak + 5.0;
                                            total_vitamin = total_vitamin + 0.2;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_ringan = harga_makanan_ringan + 15000.0;

                                        } else if (menu_makanan_ringan == 5) {
                                            kalori_makanan_ringan = kalori_makanan_ringan + 50.0;
                                            total_karbohidrat = total_karbohidrat + 14.6;
                                            total_protein = total_protein + 0.3;
                                            total_lemak = total_lemak + 0.2;
                                            total_vitamin = total_vitamin + 7.0;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_ringan = harga_makanan_ringan + 20000.0;

                                        } else if (menu_makanan_ringan == 00) {
                                            kalori_makanan_ringan = kalori_makanan_ringan + 0.0;
                                            total_karbohidrat = total_karbohidrat + 0.0;
                                            total_protein = total_protein + 0.0;
                                            total_lemak = total_lemak + 0.0;
                                            total_vitamin = total_vitamin + 0.0;
                                            total_mineral = total_mineral + 0.0;
                                            harga_makanan_ringan = harga_makanan_ringan + 0.0;

                                        } else if (menu_makanan_ringan == 0) {
                                            break;

                                        } else {
                                            System.out.println("INVALID");
                                        }
                                    }

                                    for (int i = 0; i < 3; i++) {
                                        System.out.println("==============");
                                        System.out.println("Makanan Inputan Sendiri");
                                        System.out.println("==============");

                                        for (int j = 0; j < menu_makanan_sendiri.size(); j++) {
                                            System.out.println((j + 1) + ". " + menu_makanan_sendiri.get(j) + " - " + kalori_makanan_inputan_sendiri.get(j) + " kalori");
                                        }

                                        System.out.println("00. Skip");
                                        System.out.println("Pilih menu makanan inputan sendiri " + (i + 1) + " : ");
                                        menu_makanan_inputan_sendiri = scan.nextInt();

                                        if (menu_makanan_inputan_sendiri > 0 && menu_makanan_inputan_sendiri <= menu_makanan_sendiri.size()) {
                                            Double kalori_makanan_sendiri_for = kalori_makanan_inputan_sendiri.get(menu_makanan_inputan_sendiri - 1);
                                            kalori_makanan_sendiri = kalori_makanan_sendiri + kalori_makanan_sendiri_for;

                                        } else if (menu_makanan_inputan_sendiri == 0) {
                                            kalori_makanan_sendiri = kalori_makanan_sendiri + 0.0;

                                        } else {
                                            System.out.println("INVALID");
                                        }
                                    }

                                    do {
                                        System.out.println("============");
                                        System.out.println("Air Putih (1.5 gram mineral)");
                                        System.out.println("============");
                                        System.out.println("Masukan jumlah konsumsi air putih (minimal 3) : ");
                                        minum_air_putih = scan.nextInt();

                                        if (minum_air_putih < 3) {
                                            System.out.println("KONSUMSI AIR PUTIH TERLALU SEDIKIT");

                                        } else {
                                            break;
                                        }
                                    } while (minum_air_putih < 3);

                                    for (int i = 0; i < 3; i++) {
                                        System.out.println("==============");
                                        System.out.println("Minuman lainnya ");
                                        System.out.println("==============");
                                        System.out.println("Rekomendasi : ");
                                        System.out.println("1. Susu Putih - 40.0 kalori - IDR15.000,00");
                                        System.out.println("2. Protein Shake - 285.0 kalori - IDR 80.000,00");
                                        System.out.println("3. Jus Alpukat - 195.0 kalori - IDR30.000,00");
                                        System.out.println("4. Kopi Hitam - 85.0 kalori - IDR20.000,00");
                                        System.out.println("5. Teh Hijau - 5.0 kalori - IDR10.000,00");
                                        System.out.println("6. Air Jahe - 110.0 kalori - IDR 45.000,00");
                                        System.out.println("00. Skip");
                                        System.out.println("0. Exit");
                                        System.out.println("Pilih menu minuman lainnya " + (i + 1) + " : ");
                                        System.out.println("NOTE : Maksimal ambil 3, jika ingin mengambil dibawah 3 bisa menggunakan pilihan 00 atau Skip, contoh : hanya ingin mengambil 2, berarti 2 pilihan dan 1 skip");
                                        menu_minuman_lainnya = scan.nextInt();

                                        if (menu_minuman_lainnya == 1) {
                                            kalori_minuman_lainnya = kalori_minuman_lainnya + 40.0;
                                            total_karbohidrat = total_karbohidrat + 5.1;
                                            total_protein = total_protein + 3.4;
                                            total_lemak = total_lemak + 0.0;
                                            total_vitamin = total_vitamin + 5.0;
                                            total_mineral = total_mineral + 0.7;
                                            harga_minuman_lainnya = harga_minuman_lainnya + 15000.0;

                                        } else if (menu_minuman_lainnya == 2) {
                                            kalori_minuman_lainnya = kalori_minuman_lainnya + 285.0;
                                            total_karbohidrat = total_karbohidrat + 0.5;
                                            total_protein = total_protein + 13.2;
                                            total_lemak = total_lemak + 6.6;
                                            total_vitamin = total_vitamin + 4.2;
                                            total_mineral = total_mineral + 2.5;
                                            harga_minuman_lainnya = harga_minuman_lainnya + 80000.0;

                                        } else if (menu_minuman_lainnya == 3) {
                                            kalori_minuman_lainnya = kalori_minuman_lainnya + 195.0;
                                            total_karbohidrat = total_karbohidrat + 15.2;
                                            total_protein = total_protein + 4.7;
                                            total_lemak = total_lemak + 30.1;
                                            total_vitamin = total_vitamin + 10.3;
                                            total_mineral = total_mineral + 0.8;
                                            harga_minuman_lainnya = harga_minuman_lainnya + 30000.0;

                                        } else if (menu_minuman_lainnya == 4) {
                                            kalori_minuman_lainnya = kalori_minuman_lainnya + 85.0;
                                            total_karbohidrat = total_karbohidrat + 10.07;
                                            total_protein = total_protein + 0.7;
                                            total_lemak = total_lemak + 6.3;
                                            total_vitamin = total_vitamin + 0.4;
                                            total_mineral = total_mineral + 0.5;
                                            harga_minuman_lainnya = harga_minuman_lainnya + 20000.0;

                                        } else if (menu_minuman_lainnya == 5) {
                                            kalori_minuman_lainnya = kalori_minuman_lainnya + 5.0;
                                            total_karbohidrat = total_karbohidrat + 0.0;
                                            total_protein = total_protein + 0.0;
                                            total_lemak = total_lemak + 0.0;
                                            total_vitamin = total_vitamin + 0.0;
                                            total_mineral = total_mineral + 0.0;
                                            harga_minuman_lainnya = harga_minuman_lainnya + 10000.0;

                                        } else if (menu_minuman_lainnya == 6) {
                                            kalori_minuman_lainnya = kalori_minuman_lainnya + 110.0;
                                            total_karbohidrat = total_karbohidrat + 12.3;
                                            total_protein = total_protein + 8.3;
                                            total_lemak = total_lemak + 4.8;
                                            total_vitamin = total_vitamin + 10.1;
                                            total_mineral = total_mineral + 0.4;
                                            harga_minuman_lainnya = harga_minuman_lainnya + 45000.0;

                                        } else if (menu_minuman_lainnya == 00) {
                                            kalori_minuman_lainnya = kalori_minuman_lainnya + 0.0;
                                            total_karbohidrat = total_karbohidrat + 0.0;
                                            total_protein = total_protein + 0.0;
                                            total_lemak = total_lemak + 0.0;
                                            total_vitamin = total_vitamin + 0.0;
                                            total_mineral = total_mineral + 0.0;
                                            harga_minuman_lainnya = harga_minuman_lainnya + 0.0;

                                        } else if (menu_minuman_lainnya == 0) {
                                            break;
                                        } else {
                                            System.out.println("INVALID");
                                        }
                                    }

                                    for (int i = 0; i < 3; i++) {
                                        System.out.println("==============");
                                        System.out.println("Minuman Inputan Sendiri");
                                        System.out.println("==============");

                                        for (int j = 0; j < menu_minuman_sendiri.size(); j++) {
                                            System.out.println((j + 1) + ". " + menu_minuman_sendiri.get(j) + " - " + kalori_minuman_inputan_sendiri.get(j) + " kalori");
                                        }

                                        System.out.println("00. Skip");
                                        System.out.println("Pilih menu minuman inputan sendiri " + (i + 1) + " : ");
                                        menu_minuman_inputan_sendiri = scan.nextInt();

                                        if (menu_minuman_inputan_sendiri > 0 && menu_minuman_inputan_sendiri <= menu_minuman_sendiri.size()) {
                                            Double kalori_minuman_sendiri_for = kalori_minuman_inputan_sendiri.get(menu_minuman_inputan_sendiri - 1);
                                            kalori_minuman_sendiri = kalori_minuman_sendiri + kalori_minuman_sendiri_for;

                                        } else if (menu_minuman_inputan_sendiri == 0) {
                                            kalori_minuman_sendiri = kalori_minuman_sendiri + 0.0;

                                        } else {
                                            System.out.println("INVALID");
                                        }
                                    }

                                    System.out.println("==============");
                                    System.out.println("Olahraga");
                                    System.out.println("==============");

                                    if (umur >= 50) {
                                        System.out.println("Maaf, anda sudah terlalu tua untuk menggunakan aplikasi ini");

                                    } else {

                                        if (target_berat_badan_perhari > 0.0) {

                                            if (umur >= 15 && umur <= 30) {
                                                ketentuan_menit_olahraga = 90;
                                            } else if (umur >= 31 && umur <= 50) {
                                                ketentuan_menit_olahraga = 60;
                                            }
                                        } else if (target_berat_badan_perhari < 0.0) {

                                            if (umur >= 15 && umur <= 30) {
                                                ketentuan_menit_olahraga = 120;
                                            } else if (umur >= 31 && umur <= 50) {
                                                ketentuan_menit_olahraga = 90;
                                            }
                                        }

                                        do {
                                            System.out.println("Ketentuan menit olahraga : " + ketentuan_menit_olahraga);
                                            System.out.println("Menit olahraga yang sudah terjalankan : " + menit_olahraga);

                                            System.out.println("Rekomendasi");
                                            System.out.println("1. Lari - 60 menit - 275.0 kalori");
                                            System.out.println("2. Mountain Climber - 30 menit - 300.0 kalori");
                                            System.out.println("3. Jumping Jack - 30 menit - 280.0 kalori");
                                            System.out.println("4. Sepeda statis - 30 menit - 250.0 kalori");
                                            System.out.println("5. Berenang - 60 menit - 260.0 kalori");
                                            System.out.println("6. Senam Aerobik - 30 menit - 240.0 kalori");
                                            System.out.println("7. Jalan Kaki - 30 menit - 100.0 kalori");
                                            System.out.println("00. Skip");
                                            System.out.println("0. Exit");
                                            System.out.println("Masukan pilihan : ");
                                            menu_olahraga = scan.nextInt();

                                            if (menu_olahraga == 1) {
                                                kalori_olahraga_lainnya = kalori_olahraga_lainnya - 275.0;
                                                menit_olahraga = menit_olahraga + 60;
                                                total_vitamin = total_vitamin + 20.0;
                                                total_mineral = total_mineral + 4.0;

                                            } else if (menu_olahraga == 2) {
                                                kalori_olahraga_lainnya = kalori_olahraga_lainnya - 300.0;
                                                menit_olahraga = menit_olahraga + 30;
                                                total_vitamin = total_vitamin + 10.0;
                                                total_mineral = total_mineral + 2.0;

                                            } else if (menu_olahraga == 3) {
                                                kalori_olahraga_lainnya = kalori_olahraga_lainnya - 280.0;
                                                menit_olahraga = menit_olahraga + 30;
                                                total_vitamin = total_vitamin + 10.0;
                                                total_mineral = total_mineral + 2.0;

                                            } else if (menu_olahraga == 4) {
                                                kalori_olahraga_lainnya = kalori_olahraga_lainnya - 250.0;
                                                menit_olahraga = menit_olahraga + 30;
                                                total_vitamin = total_vitamin + 10.0;
                                                total_mineral = total_mineral + 2.0;

                                            } else if (menu_olahraga == 5) {
                                                kalori_olahraga_lainnya = kalori_olahraga_lainnya - 300.0;
                                                menit_olahraga = menit_olahraga + 60;
                                                total_vitamin = total_vitamin + 10.0;
                                                total_mineral = total_mineral + 2.0;

                                            } else if (menu_olahraga == 6) {
                                                kalori_olahraga_lainnya = kalori_olahraga_lainnya - 240.0;
                                                menit_olahraga = menit_olahraga + 30;
                                                total_vitamin = total_vitamin + 10.0;
                                                total_mineral = total_mineral + 2.0;

                                            } else if (menu_olahraga == 7) {
                                                kalori_olahraga_lainnya = kalori_olahraga_lainnya - 300.0;
                                                menit_olahraga = menit_olahraga + 30;
                                                total_vitamin = total_vitamin + 10.0;
                                                total_mineral = total_mineral + 2.0;

                                            } else if (menu_olahraga == 00) {
                                                kalori_olahraga_lainnya = kalori_olahraga_lainnya - 0.0;
                                                menit_olahraga = menit_olahraga + 0;
                                                total_vitamin = total_vitamin + 0.0;
                                                total_mineral = total_mineral + 0.0;

                                            } else if (menu_olahraga == 0) {
                                                break;
                                            } else {
                                                System.out.println("INVALID");
                                            }

                                            System.out.println("==============");
                                            System.out.println("Olahraga Inputan Sendiri");
                                            System.out.println("==============");
                                            for (int j = 0; j < menu_olahraga_sendiri.size(); j++) {
                                                System.out.println((j + 1) + ". " + menu_olahraga_sendiri.get(j) + " - " + menit_olahraga_inputan_sendiri.add(j) + kalori_olahraga_inputan_sendiri.get(j) + " kalori");
                                            }
                                            System.out.println("00. Skip");
                                            System.out.println("Pilih menu olahraga inputan sendiri : ");
                                            menu_olahraga_inputan_sendiri = scan.nextInt();

                                            if (menu_olahraga_inputan_sendiri > 0 && menu_olahraga_inputan_sendiri <= menu_olahraga_sendiri.size()) {
                                                Double kalori_olahraga_sendiri_for = kalori_olahraga_inputan_sendiri.get(menu_olahraga_inputan_sendiri - 1);
                                                kalori_olahraga_sendiri = kalori_olahraga_sendiri + kalori_olahraga_sendiri_for;
                                                Integer menit_olahraga_inputan_sendiri_for = menit_olahraga_inputan_sendiri.get(menu_olahraga_inputan_sendiri - 1);

                                                menit_olahraga = menit_olahraga + menit_olahraga_inputan_sendiri_for;
                                                total_vitamin = menit_olahraga / 3.0;
                                                total_mineral = menit_olahraga / 15.0;

                                            } else if (menu_olahraga_inputan_sendiri == 0) {
                                                kalori_olahraga_sendiri = kalori_olahraga_sendiri + 0.0;

                                            } else {
                                                System.out.println("INVALID");
                                            }

                                            if (menit_olahraga >= ketentuan_menit_olahraga) {
                                                break;
                                            }

                                        } while (menit_olahraga != ketentuan_menit_olahraga);
                                    }

                                    total_harga = harga_sarapan + harga_makanan_utama + harga_makanan_ringan + harga_minuman_lainnya;
                                    harga_sarapan = 0.0;
                                    harga_makanan_utama = 0.0;
                                    harga_makanan_ringan = 0.0;
                                    harga_minuman_lainnya = 0.0;

                                    sisa_saldo = saldo_tersimpan.get(0) - total_harga;

                                    if (sisa_saldo <= 0) {
                                        System.out.println("ANDA BERUTANG, ISI SALDO ANDA");
                                    } else {
                                        harga_makanan_sarapan_tersimpan.add(harga_sarapan);
                                        harga_makanan_makananutama_tersimpan.add(harga_makanan_utama);
                                        harga_makanan_makananringan_tersimpan.add(harga_makanan_ringan);
                                        harga_minuman_minumanlainnya_tersimpan.add(harga_minuman_lainnya);

                                        pengeluaran_perhari_tersimpan.add(total_harga);

                                        kalori_makanan_sarapan_tersimpan.add(kalori_sarapan);
                                        kalori_makanan_makananutama_tersimpan.add(kalori_makanan_utama);
                                        kalori_makanan_makananringan_tersimpan.add(kalori_makanan_ringan);
                                        kalori_makanan_makanansendiri_tersimpan.add(kalori_makanan_sendiri);
                                        kalori_minuman_minumanlainnya_tersimpan.add(kalori_minuman_lainnya);
                                        kalori_minuman_minumansendiri_tersimpan.add(kalori_minuman_sendiri);
                                        kalori_olahraga_olahragalainnya_tersimpan.add(kalori_olahraga_lainnya);
                                        kalori_olahraga_olahragasendiri_tersimpan.add(kalori_olahraga_sendiri);

                                        kalori_diamdiam = 1320.0;
                                        karbohidrat_hilang = 44.0;

                                        kalori_makanan = kalori_sarapan + kalori_makanan_utama + kalori_makanan_ringan + kalori_makanan_sendiri;
                                        kalori_makanan_tersimpan.add(kalori_makanan);

                                        kalori_minuman = kalori_minuman_lainnya + kalori_minuman_sendiri;
                                        kalori_minuman_tersimpan.add(kalori_minuman);

                                        kalori_sarapan = 0.0;
                                        kalori_makanan_utama = 0.0;
                                        kalori_makanan_ringan = 0.0;
                                        kalori_makanan_sendiri = 0.0;
                                        kalori_minuman_lainnya = 0.0;
                                        kalori_minuman_sendiri = 0.0;

                                        kalori_konsumsi = kalori_makanan + kalori_minuman;
                                        kalori_konsumsi_tersimpan.add(kalori_konsumsi);

                                        kalori_makanan = 0.0;
                                        kalori_minuman = 0.0;

                                        kalori_olahraga = kalori_olahraga_lainnya + kalori_olahraga_sendiri;
                                        kalori_olahraga_tersimpan.add(kalori_olahraga);
                                        kalori_olahraga_lainnya = 0.0;
                                        kalori_olahraga_sendiri = 0.0;

                                        total_kalori_perhari = kalori_konsumsi + kalori_olahraga - kalori_diamdiam;
                                        kalori_konsumsi = 0.0;
                                        kalori_olahraga = 0.0;

                                        total_kalori_perhari = (double) Math.round(total_kalori_perhari * 100d) / 100d;

                                        kalori_perhari_tersimpan.add(total_kalori_perhari);
                                        perubahan_kalori = kalori + total_kalori_perhari;
                                        kalori_yangada.set(0, perubahan_kalori);

                                        perubahan_karbohidrat = karbohidrat + total_karbohidrat - karbohidrat_hilang;
                                        perubahan_protein = protein + total_protein - protein_hilang;
                                        perubahan_lemak = lemak + total_lemak - lemak_hilang;
                                        perubahan_vitamin = vitamin + total_vitamin - vitamin_hilang;
                                        perubahan_mineral = mineral + total_mineral - mineral_hilang;

                                        karbohidrat_yangada.set(0, total_karbohidrat);
                                        protein_yangada.set(0, total_protein);
                                        lemak_yangada.set(0, total_lemak);
                                        vitamin_yangada.set(0, total_vitamin);
                                        mineral_yangada.set(0, total_mineral);

                                        total_karbohidrat = 0.0;
                                        total_protein = 0.0;
                                        total_lemak = 0.0;
                                        total_vitamin = 0.0;
                                        total_mineral = 0.0;

                                        total_beratbadan_perhari = total_kalori_perhari / 7800.0;
                                        total_beratbadan_perhari = (double) Math.round(total_beratbadan_perhari * 100d) / 100d;
                                        beratbadan_perhari_tersimpan.add(total_beratbadan_perhari);
                                        perubahan_beratbadan = berat_badan + total_beratbadan_perhari;
                                        beratbadan_yangada.set(0, perubahan_beratbadan);

                                        saldo_tersimpan.set(0, sisa_saldo);

                                        count_per_day_menargetkan++;
                                        laporan_perhari_menargetkan.add(count_per_day_menargetkan);

                                        System.out.println("Hari Ke-" + laporan_perhari_menargetkan.get(0));
                                        System.out.println(total_kalori_perhari + " kalori");
                                        System.out.println(total_beratbadan_perhari + " kg");
                                        count_per_day++;
                                        laporan_perhari.add(count_per_day);

                                        total_kalori_perhari = 0.0;
                                        total_beratbadan_perhari = 0.0;

                                        NumberFormat currencyFormat_2 = NumberFormat.getCurrencyInstance();
                                        String formattedAmount_total_harga = currencyFormat_2.format(total_harga);
                                        System.out.println("Pengeluaran : " + formattedAmount_total_harga);
                                        total_harga = 0.0;

                                        if (target_berat_badan_perhari > 0.0) {

                                            if (total_beratbadan_perhari >= 1.0) {
                                                System.out.println("ANDA LUAR BIASA, pertahankan");
                                            } else if (total_beratbadan_perhari >= 0.2 && total_beratbadan_perhari <= 0.9) {
                                                System.out.println("pertahankan");
                                            } else if (total_beratbadan_perhari >= 0.05 && total_beratbadan_perhari <= 0.1) {
                                                System.out.println("inputan kalori perlu ditingkatkan");
                                            } else {
                                                System.out.println("PROGRESS TIDAK TERJALANKAN DENGAN BAIK, inputan kalori perlu ditingkatkan");
                                            }

                                        } else if (target_berat_badan_perhari < 0.0) {

                                            if (total_beratbadan_perhari >= -1.0) {
                                                System.out.println("ANDA LUAR BIASA, pertahankan");
                                            } else if (total_beratbadan_perhari >= -0.2 && total_beratbadan_perhari <= -0.9) {
                                                System.out.println("pertahankan");
                                            } else if (total_beratbadan_perhari >= -0.05 && total_beratbadan_perhari <= -0.1) {
                                                System.out.println("inputan kalori perlu ditingkatkan");
                                            } else {
                                                System.out.println("PROGRESS TIDAK TERJALANKAN DENGAN BAIK, inputan kalori perlu ditingkatkan");
                                            }
                                        }

                                        System.out.println("=================");
                                        System.out.println("SELESAI");

                                        if (beratbadan_yangada.get(0) >= berat_badan_tujuan) {
                                            selesai = true;
                                            break;
                                        }
                                    }
                                } else if (menu_menargetkan == 2) {

                                    System.out.println("");
                                    System.out.println("====================");
                                    System.out.println("Laporan sekarang");
                                    System.out.println("====================");

                                    for (double kalori_yangada_df : kalori_yangada) {
                                        System.out.println(df.format(kalori_yangada_df) + " kalori");
                                    }
                                    for (double beratbadan_yangada_df : beratbadan_yangada) {
                                        System.out.println(df.format(beratbadan_yangada_df) + " kg");
                                    }

                                    System.out.println("====================");
                                    System.out.println("Laporan perhari");
                                    System.out.println("====================");

                                    for (int i = 0; i < count_per_day_menargetkan; i++) {
                                        System.out.println("Hari Ke-" + laporan_perhari_menargetkan.get(i));
                                        System.out.println(kalori_perhari_tersimpan.get(i) + " kalori");
                                        System.out.println(beratbadan_perhari_tersimpan.get(i) + " kg");
                                    }

                                } else if (menu_menargetkan == 0) {
                                    break;
                                }

                            } while (menu_menargetkan != 0 || beratbadan_yangada.get(0) != berat_badan_tujuan);

                            if (laporan_perhari_menargetkan.get(0) == 0) {
                                kalori_yangada.get(0);
                                saldo_tersimpan.get(0);

                            } else {
                                kalori_yangada.set(0, perubahan_kalori);
                                saldo_tersimpan.set(0, sisa_saldo);
                            }

                            if (selesai == true) {
                                if (count_per_day < jumlah_hari) {
                                    System.out.println("Luar biasa, anda lebih cepat dari yang diperkirakan");
                                } else if (count_per_day == jumlah_hari) {
                                    System.out.println("Anda sesuai perkiraan");
                                } else {
                                    System.out.println("Anda lebih lambat dari yang diperkirakan");
                                }
                            }

                        } else if (menu_utama == 3) {

                            do {

                                System.out.println("1. Makanan");
                                System.out.println("2. Minuman");
                                System.out.println("0. Exit");
                                System.out.println("Masukan menu konsumsi : ");
                                menu_konsumsi = scan.nextInt();

                                if (menu_konsumsi == 1) {

                                    do {

                                        System.out.println("======");
                                        System.out.println("1. Sarapan");
                                        System.out.println("2. Makanan utama");
                                        System.out.println("3. Makanan ringan");
                                        System.out.println("4. Inputan sendiri");
                                        System.out.println("0. Exit");
                                        System.out.println("Pilih menu makanan : ");
                                        menu_makanan = scan.nextInt();

                                        if (menu_makanan == 1) {

                                            System.out.println("=====================");
                                            System.out.println("Rekomendasi : ");
                                            System.out.println("1. Telur Dadar - 155.0 kalori - IDR15,000.00");
                                            System.out.println("2. Greek Yogurt - 100.0 kalori - IDR70,000.00");
                                            System.out.println("3. Oatmeal - 70.0 kalori - IDR50,000.00");
                                            System.out.println("4. Waffle - 290.0 kalori - IDR60,000.00");
                                            System.out.println("5. Roti Crossiant - 220.0 kalori - IDR45,000.00");

                                        } else if (menu_makanan == 2) {

                                            System.out.println("=====================");
                                            System.out.println("Rekomendasi : ");
                                            System.out.println("1. Udang goreng tepung - 280.0 kalori - IDR50,000.00");
                                            System.out.println("2. Tumis kangkung - 100.0 kalori - IDR25,000.00");
                                            System.out.println("3. Mashed potato - 90.0 kalori  - IDR25,000.00");
                                            System.out.println("4. Perkedel tahu - 220.0 kalori - IDR20,000.00");
                                            System.out.println("5. Kimbap - 140.0 kalori - IDR35,000.00");
                                            System.out.println("6. Capcay - 100.0 kalori - IDR45,000.00");
                                            System.out.println("7. Ikan selar goreng - 305.0 kalori - IDR90,000.00");
                                            System.out.println("8. Ubi jalar isi - 85.0 kalori - IDR25,000.00");
                                            System.out.println("9. Salad - 315.0 kalori - IDR45,000.00");
                                            System.out.println("10. Pasta - 130.0 kalori - IDR30,000.00");
                                            System.out.println("11. Sup ayam - 350.0 kalori - IDR60,000.00");
                                            System.out.println("12. Ayam panggang - 215.0 kalori - IDR40,000.00");

                                        } else if (menu_makanan == 3) {

                                            System.out.println("=====================");
                                            System.out.println("Rekomendasi : ");
                                            System.out.println("1. Kerupuk pisang - 250.0 kalori - IDR50,000.00");
                                            System.out.println("2. Kacang tanah - 350.0 kalori - IDR35,000.0");
                                            System.out.println("3. Sari gandum - 30.0 kalori - IDR15,000.0");
                                            System.out.println("4. Biskuit kelapa - 130.0 kalori - IDR15,000.0");
                                            System.out.println("5. Apel Fooderation - 50.0 kalori - IDR20,000.0");

                                        } else if (menu_makanan == 4) {

                                            do {

                                                System.out.println("=====================");
                                                System.out.println("1. Tambah menu");
                                                System.out.println("2. Hapus makanan");
                                                System.out.println("3. Liat menu");
                                                System.out.println("0. Exit");
                                                System.out.println("Masukan pilihan : ");
                                                pilihan_menu_makanan_sendiri = scan.nextInt();

                                                if (pilihan_menu_makanan_sendiri == 1) {

                                                    benar = false;
                                                    while (benar == false) {

                                                        System.out.println("SYARAT : ANDA HARUS SEPENUHNYA MENGETAHUI MAKANAN YANG ANDA INPUTKAN SENDIRI SERTA JUMLAH KALORI DAN KANDUNGAN (KARBOHIDRAT, PROTEIN, LEMAK, VITAMIN, MINERAL)YANG TERSIMPAN DI DALAMNYA");
                                                        System.out.println("");
                                                        System.out.println("Masukan jumlah makanan yang ingin diinputkan sendiri : ");

                                                        try {
                                                            jumlah_input_makanan = scan.nextInt();
                                                            benar = true;
                                                        } catch (Exception e) {
                                                            System.out.println("INVALID, input harus berupa angka");
                                                            scan.nextLine();
                                                        }
                                                    }
                                                    if (benar == true) {

                                                        for (int i = 0; i < jumlah_input_makanan; i++) {

                                                            System.out.println("Masukan inputan makanan Ke-" + (i + 1) + " : ");
                                                            input_makanan = scan.next() + scan.nextLine();
                                                            menu_makanan_sendiri.add(input_makanan);

                                                            System.out.println("kalori : ");
                                                            kalori_makanan_inputan_sendiri_2 = scan.nextDouble();
                                                            kalori_makanan_inputan_sendiri.add(kalori_makanan_inputan_sendiri_2);
                                                        }
                                                        System.out.println("Menu Makanan : ");
                                                        for (int j = 0; j < menu_makanan_sendiri.size(); j++) {
                                                            System.out.println((j + 1) + ". " + menu_makanan_sendiri.get(j) + " - " + kalori_makanan_inputan_sendiri.get(j) + " kalori");
                                                        }
                                                    }
                                                } else if (pilihan_menu_makanan_sendiri == 2) {

                                                    for (int j = 0; j < menu_makanan_sendiri.size(); j++) {
                                                        System.out.println((j + 1) + ". " + menu_makanan_sendiri.get(j) + " - " + kalori_makanan_inputan_sendiri.get(j) + " kalori");
                                                    }
                                                    do {
                                                        System.out.println("Masukan pilihan makanan yang ingin dihapus : ");
                                                        makanan_yangdihapus = scan.next() + scan.nextLine();

                                                        hapus_makanan = false;

                                                        for (int i = 0; i < menu_makanan_sendiri.size(); i++) {
                                                            if (makanan_yangdihapus.equalsIgnoreCase(menu_makanan_sendiri.get(i))) {

                                                                hapus_makanan = true;
                                                                menu_makanan_sendiri.remove(i);
                                                                kalori_makanan_inputan_sendiri.remove(i);
                                                                break;
                                                            }
                                                        }

                                                        if (hapus_makanan == false) {
                                                            System.out.println("INVALID INPUT");
                                                            System.out.println("NOTE : jika anda sudah menginputkan nama makanan yang benar, maka anda memang belum menginputkan apa-apa");
                                                            break;
                                                        }
                                                    } while (hapus_makanan == false);
                                                    for (int j = 0; j < menu_makanan_sendiri.size(); j++) {
                                                        System.out.println((j + 1) + ". " + menu_makanan_sendiri.get(j) + " - " + kalori_makanan_inputan_sendiri.get(j) + " kalori");
                                                    }
                                                } else if (pilihan_menu_makanan_sendiri == 3) {
                                                    for (int j = 0; j < menu_makanan_sendiri.size(); j++) {
                                                        System.out.println((j + 1) + ". " + menu_makanan_sendiri.get(j) + " - " + kalori_makanan_inputan_sendiri.get(j) + " kalori");
                                                    }
                                                } else if (pilihan_menu_makanan_sendiri == 0) {
                                                    break;
                                                } else {
                                                    System.out.println("INVALID");
                                                }
                                            } while (pilihan_menu_makanan_sendiri != 0);

                                        } else if (menu_makanan == 0) {
                                            break;
                                        }

                                    } while (menu_makanan != 0);
                                } else if (menu_konsumsi == 2) {

                                    do {

                                        System.out.println("=====================");
                                        System.out.println("1. Air putih");
                                        System.out.println("2. Minuman lainnya");
                                        System.out.println("3. Inputan sendiri");
                                        System.out.println("0. Exit");
                                        System.out.println("Pilih menu minuman : ");
                                        menu_minuman = scan.nextInt();

                                        if (menu_minuman == 1) {

                                        } else if (menu_minuman == 2) {

                                            System.out.println("=====================");
                                            System.out.println("1. Susu Putih - 40.0 kalori - IDR15.000,00");
                                            System.out.println("2. Protein Shake - 285.0 kalori - IDR 80.000,00");
                                            System.out.println("3. Jus Alpukat - 195.0 kalori - IDR30.000,00");
                                            System.out.println("4. Soda - 140.0 kalori - IDR20.000,00 ");
                                            System.out.println("5. Kopi Hitam - 85.0 kalori - IDR20.000,00");
                                            System.out.println("6. Teh Hijau - 5.0 kalori - IDR10.000,00");
                                            System.out.println("7. Air Jahe - 110.0 kalori - IDR 45.000,00");

                                        } else if (menu_minuman == 3) {

                                            do {

                                                System.out.println("=====================");
                                                System.out.println("1. Tambah menu");
                                                System.out.println("2. Hapus minuman");
                                                System.out.println("3. Liat menu");
                                                System.out.println("0. Exit");
                                                System.out.println("Masukan pilihan : ");
                                                pilihan_menu_minuman_sendiri = scan.nextInt();

                                                if (pilihan_menu_minuman_sendiri == 1) {

                                                    benar = false;
                                                    while (benar == false) {

                                                        System.out.println("SYARAT : ANDA HARUS SEPENUHNYA MENGETAHUI MINUMAN YANG ANDA INPUTKAN SENDIRI DAN JUMLAH KALORI YANG TERSIMPAN DI DALAMNYA");
                                                        System.out.println("");
                                                        System.out.println("Masukan jumlah minuman yang ingin diinputkan sendiri : ");

                                                        try {
                                                            jumlah_input_minuman = scan.nextInt();
                                                            benar = true;
                                                        } catch (Exception e) {
                                                            System.out.println("INVALID, input harus berupa angka");
                                                            scan.nextLine();
                                                        }
                                                    }
                                                    if (benar == true) {

                                                        sudah_ada_isi = false;

                                                        for (int i = 0; i < jumlah_input_minuman; i++) {

                                                            System.out.println("Masukan inputan minuman Ke-" + (i + 1) + " : ");
                                                            input_minuman = scan.next() + scan.nextLine();
                                                            menu_minuman_sendiri.add(input_minuman);

                                                            System.out.println("kalori : ");
                                                            kalori_minuman_inputan_sendiri_2 = scan.nextDouble();
                                                            kalori_minuman_inputan_sendiri.add(kalori_minuman_inputan_sendiri_2);
                                                        }
                                                        System.out.println("Menu Minuman : ");
                                                        for (int j = 0; j < menu_minuman_sendiri.size(); j++) {
                                                            System.out.println((j + 1) + ". " + menu_minuman_sendiri.get(j) + " - " + kalori_minuman_inputan_sendiri.get(j) + " kalori");

                                                        }
                                                        sudah_ada_isi = true;
                                                    }
                                                } else if (pilihan_menu_minuman_sendiri == 2) {

                                                    if (sudah_ada_isi = true) {

                                                        for (int j = 1; j < menu_minuman_sendiri.size(); j++) {
                                                            System.out.println((j + 1) + ". " + menu_minuman_sendiri.get(j) + " - " + kalori_minuman_inputan_sendiri.get(j) + " kalori");
                                                        }
                                                        do {
                                                            System.out.println("Masukan pilihan minuman yang ingin dihapus : ");
                                                            minuman_yangdihapus = scan.next() + scan.nextLine();

                                                            hapus_minuman = false;

                                                            for (int i = 0; i < menu_minuman_sendiri.size(); i++) {
                                                                if (minuman_yangdihapus.equalsIgnoreCase(menu_minuman_sendiri.get(i))) {

                                                                    hapus_minuman = true;
                                                                    menu_minuman_sendiri.remove(i);
                                                                    kalori_minuman_inputan_sendiri.remove(i);
                                                                    break;
                                                                }
                                                            }

                                                            if (hapus_minuman == false) {
                                                                System.out.println("INVALID INPUT");
                                                                System.out.println("NOTE : jika anda sudah menginputkan nama minuman yang benar, maka anda memang belum menginputkan apa-apa");
                                                                break;
                                                            }
                                                        } while (hapus_minuman == false);
                                                        for (int j = 0; j < menu_minuman_sendiri.size(); j++) {
                                                            System.out.println((j + 1) + ". " + menu_minuman_sendiri.get(j) + " - " + kalori_minuman_inputan_sendiri.get(j) + " kalori");
                                                        }
                                                    } else {
                                                        System.out.println("ANDA BELUM MENGINPUTKAN APA-APA");
                                                    }
                                                } else if (pilihan_menu_minuman_sendiri == 3) {
                                                    for (int j = 0; j < menu_minuman_sendiri.size(); j++) {
                                                        System.out.println((j + 1) + ". " + menu_minuman_sendiri.get(j) + " - " + kalori_minuman_inputan_sendiri.get(j) + " kalori");
                                                    }
                                                } else if (pilihan_menu_minuman_sendiri == 0) {
                                                    break;
                                                } else {
                                                    System.out.println("INVALID");
                                                }
                                            } while (pilihan_menu_minuman_sendiri != 0);
                                        }

                                    } while (menu_minuman != 0);
                                }
                            } while (menu_konsumsi != 0);
                        } else if (menu_utama == 4) {

                            if (umur >= 50) {
                                System.out.println("Maaf, anda sudah terlalu tua untuk membuka menu ini");

                            } else {

                                do {

                                    System.out.println("=====================");
                                    System.out.println("1. Rekomendasi");
                                    System.out.println("2. Inputan sendiri");
                                    System.out.println("0. Exit");
                                    System.out.println("Pilih menu olahraga : ");
                                    menu_olahraga = scan.nextInt();

                                    if (menu_olahraga == 1) {
                                        System.out.println("=====================");
                                        System.out.println("1. Lari - 60 menit - 275.0 kalori");
                                        System.out.println("2. Mountain Climber - 30 menit - 300.0 kalori");
                                        System.out.println("3. Jumping Jack - 30 menit - 280.0 kalori");
                                        System.out.println("4. Sepeda statis - 30 menit - 250.0 kalori");
                                        System.out.println("5. Berenang - 60 menit - 260.0 kalori");
                                        System.out.println("6. Senam Aerobik - 30 menit - 240.0 kalori");
                                        System.out.println("7. Jalan Kaki - 30 menit - 100.0 kalori");

                                    } else if (menu_olahraga == 2) {

                                        do {

                                            System.out.println("=====================");
                                            System.out.println("1. Tambah menu");
                                            System.out.println("2. Hapus olahraga");
                                            System.out.println("3. Liat menu");
                                            System.out.println("0. Exit");
                                            System.out.println("Masukan pilihan : ");
                                            pilihan_menu_olahraga_sendiri = scan.nextInt();

                                            if (pilihan_menu_olahraga_sendiri == 1) {

                                                benar = false;
                                                while (benar == false) {

                                                    System.out.println("SYARAT : ANDA HARUS SEPENUHNYA MENGETAHUI OLAHRAGA YANG ANDA INPUTKAN SENDIRI, BERAPA MENIT OLAHRAGA TERSEBUT DIJALANKAN, SERTA JUMLAH KALORI YANG TERSIMPAN DI DALAMNYA");
                                                    System.out.println("");
                                                    System.out.println("Masukan jumlah olahraga yang ingin diinputkan sendiri : ");

                                                    try {
                                                        jumlah_input_olahraga = scan.nextInt();
                                                        benar = true;
                                                    } catch (Exception e) {
                                                        System.out.println("INVALID, input harus berupa angka");
                                                        scan.nextLine();
                                                    }
                                                }

                                                if (benar == true) {

                                                    for (int i = 0; i < jumlah_input_olahraga; i++) {

                                                        System.out.println("Masukan inputan olahraga Ke-" + (i + 1) + " : ");
                                                        input_olahraga = scan.next() + scan.nextLine();
                                                        menu_olahraga_sendiri.add(input_olahraga);

                                                        System.out.println("menit (harus diantara 30-60 menit) : ");
                                                        menit_olahraga_inputan_sendiri_2 = scan.nextInt();

                                                        if (menit_olahraga_inputan_sendiri_2 < 30 && menit_olahraga_inputan_sendiri_2 > 60) {
                                                            System.out.println("INVALID");
                                                        } else {
                                                            menit_olahraga_inputan_sendiri.add(menit_olahraga_inputan_sendiri_2);

                                                            System.out.println("kalori : ");
                                                            kalori_olahraga_inputan_sendiri_2 = scan.nextDouble();
                                                            kalori_olahraga_inputan_sendiri.add(kalori_olahraga_inputan_sendiri_2);
                                                        }
                                                        System.out.println("Menu Olahraga : ");
                                                        for (int j = 0; j < menu_olahraga_sendiri.size(); j++) {
                                                            System.out.println((j + 1) + ". " + menu_olahraga_sendiri.get(j) + " - " + menit_olahraga_inputan_sendiri.get(j) + " menit " + "\t\t" + kalori_olahraga_inputan_sendiri.get(j) + " kalori");
                                                        }
                                                    }
                                                }
                                            } else if (pilihan_menu_olahraga_sendiri == 2) {

                                                for (int j = 0; j < menu_olahraga_sendiri.size(); j++) {
                                                    System.out.println((j + 1) + ". " + menu_olahraga_sendiri.get(j) + " - " + menit_olahraga_inputan_sendiri.get(j) + " menit " + "\t\t" + kalori_olahraga_inputan_sendiri.get(j) + " kalori");
                                                }

                                                do {
                                                    System.out.println("Masukan pilihan olahraga yang ingin dihapus : ");
                                                    olahraga_yangdihapus = scan.next() + scan.nextLine();

                                                    hapus_olahraga = false;

                                                    for (int i = 0; i < menu_olahraga_sendiri.size(); i++) {
                                                        if (olahraga_yangdihapus.equalsIgnoreCase(menu_olahraga_sendiri.get(i))) {

                                                            hapus_olahraga = true;
                                                            menu_olahraga_sendiri.remove(i);
                                                            menit_olahraga_inputan_sendiri.remove(i);
                                                            kalori_olahraga_inputan_sendiri.remove(i);
                                                            break;
                                                        }
                                                    }

                                                    if (hapus_olahraga == false) {
                                                        System.out.println("INVALID INPUT");
                                                        System.out.println("NOTE : jika anda sudah menginputkan nama olahraga yang benar, maka anda memang belum menginputkan apa-apa");
                                                        break;
                                                    }
                                                } while (hapus_olahraga == false);
                                                for (int j = 0; j < menu_olahraga_sendiri.size(); j++) {
                                                    System.out.println((j + 1) + ". " + menu_olahraga_sendiri.get(j) + " - " + menit_olahraga_inputan_sendiri.get(j) + " menit " + "\t\t" + kalori_olahraga_inputan_sendiri.get(j) + " kalori");
                                                }

                                            } else if (pilihan_menu_olahraga_sendiri == 3) {

                                                for (int j = 0; j < menu_olahraga_sendiri.size(); j++) {
                                                    System.out.println((j + 1) + ". " + menu_olahraga_sendiri.get(j) + " - " + menit_olahraga_inputan_sendiri.get(j) + " menit " + "\t\t" + kalori_olahraga_inputan_sendiri.get(j) + " kalori");
                                                }
                                            } else if (pilihan_menu_olahraga_sendiri == 0) {
                                                break;
                                            }
                                        } while (pilihan_menu_olahraga_sendiri != 0);
                                    } else if (menu_olahraga == 0) {
                                        break;
                                    }
                                } while (menu_olahraga != 0);
                            }
                        } else if (menu_utama == 5) {

                            do {

                                System.out.println("===================");
                                System.out.println("1. Keseluruhan");
                                System.out.println("2. Terpisah");
                                System.out.println("0. Exit");
                                System.out.println("Masukan pilihan masukan perhari : ");
                                menu_masukan_perhari = scan.nextInt();

                                if (menu_masukan_perhari == 1) {

                                    for (int i = 0; i < laporan_perhari.size(); i++) {
                                        System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                        System.out.println(kalori_perhari_tersimpan.get(i) + " kalori");
                                        System.out.println(beratbadan_perhari_tersimpan.get(i) + " kg");
                                    }

                                } else if (menu_masukan_perhari == 2) {

                                    do {

                                        System.out.println("==========");
                                        System.out.println("1. Masukan konsumsi");
                                        System.out.println("2. Masukan olahraga");
                                        System.out.println("0. Exit");
                                        System.out.println("Masukan pilihan masukan perhari secara terpisah : ");
                                        menu_masukan_perhari_satupersatu = scan.nextInt();

                                        if (menu_masukan_perhari_satupersatu == 1) {

                                            do {
                                                System.out.println("==========");
                                                System.out.println("1. Masukan keseluruhan");
                                                System.out.println("2. Masukan makanan");
                                                System.out.println("3. Masukan minuman");
                                                System.out.println("0. Exit");
                                                System.out.println("Masukan pilihan konsumsi perhari secara terpisah : ");
                                                menu_masukan_perhari_satupersatu_konsumsi = scan.nextInt();

                                                if (menu_masukan_perhari_satupersatu_konsumsi == 1) {

                                                    for (int i = 0; i < laporan_perhari.size(); i++) {
                                                        System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                                        System.out.println(kalori_konsumsi_tersimpan.get(i) + " kalori");
                                                    }
                                                } else if (menu_masukan_perhari_satupersatu_konsumsi == 2) {

                                                    do {
                                                        System.out.println("==========");
                                                        System.out.println("1. Keseluruhan");
                                                        System.out.println("2. Sarapan");
                                                        System.out.println("3. Makanan Utama");
                                                        System.out.println("4. Makanan Ringan");
                                                        System.out.println("5. Makanan sendiri");
                                                        System.out.println("0. Exit");
                                                        System.out.println("Masukan pilihan makanan perhari secara terpisah : ");
                                                        menu_masukan_perhari_satupersatu_konsumsi_makanan = scan.nextInt();

                                                        if (menu_masukan_perhari_satupersatu_konsumsi_makanan == 1) {

                                                            for (int i = 0; i < laporan_perhari.size(); i++) {
                                                                System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                                                System.out.println(kalori_makanan_tersimpan.get(i) + " kalori");
                                                            }

                                                        } else if (menu_masukan_perhari_satupersatu_konsumsi_makanan == 2) {

                                                            for (int i = 0; i < laporan_perhari.size(); i++) {
                                                                System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                                                System.out.println(kalori_makanan_sarapan_tersimpan.get(i) + " kalori");
                                                            }

                                                        } else if (menu_masukan_perhari_satupersatu_konsumsi_makanan == 3) {

                                                            for (int i = 0; i < laporan_perhari.size(); i++) {
                                                                System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                                                System.out.println(kalori_makanan_makananutama_tersimpan.get(i) + " kalori");
                                                            }

                                                        } else if (menu_masukan_perhari_satupersatu_konsumsi_makanan == 4) {

                                                            for (int i = 0; i < laporan_perhari.size(); i++) {
                                                                System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                                                System.out.println(kalori_makanan_makananringan_tersimpan.get(i) + " kalori");
                                                            }

                                                        } else if (menu_masukan_perhari_satupersatu_konsumsi_makanan == 5) {

                                                            for (int i = 0; i < laporan_perhari.size(); i++) {
                                                                System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                                                System.out.println(kalori_makanan_makanansendiri_tersimpan.get(i) + " kalori");
                                                            }

                                                        } else if (menu_masukan_perhari_satupersatu_konsumsi_makanan == 0) {
                                                            break;
                                                        }
                                                    } while (menu_masukan_perhari_satupersatu_konsumsi_makanan != 0);

                                                } else if (menu_masukan_perhari_satupersatu_konsumsi == 3) {

                                                    do {
                                                        System.out.println("==========");
                                                        System.out.println("1. Keseluruhan");
                                                        System.out.println("2. Minuman lainnya");
                                                        System.out.println("3. Minuman sendiri");
                                                        System.out.println("0. Exit");
                                                        System.out.println("Masukan pilihan minuman perhari secara terpisah : ");
                                                        menu_masukan_perhari_satupersatu_konsumsi_minuman = scan.nextInt();

                                                        if (menu_masukan_perhari_satupersatu_konsumsi_minuman == 1) {

                                                            for (int i = 0; i < laporan_perhari.size(); i++) {
                                                                System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                                                System.out.println(kalori_minuman_tersimpan.get(i) + " kalori");
                                                            }

                                                        } else if (menu_masukan_perhari_satupersatu_konsumsi_minuman == 2) {

                                                            for (int i = 0; i < laporan_perhari.size(); i++) {
                                                                System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                                                System.out.println(kalori_minuman_minumanlainnya_tersimpan.get(i) + " kalori");
                                                            }

                                                        } else if (menu_masukan_perhari_satupersatu_konsumsi_minuman == 3) {

                                                            for (int i = 0; i < laporan_perhari.size(); i++) {
                                                                System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                                                System.out.println(kalori_minuman_minumansendiri_tersimpan.get(i) + " kalori");
                                                            }

                                                        } else if (menu_masukan_perhari_satupersatu_konsumsi_minuman == 0) {
                                                            break;
                                                        }
                                                    } while (menu_masukan_perhari_satupersatu_konsumsi_minuman != 0);
                                                } else if (menu_masukan_perhari_satupersatu_konsumsi == 0) {
                                                    break;
                                                }
                                            } while (menu_masukan_perhari_satupersatu_konsumsi != 0);

                                        } else if (menu_masukan_perhari_satupersatu == 2) {

                                            do {
                                                System.out.println("==========");
                                                System.out.println("1. Keseluruhan");
                                                System.out.println("2. Olahraga lainnya");
                                                System.out.println("3. Olahraga sendiri");
                                                System.out.println("0. Exit");
                                                System.out.println("Masukan pilihan olahraga perhari secara terpisah : ");
                                                menu_masukan_perhari_satupersatu_konsumsi_olahraga = scan.nextInt();

                                                if (menu_masukan_perhari_satupersatu_konsumsi_olahraga == 1) {

                                                    for (int i = 0; i < laporan_perhari.size(); i++) {
                                                        System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                                        System.out.println(kalori_olahraga_tersimpan.get(i) + " kalori");
                                                    }
                                                } else if (menu_masukan_perhari_satupersatu_konsumsi_olahraga == 2) {

                                                    for (int i = 0; i < laporan_perhari.size(); i++) {
                                                        System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                                        System.out.println(kalori_olahraga_olahragalainnya_tersimpan.get(i) + " kalori");
                                                    }

                                                } else if (menu_masukan_perhari_satupersatu_konsumsi_olahraga == 3) {

                                                    for (int i = 0; i < laporan_perhari.size(); i++) {
                                                        System.out.println("Hari Ke-" + laporan_perhari.get(i));
                                                        System.out.println(kalori_olahraga_olahragasendiri_tersimpan.get(i) + " kalori");
                                                    }

                                                } else if (menu_masukan_perhari_satupersatu_konsumsi_olahraga == 0) {

                                                    break;
                                                }
                                            } while (menu_masukan_perhari_satupersatu_konsumsi_olahraga != 0);

                                        } else if (menu_masukan_perhari_satupersatu == 0) {
                                            break;
                                        }
                                    } while (menu_masukan_perhari_satupersatu != 0);

                                } else if (menu_masukan_perhari == 0) {
                                    break;
                                }
                            } while (menu_masukan_perhari != 0);

                        } else if (menu_utama == 6) {

                            do {
                                System.out.println("=========");
                                System.out.println("1. Biodata");
                                System.out.println("2. Autentikasi");
                                System.out.println("0. Exit");
                                System.out.println("Masukan menu profil : ");
                                menu_profil = scan.nextInt();

                                if (menu_profil == 1) {
                                    System.out.println("===================");
                                    System.out.println("Biodata : ");
                                    System.out.println("Nama Lengkap : " + nama_tersimpan.get(0));
                                    System.out.println("Umur : " + umur);

                                    if (gender_tersimpan.get(0) == 1) {
                                        System.out.println("Gender : Laki-laki");
                                    } else if (gender_tersimpan.get(0) == 2) {
                                        System.out.println("Gender : Perempuan");
                                    } else if (gender_tersimpan.get(0) == 3) {
                                        System.out.println("Gender : Lainnya");
                                    } else {
                                        System.out.println("INVALID");
                                    }

                                    System.out.println("Berat Badan : " + beratbadan_yangada.get(0) + " kg");
                                    System.out.println("Kalori yang ada : " + kalori_yangada.get(0) + " kalori");

                                    System.out.println("Tinggi Badan : " + tinggi_badan_cm_tersimpan.get(0) + " cm");
                                    System.out.println("Tinggi Badan : " + tinggi_badan + " m");

                                    objek.MengecekBMI(BMI);

                                    for (double BMI_tersimpan_df : BMI_tersimpan) {
                                        System.out.println("BMI : " + df.format(BMI_tersimpan_df));
                                    }

                                    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
                                    String formattedAmount_saldo = currencyFormat.format(saldo_tersimpan.get(0));
                                    System.out.println("Saldo sekarang : " + formattedAmount_saldo);
                                    System.out.println("=============================");
                                    System.out.println("Karbohidrat di tubuh : " + karbohidrat_yangada.get(0) + " gram");
                                    System.out.println("Protein di tubuh : " + protein_yangada.get(0) + " gram");
                                    System.out.println("Lemak di tubuh : " + lemak_yangada.get(0) + " gram");
                                    System.out.println("Vitamin di tubuh : " + vitamin_yangada.get(0) + " gram");
                                    System.out.println("Mineral di tubuh : " + mineral_yangada.get(0) + " gram");

                                    System.out.println("=========================");
                                } else if (menu_profil == 2) {

                                    do {
                                        System.out.println("============");
                                        System.out.println("1. Change Username");
                                        System.out.println("2. Change Password");
                                        System.out.println("0. Exit");
                                        System.out.println("Masukan menu autentikasi : ");
                                        menu_authentication = scan.nextInt();

                                        if (menu_authentication == 1) {

                                            System.out.println("Username : " + array_username);
                                            new_username = scan.next();
                                            array_username.set(0, new_username);
                                            System.out.println("Username Changed");

                                        } else if (menu_authentication == 2) {

                                            System.out.println("Password : " + array_password);

                                            new_password = scan.next();
                                            length = new_password.length(); //cek panjang karakter password
                                            for (int i = 0; i < new_password.length(); i++) { //for loop untuk pengecekan password
                                                if (('a' <= new_password.charAt(i) && new_password.charAt(i) <= 'z')) { //cek mengandung brp huruf kecil
                                                    lowercase++;
                                                }
                                                if (('A' <= new_password.charAt(i) && new_password.charAt(i) <= 'Z')) { //cek mengandung berapa huruf besar
                                                    uppercase++;
                                                }
                                                if (('0' <= new_password.charAt(i) && new_password.charAt(i) <= '9')) { //cek mengandung berapa angka
                                                    number++;
                                                }
                                                if (('!' <= new_password.charAt(i) && new_password.charAt(i) <= '/') || (':' <= new_password.charAt(i) && new_password.charAt(i) <= '@')) { //cek mengandung berapa karakter
                                                    specialchar++;
                                                }
                                            }

                                            if (length >= default_password_length && lowercase >= default_lowercase && uppercase >= default_uppercase && number >= default_number && specialchar >= default_spesial_char) {
                                                array_password.set(0, new_password);
                                                System.out.println("Password Changed");
                                            }

                                        } else if (menu_authentication == 0) {
                                            break;
                                        }
                                    }
                                    while (menu_authentication != 0);

                                } else if (menu_profil == 0) {
                                    break;
                                }
                            }
                            while (menu_profil != 0);

                        } else if (menu_utama == 7) {

                            do {

                                System.out.println("==============");

                                NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
                                String formattedAmount_saldo = currencyFormat.format(saldo_tersimpan.get(0));
                                System.out.println("Saldo sekarang : " + formattedAmount_saldo);

                                System.out.println("==============");
                                System.out.println("1. Tambah saldo");
                                System.out.println("2. Liat pengeluaran saldo");
                                System.out.println("0. Exit");
                                System.out.println("Masukan pilihan menu : ");
                                menu_saldo = scan.nextInt();

                                if (menu_saldo == 1) {

                                    System.out.println("==============");

                                    System.out.println("Masukan jumlah saldo yang ingin ditambah : ");
                                    tambahan_saldo = scan.nextDouble();

                                    if (tambahan_saldo < 0) {
                                        System.out.println("INVALID");
                                    } else {

                                        perubahan_saldo = saldo_tersimpan.get(0) + tambahan_saldo;

                                        NumberFormat currencyFormat_2 = NumberFormat.getCurrencyInstance();
                                        String formattedAmount_perubahan_saldo = currencyFormat.format(perubahan_saldo);
                                        System.out.println("Saldo setelah ditambah : " + formattedAmount_perubahan_saldo);
                                        saldo_tersimpan.set(0, perubahan_saldo);

                                    }

                                } else if (menu_saldo == 2) {

                                    System.out.println("==============");
                                    System.out.println("1. Total pengeluaran");
                                    System.out.println("2. Pengeluaran terpisah");
                                    System.out.println("0. Exit");
                                    System.out.println("Masukan pilihan menu pengeluaran saldo : ");
                                    menu_pengeluaran_saldo = scan.nextInt();

                                    do {
                                        if (menu_pengeluaran_saldo == 1) {

                                            for (int i = 0; i < laporan_perhari.size(); i++) {
                                                System.out.println("Hari Ke-" + laporan_perhari.get(i));

                                                String formattedAmount_pengeluaran = currencyFormat.format(pengeluaran_perhari_tersimpan.get(i));
                                                System.out.println("Pengeluaran : " + formattedAmount_pengeluaran);
                                            }

                                        } else if (menu_pengeluaran_saldo == 2) {

                                            do {
                                                System.out.println("==============");
                                                System.out.println("1. Sarapan");
                                                System.out.println("2. Makanan utama");
                                                System.out.println("3. Makanan ringan");
                                                System.out.println("4. Minuman lainnya");
                                                System.out.println("0. Exit");
                                                System.out.println("Masukan pilihan menu pengeluaran saldo terpisah : ");
                                                menu_pengeluaran_saldo_terpisah = scan.nextInt();

                                                if (menu_pengeluaran_saldo_terpisah == 1) {

                                                    for (int i = 0; i < laporan_perhari.size(); i++) {
                                                        System.out.println("Hari Ke-" + laporan_perhari.get(i));

                                                        String formattedAmount_pengeluaran = currencyFormat.format(harga_makanan_sarapan_tersimpan.get(i));
                                                        System.out.println("Pengeluaran : " + formattedAmount_pengeluaran);
                                                    }
                                                } else if (menu_pengeluaran_saldo_terpisah == 2) {

                                                    for (int i = 0; i < laporan_perhari.size(); i++) {
                                                        System.out.println("Hari Ke-" + laporan_perhari.get(i));

                                                        String formattedAmount_pengeluaran = currencyFormat.format(harga_makanan_makananutama_tersimpan.get(i));
                                                        System.out.println("Pengeluaran : " + formattedAmount_pengeluaran);
                                                    }
                                                } else if (menu_pengeluaran_saldo_terpisah == 3) {

                                                    for (int i = 0; i < laporan_perhari.size(); i++) {
                                                        System.out.println("Hari Ke-" + laporan_perhari.get(i));

                                                        String formattedAmount_pengeluaran = currencyFormat.format(harga_makanan_makananringan_tersimpan.get(i));
                                                        System.out.println("Pengeluaran : " + formattedAmount_pengeluaran);
                                                    }
                                                } else if (menu_pengeluaran_saldo_terpisah == 4) {

                                                    for (int i = 0; i < laporan_perhari.size(); i++) {
                                                        System.out.println("Hari Ke-" + laporan_perhari.get(i));

                                                        String formattedAmount_pengeluaran = currencyFormat.format(harga_minuman_minumanlainnya_tersimpan.get(i));
                                                        System.out.println("Pengeluaran : " + formattedAmount_pengeluaran);
                                                    }
                                                } else if (menu_pengeluaran_saldo_terpisah != 0) {
                                                    break;
                                                }
                                            } while (menu_pengeluaran_saldo_terpisah == 0);
                                        } else if (menu_pengeluaran_saldo == 0) {
                                            break;
                                        }
                                    } while (menu_pengeluaran_saldo != 0);
                                } else if (menu_saldo == 0) {

                                    break;
                                }
                            } while (menu_saldo != 0);
                            saldo_tersimpan.set(0, perubahan_saldo);
                        } else if (menu_utama == 0) {
                            break;
                        }
                    }
                    while (menu_utama != 0);

                    if (kalori_yangada.get(0) == 0) {
                        System.out.println("REST IN PEACE");
                        return;
                    }
                }
            } else if (menu_authentication == 3) {

                System.out.println(array_name);
                System.out.println(array_username);
                System.out.println(array_password);

            } else if (menu_authentication == 0) {
                System.out.println("Sampai Jumpa");
                System.out.println(":)");
                break;
            }
        } while (menu_authentication != 0);
    }

    public double MencariBMI(double berat_badan, double tinggi_badan) {
        DecimalFormat df = new DecimalFormat("#.##");

        double hasil = berat_badan / (tinggi_badan * tinggi_badan);
        df.format(hasil);
        return hasil;
    }

    public void MengecekBMI(double BMI) {

        if (BMI < 18.5) {
            System.out.println("                          ");
            System.out.println("berat badan dibawah normal");
            System.out.println("Disarankan untuk menaikan berat badan");

        }
        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("                          ");
            System.out.println("berat badan badan normal");

        }
        if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("                          ");
            System.out.println("berat badan diatas normal");
            System.out.println("Disarankan untuk menurunkan berat badan");

        }
        if (BMI > 29.9) {
            System.out.println("                          ");
            System.out.println("berat badan obesitas");
            System.out.println("Sangat disarankan untuk menurunkan berat badan");

        }
    }

    public static void register(Scanner in, String username, String password, String name, ArrayList array_name, ArrayList array_username, ArrayList array_password) {
        System.out.println("-------------------------");
        System.out.println("         WELCOME         ");
        System.out.println("-------------------------");
        System.out.println("Name         :");
        in.next();
        //USERNAME VALIDATION
        boolean username_valid;
        do { //looping input & pengecekan username
            username_valid = true; //define username sebagai true
            System.out.print("Username    : "); //input username
            username = in.next(); //input username
            for (int i = 0; i < array_username.size(); i++) { //forloop untuk cek username
                if (array_username.get(i).toString().equals(username)) { //cek apakah sudah ada di arrraylist atau belum
                    System.out.println("Username already exists\n"); //kalau sudah ada tampilkan ini
                    username_valid = false; //set validasi ke false
                }
            }
            if (username.equals(0000)) {
                break;
            }
        } while (username_valid == false); //looping pertanyaan usernames selama validasi false

        //PASSWORD VALIDATION
        int default_password_length = 1; //set panjang min password 12 Char
        int default_lowercase = 1; //set jumlah min lowercase 2 char
        int default_uppercase = 1; //set jumlah min uppercase 2 char
        int default_number = 1; //set jumlah min number 2 char
        int default_spesial_char = 0; //set jumlah min special char 2 char
        boolean password_valid;
        int length = 0, lowercase = 0, uppercase = 0, number = 0, specialchar = 0;

        do {
            password_valid = false; //define password ke false
            System.out.print("Password    : "); //input password
            password = in.next(); //input password
            length = password.length(); //cek panjang karakter password
            for (int i = 0; i < password.length(); i++) { //for loop untuk pengecekan password
                if (('a' <= password.charAt(i) && password.charAt(i) <= 'z')) { //cek mengandung brp huruf kecil
                    lowercase++;
                }
                if (('A' <= password.charAt(i) && password.charAt(i) <= 'Z')) { //cek mengandung berapa huruf besar
                    uppercase++;
                }
                if (('0' <= password.charAt(i) && password.charAt(i) <= '9')) { //cek mengandung berapa angka
                    number++;
                }
                if (('!' <= password.charAt(i) && password.charAt(i) <= '/') || (':' <= password.charAt(i) && password.charAt(i) <= '@')) { //cek mengandung berapa karakter
                    specialchar++;
                }
            }

            if (length >= default_password_length && lowercase >= default_lowercase && uppercase >= default_uppercase && number >= default_number && specialchar >= default_spesial_char) { //cek apakah semua sudah sesuai nilai yang di definisikan di atas atau tidak
                password_valid = true; //kalau iya maka validasi true
            } else {
                System.out.println("Password Invalid"); //sout jika validasi gagal
                System.out.println("Password must have:\n" + default_lowercase + " character lowecase\n" + default_uppercase + " character uppercase\n" + default_number + " digit number\n" + default_spesial_char + " special character\n"); //informasi detail mengenai password yang diperlukan
                password_valid = false; //kalau gagal maka validasi false
            }
        } while (password_valid == false); //melakukan looping selamam password tidak valid

        if (username_valid == true && password_valid == true) { //cek aakah username dan password sudah valid
            array_name.add(name); //jika iya maka simpan nama
            array_username.add(username); //simpan username
            array_password.add(password); //simpan password
            System.out.println("User " + name + " created"); // informasi ada user yang dibuat
        }

    }

    public static int login(Scanner in, String username, String password, ArrayList array_name, ArrayList array_username, ArrayList array_password, int index_user, boolean logged_status) {
        boolean username_valid;
        boolean password_valid = false;
        System.out.println("-------------------------");
        System.out.println("          HELLO          ");
        System.out.println("-------------------------");

        do {
            username_valid = false;
            System.out.print("Username: "); //minta input username
            System.out.println("Forgot Username Type exit");
            username = in.next(); //input username
            if (username.equalsIgnoreCase("exit")) {
                System.out.println("Cancel Login...\nExit...\n\n\n");
                break;
            }
            for (int i = 0; i < array_username.size(); i++) { //for loop untuk cek username
                if (array_username.get(i).toString().equals(username)) { //cek apakah ada username yang di input user dengan di database
                    index_user = i; //jika ada simpan index dari si user
                    username_valid = true; //set validasi true
                    break;
                }
            }
            if (username_valid == false) { //jika salah
                System.out.println("Wrong Username"); //pesan username salah
            }
        } while (username_valid == false); //melakukan looping selama username salah

        while (password_valid == false && username_valid == true) {
            //password_valid = false; //set deklarasi ke false
            System.out.print("Password: "); //minta input password
            System.out.println("Forgot Password Type exit");
            password = in.next(); //input password
            if (password.equalsIgnoreCase("exit")) {
                System.out.println("Cancel Login...\nExit...\n\n\n");
               index_user = -1;
                break;
            }
            if (array_password.get(index_user).toString().equals(password)) { //cek apakah user dengan index i password nya sesuai dengan database i dengan inputan user i
                password_valid = true; //kalau iya, maka set validasi ke true
            }

            if (password_valid == false) { //kalau iya kalah
                System.out.println("Wrong Password"); //keluarkan pesar password salah
            }
        }  //looping selama password salah


        if (username_valid == true && password_valid == true) { //cek apakah username dan password validasi nya sudah true semua
            System.out.println("Acssess Granted"); //jika sudah true kirim pesan
            logged_status = true; //setting status looged menjadi true
        }
        return index_user; //mengiriim kembali status ke PSVM
    }
}