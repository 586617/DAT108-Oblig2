package no.hvl.dat108;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Oppg3 {
	
	public static void main(String[] args) {

		List<Ansatt> ansatte = Arrays.asList(
				new Ansatt("Philippe", "Haavik", "Sjef over alle sjefer", Kjonn.MANN, 25000),
				new Ansatt("Sebastian", "Wilhelmsen", "Chief Technical Officer", Kjonn.MANN, 900000),
				new Ansatt("Matias", "Amundsen", "R6 Siege Gamer", Kjonn.MANN, 7500000),
				new Ansatt("Kvinne", "Kvinnesen", "Kvinnestudie forsker", Kjonn.KVINNE, 950000),
				new Ansatt("Somebody", "Ones told me", "Darlig sjef", Kjonn.KVINNE, 600000)
				);
		
		System.out.println("Liste med etternavn:");
		
		ansatte.stream()
		.forEach(p -> System.out.println(p.getEtternavn()));
		
		
		System.out.println("Antall kvinner:");
		
		long antallKvinner = ansatte.stream()
		.filter(p -> p.getKjonn().equals(Kjonn.KVINNE))
		.count();
		System.out.println(antallKvinner);
		
		
		System.out.println("Gjennomsnittslønnen til kvinnene:");
		
		int LonnKvinner = ansatte.stream()
		.filter(p -> p.getKjonn().equals(Kjonn.KVINNE))
		.mapToInt(p -> p.getAarslonn())
		.sum();
		System.out.println(LonnKvinner/antallKvinner);
		
		
		System.out.println("Lønnsøkning på 7% til sjefer:");
		
		ansatte.forEach(Ansatt -> {
			if (Ansatt.getStilling().contains("sjef")) {
				Ansatt.setAarslonn((int)Math.round(Ansatt.getAarslonn() * 1.07));
			}
			System.out.println(Ansatt);
		});
		
		
		System.out.println("Tjener mer enn 800 000 kr:");
		
		boolean number = ansatte.stream()
		.anyMatch(p -> p.getAarslonn() > 800000);
		System.out.println(number);
		
		
		System.out.println("Alle ansatte:");
		
		List<String> alleansatte = ansatte.stream()
		.map(p -> "[ " + p.getFornavn() + ", " + p.getEtternavn() + ", " + p.getStilling() + ", " + p.getKjonn() + ", " + p.getAarslonn() + " ] \n")
		.collect(Collectors.toList());
		
		System.out.println(alleansatte);
		
		System.out.println("Ansatt med lavest lønn:");
		
		Ansatt minstlon = ansatte.stream()
		.min(Comparator.comparing(Ansatt::getAarslonn))
		.orElseThrow(NoSuchElementException::new);
		System.out.println(minstlon);
		
		/*List<Integer> minstlonn = ansatte.stream()
		.map(p -> p.getAarslonn())
		.sorted()
		.collect(Collectors.toList());
		
		ansatte.stream()
		.filter(p -> p.getAarslonn() == minstlonn.get(0))
		.forEach(System.out::println);*/
		
		
		System.out.println("Summen av alle heltall (1,1000) som er delelig med 3 eller 5:");
		
		int antallHeltall = IntStream.rangeClosed(1, 1000)
		.filter(i -> i % 5 == 0 || i % 3 == 0)
		.sum();
		System.out.println(antallHeltall);
		
	}
}
