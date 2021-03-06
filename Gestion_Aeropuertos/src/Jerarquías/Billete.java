package Jerarquías;

import java.util.Objects;

public class Billete {

    private Cliente cliente;
    private Vuelo vuelo;
    private int adulto;
    private int ninyo;
    private int maletas;
    private String clase;
    private int precioBillete;


    public Billete() {
        this.cliente = null;
        this.vuelo = null;
        this.adulto = 0;
        this.ninyo = 0;
        this.maletas = 0;
        this.clase = "turista";
        this.precioBillete = 0;
    }

    public Billete(Cliente cliente, Vuelo vuelo, int adulto, int ninyo, int maletas, String clase, int precioBillete) {
        this.cliente = cliente;
        this.vuelo = vuelo;
        this.adulto = adulto;
        this.ninyo = ninyo;
        this.maletas = maletas;
        this.clase = clase;
        this.precioBillete = precioBillete;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vuelo getVuelo() {
        return this.vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public int getAdulto() {
        return this.adulto;
    }

    public void setAdulto(int adulto) {
        this.adulto = adulto;
    }

    public int getNinyo() {
        return this.ninyo;
    }

    public void setNinyo(int ninyo) {
        this.ninyo = ninyo;
    }

    public int getMaletas() {
        return this.maletas;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }

    public String getClase() {
        return this.clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getPrecioBillete() {
        return this.precioBillete;
    }

    public void setPrecioBillete(int precioBillete) {
        this.precioBillete = precioBillete;
    }

    public Billete cliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public Billete vuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
        return this;
    }

    public Billete adulto(int adulto) {
        this.adulto = adulto;
        return this;
    }

    public Billete ninyo(int ninyo) {
        this.ninyo = ninyo;
        return this;
    }

    public Billete maletas(int maletas) {
        this.maletas = maletas;
        return this;
    }

    public Billete clase(String clase) {
        this.clase = clase;
        return this;
    }

    public Billete precioBillete(int precioBillete) {
        this.precioBillete = precioBillete;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Billete)) {
            return false;
        }
        Billete billete = (Billete) o;
        return Objects.equals(cliente, billete.cliente) && Objects.equals(vuelo, billete.vuelo) && adulto == billete.adulto && ninyo == billete.ninyo && maletas == billete.maletas && Objects.equals(clase, billete.clase) && precioBillete == billete.precioBillete;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, vuelo, adulto, ninyo, maletas, clase, precioBillete);
    }

    @Override
    public String toString() {
        return "{" +
            " cliente='" + getCliente() + "'" +
            ", vuelo='" + getVuelo() + "'" +
            ", adulto='" + getAdulto() + "'" +
            ", ninyo='" + getNinyo() + "'" +
            ", maletas='" + getMaletas() + "'" +
            ", clase='" + getClase() + "'" +
            ", precioBillete='" + getPrecioBillete() + "'" +
            "}";
    }
    
   
}