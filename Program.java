import java.util.Scanner;

//課題５
public class Program {

    private static Friend friend;
    public static void main(String[] args) {

        //最初の行の読み込み
        Scanner scanner = new Scanner(System.in);

        int userNum = scanner.nextInt();
        int friendshipNum = scanner.nextInt();

        friend = new Friend(userNum);

        //友達関係を作る
        for(int i=0; i<friendshipNum; i++){
            friend.makeFriend(scanner.nextInt(), scanner.nextInt());
        }

        //質問数の読み込み
        int questionNum = scanner.nextInt();

        //友達判定
        for(int i=0; i<questionNum; i++){
            boolean hasFriend = friend.findFriend(scanner.nextInt(), scanner.nextInt());

            if(hasFriend == true){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }
        scanner.close();
    }
}