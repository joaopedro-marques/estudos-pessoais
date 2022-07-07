
package Classes;


public class Pessoa {
    
    //Atributos
    private float peso;
    private float altura;
    
    //Métodos
    public float calcularIMC(){
        float imc = getPeso() / (getAltura() * getAltura());
        return imc;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
