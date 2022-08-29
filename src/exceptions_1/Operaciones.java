package exceptions_1;


public class Operaciones {
    //atributos
    
    //metodos de clase
    public static float suma(int op1, int op2){//usan la palabra static y ya no hay necesidad de instanciarlos desde el bojeto. Se invocan con el nombre de la clase
        return op1+op2;
    }
    
    public static float resta(int op1, int op2){//usan la palabra static y ya no hay necesidad de instanciarlos desde el bojeto. Se invocan con el nombre de la clase
        return op1-op2;
    }
    
    public static float multiplicacion(int op1, int op2){//usan la palabra static y ya no hay necesidad de instanciarlos desde el bojeto. Se invocan con el nombre de la clase
        return op1*op2;
    }
    
    public static float division(int op1, int op2) throws MiExcepcion{//usan la palabra static y ya no hay necesidad de instanciarlos desde el bojeto. Se invocan con el nombre de la clase
        float resultado=0;
        if (op2==0){
            throw new MiExcepcion("El operador dos no puede ser cero");
        }
            resultado=op1/op2;
       
        return resultado;
    }
}
