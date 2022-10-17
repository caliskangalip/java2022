public class CampaignManager implements ICampaignService{
    @Override
    public void campaignAdd(Order order) {
        System.out.println("Kampanya uygulandı : "+order.getAmount()+" TL");
    }

    @Override
    public void campaignUpdate(Order order) {
        System.out.println("Kampanya güncellendi : "+order.getAmount()+" TL");
    }

    @Override
    public void campaignDelete(Order order) {
        System.out.println("Kampanya silindi id : "+order.getId());
    }
}
