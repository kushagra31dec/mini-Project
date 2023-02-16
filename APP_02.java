import java.util.*;
import java.io.*;

public class APP_02 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
                Set<APP_02helper> dimensions= new HashSet<APP_02helper>();
                Set<Integer> volume = new HashSet<Integer>();
                System.out.println("\t\t\t\t\t       -> Enter the number of boxes to be inserted");
                int numberOfBoxes=scn.nextInt();
                for (int i=1;i<=numberOfBoxes;i++) {
                    System.out.println("\t\t\t\t\t       -> Enter the dimensions of boxes in the format L x W x H");
                    int l=scn.nextInt();
                    int w=scn.nextInt();
                    int h=scn.nextInt();
                    int volumeOfBox = l*w*h;
                    if(!volume.contains(volumeOfBox)) {
                        dimensions.add(new APP_02helper(l,w,h));
                        volume.add(volumeOfBox);
                    }
                }
                System.out.println();
                System.out.println("\t\t\t\t\t       -> Dimensions of boxes in the format L x W x H");
                for(APP_02helper size : dimensions) {
                    System.out.println("\t\t\t\t\t       -> "+size.length+" x "+size.width+" x "+size.height);
                }
        }
}
