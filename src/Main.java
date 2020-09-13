public class Main {

    public static void main(String[] args) {

        double centimeters = FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(6, 12);
           if(centimeters < 0.0) {
               System.out.println("Invalid parameters");
           }

           FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(188);
            }
        }




/*

        int newScore = calculateScore("April", 50);
        System.out.println("New Score is : " + newScore);
        calculateScore(75);
        calculateScore("Cameron", 200);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player "  + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }


 */