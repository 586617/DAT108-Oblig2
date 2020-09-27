
public class Ansatt {
	private String fornavn;
	private String etternavn;
	private String stilling;
	private Kjonn kjonn;
	private int aarslonn;
	
	public Ansatt(String fornavn, String etternavn, String stilling, Kjonn kjonn, int aarslonn) {
		this.fornavn=fornavn;
		this.etternavn=etternavn;
		this.stilling=stilling;
		this.kjonn=kjonn;
		this.aarslonn=aarslonn;
		
	}
	
	public int getAarslonn() {
		return aarslonn;
	}
	public int setAarslonn(int aarslonn) {
		this.aarslonn=aarslonn;
		return aarslonn;
	}
	
	
	public Kjonn getKjonn() {
		return kjonn;
	}
	
	public String toString() {
		String a=null;
		a=fornavn +" "+etternavn+" "+stilling+" "+kjonn.name()+" "+aarslonn +"\n";
		return a;
	}
}
