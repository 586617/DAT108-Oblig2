import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;



public class Oppg2 {

	public static void main(String[] args) {
		ArrayList<Ansatt> ansattliste = new ArrayList<Ansatt>();
		
		ansattliste.add(new Ansatt("Philippe", "Haavik", "Sjef over alle sjefer", Kjonn.MANN, 2500000));
		ansattliste.add(new Ansatt("Sebastian", "Wilhelmsen", "Chief Technical Officer", Kjonn.MANN, 900000));
		ansattliste.add(new Ansatt("Matias", "Amundsen", "R6 Siege Gamer", Kjonn.MANN, 750000));
		ansattliste.add(new Ansatt("Kvinne", "Kvinnesen", "Kvinnestudie forsker", Kjonn.KVINNE, 950000));
		
		Function<Ansatt, Integer> kroneTillegg = (a) -> a.setAarslonn(a.getAarslonn()+10000);
		Function<Ansatt, Integer> prosentTillegg = (a) -> a.setAarslonn((int) (a.getAarslonn() * 1.1));
		Function<Ansatt, Integer> kroneTilleggLavlonn = (a) -> (a.getAarslonn() < 1000000) ? kroneTillegg.apply(a) : 0;
		Function<Ansatt, Integer> prosentTilleggMann = (a) -> a.getKjonn().equals(Kjonn.MANN) ? prosentTillegg.apply(a) : 0;
		
		skrivUtAlle(ansattliste);
		
		lonnsoppgjor(ansattliste, kroneTillegg);
		lonnsoppgjor(ansattliste, prosentTillegg);
		lonnsoppgjor(ansattliste, kroneTilleggLavlonn);
		lonnsoppgjor(ansattliste, prosentTilleggMann);
		
		skrivUtAlle(ansattliste);
		
	}
	
	public static void skrivUtAlle(List<Ansatt> ansattl) {
		ansattl.forEach(a -> System.out.println(ansattl.toString()));
	}

	public static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> funksjon) {
		ansatte.forEach(a -> funksjon.apply(a));
	}
}
