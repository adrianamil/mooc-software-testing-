package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift) {
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift % 26; // Asegurarse de que el desplazamiento esté en el rango de 0-25

        for (int i = 0; i < length; i++) {
            currentChar = message.charAt(i);

            // Si el carácter no es una letra minúscula ni un espacio, es inválido
            if ((currentChar < 'a' || currentChar > 'z') && currentChar != ' ') {
                return "invalid";
            }

            // Si el carácter es un espacio, se agrega tal cual
            if (currentChar == ' ') {
                sb.append(currentChar);
                continue;
            }

            // Desplazamiento de la letra
            currentChar = (char) (currentChar + shift);

            if (currentChar > 'z') {
                currentChar = (char) (currentChar - 26);
            } else if (currentChar < 'a') {
                currentChar = (char) (currentChar + 26);
            }

            sb.append(currentChar);
        }

        return sb.toString();
    }
}
