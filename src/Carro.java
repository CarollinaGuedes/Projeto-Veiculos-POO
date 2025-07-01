public class Carro extends Industria implements Quilometragem {
    private int volumePortaMalas;
    private double motor;
    private String combustivel;
    private double consumoMedio;
    private int qtdePortas;
    private boolean airbags;
    private boolean tetoSolar;
    private int qtdePassageiros;

    public Carro(String modelo, int ano, String marca) {
        super(modelo, ano, marca);
    }

    public void setVolumePortaMalas(int volumePortaMalas) {
        this.volumePortaMalas = volumePortaMalas;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }

    public void setAirbags(boolean airbags) {
        this.airbags = airbags;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + getModelo() + '\'' +
                ", ano=" + getAno() +
                ", marca='" + getMarca() + '\'' +
                ", volumePortaMalas=" + volumePortaMalas +
                ", motor=" + motor +
                ", combustivel='" + combustivel + '\'' +
                ", consumoMedio=" + consumoMedio +
                ", qtdePortas=" + qtdePortas +
                ", airbags=" + airbags +
                ", tetoSolar=" + tetoSolar +
                ", qtdePassageiros=" + qtdePassageiros +
                '}';
    }

    @Override
    public String getStatusKm() {
        if (getKmRodado() == 0) {
            return "Este veículo é zero km.";
        } else if (getKmRodado() <= 20000) {
            return "Semi-novo.";
        } else {
            return "Usado.";
        }
    }
}
