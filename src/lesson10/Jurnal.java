package lesson10;
public class Jurnal extends PrintEdition{
    private int numsInYear;

    public Jurnal() {
    }

    public Jurnal(String name, int year, String izdatelstvo, int numsInYear) {
        super(name, year, izdatelstvo);
        this.numsInYear = numsInYear;
    }

    public int getNumsInYear() {
        return numsInYear;
    }

    public void setNumsInYear(int numsInYear) {
        this.numsInYear = numsInYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Jurnal jurnal = (Jurnal) o;

        return numsInYear == jurnal.numsInYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numsInYear;
        return result;
    }

    @Override
    public String toString() {
        return " Журнал: {" +
                " номер в году = " + numsInYear + super.toString() +
                '}';
    }

}
