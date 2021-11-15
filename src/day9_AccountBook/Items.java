package day9_AccountBook;

public class Items {
    private String date;
    private String detail;
    private int income;
    private int expense;
    private String sort;

    public Items(String date, String detail, int income, int expense,
                 String sort){
        this.date = date;
        this.detail = detail;
        this.income = income;
        this.expense = expense;
        this.sort = sort;
    }

    public String getDate(){
        return date;
    }

    public String getDetail(){
        return detail;
    }

    public int getIncome(){
        return income;
    }

    public int getExpense(){
        return expense;
    }

    public String getSort(){
        return sort;
    }




}

