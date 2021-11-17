import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class LecturaArchivo {

    public void leeDatos() {
        try {

            /*Entrada es el flujo de datos. El tunel por donde irán los datos.*/
            FileReader entrada = new FileReader("archivo.txt");

            int caracter = entrada.read(); /*nos devuelve el número correspondeinte al caracter UNICODE o -1 si está en el final*/
            char letra = (char) caracter; /*Parsea el número correspondiente al caracter en un caracter*/

            while (caracter != -1) { /* Preguntamos por -1 para saber cuando termina. caracter tiene el nro equivalente al codigo UNICODE de cada letra. */
                System.out.print(letra); /*Escribir el caracter actual*/
                caracter = entrada.read(); /*avanzar un caracter*/
                letra = (char) caracter;
            }
            entrada.close(); /*Siempre hay que cerrar los bufers o accesos a ficheros externos.*/

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void paraArchivo() {
        String auxColor,auxModelo,auxMarca,auxMatricula;
        auxColor = "";
        auxModelo = "";
        auxMarca = "";
        auxMatricula = "";
        boolean auxDisponible = false;
        String auxResponsable;
        auxResponsable="";
        try {

            /*Entrada es el flujo de datos. El tunel por donde irán los datos.*/
            FileReader entrada = new FileReader("archivo.txt");
            int caracter = entrada.read(); /*nos devuelve el número correspondeinte al caracter UNICODE o -1 si está en el final*/
            char letra = (char) caracter; /*Parsea el número correspondiente al caracter en un caracter*/

            while (caracter != -1) { /* Preguntamos por -1 para saber cuando termina. caracter tiene el nro equivalente al codigo UNICODE de cada letra. */
                //System.out.print(letra); /*Escribir el caracter actual*/
                caracter = entrada.read(); /*avanzar un caracter*/
                //analizar si en el texto va a venir el dato del color
                if (caracter == 'c') {
                    caracter = entrada.read();
                    if (caracter == 'o') {
                        caracter = entrada.read();
                        if (caracter == 'l') {
                            caracter = entrada.read();
                            if (caracter == 'o') {
                                caracter = entrada.read();
                                if (caracter == 'r') {
                                    caracter = entrada.read();
                                    if (caracter == '=') {
                                        caracter = entrada.read();
                                        if (caracter == '\'') {
                                            caracter = entrada.read();
                                            letra = (char) caracter;
                                            //encontro el color
                                            while (caracter != '\'') {
                                                auxColor = auxColor + letra;
                                                caracter = entrada.read();
                                                letra = (char) caracter;
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }

                }
                if (caracter == '\''){
                    caracter = entrada.read();
                    if (caracter == ','){
                        caracter = entrada.read();
                        if (caracter == ' '){
                            caracter = entrada.read();

                        }
                    }
                }
                //analizar si en el texto va a venir el dato del modelo
                if (caracter == 'm') {
                    caracter = entrada.read();
                    if (caracter == 'o') {
                        caracter = entrada.read();
                        if (caracter == 'd') {
                            caracter = entrada.read();
                            if (caracter == 'e') {
                                caracter = entrada.read();
                                if (caracter == 'l') {
                                    caracter = entrada.read();
                                    if (caracter == 'o') {
                                        caracter = entrada.read();
                                        if (caracter == '=') {
                                            caracter = entrada.read();
                                            if (caracter == '\'') {
                                                caracter = entrada.read();
                                                letra = (char) caracter;
                                                while (caracter != '\'') {
                                                    auxModelo = auxModelo + letra;
                                                    caracter = entrada.read();
                                                    letra = (char) caracter;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (caracter == '\''){
                    caracter = entrada.read();
                    if (caracter == ','){
                        caracter = entrada.read();
                        if (caracter == ' '){
                            caracter = entrada.read();

                        }
                    }
                }
                //analizar si en el texto va a venir el dato de marca
                if (caracter == 'm') {
                    caracter = entrada.read();
                    letra = (char) caracter;
                    if (caracter == 'a') {
                        caracter = entrada.read();
                        letra = (char) caracter;
                        if (caracter == 'r') {
                            caracter = entrada.read();
                            letra = (char) caracter;
                            if (caracter == 'c') {
                                caracter = entrada.read();
                                letra = (char) caracter;
                                if (caracter == 'a') {
                                    caracter = entrada.read();
                                    letra = (char) caracter;
                                    if (caracter == '=') {
                                        caracter = entrada.read();
                                        letra = (char) caracter;
                                        if (caracter == '\'') {
                                            caracter = entrada.read();
                                            letra = (char) caracter;
                                            while (caracter != '\'') {
                                                auxMarca = auxMarca + letra;
                                                caracter = entrada.read();
                                                letra = (char) caracter;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (caracter == '\''){
                    caracter = entrada.read();
                    if (caracter == ','){
                        caracter = entrada.read();
                        if (caracter == ' '){
                            caracter = entrada.read();

                        }
                    }
                }
                //analizar si en el texto va a venir el dato de la matricula
                if (caracter == 'm') {
                    caracter = entrada.read();
                    letra = (char) caracter;
                    if (caracter == 'a') {
                        caracter = entrada.read();
                        letra = (char) caracter;
                        if (caracter == 't') {
                            caracter = entrada.read();
                            letra = (char) caracter;
                            if (caracter == 'r') {
                                caracter = entrada.read();
                                letra = (char) caracter;
                                if (caracter == 'i') {
                                    caracter = entrada.read();
                                    letra = (char) caracter;
                                    if (caracter == 'c') {
                                        caracter = entrada.read();
                                        letra = (char) caracter;
                                        if (caracter == 'u') {
                                            caracter = entrada.read();
                                            letra = (char) caracter;
                                            if (caracter == 'l') {
                                                caracter = entrada.read();
                                                letra = (char) caracter;
                                                if (caracter == 'a') {
                                                    caracter = entrada.read();
                                                    letra = (char) caracter;
                                                    if (caracter == '=') {
                                                        caracter = entrada.read();
                                                        letra = (char) caracter;
                                                        if (caracter == '\'') {
                                                            caracter = entrada.read();
                                                            letra = (char) caracter;
                                                            while (caracter != '\'') {
                                                                auxMatricula = auxMatricula + letra;
                                                                caracter = entrada.read();
                                                                letra = (char) caracter;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (caracter == '\''){
                    caracter = entrada.read();
                    if (caracter == ','){
                        caracter = entrada.read();
                        if (caracter == ' '){
                            caracter = entrada.read();

                        }
                    }
                }
                //analizar si en el texto va a venir el dato del estado de disponibilidad
                if (caracter == 'd') {
                    caracter = entrada.read();
                    if (caracter == 'i') {
                        caracter = entrada.read();
                        if (caracter == 's') {
                            caracter = entrada.read();
                            if (caracter == 'p') {
                                caracter = entrada.read();
                                if (caracter == 'o') {
                                    caracter = entrada.read();
                                    if (caracter == 'n') {
                                        caracter = entrada.read();
                                        if (caracter == 'i') {
                                            caracter = entrada.read();
                                            if (caracter == 'b') {
                                                caracter = entrada.read();
                                                if (caracter == 'i') {
                                                    caracter = entrada.read();
                                                    if (caracter == 'l') {
                                                        caracter = entrada.read();
                                                        if (caracter == 'i') {
                                                            caracter = entrada.read();
                                                            if (caracter == 'd') {
                                                                caracter = entrada.read();
                                                                if (caracter == 'a') {
                                                                    caracter = entrada.read();
                                                                    if (caracter == 'd') {
                                                                        caracter = entrada.read();
                                                                        if (caracter == '=') {
                                                                            caracter = entrada.read();
                                                                            letra = (char) caracter;
                                                                            while (caracter != ',') {
                                                                                if (letra=='t'){
                                                                                    auxDisponible = true;
                                                                                }else{
                                                                                    auxDisponible = false;
                                                                                }
                                                                                caracter = entrada.read();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                //saltar la coma
                if (caracter == ','){
                    caracter = entrada.read();
                }
                //analizar responsable
                if (caracter == 'r') {
                    caracter = entrada.read();
                    if (caracter == 'e') {
                        caracter = entrada.read();
                        if (caracter == 's') {
                            caracter = entrada.read();
                            if (caracter == 'p') {
                                caracter = entrada.read();
                                if (caracter == 'o') {
                                    caracter = entrada.read();
                                    if (caracter == 'n') {
                                        caracter = entrada.read();
                                        if (caracter == 's') {
                                            caracter = entrada.read();
                                            if (caracter == 'a') {
                                                caracter = entrada.read();
                                                if (caracter == 'b') {
                                                    caracter = entrada.read();
                                                    if (caracter == 'l') {
                                                        caracter = entrada.read();
                                                        if (caracter == 'e') {
                                                            caracter = entrada.read();
                                                            if (caracter == '=') {
                                                                caracter = entrada.read();
                                                                letra = (char) caracter;
                                                                while (caracter != '}') {
                                                                    auxResponsable = auxResponsable+letra;
                                                                    caracter = entrada.read();
                                                                    letra = (char) caracter;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (caracter == '}'){
                    caracter = entrada.read();
                    letra = (char) caracter;
                }
                if (letra=='E'){
                    caracter = entrada.read();

                }

            }
            entrada.close(); /*Siempre hay que cerrar los bufers o accesos a ficheros externos.*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("color" +auxColor);
        System.out.println("modelo"+auxModelo);
        System.out.println("marca"+auxMarca);
        System.out.println("matricula"+auxMatricula);
        System.out.println("disponibilidad"+auxDisponible);
        System.out.println("responsable"+auxResponsable);
        /*
        String numero="15345465015";
        long operador= convertToLong(numero);
        System.out.println(operador);
        operador=operador/80000;
        System.out.println(operador);
        */
    }
    //convertir de string a numero long
    public static long convertToLong(String strNum) {
        long valor;
        try {
            valor = Long.parseLong(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return 0; //Valor default en caso de no poder convertir  a Long
        }
        return valor;
    }
}