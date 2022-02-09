package OOP.entities;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public String verificaAprovacao() {
        double nFinal = notaFinal();
        if (nFinal < 60.00) {
            return String.format("FAILED%nMISSING %.2f POINTS", (60.00 - nFinal));
        } else {
            return "PASS";
        }
    }
}
