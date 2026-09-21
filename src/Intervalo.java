public class Intervalo
{
    private int limiteInferior;
    private int limiteSuperior;
    private int suma;
    private int cantidadFuera;
    private boolean igualLimites;

    public Intervalo(int limiteInferior, int limiteSuperior)
    {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        suma = 0;
        cantidadFuera = 0;
        igualLimites = false;
    }

    public int getLimiteInferior()
    {
        return limiteInferior;
    }

    public int getLimiteSuperior()
    {
        return limiteSuperior;
    }

    public int getSuma()
    {
        return suma;
    }

    public int getCantidadFuera()
    {
        return cantidadFuera;
    }

    public boolean getIgualLimites()
    {
        return igualLimites;
    }

    public boolean estaDentro(int numero)
    {
        return numero >= limiteInferior && numero <= limiteSuperior;
    }

    public void registrar(int numero)
    {
        if (estaDentro(numero))
        {
            suma = suma + numero;
        }
        else
        {
            cantidadFuera++;
        }

        if (numero == limiteInferior || numero == limiteSuperior)
        {
            igualLimites = true;
        }
    }
}