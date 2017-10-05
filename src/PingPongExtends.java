/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFPB
 */
public class PingPongExtends extends Thread {
	private String name_ping = "ping";
	private String name_pong = "PONG";
	private String name;
    private int delay;
    
    public PingPongExtends(String name, int delay)
    {
        this.name = name;
        this.delay =delay;
    }
    
    public void run()
    {
        try {
            
            for(;;) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(delay);
            }
        } catch (Exception e) {
            System.err.println("Erro");
            return;
        }
    }
    
    public static void main(String[] args) 
    {
        PingPongExtends ping = new PingPongExtends("ping", 1000);
        ping.setName("Thread_1");
        ping.start();
        PingPongExtends pong = new PingPongExtends("PONG", 2000);
        ping.setName("Thread_2");
        pong.start();
        int i;
        String useName;
        
        for( i = 1 ; i==10; i++) {
        	useName = name_ping;
        	
        }
    }
}
