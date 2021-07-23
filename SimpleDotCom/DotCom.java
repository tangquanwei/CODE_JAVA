package SimpleDotCom;

import java.util.ArrayList;

class DotComTestDrive {
    public static void main(String[] args) {
        DotCom sdc = new DotCom();
        ArrayList<Integer> a = new ArrayList<Integer>();
        Integer random = (int) (Math.random() * 8); // 随机数
        a.add(random);
        a.add(random + 1);
        a.add(random + 2);
        int numOfGuesses = 0;

        sdc.setLocationCells(a);
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

public class DotCom {
    ArrayList<Integer> locationcells;
    int numOfHits = 0;

    public void setLocationCells(ArrayList<Integer> locations) {
        locationcells = locations;
    }

    public String cheakYourself(String stringGuess) {
        Integer guess = Integer.parseInt(stringGuess);
        String result = "Miss";
        for (int cell : locationcells) {
            if (guess == cell) {
                result = "Hit";
                ++numOfHits;
                locationcells.remove(guess);
                break;
            }
        }
        if (locationcells.size() == 0)
            result = "Kill";
        System.out.println(result);
        return result;
    }
}
