/*
If statement membolehkan program untuk membuat pilihan.
Berikut ialah program yang hanya akan paparkan nombor 
jika nombor tersebut ialah nombor genap:
*/
public class TutorialIf {
    public static void main(String[] args) {
        int nombor = 4;
        int baki = nombor % 2;

        if (baki == 0) {
            System.out.println(nombor + " ialah nombor genap");
        }
    }
}
//Hasilnya, terpapar 4 ialah nombor genap.

//Sekarang tukar nombor kepada nombor ganjil:
public class TutorialIf {
    public static void main(String[] args) {

        int nombor = 5;
        int baki = nombor % 2;

        if (baki == 0) {
            System.out.println(nombor + " ialah nombor genap");
        }
    }
}
/*dan hasilnya tiada apa-apa yang terpapar.
Sebelum kita pergi ke penerangan tentang code di atas,
kita perlu tahu cara untuk menentukan nombor genap.
Nombor genap tidak akan berbaki apabila dibahagi dengan dua,
contohnya 10 bahagi 2 bersamaan 5 baki 0.
Berlainan dengan nombor ganjil, contohnya 9 bahagi 2 bersamaan 4 baki 1.
Oleh itu, penentu kepada nombor genap ialah baki
selepas nombor tersebut dibahagi dengan dua.
Untuk mendapatkan baki, kita gunakan simbol %.
Jadi, program tersebut akan check sama ada baki
sama dengan 0 dengan menggunakan simbol ==. Jika ya,
program akan laksanakan if statement tersebut.
Jika tidak, program akan abaikan.
Inilah yang dinamakan membuat pilihan (decision making),
maksudnya program boleh membuat pilihan sama ada untuk
laksanakan code ataupun tidak.
*/

//Sekarang kita tambah code kita untuk paparkan
//jika nombor tersebut ialah nombor ganjil:
public class TutorialIf {
    public static void main(String[] args) {

        int nombor = 5;
        int baki = nombor % 2;

        if (baki == 0) {
            System.out.println(nombor + " ialah nombor genap");
        }

        if (baki != 0) {
            System.out.println(nombor + " ialah nombor ganjil");
        }
    }
}
/*
dan barulah terpapar 5 ialah nombor ganjil.
Perhatikan simbol !=
digunakan untuk check sama ada “baki tidak sama dengan 0”.
*/

//If else statement
//Sekarang cuba code berikut dan lihat apa yang berlaku:
public class TutorialIfElse {
    public static void main(String[] args) {

        int umur = 60;

        if (umur > 50) {
            System.out.println("tua");
        }

        if (umur > 20) {
            System.out.println("dewasa");
        }
    }
}
/*
Program akan paparkan kedua-duanya.
Jika kita mahu paparkan hanya salah satu
daripada pilihan tersebut,
kita boleh menggunakan if else statement,
seperti berikut:
*/
public class TutorialIfElse {
    public static void main(String[] args) {

        int umur = 60;

        if (umur > 50) {
            System.out.println("tua");
        } else if (umur > 20) {
            System.out.println("dewasa");
        }
    }
}
/*
Barulah satu pilihan sahaja yang terpilih, iaitu tua.
Kita juga boleh menggunakan else tanpa meletakkan if.
Ini akan membuatkan program akan pilih pilihan
tersebut jika semua pilihan di
atasnya tidak terpilih. Contoh seperti berikut:
*/
public class TutorialIfElse {
    public static void main(String[] args) {

        int umur = 5;

        if (umur > 50) {
            System.out.println("tua");
        } else if (umur > 20) {
            System.out.println("dewasa");
        } else {
            System.out.println("kecik lagi");
        }
    }
}
//else tanpa if merupakan pilihan terakhir bagi code tersebut.
/*
Kita boleh tulis semula code untuk nombor
genap menggunakan cara yang sama:
*/
public class TutorialIfElse {
    public static void main(String[] args) {

        int nombor = 5;
        int baki = nombor % 2;

        if (baki == 0) {
            System.out.println(nombor + " ialah nombor genap");
        } else {
            System.out.println(nombor + " ialah nombor ganjil");
        }
    }
}
//barulah nampak lebih kemas.

//Nested if statement
/*
Nested if statement bermaksud apabila if statement
berada di dalam if statement yang lain. Contohnya:
*/
public class TutorialNestedIf {
    public static void main(String[] args) {

        int umur = 5;

        if (umur >= 0) {    // umur tak boleh negatif
            if (umur > 20) {
                System.out.println("dewasa");
            } else {
                System.out.println("kanak-kanak");
            }
        }
    }
}
/*
 SIMBOL	 MAKSUD
 ==	     sama dengan
 !=	     tak sama dengan
 >	     lebih besar daripada
 <	     lebih kecik daripada
 >=	     lebih besar atau sama dengan
 <=	     lebih kecik atau sama dengan
*/
