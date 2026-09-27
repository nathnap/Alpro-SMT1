import java.util.*;



public class Tubes{
    Scanner sc = new Scanner(System.in);
    ArrayList<User> userList = new ArrayList<User>();
    int currentUser = 0;

    public static void main(String[] args){
        Tubes runner = new Tubes();
        runner.loginPage();
    }



    void loginPage(){
        System.out.println("===========================================================================");
        System.out.println("------------------------------- POWER TRACK -------------------------------");
        System.out.println("===========================================================================\n");
        System.out.println("Silahkan masuk menggunakan akun yang telah terdaftar.");
        System.out.println("Jika belum memiliki akun, silahkan lakukan pendaftaran terlebih dahulu :\n");
        System.out.println("1. Masuk");
        System.out.println("2. Daftar / Buat Akun");
        System.out.println("3. Keluar\n");



        System.out.print("Masukkan : ");
        int input = sc.nextInt();
        System.out.println("==========================================================================\n");        



        sc.nextLine();



        switch(input){
            case 1:
        System.out.println("==========================================================================");
        System.out.println("-------------------------------- Masuk -----------------------------------");

                System.out.print("Nama Pengguna : ");
                String usernameinput = sc.nextLine();



                System.out.print("Kata Sandi : ");
                String passwordinput = sc.nextLine();



                System.out.println("==========================================================================\n");



                boolean sameUN = false;
                boolean samePW = false;



                for(int i = 0; i < userList.size(); i++){
                    if(usernameinput.equals(userList.get(i).getUserName())){
                        sameUN = true;
                            if(passwordinput.equals(userList.get(i).getPassWord())){
                                samePW = true;
                                currentUser = i;
                            }
                        break;
                    }
                    else{
                        sameUN = false;
                    }
                }





                if(sameUN == true && samePW == true){
                    menu();
                }
                else{
                    if(sameUN == false){
                        System.out.println("Nama Pengguna Tidak Ditemukan!\n");
                        loginPage();
                    }
                    else if(samePW == false){
                        System.out.println("Kata Sandi Salah!\n");
                        loginPage();
                    }
                }
                break;



            case 2:
                register();
                break;
        
            case 3:
                exit();
                break;



            default:
                System.out.println("Input Tidak Valid!");
                loginPage();
                break;
        }
    }



    void register(){
        System.out.println("==========================================================================");
        System.out.println("--------------------------- Daftar Akun ----------------------------------");

        System.out.print("Nama Pengguna : ");
        String usernamenew = sc.nextLine();



        System.out.print("Kata Sandi Baru : ");
        String passwordnew = sc.nextLine();



        userList.add(new User(usernamenew, passwordnew));



        System.out.println("==========================================================================\n");
        System.out.println("Yay! Akun Berhasil Dibuat!\n");
        loginPage();
    }



    void exit(){
        System.exit(0);
    }
    
    void perangkat(){
        System.out.print("input nama perangkat: ");
        String perangkatnew = sc.nextLine();
        System.out.print("input daya (Watt): ");
        int wattnew = sc.nextInt();
        System.out.print("input jam pemakaian per hari: ");
        int jamPerHari = sc.nextInt();
        sc.nextLine();
        userList.get(currentUser).getPerangkatList().add(new Perangkat(perangkatnew, wattnew, jamPerHari));
        System.out.println("Perangkat berhasil ditambahkan!\n");
    }



    void riwayatPerangkat(){
        System.out.println("==========================================================================");
        System.out.println("--------------------------- Riwayat Perangkat ----------------------------\n");

        if(userList.get(currentUser).getPerangkatList().size() == 0){
            System.out.println("Belum ada perangkat yang ditambahkan\n");
        } else {
            for(int i = 0; i <   userList.get(currentUser).getPerangkatList().size(); i++){
                Perangkat p = userList.get(currentUser).getPerangkatList().get(i);
                int watt = p.getWatt();
                int jamPerHari = p.getJamPerHari();
                int totalPerHariWh = watt * jamPerHari;
                int totalPerMingguWh = totalPerHariWh * 7;
                int totalPerBulanWh = totalPerHariWh * 30;
                System.out.println((i+1) + ". " + "Nama Perangkat   : " + p.getNamaPerangkat());
                System.out.println("   Daya             : " + watt + " Watt");
                System.out.println("   Jam/Hari         : " + jamPerHari + " jam");
                System.out.println("   Pemakaian        : " + totalPerMingguWh + " Wh per minggu");
                System.out.println("                        " + totalPerBulanWh + " Wh per bulan");
            }
            System.out.println("=====================================================================");
            System.out.println("1. Kembali");
            System.out.println("2. Hapus perangkat");
            System.out.print("Masukkan : ");
            int pilih = sc.nextInt();
            sc.nextLine();
            if(pilih == 1){
                return;
            } else if(pilih == 2){
                System.out.print("Masukkan nomor perangkat yang ingin dihapus: ");
                int idx = sc.nextInt();
                sc.nextLine();
                if(idx >= 1 && idx <= userList.get(currentUser).getPerangkatList().size()){
                    userList.get(currentUser).getPerangkatList().remove(idx - 1);
                    System.out.println("Perangkat berhasil dihapus!\n");
                } else {
                    System.out.println("Nomor perangkat tidak valid!\n");
                }
            } else {
                System.out.println("Masukkan tidak valid!\n");
            }
        }
    }



