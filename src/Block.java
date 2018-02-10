import java.util.Arrays;

public class Block {
    /*
    Each block: will have:
        * list of transactions
        * Previous Hash
        * Hash
     */

    private int previousHash;
    private String[] transactions; //in real blockchain transactions are objects itselft. this is for keeping it simple.

    private int blockHash; //each block will have its own hash (obviously).

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        Object[] contents = {Arrays.hashCode(transactions),previousHash}; //Content of this block is the hash of the transactions and the previous hash.
        this.blockHash = Arrays.hashCode(contents); // This block's Hash is the hash(hash(transactions),previousHash)
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
