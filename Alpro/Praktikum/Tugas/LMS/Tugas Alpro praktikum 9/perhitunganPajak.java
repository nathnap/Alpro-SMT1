import java.util.Scanner;

class DataPajak {
    private long pendapatanTahunan;
    private String statusPernikahan;
    private int jumlahAnak;

    private long ptkp;
    private long pkp;
    private long pajakTotal;

    public void setPendapatanTahunan(long pendapatan) {
        this.pendapatanTahunan = pendapatan;
    }
    public long getPendapatanTahunan() {
        return pendapatanTahunan;
    }

    public void setStatusPernikahan(String status) {
        this.statusPernikahan = status;
    }
    public String getStatusPernikahan() {
        return statusPernikahan;
    }

    public void setJumlahAnak(int anak) {
        this.jumlahAnak = anak;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setPTKP(long ptkp) {
        this.ptkp = ptkp;
    }
    public long getPTKP() {
        return ptkp;
    }

    public void setPKP(long pkp) {
        this.pkp = pkp;
    }
    public long getPKP() {
        return pkp;
    }

    public void setPajakTotal(long pajak) {
        this.pajakTotal = pajak;
    }
    public long getPajakTotal() {
        return pajakTotal;
    }
}

class PajakPajak {
    Scanner input = new Scanner(System.in);

    public DataPajak inputData() {
        DataPajak data = new DataPajak();

        System.out.print("Masukkan total pendapatan tahunan : ");
        long pendapatan = input.nextLong();
        input.nextLine();

        System.out.print("Status pernikahan (TK/K) : ");
        String status = input.nextLine();

        System.out.print("Jumlah anak (0 - 3) : ");
        int anak = input.nextInt();

        data.setPendapatanTahunan(pendapatan);
        data.setStatusPernikahan(status);
        data.setJumlahAnak(anak);

        long ptkp = hitungPTKP(status, anak);
        data.setPTKP(ptkp);

        long pkp = pendapatan - ptkp;
        if (pkp < 0) pkp = 0;
        data.setPKP(pkp);

        long pajak = hitungPajak(pkp);
        data.setPajakTotal(pajak);

        return data;
    }

    public long hitungPTKP(String status, int jumlahAnak) {
        if (jumlahAnak > 3) jumlahAnak = 3;

        long ptkp;

        switch (status) {
            case "TK":
            case "tk":
            case "Tk":
            case "tK":
                if (jumlahAnak == 0) ptkp = 54000000;
                else if (jumlahAnak == 1) ptkp = 58500000;
                else if (jumlahAnak == 2) ptkp = 63000000;
                else ptkp = 67500000;
                break;

            case "K":
            case "k":
                if (jumlahAnak == 0) ptkp = 58500000;
                else if (jumlahAnak == 1) ptkp = 63000000;
                else if (jumlahAnak == 2) ptkp = 67500000;
                else ptkp = 72000000;
                break;

            default:
                System.out.println("Status tidak dikenal! Status dianggap TK.");
                if (jumlahAnak == 0) ptkp = 54000000;
                else if (jumlahAnak == 1) ptkp = 58500000;
                else if (jumlahAnak == 2) ptkp = 63000000;
                else ptkp = 67500000;
        }

        return ptkp;
    }

    public long hitungPajak(long pkp) {

        long pajakTotal = 0;

        long batas1 = 60000000;
        long batas2 = 250000000;
        long batas3 = 500000000;
        long batas4 = 5000000000L;

        if (pkp > 0) {
            long n;
            if (pkp <= batas1) {
                n = pkp;
            } else {
                n = batas1;
            }
            pajakTotal += (n * 5) / 100;
        }

        if (pkp > batas1) {
            long selisih = pkp - batas1;
            long batasKenaikan = batas2 - batas1;
            long n;

            if (selisih <= batasKenaikan) {
                n = selisih;
            } else {
                n = batasKenaikan;
            }
            pajakTotal += (n * 15) / 100;
        }

        if (pkp > batas2) {
            long selisih = pkp - batas2;
            long batasKenaikan = batas3 - batas2;
            long n;

            if (selisih <= batasKenaikan) {
                n = selisih;
            } else {
                n = batasKenaikan;
            }
            pajakTotal += (n * 25) / 100;
        }

        if (pkp > batas3) {
            long selisih = pkp - batas3;
            long batasKenaikan = batas4 - batas3;
            long n;

            if (selisih <= batasKenaikan) {
                n = selisih;
            } else {
                n = batasKenaikan;
            }
            pajakTotal += (n * 30) / 100;
        }

        if (pkp > batas4) {
            long n = pkp - batas4;
            pajakTotal += (n * 35) / 100;
        }

        return pajakTotal;
    }

    public void tampilkanHasil(DataPajak d) {
        System.out.println("\n=== HASIL PERHITUNGAN PAJAK ===");
        System.out.println("Pendapatan Tahunan : " + d.getPendapatanTahunan());
        System.out.println("Status Pernikahan  : " + d.getStatusPernikahan());
        System.out.println("Jumlah Anak        : " + d.getJumlahAnak());
        System.out.println("PTKP               : " + d.getPTKP());
        System.out.println("PKP                : " + d.getPKP());
        System.out.println("Total Pajak        : " + d.getPajakTotal());
    }
}

public class perhitunganPajak {
    public static void main(String[] args) {
        PajakPajak p = new PajakPajak();
        DataPajak data = p.inputData();
        p.tampilkanHasil(data);
    }
}
