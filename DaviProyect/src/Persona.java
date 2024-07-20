public class Persona {
    public String nombre;
    public String apellido;


    //metodo
    // public hace referencia a que este metodo se podra usar por fuera
    // se llama al la palabra reservada void  para  definir que este metodo no retornar nada
    // los parentesis() resiven los argumentos del metodo

    public void desplegarInformacion(){
        System.out.println("nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
    }
    //creacion de objetos personas

}
