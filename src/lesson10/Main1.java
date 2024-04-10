package lesson10;

public class Main1 {
    public static void main(String[] args) {
        double[][] forA = {{2, 4, 6, 7},
                {3, 6, 8, 4},
                {4, 8, 5, 4},
                {8, 6, 4, 3}};

        double[][] forB = {{2, 2, 2, 2},
                {4, 4, 4, 4},
                {5, 5, 5, 5},
                {7, 7, 7, 7}};

        Matrix a = new Matrix(forA);
        Matrix b = new Matrix(forB);

        IMatrix resultAdd = a.add(b);
        IMatrix resultSub = a.sub(b);
        IMatrix resultMul = a.mul(b);
        IMatrix result1Mul = a.mul(5);
        IMatrix resultTranspose = a.transpose();
        IMatrix resultFillMatrix = a;
        IMatrix resultIsSquareMatrix = a;
        IMatrix resultIsNullMatrix = a;
        IMatrix resultIsIdentityMatrix = a;
        resultAdd.printToConsole();
        resultSub.printToConsole();
        resultMul.printToConsole();
        result1Mul.printToConsole();
        resultTranspose.printToConsole();
        resultFillMatrix.printToConsole();
        resultIsSquareMatrix.printToConsole();
        resultIsNullMatrix.printToConsole();
        resultIsIdentityMatrix.printToConsole();

    }
}
