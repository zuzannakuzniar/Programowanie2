package Day3;

import java.util.Objects;

public class Points {
        private int x;
        private int y;

        public Points(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return String.format("[%d,%d]", getX(), getY());
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Day3.Points points = (Day3.Points) o;
            return x == points.x &&
                    y == points.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
}
