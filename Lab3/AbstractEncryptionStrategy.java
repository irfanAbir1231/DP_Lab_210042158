public abstract class AbstractEncryptionStrategy {
    public final void processFile(String inputFile, String outputFile, boolean isEncrypt) throws Exception {
        byte[] fileData = FileUtil.readFileAsBytes(inputFile);
        byte[] processedData;

        if (isEncrypt) {
            processedData = encrypt(new String(fileData));
        } else {
            processedData = decrypt(fileData).getBytes();
        }

        FileUtil.writeFile(outputFile, processedData);
    }

    protected abstract byte[] encrypt(String data) throws Exception;

    protected abstract String decrypt(byte[] data) throws Exception;
}
