package io.khasang.reflection;

public class Manual extends Gear {

    public Manual() {
        this.type = "manual";  // Устанавливаем значение, чтобы оно не было null
    }

    @Override
    void nextGear() {
    }

    @Override
    void prevGear() {
    }
}

