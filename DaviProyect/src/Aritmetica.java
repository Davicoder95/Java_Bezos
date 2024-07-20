public class Aritmetica {
    //atrubitos de la clase
    int a;
    int b;

    // Creacion de metodo
    // (se puede recibir argumentos como  int "tipo de dato", el nombre de la variable y si son varias se separan por comas (,) )
    public void sumar(){
        int resultado = a+b; // esta variable es local y solo existe en este metodo, una vez se ejecute se eliminara
        System.out.println(" El resultado es:  "+ resultado);// este metodo no regresa nada por lo tanto se manda a imprimir el resultado de esta suma dentro del mismo metodo
    }
    // si queremos que si retorne el resultado de la suma se hace este metodo
    public int sumarConRetorno(){
        int resultado = a+b;
        return resultado;
    }
    // metodo que recibira los argumetos (enteros)
    // los argumentos son como variables nuevas las cuales se inician en un metodo
    public  int sumarConArgumentos(int arg1,int arg2){//(int arg1,int arg2) a esto se le conoce como la firma del metodo
        a=arg1;
        b=arg2;
        return a+b;// retonar esto o a+b no cambiara nada ya que los valores de a y b permaneceran siempre
        //This.
        // this.a = args1; //( En esta linea podemos observar que el metodo this tomara remplazara en valor inicial
        // de a y lo tomara como el valor de arg1 que es el argumento que se esta usando en ete metodo
    }
}

