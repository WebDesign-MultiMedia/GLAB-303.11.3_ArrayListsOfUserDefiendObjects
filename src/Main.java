import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //instantiation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> mybooklist = b.bookdetails();
        for(Book showVal: mybooklist){
            // invoke getter method for getting data---------
            System.out.println(showVal.getNumber() + " " + showVal.getName() + " " + showVal.getCategory() + " " + showVal.getAuthor());
        }


    }
}