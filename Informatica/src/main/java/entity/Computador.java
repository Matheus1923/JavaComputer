package entity;

import javax.persistence.*;

@Entity
@Table(name="computador")
public class Computador {

    @Id
    @GeneratedValue
    @Column(name = "idcomputador")

    private int idComputador;

    @Column(name = "nome", nullable = false, length = 50)
    private String Nome;

    @Column(name = "placa", nullable = false, length = 50 )
    private String Placa;

    @Column(name = "processador", nullable = false, length = 50)
    private String Processador;

    @Column(name = "memoria", nullable = false, length = 50)
    private String Memoria;

    @Column(name = "armazenamento", nullable = false, length = 50)
    private String Armazenamento;

    @Column(name = "preco", nullable = false, precision = 11)
    private Double Preco;

    public int getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getProcessador() {
        return Processador;
    }

    public void setProcessador(String processador) {
        Processador = processador;
    }

    public String getMemoria() {
        return Memoria;
    }

    public void setMemoria(String memoria) {
        Memoria = memoria;
    }

    public String getArmazenamento() {
        return Armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        Armazenamento = armazenamento;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double preco) {
        Preco = preco;
    }

}
