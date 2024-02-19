public class Matrix implements MatrixInterface{
    private final int[][] field;

    private int columns;

    private int rows;

    public Matrix(int[][] field) {
        this.field = field;
        this.columns = field.length;
        this.rows = field[0].length;
    }

    @Override
    public void pushAt(int value, int indexI, int indexJ) {
        field[indexI][indexJ] = value;
    }

    @Override
    public int getAt(int indexI, int indexJ) {
        return field[indexI][indexJ];
    }

    @Override
    public Matrix add(Matrix matrix) {
        if (this.columns != matrix.getRows() || this.rows != matrix.getRows()) {
            System.err.println("Эти матрицы нельзя складывать");
            return null;
        }
        Matrix newMatrix = new Matrix(new int[field.length][field[0].length]);
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[0].length; j++){
                newMatrix.pushAt(field[i][j] + matrix.getAt(i, j), i, j);
            }
        }
        return newMatrix;
    }

    @Override
    public Matrix sub(Matrix matrix) {
        if (this.columns != matrix.getRows() || this.rows != matrix.getRows()) {
            System.err.println("Эти матрицы нельзя вычитать");
            return null;
        }
        Matrix newMatrix = new Matrix(new int[field.length][field[0].length]);
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[0].length; j++){
                newMatrix.pushAt(field[i][j] - matrix.getAt(i, j), i, j);
            }
        }
        return newMatrix;
    }

    @Override
    public Matrix multiply(Matrix matrix) {
        if (this.columns != matrix.getRows()) {
            System.err.println("Эти матрицы нельзя перемножить");
            return null;
        }
        Matrix newMatrix = new Matrix(new int[field.length][field[0].length]);
        for (int i = 0; i < newMatrix.getColumns(); i++) {
            for (int j = 0; j < newMatrix.getRows(); j++) {
                for (int k = 0; k < field[0].length; k++) {
                    newMatrix.pushAt(newMatrix.getAt(i, j) + field[i][k] * matrix.getAt(k, j), i, j);
                }
            }
        }
        return newMatrix;
    }

    @Override
    public Matrix multiply(int value) {
        Matrix newMatrix = new Matrix(new int[field.length][field[0].length]);
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[0].length; j++){
                newMatrix.pushAt(field[i][j] * value, i, j);
            }
        }
        return newMatrix;
    }

    @Override
    public void fillRandom(){
        for (int i = 0; i < field.length;i++){
            for (int j = 0; j < field[0].length;j++){
                field[i][j] = (int)(Math.random()*10);
            }
        }
    }

    @Override
    public Matrix transpose() {
        if (field.length != field[0].length){
            System.out.println("Матрица не квадратная!");
            return null;
        }
        else {
            Matrix newMatrix = new Matrix(new int[field.length][field[0].length]);
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < i+1; j++) {

                    newMatrix.pushAt(field[i][j], j, i);
                    newMatrix.pushAt(field[j][i], i, j);
                }
            }
            return newMatrix;
        }
    }

    @Override
    public void printMatrix(){
        for (int i = 0; i < field.length; i++){
            System.out.print("|");
            for (int j = 0; j < field[0].length; j++){
                System.out.print(" " + field[i][j]);
            }
            System.out.println(" |");
        }
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return rows;
    }
}
