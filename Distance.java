public class Distance{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        double distance = Math.sqrt(a*a + b*b);
        System.out.println("the Euclidean distance from the point (" + a +", "+ b +") to the origin (0, 0)." + distance);
    }
}