public class MoedaDolar implements IMoeda {

    private float dolar;

    @Override
    public float getMoeda() {
        return this.dolar;
    }

    @Override
    public void setMoeda(Integer dolar) {
        this.dolar = dolar;
    }
}
