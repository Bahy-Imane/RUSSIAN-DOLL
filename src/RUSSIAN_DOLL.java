class RUSSIAN_DOLL extends DOLL {
    public RUSSIAN_DOLL(int tail) {
        super(tail);
    }

    @Override
    public void Open() {
        if (!this.getOpening()) {
            this.setOpen(true);
            System.out.println("Doll is open .");
        } else {
            System.out.println("Doll is already open .");
        }
    }

    @Override
    public void Close() {
        if (this.getOpening()) {
            this.setOpen(false);
            System.out.println("Doll is closed.");
        } else {
            System.out.println("Doll is already close .");
        }
    }

    @Override
    public void PlaceIn(DOLL doll) {
        if (doll.getOpening()) {

            if (doll.getContains() == null ) {

                if (doll.getTail() > this.getTail()) {
                    this.setIn(doll);
                    doll.setContains(this);
                    System.out.println("The Doll is placed in the mother doll successfully .");
                }else {
                    System.out.println("The Doll's tail is too big .");
                }

            } else {
                System.out.println("The doll is already containing an another doll .");
                }
            }

        else {
            System.out.println("The doll is close .");
             }
        }


    @Override
    public void GetOutOf(DOLL doll) {
        if (doll.getOpening()) {

            if (doll.getContains() == this) {
                this.setIn(null);
                doll.setContains(null);
                System.out.println("The Doll is got out of the mother doll successfully");
            } else {
                System.out.println("The doll is already empty ");
            }
        } else {
            System.out.println("The doll is close ");
        }

    }

}
