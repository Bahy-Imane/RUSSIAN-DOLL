public class DOLL {
    private int taille;
    private Boolean opening = false;
    private DOLL in, Contains;

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public Boolean getOpening() {
        return opening;
    }

    public void setOpening(Boolean opening) {
        this.opening = opening;
    }

    public DOLL getIn() {
        return in;
    }

    public void setIn(DOLL in) {
        this.in = in;
    }

    public DOLL getContains() {
        return Contains;
    }

    public void setContains(DOLL contains) {
        Contains = contains;
    }



    public DOLL(int taille){       //constructeur;
        this.taille = getTaille();
        this.opening = getOpening();
    }

   void Open () {
        if (!this.opening && this.in == null) {
            System.out.println("Doll is opened .");
            this.opening = true;
        }
        else {
            System.out.println("can't open the doll");
        }
    }

    void Close(){
    if (this.opening && this.in==null) {
        System.out.println("Doll is closed .");
        this.opening = false;
        }
    }

    void PlaceIn(DOLL P){
    if (this.opening && this.in==null && P.opening && P.Contains==null && P.taille>this.taille){
        this.in = P;
        P.Contains = this ;
        System.out.println("Doll is placed in .");
        }
    }


    void GetOutOf(DOLL P){
    if (P.Contains==this && P.opening){
        this.in = null;
        P.Contains = null;
        System.out.println("Doll is got out of .");
        }

    }

}






