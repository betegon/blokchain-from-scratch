import java.util.ArrayList;

public class Main {



    ArrayList<Block> blockchain = new ArrayList<>(); //Array of blocks

    public static void main(String[] args){


        // genesis block
        String[] genesisTransactions = {"0x01a231f sent 0x78af425 10.05 btc", "0xe9231f sent 0xa12425 0.3 btc"}; // In real blockchain transactions are different in sense of structure.
        Block genesisBlock = new Block(0, genesisTransactions);

        // second block
        String[] block2Transactions = {"0x01a231f sent 0xabcd1234 29 btc", "0x1234abcd sent 0xa12425 0.8 btc"};
        Block block2 = new Block(genesisBlock.getBlockHash(),block2Transactions); //  give block2 previoushash and transactions.

        // Third block
        String[] block3Transactions = {"0x01a231f sent 0xabcd1234 29 btc"};
        Block block3 = new Block(block2.getBlockHash(),block3Transactions); //  give block2 previoushash and transactions.


        System.out.println("Genesis Block Hash:"); // output of the block we just created, genesis block.
        System.out.println(genesisBlock.getBlockHash()); // output of the block we just created, genesis block.
        System.out.println("Second Block Hash: ");
        System.out.println(block2.getBlockHash());
        System.out.println("Third Block Hash: ");
        System.out.println(block3.getBlockHash());
    }


}
