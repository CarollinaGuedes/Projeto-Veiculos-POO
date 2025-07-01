public class Moto extends Industria implements Quilometragem {
    private int cilindradas;
    private String tipoFreio;
    private String tipoMoto;
    private boolean partidaEletrica;

    public Moto(String modelo, int ano, String marca) {
        super(modelo, ano, marca);
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "modelo='" + getModelo() + '\'' +
                ", ano=" + getAno() +
                ", marca='" + getMarca() + '\'' +
                ", cilindradas=" + cilindradas +
                ", tipoFreio='" + tipoFreio + '\'' +
                ", tipoMoto='" + tipoMoto + '\'' +
                ", partidaEletrica=" + partidaEletrica +
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
