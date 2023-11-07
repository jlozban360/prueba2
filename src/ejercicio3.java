import java.util.Scanner;

public class ejercicio3
{
    public static void main( String[ ] args )
    {
        Scanner s = new Scanner( System.in );
        System.out.println( "Introduce un valor para hacer la cruz: " );

        int valor = s.nextInt( );

        if( valor % 2 == 0 || valor < 1 )
        {
            System.out.println( "El número no es válido." );
            return;
        }

        for( int i = 1; i <= valor; i++)
            dibujar_equis( i, valor );
    }

    private static void dibujar_equis( int fila, int altura )
    {
        //System.out.printf( "CALL fila %d | altura %d\n", fila, altura );

        if( fila == altura )
        {
            for( int i = 0; i < altura; i++ )
                System.out.print( "X" );
            System.out.println( );
        }
        else
        {
            for( int i = 0; i < altura; i++ )
                System.out.print( " " );

            for( int i = 0; i < altura; i++ )
                System.out.print( "X" );

            System.out.println( );
        }
    }
}
