public abstract class FiguraGeometrica implements CalculosGeometricos
{
    protected String cor;
    protected int id;
    protected static int totalFiguras = 0;
    
    public FiguraGeometrica(String cor)
    {
        this.cor = cor;
        totalFiguras +=1;
        id = totalFiguras;
    }

    protected String getCor()
    {
        return this.cor;
    }

    protected void setCor(String cor)
    {
        this.cor = cor;
    }

    protected static int getTotalFiguras()
    {
        return totalFiguras;
    }

    protected String getInfo()
    {
        return "cor: " + cor + "\nid: " + id + "\n";
    }

    public abstract String getDetalhes();

}
