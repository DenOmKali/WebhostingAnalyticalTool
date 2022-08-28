import model.*;

import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int scanInt = scanner.nextInt();

        // #Data Collections
        HashMap<Integer, TimeWaitingModel> timeWaitingModel = new HashMap<Integer, TimeWaitingModel>();
        WaitingQueryModel waitingQueryModel1 = new WaitingQueryModel(1, 1, 8, 15, 1, "P", "15.10.2012", timeWaitingModel.put(1, new TimeWaitingModel(83)));
        WaitingQueryModel waitingQueryModel2 = new WaitingQueryModel(1, 0, 10, 1, 0, "P", "01.12.2012", timeWaitingModel.put(2, new TimeWaitingModel(65)));
        WaitingQueryModel waitingQueryModel3 = new WaitingQueryModel(1, 1, 5, 5, 1, "P", "01.11.2012", timeWaitingModel.put(3, new TimeWaitingModel(117)));
        WaitingQueryModel waitingQueryModel4 = new WaitingQueryModel(8, 0, 2, 0, 0, "N", "11.10.2012", timeWaitingModel.put(4, new TimeWaitingModel(17)));


        HashMap<WaitingQueryModel, HashMap<Integer, TimeWaitingModel>> queryModel = new HashMap<>();
        queryModel.put(waitingQueryModel1, timeWaitingModel.get(1));
        queryModel.put(waitingQueryModel2, timeWaitingModel.get(2));
        queryModel.put(waitingQueryModel3, timeWaitingModel.get(3));
        queryModel.put(waitingQueryModel4, timeWaitingModel.get(4));


        HashMap<Integer, HashMap<WaitingQueryModel, HashMap<Integer, TimeWaitingModel>>> allData = new HashMap<>();
        allData.put(scanInt, queryModel);


        HashMap<Integer, HashMap<Integer, HashMap<WaitingQueryModel, HashMap<Integer, TimeWaitingModel>>>> allServiceModel = new HashMap<>();


        for (int i = 1; i <= 10; i++) {
            allServiceModel.put(i, allData);
        }

        if (scanInt > 10){
            System.out.println("Not enough!");
        } else {
            System.out.println(scanInt + "\n" + allServiceModel.get(scanInt));
        }
    }
}