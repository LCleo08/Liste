public class App {
        public static void main(String[] args) {
        Lista l=new Lista();
        l.add(new Nodo("Mario"));
        l.add(new Nodo("Giulio"));
        l.add(new Nodo("Marco"));
        l.addHead(new Nodo("Gianni"));
        System.out.println(l);
    }
}
