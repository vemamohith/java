package agreegation;

class person {
    public static void main(String[] args) {
        per pr = new per();
        laptop lp  = new laptop(16,"windows");
        pr.hasA(lp);
        System.out.println(pr.br.size);
        System.out.println(pr.br.color);
        System.out.println(lp.os);
        System.out.println(lp.ram);
    }
}


class brain {
    int size ;
    String color;

    brain(int size, String color) {
        this.color = color;
        this.size = size;
    }
}

class laptop {
    int ram ;
    String os;

    laptop(int ram, String os) {
        this.os = os;
        this.ram = ram;
    }

}
class per {
    public brain br = new brain(250,"grey");
    
    void hasA(laptop lp) {
        lp.ram = 8;
        lp.os = "windows";
    }
}
