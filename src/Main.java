
public class Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(2, 3);
        Complex complex2 = new Complex(5, -7);

        System.out.println("Действия с комплексными числами:");
        Complex complex3 = complex1.add(complex2);
        System.out.print("2 + 3i + 5 -7i = ");
        complex3.printComplex();

        Complex complex4 = complex1.sub(complex2);
        System.out.print("2 + 3i - 5 -7i = ");
        complex4.printComplex();

        Complex complex5 = complex1.multiply(complex2);
        System.out.print("2 + 3i * 5 -7i = ");
        complex5.printComplex();
        System.out.println();

        Matrix matrixA = new Matrix(new int[3][3]);
        Matrix matrixB = new Matrix(new int[3][3]);

        matrixA.fillRandom();
        System.out.println("Матрица A:");
        matrixA.printMatrix();

        matrixB.fillRandom();
        System.out.println("\nМатрица B:");
        matrixB.printMatrix();

        Matrix matrixT = matrixA.transpose();
        System.out.println("\nТранспонированная А:");
        matrixT.printMatrix();

        Matrix matrixC = matrixA.add(matrixB);
        System.out.println("\nA + B =");
        matrixC.printMatrix();

        Matrix matrixD = matrixA.sub(matrixB);
        System.out.println("\nA - B =");
        matrixD.printMatrix();

        Matrix matrixE = matrixA.multiply(2);
        System.out.println("\nA * 2 =");
        matrixE.printMatrix();

        Matrix matrixF = matrixA.multiply(matrixB);
        System.out.println("\nA * B =");
        matrixF.printMatrix();
    }
}