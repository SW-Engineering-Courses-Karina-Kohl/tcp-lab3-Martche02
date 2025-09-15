public class TrianguloEquilatero extends FiguraGeometrica
{
    private double lado;
    protected static final String tipoFigura = "Triangulo Equilatero";
    public TrianguloEquilatero(String cor, double lado)
    {
        super(cor);
        this.lado = lado;
    }

    protected double getLado()
    {
        return this.lado;
    }

    protected void setLado(double lado)
    {
        this.lado = lado;
    }

    public double calcularArea()
    {
        return Math.sqrt(3)*lado*lado/4;
    }

    public double calcularPerimetro()
    {
        return 3*lado;
    }

    public String getTipoFigura()
    {
        return tipoFigura;
    }

    protected String getInfo()
    {
        return "cor: " + cor + "\nid: " + id + "\n" + "lado: " + lado + "\n";
    }

    public String getDetalhes()
    {
        return "lado: " + lado + "\n" + "tipo: " + tipoFigura + "\n";
    }

}
