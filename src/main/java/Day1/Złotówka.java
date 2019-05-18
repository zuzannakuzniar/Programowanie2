package Day1;

import java.util.Objects;

public class Złotówka {

//    private double value;
    private int value;

    public Złotówka(double value) {
        this.value = (int) ((int) value *100.0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Złotówka złotówka = (Złotówka) o;
        return Double.compare(złotówka.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.format("%.2f PLN", (double) value / 100);
    }

    public Złotówka minus(Złotówka v) {
        Złotówka result = new Złotówka(0);
        result.value = this.value - v.value;
        return v;
    }
}
