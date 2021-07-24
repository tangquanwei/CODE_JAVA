package dotcom;

import java.io.*;

class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom sdc = new SimpleDotCom();
        int random = (int) (Math.random() * 8); // 随机数
        int[] location = { random, random + 1, random + 2 };
        int numOfGuesses = 0;

        sdc.setLocationCells(location);
        boolean isAlive = true;
        while (isAlive) {
            String guess = GameHelper.getUserInput("请输入位置: ");
            String result = sdc.cheakYourself(guess);
            ++numOfGuesses;
            if (result.equals("Kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses.");
            }
        }
    }
}

public class SimpleDotCom {
    int[] locationcells;
    int numOfHits = 0;

    public void setLocationCells(int[] locations) {
        locationcells = locations;
    }

    public String cheakYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Miss";
        for (int cell : locationcells) {
            if (guess == cell) {
                result = "Hit";
                ++numOfHits;
                break;
            }
        }
        if (numOfHits == locationcells.length)
            result = "Kill";
        System.out.println(result);
        return result;
    }
}

class GameHelper {
    public static String getUserInput(String prompt) {
        System.out.println(prompt + "   ");
        String inputLine = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}