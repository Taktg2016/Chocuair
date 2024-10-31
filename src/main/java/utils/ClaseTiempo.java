package utils;

public class ClaseTiempo {
    private ClaseTiempo(){

    }

    public static void waits(int wait){
        try{
            Thread.sleep(wait*1000L);
        } catch(InterruptedException e){
            e.getStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
