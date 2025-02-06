public class Carro {

    private String nome;
    private String fabricante;
    private String cor;
    private int ano;
    private int valor;
    private boolean motorLigado;

    

    public Carro(String nome, String fabricante, String cor, int ano, int valor, boolean motorLigado) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
        this.motorLigado = false;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public boolean isMotorLigado() {
        return motorLigado;
    }
    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public void ligarMotor() {
        if(!motorLigado) {
            motorLigado = true;
            System.out.println("O motor está ligado");
        } else {
            System.out.println("O motor já está ligado");
        }
    }

    public void desligarMotor() {
        if(motorLigado) {
            motorLigado = false;
            System.out.println("O motor está desligado");    
        } else {
            System.out.println("O motor já está desligado");
        }
    }

    public void acelerar(int velocidade) {
        if(motorLigado) {
            System.out.println("Acelerando para " + velocidade + " km/h");
        } else {
            System.out.println("O motor está desligado. Não é possível acelerar.");
        }
    }


    public void freiar(int velocidade) {
        if(motorLigado) {
            System.out.println("Freiando para " + velocidade + " km/h");
        } else {
            System.out.println("O motor está desligado. Não é possível freiar.");
        }
    }

    public void informacoesDoCarro() {
        System.out.println("Nome: " + nome + "\nFabricante: " + fabricante + "\nCor: " + cor + "\nAno: " + ano);
        System.out.println("Valor: R$" + valor);
    }
}
