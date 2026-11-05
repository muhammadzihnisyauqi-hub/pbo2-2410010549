/*
 * Nama : Muhammad Zihni Syauqi
 * NPM  : 2410010549
 */
package id.ac.uniska.pbo2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NilaiMahasiswa {

    private final String npm;
    private final String nama;
    private final int nilaiTugas;
    private final int nilaiUts;
    private final int nilaiUas;

    public NilaiMahasiswa(String npm, String nama, int nilaiTugas, int nilaiUts, int nilaiUas) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public int getNilaiUts() {
        return nilaiUts;
    }

    public int getNilaiUas() {
        return nilaiUas;
    }

    public int getNilaiAkhirX10() {
        return 3 * nilaiTugas + 3 * nilaiUts + 4 * nilaiUas;
    }

    public double getNilaiAkhir() {
        return getNilaiAkhirX10() / 10.0;
    }

    public String getNilaiAkhirTeks() {
        return BigDecimal.valueOf(getNilaiAkhirX10(), 1)
                .setScale(2, RoundingMode.HALF_UP)
                .toPlainString()
                .replace('.', ',');
    }

    public String getHuruf() {
        int x10 = getNilaiAkhirX10();
        if (x10 >= 800) {
            return "A";
        } else if (x10 >= 750) {
            return "B+";
        } else if (x10 >= 700) {
            return "B";
        } else if (x10 >= 650) {
            return "C+";
        } else if (x10 >= 600) {
            return "C";
        } else if (x10 >= 400) {
            return "D";
        } else {
            return "E";
        }
    }
}
