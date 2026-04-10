package practice.ch10;

public class Main {
    public static void main(String[] args) {
 /*
        Hand h1 = Hand.ROCK;

        Hand h2 = Hand.SCISSORS;
        
       if( h1.isStrongerThan(h2)){
            System.out.println(h1+"이"+ h2+" 보다 강하다");
        } else if(h1.isWeakerThan(h2)){
            System.out.println("h1이 h2보다 약하다");
        } else {
            System.out.println("h1과 h2는 비겼다");

       } //h1이 h2보다 강한가? true


     */
//플레이어 2명 생성
Player player1 = new Player("임혜원", new WinningStrategy(314)); //시드는 랜던 생성해두는 값 그냥 암거나 넣으면 됌
Player player2 = new Player("Hana", new WinningStrategy(15));  //부모타임으로 자식중에 뭐든 받을 수 있다: 다형성


//게임시키기
    for (int i = 0; i < 10; i++) {
        Hand h1=player1.nextHand(); //플레이어1이 다음 손을 낸다, 전략에 따라 손이 결정된다.
        Hand h2=player2.nextHand(); //플레이어2가 다음 손을 낸다, 전략에 따라 손이 결정된다.

            if(h1.isStrongerThan(h2)){
                 System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if(h1.isWeakerThan(h2)){
                 System.out.println("Winner:" + player2);
                  player1.lose();
                 player2.win();
            } else {
                 System.out.println("Even...");
                 player1.even();
                  player2.even();

}


   


    }}}
