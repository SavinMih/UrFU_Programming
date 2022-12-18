package lr4;


public class Example7 {
    public static void main(String[] args) {
        int a = 15;
        int b = 15;
        int[][] rectangle = new int[a][b];
        int c = 0;
        int d = 0;
        int h = 0;
        for (int i = 0; h < rectangle.length ; h++) {
            for (int j = 0; j <(rectangle[i].length - c); j++) {
                rectangle[i][j] = d;
                d++;
            }
            if(i< rectangle.length-1) {
                i++;}
            for (int o = a-1; o > c; o--) {
                rectangle[o][rectangle[i].length-1- c] = d;
                d++;
            }
            c++;
        }
        for (int i = 0; i < rectangle.length; i++){
            for (int j = 0; j < rectangle[i].length; j++){
                System.out.print(rectangle[i][j]+" ");
            }
            System.out.println();
        }
    }
}
