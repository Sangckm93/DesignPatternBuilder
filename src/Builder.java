public interface Builder {
    Builder setHamburger(Hamburger hamburger);
    Builder setSalad(Salad salad);
    Builder setChicken(Chicken chicken);
    Builder setWater(Water water);
    FastFood build();
}
