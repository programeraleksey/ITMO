public class lab2 {
    public static void main(String[] args){
        var n = "1111011";
        int r1 = Character.getNumericValue(n.charAt(0));
        int r2 = Character.getNumericValue(n.charAt(1));
        int i1 = Character.getNumericValue(n.charAt(2));
        int r3 = Character.getNumericValue(n.charAt(3));
        int i2 = Character.getNumericValue(n.charAt(4));
        int i3 = Character.getNumericValue(n.charAt(5));
        int i4 = Character.getNumericValue(n.charAt(6));
        int s1 = (r1 + i1 + i2 + i4) % 2;
        int s2 = (r2 + i1 + i3 + i4) % 2;
        int s3 = (r3 + i2 + i3 + i4) % 2;
        int problem = s1 + s2 * 2 + s3 * 4;
        switch (problem) {
            case 3 -> i1 = (i1+1)%2;
            case 5 -> i2 = (i2+1)%2;
            case 6 -> i3 = (i3+1)%2;
            case 7 -> i4 = (i4+1)%2;
            default -> {
                return;
            }
        }
        System.out.println(i1 + "" + i2 + i3 + i4);
        System.out.println("бит с ошибкой:" + problem);
    }
}