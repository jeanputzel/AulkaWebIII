
public class NotaAluno {
    private String nomeDoAluno;
    private String disciplina;
    private float n1, n2, n3;
    private int frequencia;
    
public void setNomeDoAluno(String nomeDoAluno) {
    this.nomeDoAluno = nomeDoAluno;
}

public String getNomeDoAluno() {
    return this.nomeDoAluno;
}

public void setDisciplina (String disciplina) {
    this.disciplina = disciplina;
}

public String getDisciplina() {
    return this.disciplina;
}

public void setN1 (float n1) {
    this.n1 = n1;
}

public float getN1() {
    return this.n1;
}

public void setN2 (float n2) {
    this.n2 = n2;
}

public float getN2() {
    return this.n2;
}

public void setN3 (float n3) {
    this.n3 = n3;
}

public float getN3() {
    return this.n3;
}

public void setFrequencia (int frequencia) {
    this.frequencia = frequencia;
}

public int getFrequencia() {
    return this.frequencia;
}

public String toString() {
    return this.nomeDoAluno + "\n" + 
    this.disciplina + "\n" +    
    this.n1 + "\n" +
    this.n2 + "\n" +
    this.n3 + "\n" +
    this.frequencia;
    }

}