public class GamerManager implements IGamerService{
    IUserValidation _userValidation;

    public GamerManager(IUserValidation userValidation) {
        this._userValidation = userValidation;
    }

    @Override
    public void add(Gamer gamer) {
        if (_userValidation.validate(gamer)) {
            System.out.println(gamer.getFirstName() + " kayıt oldu");
        }else {
            System.out.println("Doğrulama başarısız oldu");
        }
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" güncellendi");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" silindi");
    }
}
