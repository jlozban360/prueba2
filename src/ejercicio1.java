import java.util.Scanner;

public class ejercicio1
{
    public static void main( String[ ] args )
    {
        Scanner s = new Scanner( System.in );

        System.out.println( "Introduce un número:" );

        int valor = s.nextInt( );

        boolean espar = false;

        if( valor % 2 == 0 )
            espar = true;
        else
            espar = false;

        if( valor < 10 )
            System.out.println( "El número introducido tiene que ser mayor a 10." );

        int inicio = 10;

        while( true )
        {
            if( espar )
            {
                if( inicio + 5 > valor )
                {
                    System.out.println( inicio );
                    break;
                }
                else
                {
                    System.out.println( inicio );
                    inicio += 5;
                }
            }
            else
            {
                if( inicio + 3 > valor )
                {
                    System.out.println( inicio );
                    break;
                }
                else
                {
                    System.out.println( inicio );
                    inicio += 3;
                }
            }
        }
    }
}
