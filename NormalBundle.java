class NormalBundle extends Bundle {

    public NormalBundle(String name) {
        super(name);
    }

    @Override
    void addProducts() {
    items.add(new SimpleProduct("","",9.0));
    }






}