package bankomat.bankomatvvg;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class korisnikDat implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "imaSredstva")
   private java.lang.Boolean imaSredstva;
   @org.kie.api.definition.type.Label(value = "ime")
   private java.lang.String ime;
   @org.kie.api.definition.type.Label(value = "prezime")
   private java.lang.String prezime;
   @org.kie.api.definition.type.Label(value = "oib")
   private java.lang.String oib;
   @org.kie.api.definition.type.Label(value = "pin")
   private java.lang.String pin;
   @org.kie.api.definition.type.Label(value = "stanje")
   private java.lang.Integer stanje;
   @org.kie.api.definition.type.Label(value = "korisnikID")
   private java.lang.Integer korisnikID;

   public korisnikDat()
   {
   }

   public java.lang.Boolean getImaSredstva()
   {
      return this.imaSredstva;
   }

   public void setImaSredstva(java.lang.Boolean imaSredstva)
   {
      this.imaSredstva = imaSredstva;
   }

   public java.lang.String getIme()
   {
      return this.ime;
   }

   public void setIme(java.lang.String ime)
   {
      this.ime = ime;
   }

   public java.lang.String getPrezime()
   {
      return this.prezime;
   }

   public void setPrezime(java.lang.String prezime)
   {
      this.prezime = prezime;
   }

   public java.lang.String getOib()
   {
      return this.oib;
   }

   public void setOib(java.lang.String oib)
   {
      this.oib = oib;
   }

   public java.lang.String getPin()
   {
      return this.pin;
   }

   public void setPin(java.lang.String pin)
   {
      this.pin = pin;
   }

   public java.lang.Integer getStanje()
   {
      return this.stanje;
   }

   public void setStanje(java.lang.Integer stanje)
   {
      this.stanje = stanje;
   }

   public java.lang.Integer getKorisnikID()
   {
      return this.korisnikID;
   }

   public void setKorisnikID(java.lang.Integer korisnikID)
   {
      this.korisnikID = korisnikID;
   }

   public korisnikDat(java.lang.Boolean imaSredstva, java.lang.String ime,
         java.lang.String prezime, java.lang.String oib,
         java.lang.String pin, java.lang.Integer stanje,
         java.lang.Integer korisnikID)
   {
      this.imaSredstva = imaSredstva;
      this.ime = ime;
      this.prezime = prezime;
      this.oib = oib;
      this.pin = pin;
      this.stanje = stanje;
      this.korisnikID = korisnikID;
   }

}