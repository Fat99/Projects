public class Quicksort {
    static void qsort(char items[]) {
        qs(items, 0, items.length - 1);
    }

    private static void qs(char iterns[], int left, int right) {
        int i, j;
        char x, y = 0;
        i = left;
        j = right;
        x = iterns[(left + right) / 2];
        do {
            while ((iterns[i] < x) && (i < right)) i++;
            while ((x < iterns[j]) && (j > left)) j--;
            if (i <= j)
                y = iterns[i];
            iterns[i] = iterns[j];
            iterns[j] = y;
            i++;
            j--;
        }while ( i <= j) ;
        if(left < j) qs(iterns, left, j);
        if(i < right) qs(iterns, i, right);
    }
}