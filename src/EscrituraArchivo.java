import java.io.FileWriter;
public class EscrituraArchivo {
    public void escribir(String valor){

        //String texto = "Esto se escribió en el archivo desde el programa. "; /*lo que queremos que se escriba en el archivo.*/

        String texto=valor;

        try {
            /*FileWrite sólo con el parametro nombre de archivo re-escribe el archivo por completo
              FileWrite con parámetro nombre de archivo y el segundo true agrega a lo que ya tiene el archivo.*/

            FileWriter escriturua = new FileWriter("archivo.txt", false);

            for(int i =0; i < texto.length(); i++){ /* Para escribir recorremos caractear a caracter el String. */
                escriturua.write(texto.charAt(i)); /* Escribe letra por letra en el archivo.*/
            }
            escriturua.write("\n"); /*el \n es para que haga un salto de línea al final de la escritura.*/
            escriturua.close(); /*Como no usamos más cerramos el FileWriter*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
