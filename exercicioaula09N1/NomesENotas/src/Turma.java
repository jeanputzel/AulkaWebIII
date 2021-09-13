public class Turma {

    private double turma1;
    private double turma2;
    private double turma3;
    double media;
    
    
    
    public void setTurma1(double turma1) {
        this.turma1 = turma1;
    }
    
    public Double getTurma1() {
        return  this.turma1;
    }
    
    public void setTurma2(Double turma2) {
        this.turma2 = turma2;
    }
    
    public Double getTurma2() {
        return  this.turma2;
    }
    
    public void setTurma3(Double turma3) {
        this.turma3 = turma3;
    }
    
    public Double getTurma3() {
        return  this.turma3;
    }
          
    public String toString() {
            return this.turma1 + "\n" + 
            this.turma2 + "\n" + 
            this.turma3;
    }
    
    }
    