public interface MatrixInterface {
    public void pushAt(int value, int indexI, int indexJ);
    public int getAt(int indexI, int indexJ);
    public Matrix add(Matrix matrix);
    public Matrix sub(Matrix matrix);
    public Matrix multiply(Matrix matrix);
    public Matrix multiply(int value);
    public void fillRandom();
    public Matrix transpose();
    public void printMatrix();
    public int getColumns();
    public int getRows();
}
