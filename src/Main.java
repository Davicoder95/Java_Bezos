
import java.util.Random;
import java.util.regex.Pattern;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    //Calculadora  Basica
    public static void main(String[] args) {
        // exportar Scanner
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Debes ingresar un  numero el cual desea saber las operaciones basicas");
        //solicitar los datos
        System.out.println("Ingrese el primer numero: ");
        double num1 = scanner. nextDouble();

        System.out.println("Ingrese el segundo  numero: ");
        double num2 = scanner. nextDouble();
        // hacer operaciones
        double resultSuma = num1 + num2;
        double resultResta = num1 - num2 ;
        double resultMulti= num1 * num2;
        double resultDivision = num1 / num2;
        // mostrar resultados
        System.out.println(" El resultado de la suma de estos numero es: "+ resultSuma);
        System.out.println(" El resultado de la resta de estos numero es: "+ resultResta);
        System.out.println(" El resultado de la multiplicacion de estos numero es: "+ resultMulti);
        System.out.println(" El resultado de la division de estos numero es: "+ resultDivision);


        //Verificador de edad
        System.out.println("Ingrese su nombre");
        String name = scanner.nextLine();
        System.out.println("Ingrese su edad");
         byte edad = scanner.nextByte();
          if (edad >= 18){
              System.out.println(name+" eres mayor de edad");
          }else{
              System.out.println(name+" eres menor de edad");
          }

        //Conversor de Km a millas
        System.out.println("Ingresa los kilometros que deseas convertir: ");
        double kilometros = scanner.nextDouble();
        double millas = 1.609;
        double resultado = kilometros / millas;
        System.out.println( kilometros +" es equivalente a " + resultado + "millas");


        //Calculadora de IMC
        System.out.println("Ingrese su peso en kilogramos");
        float peso = scanner.nextFloat();
        System.out.println("Ingrese su altura");
        float altura = scanner.nextFloat();
        float imc = peso/(altura*altura);
        System.out.println("su IMC es de: "+ imc);



        //Clasicicador de numeros
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        if (numero > 0 &&  numero%2 == 0){
            System.out.println("Este numero es positivo y par");
        }
        else if (numero > 0 && numero%2 != 0){
            System.out.println("Este numero es positivo y  es impar");
        }
        else if (numero < 0 && numero%2 == 0 ) {
            System.out.println("Este numero es negativo y par");
        }
        else if (numero < 0 && numero%2 != 0){
            System.out.println("Este numero es negativo y impar");
        } else if (numero == 0) {
            System.out.println("El numero es 0");
        }


        // Calculadora de dias del mes

        System.out.println("Ingresa el numero del mes que desees");
        byte mes = scanner.nextByte();
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Este mes contiene 31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Este mes contiene 30 dias");
                break;
            case 2:
                System.out.println("Este mes contiene 28 dias");
        }


        System.out.println(" Bienvenido seleccione una de las siguientes opciones ");
        System.out.println("1.sumar \n 2.restar  \n 3.multiplicar \n 4. dividir " );
        String opcion = scanner.nextLine();
        if (opcion == "salir" || opcion == "5"){
            System.out.println("Hasta pronto!!");
        }else {
        System.out.println("Ingresa un numero ");
        float numeroOperacion = scanner.nextFloat();
        System.out.println("Ingresa un numero ");
        float numeroOperacion2 = scanner.nextFloat();

        float resultSum2 = numeroOperacion + numeroOperacion2;
        float resultRest2 = numeroOperacion - numeroOperacion2;
        float resultMulti2 = numeroOperacion *  numeroOperacion2;
        float resultDivision2 = numeroOperacion / numeroOperacion2;

        switch (opcion) {
            case "1":
            case "sumar":
                System.out.println("El resultado de la suma es: " + resultSum2);
                break;
            case "2":
            case "resta":
                System.out.println("El resultado de la resta es: " + resultRest2);
                break;
            case "3":
            case "multiplicar":
                System.out.println("El resultado de la multiplicacion es: " + resultMulti2);
                break;
            case "4":
            case "division":
                System.out.println("El resultado de la division es: " + resultDivision2);
                break;
          }
        }



        //Calculo de promedio
        System.out.println("Las notas van en escala de 1 a 10");
        System.out.println("Ingresa la nota 1");
        int nota1 = scanner.nextInt();
        System.out.println("Ingresa la nota 2");
        int nota2 = scanner.nextInt();
        System.out.println("Ingresa la nota 3");
        int nota3 = scanner.nextInt();

        int sumPro = nota1+nota2+nota3;
        int promedio = sumPro/3;
       if (promedio>6){
           System.out.println("Aprobaste tu promedio es de " +  promedio);
       }else{
           System.out.println("Reprobaste , tu promedio es de " + promedio);
       }


        //Calculadora de año bisiesto
        System.out.println("Ingresa un año");
        int año = scanner.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) ||(año % 400 == 0) ){
            System.out.println("Este año es bisiesto");
        }else {
            System.out.println("Este año no es bisiesto");
        }




        //Calculadora de propina
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println("Ingresa el total de la cuenta ");
        float total = scanner.nextFloat();
        System.out.println("Ingresa el porcentaje de propina que desea dejar ");
        float propina = scanner.nextInt();
        float dineroDejado =  total* (propina/100);
        System.out.println("Haz dejado una propina de "+decimalFormat.format(dineroDejado));




        // Ordenar numeros

        System.out.println("Ingresa un numero");
        int numOrdenado1 = scanner.nextInt();
        System.out.println("Ingresa un numero");
        int numOrdenado2 = scanner.nextInt();
        System.out.println("Ingresa un numero");
        int numOrdenado3 = scanner.nextInt();

        int menor= (numOrdenado1< numOrdenado2)? ((numOrdenado1<numOrdenado3)? numOrdenado1:numOrdenado3):
                ((numOrdenado2<numOrdenado3)? numOrdenado2 : numOrdenado3);
        int mayor =(numOrdenado1> numOrdenado2)? ((numOrdenado1>numOrdenado3)? numOrdenado1: numOrdenado3):
                ((numOrdenado2>numOrdenado3)? numOrdenado2: numOrdenado3);
        int medio = (numOrdenado1 != menor && numOrdenado1 != mayor)? numOrdenado1:(numOrdenado2 != menor && numOrdenado2 != mayor)?
                numOrdenado2: numOrdenado3;
        System.out.println("Orden de los numeros " + menor+ " \n" +medio+ " \n" +mayor);

        int cambiar;
         if (numOrdenado1 > numOrdenado2) {
             cambiar= numOrdenado1;
             numOrdenado1 = numOrdenado2;
             numOrdenado2= cambiar;
        }
         if (numOrdenado1 > numOrdenado3 ){
             cambiar= numOrdenado1;
             numOrdenado1 = numOrdenado3;
             numOrdenado3 = cambiar;
         }
         if (numOrdenado2 > numOrdenado3) {
             cambiar = numOrdenado2;
             numOrdenado2 = numOrdenado3;
             numOrdenado3= cambiar;
         }
        System.out.println("Orden de los numeros " + numOrdenado1+ " \n" +numOrdenado2+ " \n" +numOrdenado3);


        // Generador de horoscopo
        System.out.println("Ingresa el mes de tu nacimiento");
        int mesNacimiento = scanner.nextInt();
        System.out.println("Ingresa el dia en que naciste");
        int diaNacimiento = scanner.nextInt();
        String signo = "";
        switch (mesNacimiento) {
            case 1:
                if (diaNacimiento >= 1 && diaNacimiento <= 19) {
                    signo = "Capricornio";
                } else if (diaNacimiento >= 20 && diaNacimiento <= 31) {
                    signo = "Acuario";
                }
                break;
            case 2:
                if (diaNacimiento >= 1 && diaNacimiento <= 18) {
                    signo = "Acuario";
                } else if (diaNacimiento >= 19 && diaNacimiento <= 28) {
                    signo = "Piscis";
                }
                break;
            case 3:
                if (diaNacimiento >= 1 && diaNacimiento <=20){
                    signo="Piscis";
                }else if (diaNacimiento >= 21 && diaNacimiento<= 31) {
                    signo="Aries";
                }
                break;
            case 4:
                if (diaNacimiento >= 1 && diaNacimiento <=19){
                    signo="Aries";
                }else if (diaNacimiento >= 20 && diaNacimiento<= 30) {
                    signo="Tauro";
                }
                break;
            case 5:
                if (diaNacimiento >= 1 && diaNacimiento <=20){
                    signo="Tauro";
                }else if (diaNacimiento >= 21 && diaNacimiento<= 31) {
                    signo="Geminis";
                }
                break;
            case 6:
                if (diaNacimiento >= 1 && diaNacimiento <=20){
                    signo="Geminis";
                }else if (diaNacimiento >= 21 && diaNacimiento<= 30) {
                    signo="Cancer";
                }
                break;
            case 7:
                if (diaNacimiento >= 1 && diaNacimiento <=22){
                    signo="Cancer";
                }else if (diaNacimiento >= 23 && diaNacimiento<= 31) {
                    signo="Leo";
                }
                break;
            case 8:
                if (diaNacimiento >= 1 && diaNacimiento <=22){
                    signo="Leo";
                }else if (diaNacimiento >= 23 && diaNacimiento<= 31) {
                    signo="Virgo";
                }
                break;
            case 9:
                if (diaNacimiento >= 1 && diaNacimiento <=22){
                    signo="Virgo";
                }else if (diaNacimiento >= 23 && diaNacimiento<= 30) {
                    signo="Libra";
                }
                break;
            case 10:
                if (diaNacimiento >= 1 && diaNacimiento <=22){
                    signo="Libra";
                }else if (diaNacimiento >= 23 && diaNacimiento<= 31) {
                    signo="Escorpio";
                }
                break;
            case 11:
                if (diaNacimiento >= 1 && diaNacimiento <=21){
                    signo="Escorpio";
                }else if (diaNacimiento >= 22 && diaNacimiento<= 30) {
                    signo="Sagitario";
                }
                break;
            case 12:
                if (diaNacimiento >= 1 && diaNacimiento <=21){
                    signo="Sagitario";
                }else if (diaNacimiento >= 22 && diaNacimiento<= 31) {
                    signo="Capricornio";
                }
                break;

        }
        System.out.printf("Su signo es %s",signo);


        //Tarifa taxi
        System.out.println("Ingrese la distancia del viaje en kilometros");
        float distancia = scanner.nextInt();
        float tarifaBase = 5000;
        float totalViaje = distancia*tarifaBase;
        System.out.println("El valor del viaje es de: "+  totalViaje);

        //Convertidor temperatura
        System.out.println("Ingrese la opcion que desea \n" +
                "1.Covertir de Celsius a Fahrenheit \n" +
                "2.Convertir de Fahrenheit a Celsius");
        String opciones = scanner.next();
        float Celsius = 0;
        float Fahrenheit = 0;

       switch (opciones){
           case "1":
               System.out.println("Ingrese la temperatura: ");
               float temperatura = scanner.nextFloat();
               Fahrenheit = (temperatura* 9/5)+32;
               System.out.println(temperatura+" Celsius es equivalente a " +  Fahrenheit );
           case "2":
               System.out.println("Ingrese la temperatura: ");
               float temperatura2 = scanner.nextFloat();
               Celsius = (temperatura2 -32) * 5/9;
               System.out.println(temperatura2+" Fahrenheit es equivalente a " +  Celsius );
       }

        //Sistema de calficaciones
        System.out.println("Ingresa tu nota en escala de 0-100");
        int nota = scanner.nextInt();
       if (nota < 28){
           System.out.println("Su nota es F");
       } else if (nota >=28 && nota < 54 ) {
           System.out.println("Su nota es D");
       } else if (nota >=54  && nota <80) {
           System.out.println("Su nota es C");
       }else if (nota >=80  && nota <90) {
           System.out.println("Su nota es B");
       }else if (nota >=90  && nota <=100) {
           System.out.println("Su nota es A");
       }

        // Verificador de contraseña
        System.out.println("Ingrese su Contraseña (recuerde que debe contener al menos 1" +
                " mayuscula una minuscula y un caracter especial");
       String contraseña = scanner.next();
        boolean longitud = false;
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean caracter = false;
        String caracterEspecial = "!@#$%&*()_+=|<>?{}.,;[0-9]";
       if (longitud == contraseña.length()<9){
           longitud= true;
       }
        for (int i = 0; i < contraseña.length() ; i++) {
            char f = contraseña.charAt(i);
            if (Character.isUpperCase(f)){
                mayuscula= true;
            } else if (Character.isLowerCase(f)) {
                minuscula=true;
            } else if (caracterEspecial.indexOf(f) != -1) {
                caracter= true;
            }
        }
        boolean validar = (longitud && caracter && mayuscula && minuscula);
        System.out.println("¿La contraseña es segura?" + validar);

        //Verificador de caracter
        System.out.println("Ingrese un caracter");
        String caracterIdentificador = scanner.nextLine();
        if (caracterIdentificador.length() != 1) {
            char caracter = caracterIdentificador.charAt(0);
            caracter = Character.toLowerCase(caracter);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                System.out.println("Este caracter es una vocal.");
            } else if ((caracter >= 'a' && caracter <= 'z') && !(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')) {
                System.out.println("Este caracter es una consonante.");
            } else {
                System.out.println("Este caracter es un carácter especial.");
            }
        }


        //Piedra papel o tijera
        Random random = new Random();
        System.out.println("Bienvenido a piedra papel o tijera \n" +
                "seleccione la opccion que desea\n" +
                "-Piedra\n" +
                "-Papel\n" +
                "-Tijera\n");
        String usuario = scanner.next();
        usuario = usuario.toLowerCase();
        String [] opciones = {"piedra","papel", "tijera"};
        String bot = opciones[random.nextInt(opciones.length)];
        System.out.println("He elegido "+ bot);
       if (usuario.equals(bot)){
           System.out.println("Ha sido un empate");
       } else if((usuario.equals("piedra")) && (bot.equals("tijera")) || (usuario.equals("tijera")) && (bot.equals("papel")) ||
               (usuario.equals("papel")) && (bot.equals("piedra"))){
            System.out.println("Ganaste");
       }else{
           System.out.println("Te gané");
        }


        //Calculador de edad
        System.out.println("Ingrese el año de nacimiento");
        int nacimiento = scanner.nextInt();
        System.out.println("Ingrese el mes (formato numerico)");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el dia");
        int dia = scanner.nextInt();
        int añoActual = 2024;
        int mesActual = 7;
        int diaActual = 8;
        int calcularAños = añoActual-nacimiento;
        int calcularMeses = mesActual-mes;
        int calcularDia = diaActual-dia;
        if (calcularAños<18 && calcularMeses> mesActual && diaActual< dia){
            System.out.println("sos mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }


        //Cifrado Cesar
        System.out.println("ingresa el mensaje");
        String mensaje = scanner.next();
        System.out.println("Ingrese el desplazamiento");
        int desplazamiento = scanner.nextInt();
        // Cifrado
        StringBuilder mensajeCifrado = new StringBuilder();
        for (char caracter : mensaje.toCharArray()) {
            if (Character.isLetter(caracter)) {
                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                caracter = (char) ((caracter - base + desplazamiento) % 26 + base);
            }
            mensajeCifrado.append(caracter);
        }
        String cifrado = mensajeCifrado.toString();
        System.out.println("Mensaje cifrado: " + cifrado);
        // Descifrado
        StringBuilder mensajeDescifrado = new StringBuilder();
        for (char caracter : cifrado.toCharArray()) {
            if (Character.isLetter(caracter)) {
                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                caracter = (char) ((caracter - base - desplazamiento + 26) % 26 + base);
            }
            mensajeDescifrado.append(caracter);
        }
        String descifrado = mensajeDescifrado.toString();
        System.out.println("Mensaje descifrado: " + descifrado);

         */
    }

}
