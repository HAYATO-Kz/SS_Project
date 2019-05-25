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

    public void doFunction(String text) {
        double b = Double.parseDouble(text);
        if(answer == "ANS"){
            answer = text;
        }else {
            double a = Double.parseDouble(answer);
            answer = Double.toString(func.execute(a,b));
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
            else{
                return  answer;
            }
        } catch (NumberFormatException ne){
            return answer;
        }
    }

    public Memento save() {
        return new Memento(answer);
    }

    public String getSaved(Memento m){
        String ans = m.getSavedAnswer();
        try {
            double d = Double.parseDouble(ans);
            if(Math.ceil(d) == d){
                return Integer.toString((int)d);
            }
            else{
                return  ans;
            }
        } catch (NumberFormatException ne){
            return ans;
        }
    }

    static class Memento{
        private String ans;

        private Memento(String ans){
            this.ans = ans;
        }

        public String getSavedAnswer(){
            return ans;
        }
    }
}
