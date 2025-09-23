import java.util.Scanner;

class Player {
    int pid, innings, notOut;
    String pname;
    int totalRuns;
    double avg;

    void calcAvg() {
        avg = (double) totalRuns / (innings - notOut);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        Player arr[] = new Player[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Player();
            System.out.println("Enter pid, pname, totalRuns, inningsPlayed, notOut:");
            arr[i].pid = sc.nextInt();
            arr[i].pname = sc.next();
            arr[i].totalRuns = sc.nextInt();
            arr[i].innings = sc.nextInt();
            arr[i].notOut = sc.nextInt();
            arr[i].calcAvg();
        }

        Player max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i].avg > max.avg) {
                max = arr[i];
            }
        }

        System.out.println("\n--- Player with Max Average ---");
        System.out.println(max.pid + " " + max.pname + " " + max.totalRuns +
                " " + max.innings + " " + max.notOut + " Avg=" + max.avg);
    }
}
