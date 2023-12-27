package Practice;

public class _16_Counter {
    private String id;
    private int count;

    public _16_Counter(String Id) {
        this.id = Id;
        this.count = 0;
    }

    public void increment() {
        this.count++;
    }

    public int tally() {
        return this.count;
    }

    public String toString() {
        return this.count + " " + this.id;
    }
}
