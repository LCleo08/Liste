public class App {
    public static void main(String[] args){
        Lista l = new Lista();
        l.add(new Nodo("Mario"));
        l.add(new Nodo("Giulio"));
        l.addHead(new Nodo("Gianni"));
        System.out.println(l);

        boolean esiste = l.exists("Mario");
        System.out.println("Esiste 'Mario'? " + esiste);

        l.remove("Giulio");
        System.out.println("Dopo remove 'Giulio': " + l);
    }
}