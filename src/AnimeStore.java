public class AnimeStore {
    public static void main(String[] args) {
        Figure[] figures ={new Figure("Luffy",234.54),
                new Figure("Zoro",2400),
                new Figure("Nami",6786)};

        for(Figure figure: figures ){
            figure.purchase();
        }
    }
}

