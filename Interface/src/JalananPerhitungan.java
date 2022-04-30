import Model.Perhitungan;

public class JalananPerhitungan {

    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);

        s.PrintJudul();

        int Hasilkalian = s.perkalian(4, 6);
        System.out.println(Hasilkalian);

        
        int HasilTambah = s.pertambah(4, 6);
        System.out.println(HasilTambah);
    }
}