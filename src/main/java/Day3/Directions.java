package Day3;

enum Directions {
    RIGHT { // row + 1

        public int getCol(int col, int i) {
            return col;
        }

        public int getRow(int row, int i) {
            return row + i;
        }

        public int getRowCondition(char[][] array, int col) {
            return array[col].length;
        }

        public int getColCondition(char[][] array, int row) {
            return array[row].length;
        }
    },
    LEFT { // row - 1

        public int getCol(int col, int i) {
            return col;
        }

        public int getRow(int row, int i) {
            return row - i;
        }

        public int getRowCondition(char[][] array, int col) {
            return -1;
        }

        public int getColCondition(char[][] array, int row) {
            return -1;
        }
    },
    TOP { // col - 1

        public int getCol(int col, int i) {
            return col - i;
        }

        public int getRow(int row, int i) {
            return row;
        }

        public int getRowCondition(char[][] array, int col) {
            return -1;
        }

        public int getColCondition(char[][] array, int row) {
            return -1;
        }
    },
    BOTTOM { // col + 1

        public int getCol(int col, int i) {
            return col + i;
        }

        public int getRow(int row, int i) {
            return row;
        }

        public int getRowCondition(char[][] array, int col) {
            return array[col].length;
        }

        public int getColCondition(char[][] array, int row) {
            return array[row].length;
        }
    },
    RIGHT_TOP { // row + 1, col - 1

        public int getCol(int col, int i) {
            return TOP.getCol(col, i);
        }

        public int getRow(int row, int i) {
            return RIGHT.getRow(row, i);
        }

        public int getRowCondition(char[][] array, int col) {
            return RIGHT.getRowCondition(array, col);
        }

        public int getColCondition(char[][] array, int row) {
            return TOP.getColCondition(array, row);
        }
    },
    RIGHT_BOTTOM { // row + 1, col + 1

        public int getCol(int col, int i) {
            return BOTTOM.getCol(col, i);
        }

        public int getRow(int row, int i) {
            return RIGHT.getRow(row, i);
        }

        public int getRowCondition(char[][] array, int col) {
            return RIGHT.getRowCondition(array, col);
        }

        public int getColCondition(char[][] array, int row) {
            return BOTTOM.getColCondition(array, row);
        }
    },
    LEFT_TOP { // row - 1, col - 1

        public int getCol(int col, int i) {
            return TOP.getCol(col, i);
        }

        public int getRow(int row, int i) {
            return LEFT.getRow(row, i);
        }

        public int getRowCondition(char[][] array, int col) {
            return LEFT.getRowCondition(array, col);
        }

        public int getColCondition(char[][] array, int row) {
            return TOP.getColCondition(array, row);
        }
    },
    LEFT_BOTTOM { // row - 1, col + 1

        public int getCol(int col, int i) {
            return BOTTOM.getCol(col, i);
        }

        public int getRow(int row, int i) {
            return LEFT.getRow(row, i);
        }

        public int getRowCondition(char[][] array, int col) {
            return LEFT.getRowCondition(array, col);
        }

        public int getColCondition(char[][] array, int row) {
            return BOTTOM.getColCondition(array, row);
        }
    };

    public int getCol(int col, int i) {
        throw new AbstractMethodError();
    }

    public int getRow(int row, int i) {
        throw new AbstractMethodError();
    }

    public int getRowCondition(char[][] array, int col) {
        throw new AbstractMethodError();
    }

    public int getColCondition(char[][] array, int row) {
        throw new AbstractMethodError();
    }
}
