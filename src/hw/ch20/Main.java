package hw.ch20;



public class Main {

static final String RED     = "\u001B[31m";
static final String GREEN   = "\u001B[32m";
static final String YELLOW  = "\u001B[33m";
static final String BLUE    = "\u001B[34m";
static final String MAGENTA = "\u001B[35m";
static final String CYAN    = "\u001B[36m";
static final String RESET   = "\u001B[0m";
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        String input = args[0];
        BigString bs = new BigString(input);

    
        if (input.equals("1212123")) {
            String[] colors = { RED, BLUE, GREEN, MAGENTA, CYAN, YELLOW, BLUE };
            bs.print(colors);
        } 
        
        }
    }

//C:\study\SW\DP_2026-1\src\hw\ch20> java hw.ch20.Main 1212123