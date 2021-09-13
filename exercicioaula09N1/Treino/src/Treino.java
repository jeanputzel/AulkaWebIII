public class Treino {

private String nomeAtleta;
private String treino;
private double marca1;
private double marca2; 
private double marca3;


public void setNomeAtleta(String nomeAtleta) {
    this.nomeAtleta = nomeAtleta;
}

public String getNomeAtleta() {
    return  this.nomeAtleta;
}

public void setTreino(String treino) {
    this.treino = treino;
}

public String getTreino() {
    return  this.treino;
}

public void setMarca1 (double marca1) {
    this.marca1 = marca1;
}

public double getMarca1() {
    return this.marca1;
}

public void setMarca2 (double marca2) {
    this.marca2 = marca2;
}

public double getMarca2() {
    return this.marca2;
}

public void setMarca3 (double marca3) {
    this.marca3 = marca3;
}

public double getMarca3() {
    return this.marca3;
}


public String toString() {
        return this.nomeAtleta + "\n" + 
        this.treino + "\n" + 
        this.marca1 + this.marca2 + this.marca3;
}

}
