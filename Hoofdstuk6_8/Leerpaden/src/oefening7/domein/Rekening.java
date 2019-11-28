package oefening7.domein;

public class Rekening {
    private long rekeningnummer;
    private double saldo;
    private String houder;

    public Rekening()
    {
        this(123456789,"onbekend");
    }

    public Rekening(long rekeningnummer)
    {
        this(rekeningnummer,"onbekend");
    }

    public Rekening(long rekeningnummer, String houder)
    {
        setRekeningnummer(rekeningnummer);
        setHouder(houder);
    }

    public long getRekeningnummer()
    {
        return rekeningnummer;
    }

    private void setRekeningnummer(long rekeningnummer)
    {
        this.rekeningnummer = rekeningnummer;
    }

    public String getHouder()
    {
        return houder;
    }

    public final void setHouder(String houder)
    {
        this.houder = houder;
    }

    public double getSaldo()
    {
        return saldo;
    }

    //stortOp

    //haalAf

    //schrijfBedragOverNaar


    @Override
    public String toString(){
        return String.format("De rekening met rekeningnummer %d behoort toe aan %s en heeft als saldo €%.2f%n", rekeningnummer,
                houder, saldo);
    }

    public void haalAf(int i) {
    }

    public void stortOp(int i) {
    }

    public void schrijfBedragOverNaar(int i, Rekening rekening) {
    }
}
