public class EncryptionContext {
    private AbstractEncryptionStrategy strategy;

    public void setEncryptionStrategy(AbstractEncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void processFile(String inputFile, String outputFile, boolean isEncrypt) throws Exception {
        strategy.processFile(inputFile, outputFile, isEncrypt);
    }
}
