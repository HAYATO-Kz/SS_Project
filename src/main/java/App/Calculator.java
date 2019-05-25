package App;

public class Calculator {

    public static Calculator instance;

    private String answer = "ANS";
    private Function func ;

    private Calculator(){ }

    public static Calculator getInstance() {
        if(instance == null){
            instance = new Calculator();
        }
        return instance;
    }

    public void serFunction(Function func){
        this.func = func;
    }

    public void doSomething(String text) {
        double b = Double.parseDouble(text);
        if(answer == "ANS"){
            answer = text;
        }else {
            double a = Double.parseDouble(answer);
            answer = Double.toString(func.doIt(a,b));
        }
    }

    public void reset(){
        answer = "ANS";
    }

    public String getAnswer(){

        try {
            double d = Double.parseDouble(answer);
            if(Math.ceil(d) == d){
                return Integer.toString((int)d);
            }
//            if( (int) d == Math.round(d)){
//                return Integer.toString((int)d);
//            }
            else{
                return  answer;
            }
        } catch (NumberFormatException ne){
            return answer;
        }
    }

    public Momento save() {
        return new Momento(answer);
    }

    public String getSaved(Momento m){
        return m.ans;
    }




    static class Momento{
        private String ans;

        private Momento(String ans){
            this.ans = ans;
        }
    }
}
