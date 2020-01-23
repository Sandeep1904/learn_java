//this an example of protected modifiers
//Logger.java
package package1;
public class Logger {
    protected void debug(String logLine){
        System.out.println("Debug line: "+logLine);
    }
}
// Main.java
package package2;
        import package1.Logger;
public class Main extends Logger {
    public static void main(String [] args){
        Main logger = new Main();
        // invokes debug() from Logger class
        logger.debug("hello from main");
    }
}