import java.util.Scanner;

public class ejercicio4
{
    public static void main( String[ ] args )
    {
        Scanner s = new Scanner( System.in );

        int recorrido = 0;
        int piso_anterior = 0;
        int id = 0;

        while( true )
        {
            System.out.println( "Introduce el número del piso: ");
            int piso = s.nextInt();

            if( piso == -1 ) break;

            int result;

            if( piso > piso_anterior )
                result = piso - piso_anterior;
            else
                result = piso_anterior - piso;

            if( id > 0 )
            {
                while( result > 0)
                {
                    recorrido++;
                    result--;
                }
            }

            piso_anterior = piso;
            id++;
        }

        System.out.printf( "El ascensor se ha movido %d pisos.", recorrido );
    }
}
