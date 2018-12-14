public class Math {
    public static char[] decToBeen(int b) {
        int k = b;
        int count = 0;
        if(b == 0) {
            char[] s = new char[2];
            s[0] = '0';
            s[1] = '\0';
            return s;
        }
        if(b > 0) {
            while (b > 0) {
                b = b / 2;
                count++;
            }
            char[] d = new char[count+1];
            for (int i = 0; i < count; i++) {
                d[i] = (char) ('0'+k % 2);
                k = k / 2;
            }
            for (int i = 0; i < count / 2; i++) {
                char tmp = d[i];
                d[i] = d[count - i - 1];
                d[count - i - 1] = tmp;
            }
            d[count]='\0';
            return d;
        }
        else{
            int l = -b;
            while (b < 0) {
                b = b / 2;
                count++;
            }
            char[] d = new char[count+2];
            d[0]= '-';
            for (int i = 0; i < count; i++) {
                d[i + 1] =(char) ('0'+l % 2);
                l = l / 2;
            }
            for (int i = 0; i < count / 2; i++) {
                char tmp = d[i + 1];
                d[i + 1] = d[count - i];
                d[count - i] = tmp;
            }
            return d;
        }
    }
}
