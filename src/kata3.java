import java.lang.StringBuilder;

class Solution {
    /**
     * Sustitución de los caracteres "-" por "_"
     * @param s
     * @return String del texto con los cambios realizados
     */
    public static String toCamelCase(String s) {
        StringBuilder resultado = new StringBuilder();
        boolean siguienteMayus = false;
        /**
         * Creamos un bucle
         */
        for (int i = 0; i < s.length(); i++) {
            char charActual = s.charAt(i);

            if (charActual == '-' || charActual == '_') {
                siguienteMayus = true;
            } else {
                if (siguienteMayus) {
                    resultado.append(Character.toUpperCase(charActual));
                    siguienteMayus = false;
                } else {
                    resultado.append(charActual);
                }
            }
        }
        return resultado.toString();
    }
}