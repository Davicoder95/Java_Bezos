public class Main {
    public static void main(String[] args) {
        /*
        // metodo main permite ejecutar nuestras clases
        Persona persona1;
        persona1 = new Persona();
        // se le asignan los valores a persona 1, los cuales son: nombre y apellido
        persona1.nombre= "Juan";
        persona1.apellido="Mendez";
        // se ejecuta el metodo desplegarInformacion la cual lo que hace es desplegar la informacion de los atributos de la clase
        persona1.desplegarInformacion();

        //se crea un nuevo  objeto(instancia) llamado persona 2
        Persona persona2 = new Persona();
        persona2.nombre= "Maria";
        persona2.apellido="rios";
        // si se llama  persona2.desplegarInformacion(); sin antes modificar los valores de nombvre y apellido estos
        //seran null por el tipo de dato String
        persona2.desplegarInformacion();

         */
//MAIN DE LA CLASE ARITMETICA

    Aritmetica aritmetica1= new Aritmetica();
    // se modifican los valores de los atributos
        aritmetica1.a= 1;
        aritmetica1.b=7;
    aritmetica1.sumar();

    // para usar el metodo el cual retorna el resultado de la suma se define una variable
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado desde el metodo con return: "+resultado);

        // se llama el metodo sumarConArgumentos y se les dan los parametros
         resultado= aritmetica1.sumarConArgumentos(5,9);// lo que se hace aca es enviar los datos  5,9 a la firma de el metodo sumarConArgumentos
        System.out.println("Resultado usando argumentos:  "+resultado);// en este caso la operacion pasaria de tener en cuenta las instancias dadas en el metodo Aritmetica y
        // tendria en cuenta los datos que se se han dado como argumentos en este caso 5 y 9, esta seria la suma que haria este metodo
        /* TODO ESTO NO ES TAN COMUN PERO PODRIA SER UTIL YA QUE PARA ESTO SE USAN LOS CONTRUCTORES*/


    }
}