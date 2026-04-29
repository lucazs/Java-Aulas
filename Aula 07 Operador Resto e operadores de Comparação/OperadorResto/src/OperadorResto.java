public class OperadorResto 
{
    public static void main(String[] args) 
    {
        int numeroInteiro = 20;
        long numeroLong = 200000L;

        double numeroDouble = 10d;
        float numeroFloat = 20f;
        System.out.println(numeroFloat);

        numeroFloat = (float) numeroDouble;

        System.out.println(numeroDouble);
        System.out.println(numeroFloat);
        System.out.println(numeroInteiro);
        System.out.println(numeroLong);

        System.out.println("Resto da divisao: " + (20 % 2));
    }
}
