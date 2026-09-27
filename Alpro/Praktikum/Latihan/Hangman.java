import java.io.*;
import java.util.*;

public class Hangman {

    // ========================= LOGIN SYSTEM ===============================

    public static boolean login(Scanner input) {
        System.out.println("===== LOGIN =====");
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        File file = new File("users.txt");
        try {
            if (!file.exists()) {
                System.out.println("Belum ada akun. Silakan register terlebih dahulu.");
                return false;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    if (parts[0].equals(username) && parts[1].equals(password)) {
                        System.out.println("Login berhasil!");
                        return true;
                    }
                }
            }

            br.close();
            System.out.println("Login gagal!");
            return false;

        } catch (Exception e) {
            return false;
        }
    }

    public static void registerUser(Scanner input) {
        System.out.println("===== REGISTER =====");
        System.out.print("Buat Username: ");
        String username = input.nextLine();
        System.out.print("Buat Password: ");
        String password = input.nextLine();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("users.txt", true));
            bw.write(username + "," + password);
            bw.newLine();
            bw.close();

            System.out.println("Akun berhasil dibuat!");
        } catch (IOException e) {
            System.out.println("Gagal membuat akun!");
        }
    }


    // ========================= SCORE SYSTEM ===============================

    public static void saveScoreHistory(String username, int score) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("history.txt", true));
            bw.write(username + " : " + score);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Gagal menyimpan riwayat skor!");
        }
    }

    public static void saveHighScore(int score) {
        try {
            int current = getHighScore();

            if (score > current) {
                BufferedWriter bw = new BufferedWriter(new FileWriter("highscore.txt"));
                bw.write(String.valueOf(score));
                bw.close();
                System.out.println("🎉 HIGH SCORE BARU: " + score + " !!!");
            }
        } catch (IOException e) {
        }
    }

    public static int getHighScore() {
        try {
            File f = new File("highscore.txt");
            if (!f.exists()) return 0;

            BufferedReader br = new BufferedReader(new FileReader(f));
            int hs = Integer.parseInt(br.readLine());
            br.close();
            return hs;
        } catch (Exception e) {
            return 0;
        }
    }

    public static void showScoreHistory() {
        System.out.println("\n===== RIWAYAT SKOR =====");

        try {
            File f = new File("history.txt");
            if (!f.exists()) {
                System.out.println("Belum ada riwayat skor.");
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (Exception e) {
            System.out.println("Gagal membaca history.");
        }
    }

    // ========================= HANGMAN ASCII ===============================

    public static void printHangman(int wrong) {
        String[] stages = {
            """
              +---+
              |   |
                  |
                  |
                  |
                  |
            =========
            """,
            """
              +---+
              |   |
              O   |
                  |
                  |
                  |
            =========
            """,
            """
              +---+
              |   |
              O   |
              |   |
                  |
                  |
            =========
            """,
            """
              +---+
              |   |
              O   |
             /|   |
                  |
                  |
            =========
            """,
            """
              +---+
              |   |
              O   |
             /|\\  |
                  |
                  |
            =========
            """,
            """
              +---+
              |   |
              O   |
             /|\\  |
             /    |
                  |
            =========
            """,
            """
              +---+
              |   |
              O   |
             /|\\  |
             / \\  |
                  |
            =========
            """
        };

        System.out.println(stages[wrong]);
    }

    // ========================= GAME PLAY ===============================

    public static int playHangman(Scanner input, String username) {
        String[] words = {"JAVA", "PROGRAM", "HANGMAN", "ANDROID", "KEYBOARD", "ROBOT", "KOMPUTER"};
        Random rand = new Random();

        String word = words[rand.nextInt(words.length)];
        char[] progress = new char[word.length()];
        Arrays.fill(progress, '_');

        String guessed = "";
        int mistakes = 0;
        int maxMistakes = 6;

        while (mistakes < maxMistakes) {
            printHangman(mistakes);

            System.out.println("Kata: " + String.valueOf(progress));
            System.out.println("Tebakan: " + guessed);
            System.out.println("Kesalahan: " + mistakes + "/" + maxMistakes);

            System.out.print("Tebak huruf: ");
            char g = Character.toUpperCase(input.next().charAt(0));

            if (guessed.contains(String.valueOf(g))) {
                System.out.println("Huruf sudah ditebak!");
                continue;
            }

            guessed += g + " ";

            boolean correct = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == g) {
                    progress[i] = g;
                    correct = true;
                }
            }

            if (!correct) mistakes++;

            if (String.valueOf(progress).equals(word)) {
                printHangman(mistakes);
                System.out.println("Kata: " + word);
                System.out.println("Selamat! Anda menang!");

                int score = 100 - (mistakes * 10);
                saveHighScore(score);
                saveScoreHistory(username, score);

                return score;
            }
        }

        // kalah
        printHangman(6);
        System.out.println("Anda kalah! Kata yang benar: " + word);
        saveScoreHistory(username, 0);
        return 0;
    }


    // ========================= MENU SYSTEM ===============================

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // LOGIN MENU
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("\n===== MENU LOGIN =====");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");

            int pilih = Integer.parseInt(input.nextLine());

            if (pilih == 1) {
                loggedIn = login(input);
            } else if (pilih == 2) {
                registerUser(input);
            } else if (pilih == 3) {
                System.out.println("Keluar...");
                return;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        System.out.print("\nMasukkan username untuk data skor: ");
        String username = input.nextLine();

        // MAIN MENU
        while (true) {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Main Hangman");
            System.out.println("2. Lihat High Score");
            System.out.println("3. Lihat Riwayat Skor");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");

            int pilih = Integer.parseInt(input.nextLine());

            switch (pilih) {
                case 1:
                    int score = playHangman(input, username);
                    System.out.println("Skor kamu: " + score);
                    break;

                case 2:
                    System.out.println("===== HIGH SCORE =====");
                    System.out.println("High Score: " + getHighScore());
                    break;

                case 3:
                    showScoreHistory();
                    break;

                case 4:
                    System.out.println("Keluar...");
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
