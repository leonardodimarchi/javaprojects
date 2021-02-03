package CalculatorSwing;

import static java.lang.Math.*;
        
public class CalcMath {
    private double leftX, rightY, resultado;
    private String operador;
    
    //Construtor
    
    public CalcMath(double leftX, double rightY, String operador){
        this.setLeftX(leftX);
        this.setRightY(rightY);
        this.setOperador(operador);
    }
    
    //Métodos
    
    public void exec() throws ArithmeticException {
        double resposta; 
        switch (this.operador){
            case "+":
                resposta = this.leftX+this.rightY;
                break;
            case "-":
                resposta = this.leftX-this.rightY;
                break;
            case "X":
                resposta = this.leftX*this.rightY;
                break;
            case "/":                
                resposta = this.leftX/this.rightY;
                if (this.rightY == 0) throw new ArithmeticException("ERRO: / por 0");
                break;
            case "x^y":
                resposta = pow(this.leftX,this.rightY);
                break;
            case "logx(y)":
                resposta = logaritmo(this.leftX,this.rightY);
                if (this.rightY <= 0) throw new ArithmeticException("ERRO: Log de ");
                break;
            default:
                resposta =  0;           
            }            

            this.resultado = resposta;
        }
    
    public String contaToString(){
       return this.leftX+" "+this.operador+" "+this.rightY+" = "+this.resultado;
    }

    private double logaritmo(double base, double logaritmando){              
        double resposta = Math.log(logaritmando)/Math.log(base);    
        return resposta;
    }       
    
    //Getters e Setters

    public double getLeftX() {
        return leftX;
    }

    public void setLeftX(double leftX) {
        this.leftX = leftX;
    }

    public double getRightY() {
        return rightY;
    }

    public void setRightY(double rightY) {
        this.rightY = rightY;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
}
    
    
