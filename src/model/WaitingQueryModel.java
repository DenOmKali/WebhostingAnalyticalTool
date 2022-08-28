package model;

public class WaitingQueryModel {

    private int service_id;

    private int variation_id;

    private int question_type_id;

    private int category_id;

    private int sub_category_id;

    private String N_or_P;

    private String date;

    private TimeWaitingModel timeWaitingModel;


    public WaitingQueryModel(int service_id, int variation_id, int question_type_id, int category_id, int sub_category_id, String N_or_P, String date, TimeWaitingModel timeWaitingModel) {
        this.service_id = service_id;
        this.variation_id = variation_id;
        this.question_type_id = question_type_id;
        this.category_id = category_id;
        this.sub_category_id = sub_category_id;
        this.N_or_P = N_or_P;
        this.date = date;
        this.timeWaitingModel = timeWaitingModel;
    }

    @Override
    public String toString() {
        return "C " + service_id + "."
                + variation_id + " "
                + question_type_id + "."
                + category_id + "."
                + sub_category_id + " "
                + N_or_P + " "
                + date + " ";
    }
}
