interface Player {
    default void play() {
        System.out.println("Playing football on the field...");
    }
}

interface Trainer {
    default void train() {
        System.out.println("Training the team before the match...");
    }
}

class Footballer implements Player, Trainer {
    @Override
    public void play() {
        System.out.println("Footballer is scoring goals!");
    }

    @Override
    public void train() {
        System.out.println("Footballer is training hard every morning.");
    }
}

public class multiple_inheritance3 {
    public static void main(String[] args) {
        Footballer f = new Footballer();
        f.play();
        f.train();
    }
}


