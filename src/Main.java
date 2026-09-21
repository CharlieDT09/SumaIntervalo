import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inferior, superior, numero;

        do
        {
            System.out.print("Ingrese el límite inferior: ");
            inferior = Integer.parseInt(br.readLine());
            System.out.print("Ingrese el límite superior: ");
            superior = Integer.parseInt(br.readLine());

            if (inferior > superior)
            {
                System.out.println("El límite inferior no puede ser mayor que el superior. Intente de nuevo.\n");
            }
        }
        while (inferior > superior);

        Intervalo intervalo = new Intervalo(inferior, superior);

        System.out.println("\nIngrese números (0 para terminar)");
        System.out.print("Número: ");
        numero = Integer.parseInt(br.readLine());

        while (numero != 0)
        {
            intervalo.registrar(numero);
            System.out.print("Número: ");
            numero = Integer.parseInt(br.readLine());
        }

        System.out.println("\n----- Resultados -----");
        System.out.printf("Intervalo evaluado: [%d, %d]%n", intervalo.getLimiteInferior(), intervalo.getLimiteSuperior());
        System.out.printf("Suma de los números dentro del intervalo: %d%n", intervalo.getSuma());
        System.out.printf("Cantidad de números fuera del intervalo: %d%n", intervalo.getCantidadFuera());

        if (intervalo.getIgualLimites())
        {
            System.out.println("Sí se ingresó al menos un número igual a un límite del intervalo.");
        }
        else
        {
            System.out.println("No se ingresó ningún número igual a los límites del intervalo.");
        }
    }
}