package DSA;

public class DrMorgansLaws {
    public static void main(String[] args) {

      int x = 4, y = 6;
      int a = 3, b = 3, g = 5;
      int i = 5, j = 7;

      boolean originalA = !(x < 5) && !(y >= 7);
      boolean deMorganA = !(a < 5) || !(y >= 7);
      System.out.println("a) original: " + originalA + ", DeMordan: " + deMorganA + ", Equal: " + (originalA == deMorganA));

      boolean originalB = !(a == b) || !(g != 5);
      boolean deMorganB = !(a == b) && (g != 5);
      System.out.println("b) original: " + originalB + ", DeMorgan: " + deMorganB + ", Equal: " + (originalB == deMorganB));

      boolean originalC = !((x <= 8) && (y > 4));
      boolean deMorganC = (x > 8) || (y <= 4);
      System.out.println("c) original: " + originalC + ", DeMorgan: " + deMorganC + ", Equal: " + (originalC == deMorganC));

      boolean originalD = !((i > 4) || (j <= 6));
      boolean deMorganD = (i <= 4) && (j > 6);
      System.out.println("d) original: " + originalD + ", DeMorgan: " + deMorganD + ", Equal: " + (originalD == deMorganD));


    }
}