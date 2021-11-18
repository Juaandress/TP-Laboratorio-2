import java.io.FileWriter;
public class EscrituraArchivo {
    public void escribir(String valor,String nombre){

        //String texto = "Esto se escribió en el archivo desde el programa. "; /*lo que queremos que se escriba en el archivo.*/

        String texto=valor;

        try {
            /*FileWrite sólo con el parametro nombre de archivo re-escribe el archivo por completo
              FileWrite con parámetro nombre de archivo y el segundo true agrega a lo que ya tiene el archivo.*/

            FileWriter escritura = new FileWriter(nombre, false);

            for(int i =0; i < texto.length(); i++){ /* Para escribir recorremos caractear a caracter el String. */
                escritura.write(texto.charAt(i)); /* Escribe letra por letra en el archivo.*/
            }
            escritura.write("\n"); /*el \n es para que haga un salto de línea al final de la escritura.*/
            escritura.close(); /*Como no usamos más cerramos el FileWriter*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
