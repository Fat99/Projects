class Massiv {
    public static boolean inOrder(int[] a) {
        for (int i = 0; i < 3; i++) {
            if (a[i + 1] < a[i])
                return false;
        }
        return true;
    }
}
