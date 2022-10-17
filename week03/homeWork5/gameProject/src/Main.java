public class Main {
    public static void main(String[] args) {
        Gamer gamer=new Gamer();
        gamer.setId(1);
        gamer.setBirtOfYear(1985);
        gamer.setFirstName("Engin");
        gamer.setLastName("Demiroğ");
        gamer.setIdentityNumber(12345);

        GamerManager gamerManager=new GamerManager(new UserValidationManager());
        gamerManager.add(gamer);

        GamerManager gamerManager1=new GamerManager(new NewEStateUserValidationManager());
        gamerManager1.add(gamer);

        Order order=new Order();
        order.setId(1);
        order.setAmount(450);

        CampaignManager campaignManager=new CampaignManager();
        campaignManager.campaignAdd(order);
        campaignManager.campaignUpdate(order);
        campaignManager.campaignDelete(order);
    }
}