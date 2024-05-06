package View;

import Model.Lista;

public class Main {
    public static void main(String[] args) throws Exception {

        Lista L = new Lista();


        L.addFirst(3);
        L.addLast(5);
        L.addLast(8);
        L.addLast(12);
        L.addLast(9);
        L.addLast(7);
        L.addLast(6);
        L.addLast(2);
        L.addLast(3);
        L.addLast(7);
        L.addLast(16);

        int tam = L.size();
        int maior1 = L.get(0);
        int maior2 = L.get(1);
        for(int i = 0; i < tam; i++) {
            if(L.get(i) > maior1) {
                maior2 = maior1;
                maior1 = L.get(i);
            } else if(L.get(i) > maior2) {
                maior2 = L.get(i);
            }
        }
        System.out.println("Maior 1: " + maior1 + " - Maior 2: " + maior2);


    }
}
