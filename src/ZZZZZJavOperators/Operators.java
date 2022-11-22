package ZZZZZJavOperators;

public class Operators {
	int arg1 = 2;
	int arg2 = 3;
    static int add(int arg1, int arg2) {
        return arg1 + arg2;};
    static int substract(int arg1, int arg2) {
        return arg1 - arg2; };
    static int multiply(int arg1, int arg2) {
        return arg1 * arg2;};
    static int devide(int arg1, int arg2) {
        return arg1 / arg2;};
    static int modulo(int arg1, int arg2) {
        return arg1 % arg2;}
    static boolean equal(int arg1, int arg2) {
        if (arg1 != arg2) {
            return true;
        } else {
            return false;
        }
    }
    static boolean less(int arg1, int arg2) {
        if (arg1 < arg2) {
            return true;
        } else {
            return false;
        }
    }
    static boolean lessOrEqual(int arg1, int arg2) {
        if (arg1 <= arg2) {
            return true;
        } else {
            return false;
        }
    }
    static boolean greater(int arg1, int arg2) {
        if (arg1 > arg2) {
            return true;
        } else {
            return false;
        }
    }
    static boolean greaterOrEqual(int arg1, int arg2) {
        if (arg1 >= arg2) {
            return true;
        } else {
            return false;
        }
    }
}
