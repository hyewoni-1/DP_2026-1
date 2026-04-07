package hw.ch05;

public enum LoggerEnum {
    INSTANCE; 

    
    private final StringBuilder logBuffer;


    private LoggerEnum() {
        logBuffer = new StringBuilder(); 
        System.out.println("The instance " + this + " is created.");
    }

    public void log(String message) { 

        logBuffer.append("[").append(System.currentTimeMillis()).append("] ") 
                 .append(message).append("\n"); 
        System.out.println("[LoggerEnum] " + message); 
    } 

    public String getLog() { 
        return logBuffer.toString();
    } 
}