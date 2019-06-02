package Day3;

import java.awt.*;
import java.util.*;
import java.util.List;

public class SearchingSolution {


    /**
     * @return list of points, where first letter of searched word occurred
     */
    public static Points[] findAllOccurrencesOfFirstLetter(String word, char[][] array) {
        Points[] possible_occurrences = new Points[array.length * array[0].length];
        int index = 0;

        for (int col = 0; col < array.length; col++) {
            for (int row = 0; row < array[col].length; row++) {
                // System.out.println("Letter: " + array[col][row]);
                if (word.charAt(0) == array[col][row]) {
                    // we have found it, so we should add it the the array
                    possible_occurrences[index] = new Points(col, row);
                    index++;
                    // System.out.println(Arrays.toString(occurrences[index]));
                }
            }
        }

        Points[] points = new Points[index];
        System.arraycopy(possible_occurrences, 0, points, 0, index);

        return points;
    }


    /**
     * @return null if searching word not found; Coordinates if found
     */
    public static Coordinates findWordInTheDirection(String word, char[][] array, Points firstLetterOccurrence, Directions direction) {

        Coordinates coords = new Coordinates();
        coords.setStartPosition(firstLetterOccurrence);

        // e.g. Points [x: 0, y: 0]
        int col = firstLetterOccurrence.getX();
        int row = firstLetterOccurrence.getY();

        for (int i = 1; i < word.length(); i++) {
            if (
                    direction.getRow(row, i) != direction.getRowCondition(array, col)
                            && direction.getCol(col, i) != direction.getColCondition(array, row)
                            && isCharacterAtPosition(word.charAt(i), array, direction.getCol(col, i), direction.getRow(row, i))
            ) {
                // System.out.println("Letter found: " + array[col][row + i]);
                if (i + 1 == word.length()) {
                    // Last letter of searched word was found
                    coords.setEndPosition(new Points(direction.getCol(col, i), direction.getRow(row, i)));
                    // System.out.println("array: " + Arrays.toString(coords[1]));
                    return coords;
                }
            } else {
                return null;
            }
        }

        return null;
    }

    public static Map<Directions, List<Coordinates>> findAll(String word, char[][] array) {
        Map<Directions, List<Coordinates>> map = new HashMap<>();

        Points[] occurrences = SearchingSolution.findAllOccurrencesOfFirstLetter(word, array);

        for (int i = 0; i < occurrences.length; i++) { // iteration over occurrences

            for (Directions direction : Directions.values()) { // iteration over Directions
                Coordinates coordsInDirection = findWordInTheDirection(word, array, occurrences[i], direction);
                if (coordsInDirection != null) {
                    if (map.containsKey(direction)) {
                        // list already exists, just add to it and return
                        map.get(direction).add(coordsInDirection);
                    } else {
                        // create list, add to it and return
                        List<Coordinates> listOfCoordinatesInThisDirection = new ArrayList<>();
                        listOfCoordinatesInThisDirection.add(coordsInDirection);
                        map.put(direction, listOfCoordinatesInThisDirection);
                    }
                }
            }


        }

        return map;
    }


    private static boolean isCharacterAtPosition(char searchingCharacter, char[][] array, int col, int row) {
        return array[col][row] == searchingCharacter;
    }
}
