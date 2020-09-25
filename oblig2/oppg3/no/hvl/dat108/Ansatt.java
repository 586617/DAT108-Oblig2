package no.hvl.dat108;

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
    
    public String getFornavn() {
        return fornavn;
    }
    
    public String getEtternavn() {
        return etternavn;
    }
    
    public String getStilling() {
        return stilling;
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
    
    @Override
	public String toString() {
		return "Ansatt [Fornavn=" + fornavn + ", Etternavn=" 
				+ etternavn + ", Stilling=" + stilling + ", Kjønn=" + kjonn + ", Årslønn=" + aarslonn + "]";
	}
}
