public class Race {
    String contestantOne;
    String contestantTwo;
    double contestantOnePostion;
    double contestantTwoPostion;
    double contestantOneSpeed;
    double contestantTwoSpeed;
    double totalTime;
    public Race(String nameOne, String nameTwo, double posOne, double posTwo, double sOne, double sTwo, double tTime){
        contestantOne = nameOne;
        contestantTwo = nameTwo;
        contestantOnePostion = posOne;
        contestantTwoPostion = posTwo;
        totalTime = tTime;
        contestantOneSpeed = sOne;
        contestantTwoSpeed = sTwo;
    }
    private void printCurrent(String status){
        System.out.println("At time : " + totalTime);
        System.out.println("  " + contestantOne + "is at position " + contestantOnePostion);
        System.out.println("  " + contestantTwo + "is at position " + contestantTwoPostion);
        System.out.println("  " + status);
    }
    public void race(){
        while(contestantTwoPostion < contestantOnePostion){
            printCurrent("Not Yet");
            double timeToReach  = (contestantOnePostion - contestantTwoPostion) / contestantTwoSpeed;
            totalTime = totalTime + timeToReach;
            contestantOnePostion = contestantOnePostion + (timeToReach * contestantOneSpeed);
            contestantTwoPostion = contestantTwoPostion + (timeToReach * contestantTwoSpeed);
        }
        printCurrent("matched");
    }
}

// Notes : Before a variable in java is used it must first be declared 
//         Java variables must have a specific type 
//         Java variable types can never change.
//         In Java types are verified before the code even runs.
