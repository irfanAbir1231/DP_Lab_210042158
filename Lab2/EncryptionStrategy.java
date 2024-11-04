public interface EncryptionStrategy {
    byte[] encrypt(String data) throws Exception;
    String decrypt(byte[] data) throws Exception;
}
