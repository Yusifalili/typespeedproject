package services;

import services.imple.GameService;
import util.InputUtil;
import util.MenuUtil;

public class ManagementServiceİmple implements services.imple.ManagementService {

    @Override
    public void manage() throws InterruptedException {
        while (true) {
            int option = MenuUtil.showMenu();

            switch (option) {
                case 1:
                    GameService gameService = new GameServiceİmple();
                    gameService.play();
                    break;
                case 2:
                    GameService gameService2 = new GameServiceİmple();
                    gameService2.exit();
                    break;
                default:
                    System.out.println("Enter the correct option!");
            }
        }
    }
}