    void menu(){
        System.out.println("==========================================================================");
        System.out.println("---------------------------------- Menu ----------------------------------\n");

        System.out.println("1. Tambahkan perangkat");
        System.out.println("2. Lihat riwayat perangkat");
        System.out.println("3. Total Pemakaian Listrik");
        System.out.println("4. Keluar");
        System.out.println("5. Keluar Akun (Logout)\n");



        System.out.print("Masukkan : ");
        int input = sc.nextInt();
        System.out.println("==========================================================================\n");
        sc.nextLine();



        switch(input) {
            case 1:
                perangkat();
                menu();
                break;
            case 2:
                riwayatPerangkat();
                menu();
                break;
            case 3:
                totalPemakaianListrik();
                menu();
                break;
            case 4:
                exit();
                break;
            case 5:
                loginPage();
                break;
            default:
                System.out.println("Input Tidak Valid\n");
                menu();
                break;
        }
    }

    void totalPemakaianListrik(){
        System.out.println("==========================================================================");
        System.out.println("---------------------- Total Pemakaian Listrik ---------------------------\n");
        if( userList.get(currentUser).getPerangkatList().size() == 0){
            System.out.println("\nBelum ada perangkat yang ditambahkan\n");
            return;
        }

        System.out.println("1. Hitung per Minggu");
        System.out.println("2. Hitung per Bulan");
        System.out.println("3. Hitung per Tahun\n");

        System.out.print("Input : ");
        int input = sc.nextInt();
        System.out.println("==========================================================================\n");
        sc.nextLine();


        int totalWh = 0;

        for(Perangkat p : userList.get(currentUser).getPerangkatList()){
            int watt = p.getWatt();
            int jam = p.getJamPerHari();

            totalWh += watt * jam;
        }

        switch(input){
            case 1 :
                hitungMingguan(totalWh);
                break;
            case 2 :
                hitungBulanan(totalWh);
                break;
            case 3 :
                hitungTahunan(totalWh);
                break;

            default :
                System.out.println("Input tidak valid!\n");
                System.out.println("==================================================================");
            }
}


    void hitungMingguan(int totalPerHariWh){
        int totalMingguWh = totalPerHariWh * 7;
        double totalKwh = totalMingguWh / 1000.0;
        double biaya = totalKwh * 1444.70;

        System.out.println("==========================================================================");
        System.out.println("---------------------- Total Pemakaian Listrik ---------------------------\n");

        System.out.println("Total Energi dan Biaya dalam 1 Minggu : \n");
            System.out.println("Energi Listrik yang Digunakan = " + totalMingguWh + " Wh atau " + totalKwh + " kWh");
            System.out.println("Total Biaya Pemakaian Listrik = " + "Rp " + biaya);
    }

    void hitungBulanan(int totalPerHariWh){
        int totalBulanWh = totalPerHariWh * 30;
        double totalKwh = totalBulanWh / 1000.0;
        double biaya = totalKwh * 1444.70;

        System.out.println("==========================================================================");
        System.out.println("---------------------- Total Pemakaian Listrik ---------------------------\n");

        System.out.println("Total Energi dan Biaya dalam 1 Bulan : \n");
            System.out.println("Energi Listrik yang Digunakan = " + totalBulanWh + " Wh atau " + totalKwh + " kWh");
            System.out.println("Total Biaya Pemakaian Listrik = " + "Rp " + biaya);

    }

    void hitungTahunan(int totalPerHariWh){
        int totalTahunWh = totalPerHariWh * 365;
        double totalKwh = totalTahunWh / 1000.0;
        double biaya = totalKwh * 1444.70;

        System.out.println("==========================================================================");
        System.out.println("---------------------- Total Pemakaian Listrik ---------------------------\n");

        System.out.println("Total Energi dan Biaya dalam 1 Tahun : \n");
            System.out.println("Energi Listrik yang Digunakan = " + totalTahunWh + " Wh atau " + totalKwh + " kWh");
            System.out.println("Total Biaya Pemakaian Listrik = " + "Rp " + biaya);
    }
}


class User{
    private String username, password;
    private ArrayList<Perangkat> perangkatList;


    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.perangkatList = new ArrayList<Perangkat>();
    }



    public void setUserName(String username){
        this.username = username;
    }



    public void setPassWord(String password){
        this.password = password;
    }



    public String getUserName(){
        return this.username;
    }



    public String getPassWord(){
        return this.password;
    }

    public ArrayList<Perangkat> getPerangkatList(){
        return perangkatList;
    }
}



class Perangkat{
    private String namaPerangkat;
    private int watt;
    private int jamPerHari;



    public Perangkat(String namaPerangkat, int watt, int jamPerHari){
        this.namaPerangkat = namaPerangkat;
        this.watt = watt;
        this.jamPerHari = jamPerHari;
    }



    public String getNamaPerangkat(){
        return this.namaPerangkat;
    }



    public int getWatt(){
        return this.watt;
    }



    public int getJamPerHari(){
        return this.jamPerHari;
    }
}


