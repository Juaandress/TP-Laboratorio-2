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
        boolean auxDisponible;
        long auxResponsable;
        try {

            /*Entrada es el flujo de datos. El tunel por donde irán los datos.*/
            FileReader entrada = new FileReader("archivo.txt");
            int caracter = entrada.read(); /*nos devuelve el número correspondeinte al caracter UNICODE o -1 si está en el final*/
            char letra = (char) caracter; /*Parsea el número correspondiente al caracter en un caracter*/

            while (caracter != -1) { /* Preguntamos por -1 para saber cuando termina. caracter tiene el nro equivalente al codigo UNICODE de cada letra. */
                //System.out.print(letra); /*Escribir el caracter actual*/
                caracter = entrada.read(); /*avanzar un caracter*/
                letra = (char) caracter;
                //analizar si en el texto va a venir el dato del color
                if (caracter == 'c') {
                    caracter = entrada.read();
                    letra = (char) caracter;
                    if (caracter == 'o') {
                        caracter = entrada.read();
                        letra = (char) caracter;
                        if (caracter == 'l') {
                            caracter = entrada.read();
                            letra = (char) caracter;
                            if (caracter == 'o') {
                                caracter = entrada.read();
                                letra = (char) caracter;
                                if (caracter == 'r') {
                                    caracter = entrada.read();
                                    letra = (char) caracter;
                                    if (caracter == '=') {
                                        caracter = entrada.read();
                                        letra = (char) caracter;
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
                //analizar si en el texto va a venir el dato del modelo
                if (caracter == 'm') {
                    caracter = entrada.read();
                    letra = (char) caracter;
                    if (caracter == 'o') {
                        caracter = entrada.read();
                        letra = (char) caracter;
                    }if (caracter == 'd') {
                        caracter = entrada.read();
                        letra = (char) caracter;
                    }if (caracter == 'e') {
                        caracter = entrada.read();
                        letra = (char) caracter;
                    }if (caracter == 'l') {
                        caracter = entrada.read();
                        letra = (char) caracter;
                    }if (caracter == 'o') {
                        caracter = entrada.read();
                        letra = (char) caracter;
                    }if (caracter == '=') {
                        caracter = entrada.read();
                        letra = (char) caracter;
                    }if (caracter == '\'') {
                        caracter = entrada.read();
                        letra = (char) caracter;
                        while (caracter != '\'') {
                            auxModelo = auxModelo + letra;
                            caracter = entrada.read();
                            letra = (char) caracter;
                        }
                    }
                }
                //analizar si en el texto va a venir el dato de marca
                //analizar si en el texto va a venir el dato de la matricula
                //analizar si en el texto va a venir el dato del estado de disponibili

            }
            entrada.close(); /*Siempre hay que cerrar los bufers o accesos a ficheros externos.*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("color" +auxColor);
        System.out.println("modelo"+auxModelo);
    }
}