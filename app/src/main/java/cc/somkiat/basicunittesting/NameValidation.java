package cc.somkiat.basicunittesting;

class NameValidation {


    public boolean isEmpty(String name) {
        if(name.equals("")){
            return  false;
        }
        return true;
    }

    public boolean isLowerTwo(String name) {
        if(name.length() < 2) {
            return false;
        }
        return true;
    }

    public boolean isOverTwenty(String name) {
        if(name.length() > 20) {
            return false;
        }
        return true;
    }
}
