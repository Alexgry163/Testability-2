public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int MassbodyIndex = service.calculate(99, 1.82);
        System.out.println(MassbodyIndex);


    }
}