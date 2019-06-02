package Day3;

import Day3.Coordinates;
import Day3.Points;
import Day3.SearchingSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class SearchingSolutionTest {

    private char[][] array;

    @BeforeEach
    void setUp() {
        array = new char[][]{
                {'K', 'O', 'T', 'B', 'C', 'B'},
                {'O', 'T', 'O', 'A', 'A', 'K'},
                {'T', 'O', 'K', 'C', 'T', 'O'},
                {'A', 'O', 'A', 'O', 'B', 'T'},
                {'B', 'K', 'K', 'B', 'T', 'A'},
                {'C', 'T', 'O', 'T', 'B', 'C'}
        };
    }

    @DisplayName("Should find all occurrences of single letter in array")
    @Test
    void shouldFindOneChar() {
        String word = "KOT";

        // [0,0], [1,5] ...
        Points[] points = new Points[5];
        points[0] = new Points(0, 0);
        points[1] = new Points(1, 5);
        points[2] = new Points(2, 2);
        points[3] = new Points(4, 1);
        points[4] = new Points(4, 2);

        Assertions.assertArrayEquals(
                points,
                SearchingSolution.findAllOccurrencesOfFirstLetter(word, array));
    }

    @DisplayName("Should find searching word in the right direction")
    @Test
    void shouldFindWordInTheRightDirection() {
        String word = "KOT";

        Coordinates points = new Coordinates();
        points.setStartPosition(new Points(0, 0));    // start position
        points.setEndPosition(new Points(0, 2));    // end position

        Points firstLetterOccurrence = new Points(0, 0);

        Assertions.assertEquals(
                points,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.RIGHT)
        );
    }

    @DisplayName("Should not find searching word in the right direction")
    @Test
    void shouldNotFindWordInTheRightDirection() {
        String word = "KOT";

        Points firstLetterOccurrence = new Points(1, 5);

        Assertions.assertEquals(
                null,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.RIGHT)
        );
    }

    @DisplayName("Should find all occurrences of searching word in the right direction")
    @Test
    void shouldFindAllOccurrencesOfWordInTheRightDirection() {
        String word = "KOT";

        Coordinates occurrence_1 = new Coordinates();
        occurrence_1.setStartPosition(new Points(0, 0));   // start position
        occurrence_1.setEndPosition(new Points(0, 2));     // end position

        Points[] occurrences = SearchingSolution.findAllOccurrencesOfFirstLetter(word, array);

        Coordinates[] results = new Coordinates[occurrences.length];

        for (int i = 0; i < occurrences.length; i++) {
            results[i] = SearchingSolution.findWordInTheDirection(word, array, occurrences[i], Directions.RIGHT);
        }

        // System.out.println(Arrays.toString(results));
        Assertions.assertArrayEquals(
                results,
                new Coordinates[]{occurrence_1, null, null, null, null});
    }

    @DisplayName("Should find searching word in the left direction")
    @Test
    void shouldFindWordInTheLeftDirection() {
        String word = "KOT";

        Coordinates points = new Coordinates();
        points.setStartPosition(new Points(2, 2));    // start position
        points.setEndPosition(new Points(2, 0));    // end position

        Points firstLetterOccurrence = new Points(2, 2);

        Assertions.assertEquals(
                points,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.LEFT)
        );
    }

    @DisplayName("Should not find searching word in the left direction")
    @Test
    void shouldNotFindWordInTheLeftDirection() {
        String word = "KOT";

        Points firstLetterOccurrence = new Points(0, 0);

        Assertions.assertEquals(
                null,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.LEFT)
        );
    }

    @DisplayName("Should find searching word - top direction")
    @Test
    void shouldFindWordTopDirection() {
        String word = "KOT";

        Coordinates points = new Coordinates();
        points.setStartPosition(new Points(2, 2));    // start position
        points.setEndPosition(new Points(0, 2));    // end position

        Points firstLetterOccurrence = new Points(2, 2);

        Assertions.assertEquals(
                points,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.TOP)
        );
    }

    @DisplayName("Should not find searching word - top direction")
    @Test
    void shouldNotFindWordTopDirection() {
        String word = "KOT";

        Points firstLetterOccurrence = new Points(4, 1);

        Assertions.assertEquals(
                null,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.TOP)
        );
    }

    @DisplayName("Should find searching word - bottom direction")
    @Test
    void shouldFindWordBottomDirection() {
        String word = "KOT";

        Coordinates points = new Coordinates();
        points.setStartPosition(new Points(0, 0));    // start position
        points.setEndPosition(new Points(2, 0));    // end position

        Points firstLetterOccurrence = new Points(0, 0);

        Assertions.assertEquals(
                points,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.BOTTOM)
        );
    }

    @DisplayName("Should not find searching word - bottom direction")
    @Test
    void shouldNotFindWordBottomDirection() {
        String word = "KOT";

        Points firstLetterOccurrence = new Points(4, 2);

        Assertions.assertEquals(
                null,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.BOTTOM)
        );
    }

    @DisplayName("Should find searching word - right-top direction")
    @Test
    void shouldFindWordRightTopDirection() {
        String word = "KOT";

        Coordinates points = new Coordinates();
        points.setStartPosition(new Points(4, 2));    // start position
        points.setEndPosition(new Points(2, 4));    // end position

        Points firstLetterOccurrence = new Points(4, 2);

        Assertions.assertEquals(
                points,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.RIGHT_TOP)
        );
    }

    @DisplayName("Should not find searching word - right-top direction")
    @Test
    void shouldNotFindWordRightTopDirection() {
        String word = "KOT";

        Points firstLetterOccurrence = new Points(2, 2);

        Assertions.assertEquals(
                null,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.RIGHT_TOP)
        );
    }

    @DisplayName("Should find searching word - right-bottom direction")
    @Test
    void shouldFindWordRightBottomDirection() {
        String word = "KOT";

        Coordinates points = new Coordinates();
        points.setStartPosition(new Points(2, 2));    // start position
        points.setEndPosition(new Points(4, 4));    // end position

        Points firstLetterOccurrence = new Points(2, 2);

        Assertions.assertEquals(
                points,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.RIGHT_BOTTOM)
        );
    }

    @DisplayName("Should not find searching word - right-bottom direction")
    @Test
    void shouldNotFindWordRightBottomDirection() {
        String word = "KOT";

        Points firstLetterOccurrence = new Points(0, 0);

        Assertions.assertEquals(
                null,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.RIGHT_BOTTOM)
        );
    }

    @DisplayName("Should find searching word - left-top direction")
    @Test
    void shouldFindWordLeftTopDirection() {
        String word = "KOT";

        Coordinates points = new Coordinates();
        points.setStartPosition(new Points(4, 2));    // start position
        points.setEndPosition(new Points(2, 0));    // end position

        Points firstLetterOccurrence = new Points(4, 2);

        Assertions.assertEquals(
                points,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.LEFT_TOP)
        );
    }

    @DisplayName("Should not find searching word - left-top direction")
    @Test
    void shouldNotFindWordLeftTopDirection() {
        String word = "KOT";

        Points firstLetterOccurrence = new Points(2, 2);

        Assertions.assertEquals(
                null,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.LEFT_TOP)
        );
    }

    @DisplayName("Should find searching word - left-bottom direction")
    @Test
    void shouldFindWordLeftBottomDirection() {
        String word = "KOT";

        array = new char[][]{
                {'K', 'O', 'T', 'B', 'C', 'B'},
                {'O', 'T', 'O', 'A', 'A', 'K'},
                {'T', 'O', 'K', 'C', 'T', 'O'},
                {'A', 'O', 'A', 'O', 'B', 'T'},
                {'T', 'K', 'K', 'B', 'T', 'A'},
                {'C', 'T', 'O', 'T', 'B', 'C'}
        };

        Coordinates points = new Coordinates();
        points.setStartPosition(new Points(2, 2));    // start position
        points.setEndPosition(new Points(4, 0));    // end position

        Points firstLetterOccurrence = new Points(2, 2);

        Assertions.assertEquals(
                points,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.LEFT_BOTTOM)
        );
    }

    @DisplayName("Should not find searching word - left-bottom direction")
    @Test
    void shouldNotFindWordLeftBottomDirection() {
        String word = "KOT";

        Points firstLetterOccurrence = new Points(0, 0);

        Assertions.assertEquals(
                null,
                SearchingSolution.findWordInTheDirection(word, array, firstLetterOccurrence, Directions.LEFT_BOTTOM)
        );
    }

    @Test
    void findAll() {
        Map<Directions, List<Coordinates>> map = SearchingSolution.findAll("KOT", array);

        Assertions.assertEquals(map.size(), 7); // directions count
        Assertions.assertEquals(map.get(Directions.BOTTOM).size(), 2); // occurrences for BOTTOM
        Assertions.assertEquals(map.get(Directions.LEFT_BOTTOM), null);

        map.entrySet().stream().forEach(entry -> {
            System.out.format("Direction: %s -> coords: %s\n", entry.getKey(), entry.getValue());
        });
    }

}
