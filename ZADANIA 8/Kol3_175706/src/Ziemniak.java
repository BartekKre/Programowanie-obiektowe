class Ziemniak extends Warzywo {
    @Override
    public void smak() {
        System.out.println("Ziemniak jest neutralny w smaku.");
    }

    @Override
    public void umyj() {
        System.out.println("Ziemniak został umyty.");
    }

    @Override
    public void zjedz() {
        System.out.println("Ziemniak został ugotowany i zjedzony.");
    }
}