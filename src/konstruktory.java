

public class konstruktory {
    public static void main(String[] args){
        Firma f = new Firma();
        f.stworzPracownika();
    }
}

class Pracownik{
    String imie, nazwisko;
    int wiek;

    Pracownik(){}
    Pracownik(Pracownik p_){
        imie = p_.imie;
        nazwisko = p_.nazwisko;
        wiek = p_.wiek;
    }
    Pracownik(String i_, String n_){
        imie = i_;
        nazwisko = n_;
        wiek = 69;
    }
    Pracownik(String i_, String n_, int w_){
        imie = i_;
        nazwisko = n_;
        wiek = w_;
    }
}

class Firma{
    void stworzPracownika(){
        Pracownik p1 = new Pracownik("Wiktor", "Adamowski");
        Pracownik p2 = new Pracownik("Kamil","Josek", 21);
        Pracownik p3 = new Pracownik(p1);

        System.out.println(p1.imie+" "+p1.nazwisko);
        System.out.println(p2.imie+p2.nazwisko+p2.wiek);
        System.out.println(p3.imie+p3.wiek);
    }
}