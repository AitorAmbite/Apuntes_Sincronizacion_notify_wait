public class Productor extends Thread{

    @Override
    public void run() {
        while (true){
            synchronized (Principal.comida){
                try {
                    Principal.comida.wait();
                    Principal.comida.add("Arroz");
                    Principal.comida.add("Arroz");
                    Principal.comida.add("Arroz");
                    sleep(2000);
                    Principal.comida.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
