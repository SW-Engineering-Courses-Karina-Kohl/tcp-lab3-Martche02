public class Retangulo extends FiguraGeometrica
{
    private double largura;
    private double altura;
    protected static final String tipoFigura = "Retangulo";
    public Retangulo(String cor, double largura, double altura)
    {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    protected double getLargura()
    {
        return this.largura;
    }

    protected void setLargura(double largura)
    {
        this.largura = largura;
    }

    protected double getAltura()
    {
        return this.altura;
    }

    protected void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double calcularArea()
    {
        return largura*altura;
    }

    public double calcularPerimetro()
    {
        return 2*(largura + altura);
    }

    public String getTipoFigura()
    {
        return tipoFigura;
    }

    protected String getInfo()
    {
        return "cor: " + cor + "\nid: " + id + "\n" + "largura: " + largura + "\n" + "altura: " + altura + "\n";
    }

    public String getDetalhes()
    {
        return "largura: " + largura + "\n" + "altura: " + altura + "\n" + "tipo: " + tipoFigura + "\n";
    }

}
