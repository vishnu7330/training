package com.core.java.session.thread;

public class Waiter implements Runnable{
    
    private Message msg;
    
    public Waiter(Message msg){
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        //Thread Safety
        synchronized (msg) {
            try{
                System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
                msg.wait();
                //lines here will be executed upon notify
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name+" thread got notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed: "+msg.getMsg());
        }
    }

}