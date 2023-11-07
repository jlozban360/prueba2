import java.util.Scanner;

public class ejercicio2
{
    public static void main( String[ ] args )
    {
        Scanner s = new Scanner( System.in );

        int globalnota = 0;
        int numeronotas = 0;

        int aprobados = 0;
        int suspensos = 0;
        while( true )
        {
            System.out.println("Introduce una nota (-1 SALIR): ");
            int nota = s.nextInt();

            if (nota == -1) break;

            if( nota >= 5 )
                aprobados++;
            else
                suspensos++;

            globalnota += nota;
            numeronotas++;
        }

        if( numeronotas > 0 )
        {
            float finalnota = 0.0f;

            finalnota = globalnota / suspensos;
            System.out.printf( "La media es %f\n", finalnota );
            System.out.printf( "Aprobados: %d - Suspensos: %d", aprobados, suspensos );
        }
        else
            System.out.println( "No se han introducido calificaciones." );
    }
}
