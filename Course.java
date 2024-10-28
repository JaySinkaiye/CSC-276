public class Course{

    String Prefix;
    int Code;

    Course(){
       Prefix = "CSC";
       Code = 276;
    }

    Course(String prefix, int code){
        Prefix = prefix;
        Code = code;
    }

    public void setPrefix(String newPrefix){
        Prefix = newPrefix;
    }

    public String getPrefix(){
        return Prefix;
    }

    public void setCode(int newCode){
        Code = newCode;
    }

    public int getCode(){
        return Code;
    }

    public void displayCourse(){
        System.out.println("The name of your course is " + Prefix + " " + Code);
    }
}