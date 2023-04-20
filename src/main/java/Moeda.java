public class Moeda {

    IMoeda moeda;
    MoedaAdapter persistencia;

    public Moeda() {
        moeda = new MoedaDolar();
        persistencia = new MoedaAdapter(moeda);
    }

    public void setMoeda(Integer dolar) {
        moeda.setMoeda(dolar);
        persistencia.salvarMoeda();
    }

    public float getMoeda() {
        return persistencia.recuperarMoeda();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public Float getReal() {
        return persistencia.getReal();
    }
}
