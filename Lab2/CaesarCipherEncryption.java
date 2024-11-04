public class CaesarCipherEncryption extends AbstractEncryptionStrategy {
    private int shift;

    public CaesarCipherEncryption(int shift) {
        this.shift = shift;
    }

    @Override
    protected byte[] encrypt(String data) {
        StringBuilder result = new StringBuilder();
        for (char character : data.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedChar = (char) (character + shift);
                result.append(shiftedChar);
            } else {
                result.append(character);
            }
        }
        return result.toString().getBytes();
    }

    @Override
    protected String decrypt(byte[] data) {
        StringBuilder result = new StringBuilder();
        for (char character : new String(data).toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedChar = (char) (character - shift);
                result.append(shiftedChar);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
