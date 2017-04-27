package teamWork;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-27.
 */
public class Change {
    public static List<Integer> getChangeNominals(int amount){
        ArrayList<Integer> nominals = new ArrayList<Integer>();
        nominals.add(500);
        nominals.add(200);
        nominals.add(100);
        nominals.add(50);
        nominals.add(20);
        nominals.add(10);
        nominals.add(5);
        nominals.add(2);
        nominals.add(1);
        int index =0;
        List<Integer> result = new ArrayList<Integer>();

        while(amount>0){
            int currentNominal= nominals.get(index);
            if(currentNominal<=amount){
                result.add(currentNominal);
                amount-=currentNominal;
            }else{
                index++;
            }
        }
        for (Integer returnedNominal: result){
            System.out.println(returnedNominal);
        }





        return result;
    }

    public static void main(String[] args) {

        getChangeNominals(347);


    }
}
