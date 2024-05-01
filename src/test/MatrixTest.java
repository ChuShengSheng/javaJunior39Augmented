package test;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MatrixTest extends TestCase {


    public void testGetRows1() {
        double[][] forTestGetRows = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forTestGetRows);
        int resultFact = matrix.getRows();
        int resultWant = 3;
        assertEquals(resultFact, resultWant);
    }

    public void testGetRows2() {
        double[][] forTestGetRows = new double[5][6];
        Matrix matrix = new Matrix(forTestGetRows);
        int resultFact = matrix.getRows();
        int resultWant = 5;
        assertEquals(resultFact, resultWant);
    }

    public void testGetColumns1() {
        double[][] forTestGetColumns = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        Matrix matrix = new Matrix(forTestGetColumns);
        int resultFact = matrix.getColumns();
        int resultWant = 4;
        assertEquals(resultFact, resultWant);
    }

    public void testGetColumns2() {
        double[][] forTestGetColumns = new double[3][2];
        Matrix matrix = new Matrix(forTestGetColumns);
        int resultFact = matrix.getColumns();
        int resultWant = 2;
        assertEquals(resultFact, resultWant);
    }

    public void testGetValueAt1() {
        double[][] forTestGetValueAt = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        Matrix matrix = new Matrix(forTestGetValueAt);
        double resultFact = matrix.getValueAt(2, 2);
        double resultWant = 9.0;
        assertEquals(resultFact, resultWant);
    }

    public void testGetValueAt2() {
        double[][] forTestGetValueAt = new double[3][3];
        Matrix matrix = new Matrix(forTestGetValueAt);
        double resultFact = matrix.getValueAt(1, 1);
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueAt_ThrowIndexOutOfBounds() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.getValueAt(22, 22);
    }

    public void testSetValueAt1() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        matrix.setValueAt(0, 1, 1234555456);
        double resultFact = matrix.getValueAt(0, 1);
        double resultWait = 1234555456;
        assertEquals(resultWait, resultFact);
    }

    public void testSetValueAt2() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);

        matrix.setValueAt(0, 1, 10.0);
        Assert.assertEquals(10.0, matrix.getValueAt(0, 1), 0);

        matrix.setValueAt(2, 0, -20.0);
        Assert.assertEquals(-20.0, matrix.getValueAt(2, 0), 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValueAt_ThrowIndexOutOfBounds() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        matrix.setValueAt(22, 22, 4.0);
    }

    public void testAddMatrix1() {
        double[][] forTestAddMatrixT = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        double[][] forTestAddMatrixO = {{1, 2, 3, 3}, {4, 5, 6, 6}, {7, 8, 9, 9}};
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resultFact = matrixT.add(matrixO);
        double[][] arrayWant = {{2, 4, 6, 4}, {8, 10, 12, 9}, {14, 16, 18, 14}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testAddMatrix2() {
        double[][] forTestAddMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestAddMatrixO = {{-1, -2, -3, -3}, {-4, -5, -6, -6}, {-7, -8, -9, -9}};
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resultFact = matrixT.add(matrixO);
        double[][] arrayWant = {{-2, -4, -6, -4}, {-8, -10, -12, -9}, {-14, -16, -18, -14}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testAddMatrix3() {
        double[][] forTestAddMatrixT = new double[5][5];
        double[][] forTestAddMatrixO = new double[5][5];
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resultFact = matrixT.add(matrixO);
        double[][] arrayWant = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_differentSizeMatrices_ThrowIllegalArgumentException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        matrix1.add(matrix2);
    }

    public void testSubMatrix1() {
        double[][] forTestSubMatrixT = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        double[][] forTestSubMatrixO = {{1, 2, 3, 3}, {4, 5, 6, 6}, {7, 8, 9, 9}};
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resultFact = matrixT.sub(matrixO);
        double[][] arrayWant = {{0, 0, 0, -2}, {0, 0, 0, -3}, {0, 0, 0, -4}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);

    }

    public void testSubMatrix2() {
        double[][] forTestSubMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestSubMatrixO = {{-1, -2, -3, -3}, {-4, -5, -6, -6}, {-7, -8, -9, -9}};
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resultFact = matrixT.sub(matrixO);
        double[][] arrayWant = {{0, 0, 0, 2}, {0, 0, 0, 3}, {0, 0, 0, 4}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testSubMatrix3() {
        double[][] forTestSubMatrixT = new double[3][3];
        double[][] forTestSubMatrixO = new double[3][3];
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resultFact = matrixT.sub(matrixO);
        double[][] arrayWant = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubWithDifferentSize_ThrowIllegalArgumentException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        matrix1.sub(matrix2);
    }


    public void testMulMatrix1() {
        double[][] forTestMulMatrixT = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        double[][] forTestMulMatrixO = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {4, 5, 7}};
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resultFact = matrixT.mul(matrixO);
        double[][] arrayWant = {{34, 41, 49}, {78, 96, 117}, {122, 151, 185}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testMulMatrix2() {
        double[][] forTestMulMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestMulMatrixO = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}, {-4, -5, -7}};
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resultFact = matrixT.mul(matrixO);
        double[][] arrayWant = {{34, 41, 49}, {78, 96, 117}, {122, 151, 185}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testMulMatrix3() {
        double[][] forTestMulMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestMulMatrixO = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resultFact = matrixT.mul(matrixO);
        double[][] arrayWant = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testMulMatrix4() {
        double[][] forTestMulMatrixT = new double[3][4];
        double[][] forTestMulMatrixO = new double[4][3];
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resultFact = matrixT.mul(matrixO);
        double[][] arrayWant = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMul_ThrowIllegalArgumentException() {
        double[][] forMatrix1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        double[][] forMatrix2 = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        matrix1.mul(matrix2);
    }

    public void testMulonNumMatrix1() {
        double[][] forTestMulonNumMatrix = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        Matrix matrix = new Matrix(forTestMulonNumMatrix);
        IMatrix resultFact = matrix.mul(5);
        double[][] arrayWant = {{-5, -10, -15, -5}, {-20, -25, -30, -15}, {-35, -40, -45, -25}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testMulonNumMatrix2() {
        double[][] forTestMulonNumMatrix = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        Matrix matrix = new Matrix(forTestMulonNumMatrix);
        IMatrix resultFact = matrix.mul(-5);
        double[][] arrayWant = {{5, 10, 15, 5}, {20, 25, 30, 15}, {35, 40, 45, 25}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testMulonNumMatrix3() {
        double[][] forTestMulonNumMatrix = {{1, 2, 3, 4}, {5, 6, 7, 9}, {11, 32, 11, 25}};
        Matrix matrix = new Matrix(forTestMulonNumMatrix);
        IMatrix resultFact = matrix.mul(0);
        double[][] arrayWant = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testTranspose1() {
        Matrix matrix = new Matrix(new double[][]{{-1, -2, 0}, {-4, -5, -6}, {-7, -8, -9}});
        IMatrix result = matrix.transpose();
        assertEquals(-1, result.getValueAt(0, 0), 0);
        assertEquals(-4, result.getValueAt(0, 1), 0);
        assertEquals(-7, result.getValueAt(0, 2), 0);
        assertEquals(-2, result.getValueAt(1, 0), 0);
        assertEquals(-5, result.getValueAt(1, 1), 0);
        assertEquals(-8, result.getValueAt(1, 2), 0);
        assertEquals(0, result.getValueAt(2, 0), 0);
        assertEquals(-6, result.getValueAt(2, 1), 0);
        assertEquals(-9, result.getValueAt(2, 2), 0);
    }

    public void testTranspose2() {
        Matrix matrix = new Matrix(new double[][]{{1, 2}, {3, 4}});
        IMatrix result = matrix.transpose();
        assertEquals(1, result.getValueAt(0, 0), 0);
        assertEquals(3, result.getValueAt(0, 1), 0);
        assertEquals(2, result.getValueAt(1, 0), 0);
        assertEquals(4, result.getValueAt(1, 1), 0);
    }

    public void testFillMatrix() {
        double[][] forTestFillMatrix = new double[3][3];
        Matrix matrix = new Matrix(forTestFillMatrix);
        matrix.fillMatrix(3);
        IMatrix resultFact = matrix;
        double[][] arrayWant = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
        Matrix matrixWant = new Matrix(arrayWant);
        IMatrix resultWant = matrixWant;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminant1() {

        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Matrix matrix = new Matrix(forMatrix);

        double resultFact = matrix.determinant();
        double resultWant = 0.0;

        assertEquals(resultFact, resultWant);
    }

    public void testDeterminant2() {

        double[][] forMatrix = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};

        Matrix matrix = new Matrix(forMatrix);

        double resultFact = matrix.determinant();
        double resultWant = 0.0;

        assertEquals(resultFact, resultWant);
    }

    public void testDeterminant3() {

        double[][] forMatrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        Matrix matrix = new Matrix(forMatrix);

        double resultFact = matrix.determinant();
        double resultWant = 0.0;

        assertEquals(resultFact, resultWant);
    }

    public void testDeterminant4() {

        double[][] forMatrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        Matrix matrix = new Matrix(forMatrix);

        double resultFact = matrix.determinant();
        double resultWant = 1.0;

        assertEquals(resultFact, resultWant);
    }


    public void testDeterminant5() {

        double[][] forMatrix = {{2147483647, 2147483647, 2147483647}, {2147483647, 2147483647, 2147483647}, {2147483647, 2147483647, 2147483647}};

        Matrix matrix = new Matrix(forMatrix);

        double resultFact = matrix.determinant();
        double resultWant = 0.0;

        assertEquals(resultFact, resultWant);
    }

    public void testIsSquareMatrix1() {
        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Matrix matrix = new Matrix(forMatrix);

        assertTrue(matrix.isSquareMatrix());
    }

    public void testIsNullMatrix1() {
        double[][] forMatrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        Matrix matrix = new Matrix(forMatrix);

        assertTrue(matrix.isNullMatrix());
    }

    public void testIsIdentityMatrix1() {
        double[][] forMatrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        Matrix matrix = new Matrix(forMatrix);

        assertTrue(matrix.isIdentityMatrix());
    }
}












