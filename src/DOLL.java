public abstract class DOLL {
    private final int  tail;
    private boolean opening;
    private DOLL in, contains;

    public DOLL(int tail) {
        this.tail = tail;
    }

    public int getTail() {
        return tail;
    }

    public boolean getOpening() {
        return opening;
    }

    public void setOpen(boolean opening) {
        this.opening = opening;
    }

    public DOLL getIn() {
        return in;
    }

    public void setIn(DOLL in) {
        this.in = in;
    }

    public DOLL getContains() {
        return contains;
    }

    public void setContains(DOLL contains) {
        this.contains = contains;
    }

    public abstract void Open();

    public abstract void Close();

    public abstract void PlaceIn(DOLL doll);

    public abstract void GetOutOf(DOLL doll);
}






