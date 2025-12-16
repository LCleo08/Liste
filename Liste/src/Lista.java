

public class Lista {
    Nodo root;
    
    
    public void addHead(Nodo n){
    if (root == null) {
        root = n;
        return;
    }

    n.setNext(root);
    root = n;
}

public void remove(String s) {
        if (root == null) return;

        if (!exists(s)) return;

        if (s == null ? root.getValue() == null : s.equals(root.getValue())) {
            root = root.getNext();
            return;
        }

        Nodo prev = root;
        Nodo curr = root.getNext();
        while (curr != null) {
            if (s == null ? curr.getValue() == null : s.equals(curr.getValue())) {
                prev.setNext(curr.getNext());
                return;
            }
            prev = curr;
            curr = curr.getNext();
        }
    }
    public boolean exists(String s) {
        Nodo temp = root;
        while (temp != null) {
            if (s == null) {
                if (temp.getValue() == null) return true;
            } else {
                if (s.equals(temp.getValue())) return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public Lista(){
        root = null;
    }
    
    public void add(Nodo n) {
        if (root == null) {
            root = n;
            return;
        }
        
        Nodo temp = root;
        while (temp.getNext()!=null) temp = temp.getNext();
        temp.setNext(n);
    }
    

    public String toString(){
        
        String s = "La lista contiene: ";
        Nodo temp = root;
        
        while(temp != null) {
            s += temp.getValue() + " - ";
            temp = temp.getNext();
        }
        
        return s + "\n";
                
    }





    
}