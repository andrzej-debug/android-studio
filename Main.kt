fun main() {

    // 1. Dane ucznia
    val imie = "Jan"
    var klasa = "3 TI"
    val kierunek = "Technik informatyk"

    println("===== DANE UCZNIA =====")
    println("Imię: $imie")
    println("Klasa: $klasa")
    println("Kierunek kształcenia: $kierunek")

    // 2. Funkcja obliczająca liczbę godzin
    fun obliczGodziny(godzinyTygodniowo: Int, liczbaTygodni: Int): Int {
        return godzinyTygodniowo * liczbaTygodni
    }

    // Pierwszy zestaw danych
    val wynik1 = obliczGodziny(30, 4)

    // Drugi zestaw danych
    val wynik2 = obliczGodziny(35, 5)

    println("\n===== LICZBA GODZIN ZAJĘĆ =====")
    println("30 godzin tygodniowo przez 4 tygodnie = $wynik1 godzin")
    println("35 godzin tygodniowo przez 5 tygodni = $wynik2 godzin")
}