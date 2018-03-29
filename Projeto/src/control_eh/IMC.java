/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_eh;

/**
 * @author Erik Santos Sardinha 
 * @author Henrique Lima Velardo
 * Repositório GitHub : https://github.com/henriquevelardo/imc
 */
public class IMC {
    float altura;
    int peso;
    boolean sexo;

    public IMC(float altura, int peso, boolean sexo) {
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }
    public float Calculo(){
        
        float result = (float) peso/(altura*altura);
        return (result);   
    }
    public String Mensagem(){
        String message;
        float imc = this.Calculo();
        if (this.sexo){
            if (imc < 20.7){
                message = "Você está Abaixo do Peso Ideal. Cuide-se!";
            }
            else if ((imc >= 20.7)&&(imc <26.5) ){
                message = "Parabéns!!! Você está em seu Peso Ideal";
            }
            else if ((imc >=26.5)&&(imc<27.9)){
                message = "Cuidado. Você está acima do Peso Ideal.";
            }
            else  if(imc>=31.2){
                message = "Você está OBESO. Procure um Médico.";
            }
            else{
                message = "Altura ou Peso 0. Calculo inválido";
            }
        }
        else{
            if (imc < 19.1){
                message = "Você está Abaixo do Peso Ideal. Cuide-se!";
            }
            else if ((imc >= 19.1)&&(imc<25.9)){
                message = "Parabéns!!! Você está em seu Peso Ideal";
            }
            else if ((imc >= 25.9)&&(imc<32.4)){
                message = "Cuidado. Você está acima do Peso Ideal.";
            }
            else if (imc>=32.4){
                message = "Você está OBESA. Procure um Médico.";
            }
            else{
                message = "Altura ou Peso 0. Calculo inválido"; 
            }
                
        }
                
        return (message);
    }
}
