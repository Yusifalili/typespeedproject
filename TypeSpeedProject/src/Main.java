import global.GlobalStrings;
import services.GameServiceİmple;
import services.ManagementServiceİmple;
import services.imple.GameService;
import services.imple.ManagementService;
import util.Util;

import java.io.*;
import java.lang.reflect.Executable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ManagementService managementService = new ManagementServiceİmple();
        managementService.manage();

    }
}

