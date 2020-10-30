package com.latihan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program Saldo Tabungan Latihan 19
 *
 */
public class SaldoTabungan {

    public static void main(String[] args) {
        //Deklarasi Variabel
        double saldoAwal = 2500000, bunga;
        int lama = 6;
        String saldo;

        // Formating Currency Start
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        // Formating Currency END

        for (int i = 1; i <= lama; i++) {
            bunga = saldoAwal * 0.15;
            saldoAwal = Math.floor(saldoAwal + bunga);
            saldo = kursIndonesia.format(saldoAwal);
            String[] parts = saldo.split(",");
            saldo = parts[0];
            System.out.println("Saldo di bulan ke-" + i + " " + saldo);
        }
    }
}
