public class UserValidationManager implements IUserValidation{
    @Override
    public boolean validate(Gamer gamer) {
        if (gamer.getBirtOfYear()==1985 && gamer.getFirstName()=="Engin"&& gamer.getLastName()=="Demiroğ"&&gamer.getIdentityNumber()==12345){
            return true;
        }else {
            return false;
        }
    }
}
