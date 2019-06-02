package Day3;

import java.util.Objects;

public class Coordinates {

    private Points startPosition;
    private Points endPosition;

    public Coordinates() {
    }

    public Coordinates(Points startPosition) {
        this.startPosition = startPosition;
    }

    public Coordinates(Points startPosition, Points endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public void setStartPosition(Points startPosition) {
        this.startPosition = startPosition;
    }

    public void setEndPosition(Points endPosition) {
        this.endPosition = endPosition;
    }

    public Points getStartPosition() {
        return startPosition;
    }

    public Points getEndPosition() {
        return endPosition;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "startPosition=" + getStartPosition() +
                ", endPosition=" + getEndPosition() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Objects.equals(startPosition, that.startPosition) &&
                Objects.equals(endPosition, that.endPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPosition, endPosition);
    }
}
