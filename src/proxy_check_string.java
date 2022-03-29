public class proxy_check_string{
    // take in the input string and check if it passed the proxy check
    final private String text_input;


    // constructor
    public proxy_check_string(String text_input){
        this.text_input = text_input;
    }

    // check if the input string passed the proxy check
    public boolean check_proxy(){
        if (text_input.isEmpty()){
            return false;
        }

    }

}
