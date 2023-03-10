import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    private int cost = 500;
    private Random random = new Random();
    private String[][] listGame = new String[3][3];
    private List<String> list = new ArrayList<String>();
    public void addList(){
        list.add("W");
        list.add("@");
        list.add("$");
        list.add("X");
    }

    public void fillList(){
        for (int i = 0; i < listGame.length; i++) {
            for (int j = 0; j < listGame.length; j++) {
                listGame[i][j] = list.get(random.nextInt(list.size()));
            }
        }
    }
    public void showList(){
        for (int i = 0; i < listGame.length; i++) {
            for (int j = 0; j < listGame.length; j++) {
                System.out.print(listGame[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void check(int cost) {
        fillList();
        showList();
        int count = 0;
        if ((listGame[0][0].equals(listGame[0][1]) & listGame[0][0].equals(listGame[0][2]))) {
            count++;
            System.out.println("\nЕсть совпадение! X"+count+"\n");
            switch (listGame[0][0]) {
                case "$":
                    listGame[0][0] = ANSI_GREEN + "$" + ANSI_RESET;
                    listGame[0][1] = ANSI_GREEN + "$" + ANSI_RESET;
                    listGame[0][2] = ANSI_GREEN + "$" + ANSI_RESET;
                    showList();
                    cost += 1000;
                    System.out.println();
                    System.out.println("Джэкпот! +500 ");
                    break;
                case "@":
                    listGame[0][0] = ANSI_YELLOW + "@" + ANSI_RESET;
                    listGame[0][1] = ANSI_YELLOW + "@" + ANSI_RESET;
                    listGame[0][2] = ANSI_YELLOW + "@" + ANSI_RESET;
                    showList();
                    cost += 300;
                    System.out.println();
                    System.out.println("Собачник. Гав гав +300");
                    break;
                case "X":
                    listGame[0][0] = ANSI_RED + "X" + ANSI_RESET;
                    listGame[0][1] = ANSI_RED + "X" + ANSI_RESET;
                    listGame[0][2] = ANSI_RED + "X" + ANSI_RESET;
                    showList();
                    System.out.println();
                    System.out.println("Увы");
                    break;
                case "W":
                    listGame[0][0] = ANSI_BLUE + "W" + ANSI_RESET;
                    listGame[0][1] = ANSI_BLUE + "W" + ANSI_RESET;
                    listGame[0][2] = ANSI_BLUE + "W" + ANSI_RESET;
                    showList();
                    cost += 100;
                    System.out.println();
                    System.out.println("Мафия. Получите долю +100");
                    break;
            }
        }
        if ((listGame[1][0].equals(listGame[1][1]) & listGame[1][0].equals(listGame[1][2]))) {
            count++;
            System.out.println("\nЕсть совпадение! X"+count+"\n");
            switch (listGame[1][0]) {
                case "$":
                    listGame[1][0] = ANSI_GREEN + "$" + ANSI_RESET;
                    listGame[1][1] = ANSI_GREEN + "$" + ANSI_RESET;
                    listGame[1][2] = ANSI_GREEN + "$" + ANSI_RESET;
                    showList();
                    cost += 1000;
                    System.out.println();
                    System.out.println("Джэкпот! +500 ");
                    break;
                case "@":
                    listGame[1][0] = ANSI_YELLOW + "@" + ANSI_RESET;
                    listGame[1][1] = ANSI_YELLOW + "@" + ANSI_RESET;
                    listGame[1][2] = ANSI_YELLOW + "@" + ANSI_RESET;
                    showList();
                    cost += 300;
                    System.out.println();
                    System.out.println("Собачник. Гав гав +300");
                    break;
                case "X":
                    listGame[1][0] = ANSI_RED + "X" + ANSI_RESET;
                    listGame[1][1] = ANSI_RED + "X" + ANSI_RESET;
                    listGame[1][2] = ANSI_RED + "X" + ANSI_RESET;
                    showList();
                    System.out.println();
                    System.out.println("Увы");
                    break;
                case "W":
                    listGame[1][0] = ANSI_BLUE + "W" + ANSI_RESET;
                    listGame[1][1] = ANSI_BLUE + "W" + ANSI_RESET;
                    listGame[1][2] = ANSI_BLUE + "W" + ANSI_RESET;
                    showList();
                    cost += 100;
                    System.out.println();
                    System.out.println("Мафия. Получите долю +100");
                    break;
            }
        }
        if ((listGame[2][0].equals(listGame[2][1]) & listGame[2][0].equals(listGame[2][2]))) {
            count++;
            System.out.println("\nЕсть совпадение! X"+count+"\n");
            switch (listGame[2][0]) {
                case "$":
                    listGame[2][0] = ANSI_GREEN + "$" + ANSI_RESET;
                    listGame[2][1] = ANSI_GREEN + "$" + ANSI_RESET;
                    listGame[2][2] = ANSI_GREEN + "$" + ANSI_RESET;
                    showList();
                    cost += 1000;
                    System.out.println();
                    System.out.println("Джэкпот! +500 ");
                    break;
                case "@":
                    listGame[2][0] = ANSI_YELLOW + "@" + ANSI_RESET;
                    listGame[2][1] = ANSI_YELLOW + "@" + ANSI_RESET;
                    listGame[2][2] = ANSI_YELLOW + "@" + ANSI_RESET;
                    showList();
                    cost += 300;
                    System.out.println();
                    System.out.println("Собачник. Гав гав +300");
                    break;
                case "X":
                    listGame[2][0] = ANSI_RED + "X" + ANSI_RESET;
                    listGame[2][1] = ANSI_RED + "X" + ANSI_RESET;
                    listGame[2][2] = ANSI_RED + "X" + ANSI_RESET;
                    showList();
                    System.out.println();
                    System.out.println("Увы");
                    break;
                case "W":
                    listGame[2][0] = ANSI_BLUE + "W" + ANSI_RESET;
                    listGame[2][1] = ANSI_BLUE + "W" + ANSI_RESET;
                    listGame[2][2] = ANSI_BLUE + "W" + ANSI_RESET;
                    showList();
                    cost += 100;
                    System.out.println();
                    System.out.println("Мафия. Получите долю +100");
                    break;
            }
        }
        if ((listGame[0][0].equals(listGame[1][0]) & listGame[0][0].equals(listGame[2][0]))) {
            count++;
            System.out.println("\nЕсть совпадение! X"+count+"\n");
            switch (listGame[0][0]) {
                case "$":
                    listGame[0][0] = ANSI_GREEN + "$" + ANSI_RESET;
                    listGame[1][0] = ANSI_GREEN + "$" + ANSI_RESET;
                    listGame[2][0] = ANSI_GREEN + "$" + ANSI_RESET;
                    showList();
                    cost += 1000;
                    System.out.println();
                    System.out.println("Джэкпот! +500 ");
                    break;
                case "@":
                    listGame[0][0] = ANSI_YELLOW + "@" + ANSI_RESET;
                    listGame[1][0] = ANSI_YELLOW + "@" + ANSI_RESET;
                    listGame[2][0] = ANSI_YELLOW + "@" + ANSI_RESET;
                    showList();
                    cost += 300;
                    System.out.println();
                    System.out.println("Собачник. Гав гав +300");
                    break;
                case "X":
                    listGame[0][0] = ANSI_RED + "X" + ANSI_RESET;
                    listGame[1][0] = ANSI_RED + "X" + ANSI_RESET;
                    listGame[2][0] = ANSI_RED + "X" + ANSI_RESET;
                    showList();
                    System.out.println();
                    System.out.println("Увы");
                    break;
                case "W":
                    listGame[0][0] = ANSI_BLUE + "W" + ANSI_RESET;
                    listGame[1][0] = ANSI_BLUE + "W" + ANSI_RESET;
                    listGame[2][0] = ANSI_BLUE + "W" + ANSI_RESET;
                    showList();
                    cost += 100;
                    System.out.println();
                    System.out.println("Мафия. Получите долю +100");
                    break;
            }
        }
        if ((listGame[0][1].equals(listGame[1][1]) & listGame[0][1].equals(listGame[2][1]))) {
            count++;
            System.out.println("\nЕсть совпадение! X"+count+"\n");
            switch (listGame[0][1]) {
                case "$":
                    listGame[0][1] = ANSI_GREEN + "$" + ANSI_RESET;
                    listGame[1][1] = ANSI_GREEN + "$" + ANSI_RESET;
                    listGame[2][1] = ANSI_GREEN + "$" + ANSI_RESET;
                    showList();
                    cost += 1000;
                    System.out.println();
                    System.out.println("Джэкпот! +500 ");
                    break;
                case "@":
                    listGame[0][1] = ANSI_YELLOW + "@" + ANSI_RESET;
                    listGame[1][1] = ANSI_YELLOW + "@" + ANSI_RESET;
                    listGame[2][1] = ANSI_YELLOW + "@" + ANSI_RESET;
                    showList();
                    cost += 300;
                    System.out.println();
                    System.out.println("Собачник. Гав гав +300");
                    break;
                case "X":
                    listGame[0][1] = ANSI_RED + "X" + ANSI_RESET;
                    listGame[1][1] = ANSI_RED + "X" + ANSI_RESET;
                    listGame[2][1] = ANSI_RED + "X" + ANSI_RESET;
                    showList();
                    System.out.println();
                    System.out.println("Увы");
                    break;
                case "W":
                    listGame[0][1] = ANSI_BLUE + "W" + ANSI_RESET;
                    listGame[1][1] = ANSI_BLUE + "W" + ANSI_RESET;
                    listGame[2][1] = ANSI_BLUE + "W" + ANSI_RESET;
                    showList();
                    cost += 100;
                    System.out.println();
                    System.out.println("Мафия. Получите долю +100");
                    break;
            }
        }
        if ((listGame[0][2].equals(listGame[1][2]) & listGame[0][2].equals(listGame[2][2]))) {
            count++;
            System.out.println("\nЕсть совпадение! X"+count+"\n");
            switch (listGame[0][2]) {
                case "$":
                    listGame[0][2] = ANSI_GREEN + "$" + ANSI_RESET;
                    listGame[1][2] = ANSI_GREEN + "$" + ANSI_RESET;
                    listGame[2][2] = ANSI_GREEN + "$" + ANSI_RESET;
                    showList();
                    cost += 1000;
                    System.out.println();
                    System.out.println("Джэкпот! +500 ");
                    break;
                case "@":
                    listGame[0][2] = ANSI_YELLOW + "@" + ANSI_RESET;
                    listGame[1][2] = ANSI_YELLOW + "@" + ANSI_RESET;
                    listGame[2][2] = ANSI_YELLOW + "@" + ANSI_RESET;
                    showList();
                    cost += 300;
                    System.out.println();
                    System.out.println("Собачник. Гав гав +300");
                    break;
                case "X":
                    listGame[0][2] = ANSI_RED + "X" + ANSI_RESET;
                    listGame[1][2] = ANSI_RED + "X" + ANSI_RESET;
                    listGame[2][2] = ANSI_RED + "X" + ANSI_RESET;
                    showList();
                    System.out.println();
                    System.out.println("Увы");
                    break;
                case "W":
                    listGame[0][2] = ANSI_BLUE + "W" + ANSI_RESET;
                    listGame[1][2] = ANSI_BLUE + "W" + ANSI_RESET;
                    listGame[2][2] = ANSI_BLUE + "W" + ANSI_RESET;
                    showList();
                    cost += 100;
                    System.out.println();
                    System.out.println("Мафия. Получите долю +100");
                    break;
            }}
        System.out.println(cost);
        }



    public void game(){
        System.out.println("Нажмите ENTER чтобы начать играть!");
        while (true){
            Scanner scanner = new Scanner(System.in);
            if(cost<=0) return;
            if(scanner.nextLine().isEmpty()){
                cost-=20;
                check(cost);
            }
            else return;


        }
    }
}
