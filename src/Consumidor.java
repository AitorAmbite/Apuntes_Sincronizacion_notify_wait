public class Consumidor extends Thread{

    @Override
    public void run() {
        while (true){
            synchronized (Principal.comida){
                if(!Principal.comida.isEmpty()){
                    System.out.println("Me como "+Principal.comida.get(0));
                    Principal.comida.remove(0);
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("Me espero a que haya mas comida güena güena");
                    try {
                        Principal.comida.notify();
                        Principal.comida.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
