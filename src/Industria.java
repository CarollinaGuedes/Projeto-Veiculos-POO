

public class Industria {

    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    private boolean seguro;
    private double nota;
    private double totalNotas;
    private double somaDasNotas;
    private double mediaN;
    private String cnpj;
    private String localidade;
    private String marca;
    private double kmRodado;

    public Industria(String modelo, int ano, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getTotalNotas() {
        return totalNotas;
    }

    public void setTotalNotas(double totalNotas) {
        this.totalNotas = totalNotas;
    }

    public double getSomaDasNotas() {
        return somaDasNotas;
    }

    public void setSomaDasNotas(double somaDasNotas) {
        this.somaDasNotas = somaDasNotas;
    }

    public double getMediaN() {
        return mediaN;
    }

    public void setMediaN(double mediaN) {
        this.mediaN = mediaN;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(double kmRodado) {
        this.kmRodado = kmRodado;
    }

    public void notasClientes(double notas) {
        somaDasNotas = somaDasNotas + notas;
        totalNotas++;
    }

    @Override
    public String toString() {
        return "Industria{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                '}';
    }

    public void mediaAvaliacoes() {
        mediaN = somaDasNotas / totalNotas;



    }
}

