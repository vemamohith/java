class supercls {
    public static void main(String[] args) {
        child ch = new child(10);
        ch.displaychild();
        ch.displayparent();
        System.out.println(ch.x);
        System.out.println(ch.y);
    }
   
}

class parent {
    int x;
    void displayparent() {
        System.out.println("printing parent");
    }
    parent(int x) {
        super();
        this.x = x;
    }

}

class child extends parent {
    int y;
    void displaychild() {
        System.out.println("printing child");
    }
    child(int y) {
        super(20);
        this.y = y;
    }
}
